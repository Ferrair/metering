package com.adc.metering.controller;

import com.adc.metering.service.ExcelImport;
import com.adc.metering.bean.ProjectDTO;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;


/**
 * 文件上传的controller
 */
@Controller
@CrossOrigin
@ResponseBody
public class ProjectController {

    private static Logger logger = LoggerFactory.getLogger(ProjectController.class);

    @Autowired
    private MongoTemplate mongoTemplate;

    private static final String COLLECTION_NAME = "projects";

//    @RequestMapping(value = "/file/upload", method = RequestMethod.GET)
//    public String upload() {
//        return "file upload";
//    }

    /**
     * 文件上传的具体实现方法
     */

    @RequestMapping(value = "/file/upload", method = RequestMethod.POST)
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file) throws IOException {
        if (!file.isEmpty()) {
            String fileName = file.getOriginalFilename();
            // 获取文件后缀
            String prefix=fileName.substring(fileName.lastIndexOf("."));
            // 用uuid作为文件名，防止生成的临时文件重复
            final File excelFile = File.createTempFile(UUID.randomUUID().toString(), prefix);
            try {
                file.transferTo(excelFile);
                toMongoDb(excelFile);
                //程序结束时，删除临时文件
                deleteFile(excelFile);
                return "上传成功";
            } catch (IOException e) {
                return "上传失败";
            }
        } else {
            return "文件为空，上传失败";
        }



    }
    private void deleteFile(File... files) {
        for (File file : files) {
            if (file.exists()) {
                file.delete();
            }
        }
    }


    /**
     * 文件查询的 具体实现方法
     */
    @RequestMapping(value = "/file/searchName", method = RequestMethod.GET)
    @ResponseBody
    public List<ProjectDTO> searchNameOrUnit(@RequestParam String projectName, @RequestParam String unitName) {
        Query query = new Query();
        Criteria criteria = new Criteria();
        if (projectName != null && unitName != null) {
            query = new Query(criteria.andOperator(Criteria.where("projectName").regex(projectName), Criteria.where("unitInfo.unitName").regex(unitName)));//必须写unitInfo.unitName，
        } else if (projectName != null) {
            query = new Query(Criteria.where("projectName").regex(projectName));
        } else if (unitName != null) {
            query = new Query(Criteria.where("unitInfo.unitName").regex(unitName));
        } else {
            // throw Exception()
        }
        //
        List<ProjectDTO> result = mongoTemplate.find(query, ProjectDTO.class, COLLECTION_NAME);
        System.out.println("query: " + query + " | specialFieldQueryOne: " + result);
        return result;

    }

    /**
     * 将上传的文件导入数据库
     *
     * @param file
     */
    public void toMongoDb(File file) {
        ExcelImport excelImport = new ExcelImport();

        List<ProjectDTO> list = excelImport.readExcel(file.getAbsolutePath());

        //MongoCollection<Document> collection = MongoJDBC.connectToDB().getCollection("projects");


        for (int i = 0; i < list.size(); i++) {
            mongoTemplate.save(list.get(i));

            //collection.insertOne(MongoJDBC.saveToDB(list.get(i)));

        }

        System.out.println("插入成功");

//        FindIterable<Document> findIterable = collection.find();
//        MongoCursor<Document> mongoCursor = findIterable.iterator();
//        while (mongoCursor.hasNext()) {
//            System.out.println(mongoCursor.next());
//        }


    }


}

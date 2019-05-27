package com.adc.metering.bean;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

//解析excel
public class ExcelImport {
    public List<ProjectDTO> readExcel(String filePath) {
        List<ProjectDTO> list = new ArrayList<ProjectDTO>();//返回项目集合
        InputStream is;
        Workbook workbook = null;
        if ("".equals(filePath)) {
            return null;
        } else {
            try {
                is = new FileInputStream(filePath);//创建文件流
                if ("xls".equals(getPostFix(filePath))) {
                    workbook = new HSSFWorkbook(is); //xls对应的HSSWorkbook工作簿对象
                } else if ("xlsx".equals(getPostFix(filePath))) {
                    workbook = new XSSFWorkbook(is);
                } else {
                    return null;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Sheet sheet = workbook.getSheetAt(0);//读取工作表
                                    list.add(handleRowData(sheet.getRow(2)));



//            for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
//                Sheet sheet = workbook.getSheetAt(i);//读取工作表
//                if (sheet == null)
//                    continue;
//                for (int j = 2; j <= sheet.getLastRowNum(); j++) {
//                    Row row = sheet.getRow(j);//读取每一行
//                    if (row != null) {
//                        list.add(handleRowData(sheet.getRow(j)));
//                    }
//                }
//
//            }
        }
        return list;
    }


    private ProjectDTO handleRowData(Row row) {
        ProjectDTO project = new ProjectDTO();
        //设置项目实体各属性的值
        //序号
        //System.out.println(row.getCell(0).getCellTypeEnum().name());
        //System.out.println(row.getCell(0).getNumericCellValue());
        project.setNumber((int) row.getCell(0).getNumericCellValue());
        //申报单位信息
        UnitInfo unitInfo = new UnitInfo(row.getCell(1).getStringCellValue(), row.getCell(2).getStringCellValue(), row.getCell(3).getStringCellValue(), row.getCell(4).getStringCellValue(),row.getCell(5).getStringCellValue());
        project.setUnitInfo(unitInfo);
        //项目名称
        project.setProjectName(row.getCell(6).getStringCellValue());
//        //检测参数
        Parameter parameter1 = new Parameter(row.getCell(7).getStringCellValue(), row.getCell(8).getStringCellValue());
        Parameter parameter2 = new Parameter(row.getCell(9).getStringCellValue(), row.getCell(10).getStringCellValue());
        Parameter parameter3 = new Parameter(row.getCell(11).getStringCellValue(), row.getCell(12).getStringCellValue());
        List<Parameter> parameterList = new ArrayList<Parameter>();
        parameterList.add(parameter1);
        parameterList.add(parameter2);
        parameterList.add(parameter3);
        project.setParameterList(parameterList);
        //联系人
        //System.out.println(row.getCell(23).getCellTypeEnum().name());
        Contact contact1 = new Contact(row.getCell(13).getStringCellValue(), row.getCell(14).getStringCellValue(), row.getCell(15).getStringCellValue(), row.getCell(16).getStringCellValue(), (int)row.getCell(17).getNumericCellValue(), row.getCell(18).getStringCellValue());
        Contact contact2 = new Contact(row.getCell(19).getStringCellValue(), row.getCell(20).getStringCellValue(), row.getCell(21).getStringCellValue(), row.getCell(22).getStringCellValue(),(int)row.getCell(23).getNumericCellValue(), row.getCell(24).getStringCellValue());
        List<Contact> contactList = new ArrayList<Contact>();
        contactList.add(contact1);
        contactList.add(contact2);
        project.setContactList(contactList);
        //立项依据
        BasisOfProject basisOfProject= new BasisOfProject(row.getCell(25).getStringCellValue(), row.getCell(26).getStringCellValue());
        project.setBasisOfProject(basisOfProject);
        //申报单位检测资质的说明
        DescriptionOfTestQualification descriptionOfTestQualification  = new DescriptionOfTestQualification(row.getCell(27).getStringCellValue(), row.getCell(28).getStringCellValue(), row.getCell(29).getStringCellValue(), row.getCell(30).getStringCellValue(), row.getCell(31).getStringCellValue(), row.getCell(32).getStringCellValue(),row.getCell(33).getStringCellValue());
        project.setDescriptionOfTestQualification(descriptionOfTestQualification);
        //申报单位在该领域的能力说明
        project.setCapacityDescriptionOfUnitInField(row.getCell(34).getStringCellValue());
        //申报单位检测水平描述
        DescriptionOfTestCapacity descriptionOfTestCapacity = new DescriptionOfTestCapacity(row.getCell(35).getStringCellValue(),row.getCell(36).getStringCellValue(),row.getCell(37).getStringCellValue());
        project.setDescriptionOfTestCapacitie(descriptionOfTestCapacity);
        //获得相关检测资质的机构数目
        project.setNumberOfRelatedUnit((int)row.getCell(38).getNumericCellValue());
        //计划类型
        TypeOfTestProgram typeOfTestProgram = new TypeOfTestProgram(row.getCell(39).getStringCellValue(),row.getCell(40).getStringCellValue(),row.getCell(41).getStringCellValue());
        project.setTypeOfTestProgram(typeOfTestProgram);
        //样品设计
        SampleDesign sampleDesign = new SampleDesign(row.getCell(42).getStringCellValue(), row.getCell(43).getStringCellValue(), row.getCell(44).getStringCellValue(), row.getCell(45).getStringCellValue(), row.getCell(46).getStringCellValue(), row.getCell(47).getStringCellValue(), row.getCell(48).getStringCellValue(), row.getCell(49).getStringCellValue(), row.getCell(50).getStringCellValue(), row.getCell(51).getStringCellValue());
        project.setSampleDesign(sampleDesign);
        //统计设计
        StatisticsDesign statisticsDesign = new StatisticsDesign(row.getCell(52).getStringCellValue(), row.getCell(53).getStringCellValue(), row.getCell(54).getStringCellValue(), row.getCell(55).getStringCellValue(), row.getCell(56).getStringCellValue(), row.getCell(57).getStringCellValue(), row.getCell(58).getStringCellValue(), row.getCell(59).getStringCellValue());
        project.setStatisticsDesign(statisticsDesign);
        //指定值确定
        DeterminationOfSpecifiedValue determinationOfSpecifiedValue = new DeterminationOfSpecifiedValue(row.getCell(60).getStringCellValue(), row.getCell(61).getStringCellValue(), row.getCell(62).getStringCellValue(), row.getCell(63).getStringCellValue(), row.getCell(64).getStringCellValue(), row.getCell(65).getStringCellValue());
        project.setDeterminationOfSpecifiedValue(determinationOfSpecifiedValue);
        //项目经费
        ProjectFunding projectFunding = new ProjectFunding((int)row.getCell(66).getNumericCellValue(),(int)row.getCell(67).getNumericCellValue(),(int)row.getCell(68).getNumericCellValue(),row.getCell(69).getStringCellValue());
        project.setProjectFunding(projectFunding);
        //其他
       project.setOthers(row.getCell(70).getStringCellValue());
        return project;
    }

    /**
     * 获取文件后缀
     *
     * @param path
     * @return
     */
    private String getPostFix(String path) {
        //trim()删除首尾的空白
        if (path == null || "".equals(path.trim())) {
            return "";
        }

        //.最后一次出现的位置是否在path的最后一位，不在就提取后缀
        if (path.contains(".") && path.lastIndexOf(".") != path.length() - 1) {
            return path.substring(path.lastIndexOf(".") + 1);//提取子串
        }
        return "";
    }


}

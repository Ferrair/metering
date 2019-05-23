package com.adc.metering.controller;

import com.adc.metering.bean.ProjectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ProjectController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public String save() {
        ProjectDTO project = new ProjectDTO();
        project.setTitle("title");
        mongoTemplate.save(project);
        return "index";
    }
}

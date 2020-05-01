package com.atguigu.eduservice.controller;


import com.atguigu.eduservice.entity.EduTeacher;
import com.atguigu.eduservice.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author testjava
 * @since 2020-05-01
 */
@RestController
@RequestMapping("/eduservice/eduteacher")
public class EduTeacherController {
    @Autowired
    private EduTeacherService teacherService;
@GetMapping(value = "")
    public EduTeacher getEdutearchById(){
       return teacherService.getById(1);

    }

}


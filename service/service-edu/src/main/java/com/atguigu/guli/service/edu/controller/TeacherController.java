package com.atguigu.guli.service.edu.controller;


import com.atguigu.guli.service.edu.entity.Teacher;
import com.atguigu.guli.service.edu.service.TeacherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author atguigu
 * @since 2022-07-17
 */
@RestController
@RequestMapping("/edu/teacher")
public class TeacherController {
    @Resource
    TeacherService teacherService;
    //查询所有讲师
    @GetMapping("queryAll")
    public List<Teacher> queryAll(){
        List<Teacher> list = teacherService.list();
        return list;
    }

}


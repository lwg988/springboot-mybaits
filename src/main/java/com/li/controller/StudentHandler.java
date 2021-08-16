package com.li.controller;

import com.li.dao.StudentDao;
import com.li.entiy.Student;
import com.li.repository.StudentRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(tags = "员工接口")
@RestController
public class StudentHandler {

    @Autowired
    private StudentDao studentDao;

    @GetMapping("/findAll")
    public List<Student> findAll(){
        return studentDao.findAll();
    }
    @ApiOperation(value = "根据ID查询员工信息",notes = "这里是notes笔记标注一些信息，给前端开发人员看")
    @GetMapping("/findById/{id}")
    public Student findById (@ApiParam(value = "学生ID",required = false) @PathVariable("id") Long id){
        return studentDao.findById(id);
    }
    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentDao.save(student);
    }
    @GetMapping("/deleteById/{id}")
    public int deleteById(@PathVariable("id") Long id){
        return studentDao.deleteById(id);
    }
    @PostMapping("/update")
    public int update(@RequestBody Student student){
       return studentDao.update(student);
    }
}

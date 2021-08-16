package com.li.repository;

import com.li.entiy.Student;

import java.util.List;

public interface StudentRepository {
    public List<Student> findAll();
    public Student findById(Long id);
    public void save(Student student);
    public int deleteById(Long id);
    public int update(Student student);
}

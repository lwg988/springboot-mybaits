package com.li.dao;

import com.li.entiy.Student;
import com.li.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class StudentDaoImpl implements StudentDao{

    @Autowired
    private StudentRepository repository;

    public List<Student> findAll() {
        return repository.findAll();
    }

    public Student findById(Long id) {
        return repository.findById(id);
    }

    public void save(Student student) {
        repository.save(student);
    }


    //@Transactional
    public int deleteById(Long id) {
        int i = repository.deleteById(id);
        int a = 10/0;
        return i;
    }

    public int update(Student student) {
        return update(student);
    }
}

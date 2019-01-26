package com.linyang.service.impl;

import java.util.Date;
import java.util.List;

import com.linyang.dao.StudentDao;
import com.linyang.model.Student;
import com.linyang.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfinal.plugin.activerecord.Record;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao studentDao;

    public void save(Student student) {
        studentDao.save(student);
    }

    @Override
    public void delete(Long id) {
        studentDao.delelte(id);
    }

    @Override
    public void update(long id, String TheClass, long age, String name, String address, Date birthday, String comprehensive, String comments) {
        studentDao.update(id, TheClass, age, name, address, birthday, comprehensive, comments);
    }

    @Override
    public List<Record> page(String name) {
        return studentDao.page(name);
    }
}

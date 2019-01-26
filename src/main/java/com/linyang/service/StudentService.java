package com.linyang.service;

import java.util.Date;
import java.util.List;

import com.jfinal.plugin.activerecord.Record;
import com.linyang.model.Student;

public interface StudentService {

    public void save(Student student);

    public void delete(Long id);

    public void update(long id, String TheClass, long age, String name, String address, Date birthday, String comprehensive, String comments);

    public List<Record> page(String name);

}

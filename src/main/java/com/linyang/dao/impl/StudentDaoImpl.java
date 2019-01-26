package com.linyang.dao.impl;

import java.util.Date;
import java.util.List;

import com.linyang.dao.StudentDao;
import com.linyang.model.Student;
import org.springframework.stereotype.Component;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

@Component
public class StudentDaoImpl implements StudentDao {

	public void save(Student student) {
		student.save();
	}

	@Override
	public void delelte(long id) {
		Student.dao.deleteById(id);
	}

	@Override
	public void update(long id,String TheClass,long age,String name, String address, Date birthday, String comprehensive, String comments) {
		Student.dao.findById(id).set("name", name).set("address", address).set("birthday", birthday)
				.set("comprehensive", comprehensive).set("comments", comments).update();
	}

	public List<Record> page(String name)
	{    
		  return Db.find("select * from student where name = ?",name);
	}
   
}

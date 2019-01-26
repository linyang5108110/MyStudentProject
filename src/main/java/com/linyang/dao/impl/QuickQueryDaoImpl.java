package com.linyang.dao.impl;

import java.util.List;

import com.linyang.dao.QuickQueryDao;
import org.springframework.stereotype.Component;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
@Component
public class QuickQueryDaoImpl implements QuickQueryDao {

	@Override
	public List<Record> page(String name) {
		System.out.println(name);
		return Db.find(
				"select student.*, results.subjects, results.results " +
						"from student, results " +
						"where student.id=results.student_id and name = ?",
				name);
	}
}

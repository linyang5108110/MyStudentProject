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
		return Db.find(
				"select st.*,re.subjects,re.results from student as st LEFT JOIN results as re on st.id = re.student_id where st.name = ?",
				name);
	}
}

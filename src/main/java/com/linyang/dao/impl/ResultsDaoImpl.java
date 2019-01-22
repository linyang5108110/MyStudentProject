package com.linyang.dao.impl;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.linyang.dao.ResultsDao;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ResultsDaoImpl implements ResultsDao {

	@Override
	public void save(String subjects, long results, long student_id) {

		Record record = new Record().set("subjects", subjects).set("results", results).set("student_id", student_id);
		Db.save("results", record);

	}

	@Override
	public void delete(long id) {

		Db.deleteById("results", id);
	}

	@Override
	public void update(long id, String subjects, long results, long student_id) {
		Record record = Db.findById("results", id).set("subjects", subjects).set("results", results).set("student_id",
				student_id);
		Db.update("results", record);
	}

	public List<Record> query(long id) {
		
		return Db.find("select * from results where id = ?", id);
	}

}

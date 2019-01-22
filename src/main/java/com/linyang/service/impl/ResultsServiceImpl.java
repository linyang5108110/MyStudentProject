package com.linyang.service.impl;

import java.util.List;

import com.linyang.dao.ResultsDao;
import com.linyang.service.ResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfinal.plugin.activerecord.Record;

@Service
public class ResultsServiceImpl implements ResultsService {
	@Autowired
	ResultsDao resultdao;

	@Override
	public void save(String subjects, long results, long student_id) {
		resultdao.save(subjects, results, student_id);
	}

	@Override
	public void delete(long id) {
		resultdao.delete(id);
	}

	@Override
	public void update(long id, String subjects, long results, long student_id) {
      resultdao.update(id, subjects, results, student_id);
	}

	@Override
	public List<Record> query(long id) {
		return resultdao.query(id);
	}

}

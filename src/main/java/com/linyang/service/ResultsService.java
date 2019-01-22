package com.linyang.service;

import java.util.List;

import com.jfinal.plugin.activerecord.Record;

public interface ResultsService {
    
	public void save(String subjects, long results, long student_id);
	
	public void delete(long id);
	
	public void update(long id, String subjects, long results, long student_id);

	public List<Record> query(long id);

}

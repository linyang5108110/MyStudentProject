package com.linyang.dao;

import java.util.Date;
import java.util.List;

import com.jfinal.plugin.activerecord.Record;
import com.linyang.model.Student;

public interface StudentDao {
	public void save(Student student);

	public void delelte(long id);

	public void update(long id,String TheClass,long age, String name, String address, Date birthday, String comprehensive, String comments);
    
	/**
	 * 分页查询
	 * @param pageNumber
	 * @param pageSize
	 * @param id
	 * @return
	 */
	public List<Record> page(String name);
}

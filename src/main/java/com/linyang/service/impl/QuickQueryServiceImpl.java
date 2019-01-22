package com.linyang.service.impl;

import java.util.List;

import com.linyang.dao.QuickQueryDao;
import com.linyang.service.QuickQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfinal.plugin.activerecord.Record;

@Service
public class QuickQueryServiceImpl implements QuickQueryService {
	@Autowired
	QuickQueryDao quickQueryDao;

	@Override
	public List<Record> page(String name) {
		return quickQueryDao.page(name);
	}

}

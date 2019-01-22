package com.linyang.service;

import java.util.List;

import com.jfinal.plugin.activerecord.Record;

public interface QuickQueryService {
	public List<Record> page(String name);
}

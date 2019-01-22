package com.linyang.dao;

import java.util.List;

import com.jfinal.plugin.activerecord.Record;

public interface QuickQueryDao {
    public List<Record> page(String name);
}

package com.linyang.config;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import com.linyang.model._Mappingkit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.template.source.ClassPathSourceFactory;

@Component
public class JFinalConfig {

	@Autowired
	DataSource dataSource;

	@PostConstruct
	public void init2() {
		ActiveRecordPlugin arp = new ActiveRecordPlugin(dataSource);
		arp.stop();
		_Mappingkit.createMapping(arp);
		arp.getEngine().setSourceFactory(new ClassPathSourceFactory());
		arp.setShowSql(true);
		
		arp.start();
	}


}

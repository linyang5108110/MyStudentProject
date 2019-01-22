package com.linyang.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

public class _Mappingkit {
	
	   public static void createMapping(ActiveRecordPlugin arp)
	   {
		   arp.addMapping("student",Student.class);
		   arp.addMapping("results", Results.class);
	   }

}

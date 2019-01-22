package com.linyang.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jfinal.plugin.activerecord.Model;

@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Student extends Model<Student>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final Student dao = new Student().dao(); 

}

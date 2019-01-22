package com.linyang.contorller;

import java.util.Date;
import java.util.List;

import com.linyang.model.Student;
import com.linyang.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jfinal.plugin.activerecord.Record;

@RestController()
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping("save")
	public void save(String name, String address, Date birthday, String comprehensive, String comments) {
		studentService.save(new Student().set("name", name).set("address", address).set("birthday", birthday)
				.set("comprehensive", comprehensive).set("comments", comments));
	}
	   
	@PostMapping("delete")
	public void delete(long id)
	{
		studentService.delete(id);
	}
	
	@PostMapping("update")
	public void update(long id, String name, String address, Date birthday, String comprehensive, String comments)
	{
		studentService.update(id, name, address, birthday, comprehensive, comments);
	}
	
	@GetMapping("page")
	public List<Record> page(long id)
	{
		return studentService.page(id);
	}
	
}

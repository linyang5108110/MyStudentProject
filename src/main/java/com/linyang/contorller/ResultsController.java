package com.linyang.contorller;


import com.linyang.common.R;
import com.linyang.service.ResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/results")
public class ResultsController {
	@Autowired
	ResultsService resultservice;

	@RequestMapping("save")
	public void save(String subjects, long results, long student_id) {

		resultservice.save(subjects, results, student_id);
	}

	@RequestMapping("delete")
	public void delete(long id) {
		System.out.println(id);
		resultservice.delete(id);
	}

	@RequestMapping("update")
	public void update(long id, String subjects, long results, long student_id) {
		resultservice.update(id, subjects, results, student_id);
	}

	@RequestMapping("query")
	public R query(long id) {
		return R.ok().setData(resultservice.query(id));
	}

}

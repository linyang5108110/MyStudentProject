package com.linyang.contorller;

import java.util.List;

import com.linyang.service.QuickQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jfinal.plugin.activerecord.Record;

@RestController
@RequestMapping("/QuickQuery")
public class QuickQueryController {
	@Autowired
	QuickQueryService quickQueryService;

	@RequestMapping("page")
	public List<Record> index(String name) {
		return quickQueryService.page(name);
	}
}

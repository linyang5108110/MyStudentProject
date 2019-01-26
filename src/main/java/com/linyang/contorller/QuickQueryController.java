package com.linyang.contorller;


import com.linyang.common.R;
import com.linyang.service.QuickQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/QuickQuery")
public class QuickQueryController {
	@Autowired
	QuickQueryService quickQueryService;

	@RequestMapping("page")
	public R index(String name) {
		return R.ok().setData(quickQueryService.page(name));
	}
}

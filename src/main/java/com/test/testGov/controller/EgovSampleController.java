package com.test.testGov.controller;

import com.test.testGov.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Map;


@Controller
public class EgovSampleController {

	@Resource(name = "memberService")
	private MemberService memberService;


	@RequestMapping(value = "/")
	public String home(){String x = "Hello World!";
		String id = "test1234";
		Map<String,Object> map = memberService.selectMemberList(id);
		return "index";
	}


}

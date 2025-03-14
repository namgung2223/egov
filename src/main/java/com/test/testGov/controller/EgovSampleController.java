package com.test.testGov.controller;

import com.test.testGov.service.EgovSampleService;
import com.test.testGov.service.MemberService;
import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springmodules.validation.commons.DefaultBeanValidator;

import javax.annotation.Resource;
import java.util.Map;


@Controller
public class EgovSampleController {

	/** EgovSampleService */
	@Resource(name = "sampleService")
	private EgovSampleService sampleService;

	@Resource(name = "memberService")
	private MemberService memberService;


	@RequestMapping(value = "/")
	public String home(){String x = "Hello World!";
		String id = "test1234";
		Map<String,Object> map = memberService.selectMemberList(id);
		return "index";
	}


}

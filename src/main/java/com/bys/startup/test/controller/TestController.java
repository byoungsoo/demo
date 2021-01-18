package com.bys.startup.test.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bys.startup.test.vo.TestVo;

@Controller
public class TestController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/test")
	public String getFruit(Model model) {
		Map<String, String> fruitMap = new HashMap<String, String>();

		fruitMap.put("fruit1", "apple");
		logger.info("info test");
		fruitMap.put("fruit2", "kiwi");
		logger.debug("debug test");
		fruitMap.put("fruit3", "orange");
		logger.info("info test2");
		

		model.addAttribute("fruit", fruitMap);

		return "views/test/test";
		// return template/views/test/test.html
	}
	
	
	public ModelAndView test() throws Exception{
	    ModelAndView mav = new ModelAndView("test");

	    List<TestVo> testList = testService.selectTest();
	    mav.addObject("list", testList);

	    return mav;
	}

		

}

package com.bys.demo.board.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bys.demo.board.domain.BoardDTO;
import com.bys.demo.board.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class BoardController {
	
    private BoardService testService;
	
	@GetMapping("/test")
	public String getFruit(Model model) {
		Map<String, String> fruitMap = new HashMap<String, String>();
		fruitMap.put("fruit1", "apple");
		log.info("info test");
		fruitMap.put("fruit2", "kiwi");
		log.debug("debug test");
		fruitMap.put("fruit3", "orange");
		log.info("info test2");
		

		model.addAttribute("fruit", fruitMap);

		return "views/test/test";
		// return template/views/test/test.html
	}
	
	@GetMapping("/test1")
	public ModelAndView test() throws Exception{
	    ModelAndView mv = new ModelAndView("views/test/test1");
	    
//		List<TestVo> testList = testService.selectTest();
//	    mv.addObject("list", testList);

	    return mv;
	}

		

}

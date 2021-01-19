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

	@Autowired
	private BoardService boardService;

	
	@GetMapping(value = "/board/write.do")
	public String openBoardWrite(Model model) {

		String title = "Title";
		String content = "Contents";
		String writer = "Tester";

		model.addAttribute("title", title);
		model.addAttribute("content", content);
		model.addAttribute("writer", writer);

		return "board/write";
	}
	
	
	

}

package com.bys.demo.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bys.demo.board.domain.BoardDTO;
import com.bys.demo.board.mapper.BoardMapper;

@Service
public class BoardService {

	@Autowired
	public BoardMapper mapper;

	public List<BoardDTO> selectTest() {
		return mapper.selectBoardList();
	}
	
	
}

package com.bys.demo.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bys.demo.board.domain.BoardDTO;

/*
기존의 스프링은 DAO(Data Access Object) 클래스에 @Repository를 선언해서 해당 클래스가 데이터베이스와 통신하는 클래스임을 나타내고는 하였다.
하지만, 마이바티스는 인터페이스에 @Mapper만 지정해주면 XML Mapper에서 메서드의 이름과 일치하는 SQL을 찾아 실행한다.
Mapper 영역은 데이터베이스와의 통신, 즉 SQL 쿼리를 호출하는 것이 전부이며, 다른 로직은 전혀 필요하지 않다.
 */
@Mapper
public interface BoardMapper {

	public int insertBoard(BoardDTO params);

	public BoardDTO selectBoardDetail(Long idx);

	public int updateBoard(BoardDTO params);

	public int deleteBoard(Long idx);

	public List<BoardDTO> selectBoardList();

	public int selectBoardTotalCount();

}

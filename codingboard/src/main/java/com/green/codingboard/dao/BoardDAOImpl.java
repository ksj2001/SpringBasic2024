package com.green.codingboard.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.green.codingboard.dto.BoardDTO;

@Repository
public class BoardDAOImpl implements BoardDAO{

	@Autowired
	private SqlSessionTemplate sql;
	
	@Override
	public int insert(BoardDTO bdto) {
		return sql.insert("Board.insert", bdto);
	}

	@Override
	public List<BoardDTO> findAll() {
		return sql.selectList("Board.findAll");
	}

	@Override
	public BoardDTO findByNo(Long boardNo) {
		return sql.selectOne("Board.findByNo", boardNo);
	}

	@Override
	public void updateHits(Long boardNo) {
		sql.update("Board.updateHits", boardNo);
	}

	@Override
	public void delete(Long boardNo) {
		sql.delete("Board.delete", boardNo);
	}

	@Override
	public void update(BoardDTO bdto) {
		sql.update("Board.update", bdto);
	}

	@Override
	public int boardCount() {
		return sql.selectOne("Board.boardCount");
	}

}

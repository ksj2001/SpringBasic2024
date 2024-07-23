package com.green.codingboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.codingboard.dao.BoardDAOImpl;
import com.green.codingboard.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	BoardDAOImpl bdao;
	
	@Override
	public int insert(BoardDTO bdto) {
		return bdao.insert(bdto);
	}

	@Override
	public List<BoardDTO> findAll() {
		return bdao.findAll();
	}

	@Override
	public BoardDTO findByNo(Long boardNo) {
		return bdao.findByNo(boardNo);
	}

	@Override
	public void updateHits(Long boardNo) {
		bdao.updateHits(boardNo);
	}

	@Override
	public void delete(Long boardNo) {
		bdao.delete(boardNo);
	}

	@Override
	public void update(BoardDTO bdto) {
		bdao.update(bdto);
	}

	@Override
	public int boardCount() {
		return bdao.boardCount();
	}

}

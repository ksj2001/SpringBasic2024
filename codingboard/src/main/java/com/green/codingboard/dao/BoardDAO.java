package com.green.codingboard.dao;

import java.util.List;
//import java.util.Map;

import com.green.codingboard.dto.BoardDTO;

public interface BoardDAO {
	// �Խ��� ����
	public int insert(BoardDTO bdto);
	// �Խ��� ��ü��� �˻�
	public List<BoardDTO> findAll();
	// �Խ��� �Խñ� �Ѱ� �˻�
	public BoardDTO findByNo(Long boardNo);
	// �Խñ� ��ȸ�� ����
	public void updateHits(Long boardNo);
	// �Խñ� �Ѱ� ����
	public void delete(Long boardNo);
	// �Խñ� ����
	public void update(BoardDTO bdto);
	// �Խñ� ����¡
//	public List<BoardDTO> pagingList(Map<String, Integer> pagingParams);
	// �Խñ� ��ü ����
	public int boardCount();
}

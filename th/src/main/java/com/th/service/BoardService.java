package com.th.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.th.dao.BoardDao;
import com.th.model.Board;

@Service
public class BoardService {
	@Autowired
	private BoardDao boardDao;
	
	public List<Board> getBoardList(Board board){
		return boardDao.selectBoardList(board);
	}
	
	public int insertBoard(Board board){
		return boardDao.insertBoard(board);
	}
	
	public Board getBoardDetail(Board board){
		return boardDao.detailBoard(board);
	}
	
	public int deleteBoard(Board board){
		return boardDao.deleteBoard(board);
	}
	
	public int updateBoard(Board board){
		return boardDao.updateBoard(board);
	}
}

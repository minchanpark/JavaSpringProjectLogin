package com.example.dao;

import com.example.bean.BoardVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDAO {

	@Autowired
	SqlSession sqlSession;
	public BoardVO getUser(BoardVO vo){
		return sqlSession.selectOne("User.getUser", vo);
	}

	public int insertBoard(BoardVO vo){
		int count = sqlSession.insert("Board.insertBoard", vo);
		return count;
	}

	public int deleteBoard(int seq){
		int delete = sqlSession.delete("Board.deleteBoard", seq);
		return delete;
	}

	public int updateBoard(BoardVO vo) {
		int update = sqlSession.update("Board.updateBoard", vo);
		return update;
	}

	public BoardVO getBoard(int seq){
		BoardVO one = sqlSession.selectOne("Board.getBoard", seq);
		return one;
	}

	public List<BoardVO> getBoardList(){
		List<BoardVO> list = sqlSession.selectList("Board.getBoardList");
		return list;
	}
}

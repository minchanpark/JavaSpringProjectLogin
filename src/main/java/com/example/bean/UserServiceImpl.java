package com.example.bean;

import com.example.dao.BoardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
    @Autowired
    BoardDAO boardDAO;

    public BoardVO getUser(BoardVO vo) {return boardDAO.getUser(vo);}
}

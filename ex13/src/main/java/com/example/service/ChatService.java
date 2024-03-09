package com.example.service;

import java.util.List;

import com.example.vo.ChatVO;

public interface ChatService {
	
	public List<ChatVO> list();

	public int insert(ChatVO vo);

	public int delete(int id);

	public int getUser();
}

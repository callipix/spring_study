package com.example.mapper;

import java.util.List;

import com.example.vo.ChatVO;

public interface ChatMapper {
	
	public List<ChatVO> list();

	public int insert(ChatVO vo);

	public int delete(int id);

	public int getUser();
}

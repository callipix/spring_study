package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.ChatMapper;
import com.example.service.ChatService;
import com.example.vo.ChatVO;

@Service
public class ChatServiceImpl implements ChatService{
	@Autowired
	ChatMapper chatMapper;
	
	@Override
	public List<ChatVO> list() {
		return this.chatMapper.list();
	}

	@Override
	public int insert(ChatVO vo) {
		return this.chatMapper.insert(vo);
	}

	@Override
	public int delete(int id) {
		return this.chatMapper.delete(id);
	}

	@Override
	public int getUser() {
		return this.chatMapper.getUser();
	}
}

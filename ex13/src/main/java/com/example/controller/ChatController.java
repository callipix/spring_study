package com.example.controller;

import java.io.FileInputStream;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.ChatService;
import com.example.vo.ChatVO;

@RestController
public class ChatController {
	
	private String path = "d:/upload";
	
	@Autowired
	ChatService chatService;
	
	@RequestMapping("/chat.json")
	public List<ChatVO> list(){
		return chatService.list();
	}
	
	@RequestMapping(value="/chat/insert", method=RequestMethod.POST)
	public int insert(ChatVO vo){
		chatService.insert(vo);
		int result= this.chatService.insert(vo);
		System.out.println("채팅 입력 성공" + result);
		return result;
	}
	
	@RequestMapping(value="/chat/delete", method=RequestMethod.POST)
	public void insert(int id){
		chatService.delete(id);
	}
	
	//�̹������� ���
	@RequestMapping("/display")
	public byte[] display(String file)throws Exception{
      FileInputStream in=new FileInputStream(path + "/" + file);
      byte[] image=IOUtils.toByteArray(in);
      in.close();
      return image;
	}
}

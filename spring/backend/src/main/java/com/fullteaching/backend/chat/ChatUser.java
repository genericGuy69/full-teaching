package com.fullteaching.backend.chat;

public interface ChatUser {

	public String getName();
	
	public String getColor();

	public void newChat(Chat chat);

	public void chatClosed(Chat chat);

	public void newUserInChat(Chat chat, ChatUser user);

	public void userExitedFromChat(Chat chat, ChatUser user);

	public void newMessage(Chat chat, ChatUser user, String message);

}
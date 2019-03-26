package edu.ycp.cs320.entrelink.model;

import java.util.ArrayList;

public class Post {
	
	// User-related fields
	private int posterId;
	private String name;
	
	// Everything else
	private int timePosted;
	private int postId;
	private String postTitle;
	private String postDescription;
	private ArrayList<String> tags;
	
	public Post() {}
	
	public Post(User user, int timePosted, int postId, String postTitle, String postDescription, ArrayList<String> tags) {
		// User-related fields
		posterId = user.getUserId();
		name = user.getUserFirstName() + " " + user.getUserLastName();
		
		// Everything else
		this.timePosted = timePosted;
		this.postId = postId;
		this.postTitle = postTitle;
		this.postDescription = postDescription;
		this.tags = tags;
	}
	
	public void setPosterId(int posterId) {
		this.posterId = posterId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTimePosted(int timePosted) {
		this.timePosted = timePosted;
	}
	
	public void setPostId(int postId) {
		this.postId = postId;
	}
	
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	
	public void setPostDescription(String postDescription) {
		this.postDescription = postDescription;
	}
	
	public void setTags(ArrayList<String> tags) {
		for (String tag : tags) {
			this.tags.add(tag);
		}
	}
	
	public int getPosterId() {
		return this.posterId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getTimePosted() {
		return this.timePosted;
	}
	
	public int getPostId() {
		return this.postId;
	}
	
	public String getPostTitle() {
		return this.postTitle;
	}
	
	public String getPostDescription() {
		return this.postDescription;
	}
	
	public ArrayList<String> getTags(){
		return this.tags;
	}
}
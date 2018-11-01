package org.itstep.spring;

public class News {
	
	private int id;
	private String title;
	private String about;
	private String content;
	private String publish;
	private String photo;
	
	public News() {}
	
	public News (String title, String about, String content,String publish,String photo) {
		this.title = title;
		this.about = about;
		this.content = content;
		this.publish = publish;
		this.photo = photo;
	}
	
	public int getId() {
		return id;
	}
	
	public String getAbout() {
		return about;
	}
	public String getContent() {
		return content;
	}
	public String getPublish() {
		return publish;
	}
	public String Photo() {
		return photo;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}


}

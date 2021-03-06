package pl.reaktor.model;

public class Article {
	 private String title; 
	 private String content; 
	 private String tags;
	 private int age;
	 
	 public Article(){}       
	 
	 public Article(String title, String content, String tags, int age) { 
	        this.title = title; 
	        this.content = content; 
	        this.tags = tags;
	        this.age = age;
	 }
	 
	public String addText(String content) {
		StringBuffer c1 = new StringBuffer(content);
		return (content + " \nOdwrócona treść posta\n" + c1.reverse().toString());
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	 
	 
}

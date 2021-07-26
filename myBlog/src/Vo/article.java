package Vo;

public class article {
	public int textId;
	public String title;
	public String description;
	public String context;
	public String time;
	public String type;
	public int getTextId(){
		return textId;
	}
	public String getTitle(){
		return title;
	}
	public String getDescription(){
		return description;
	}
	public String getContext(){
		return context;
	}
	public String getTime(){
		return time;
	}
	public String getType(){
		return type;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setTextId(int textId) {
		this.textId = textId;
	}
	public void setTextId(String context) {
		this.context = context;
	}
}

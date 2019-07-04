package entity;

public class UserBean {
	private String id;
	private String account="";
	private String pwd = "";
	private int isOk = 1;
	private int sex = -1;
	private int age = -1;
	private String school = "未知学校";
	private String nickname = "";
	private String text = "";
	
	public void setId(String id){
		this.id = id;
	}
	
	public void setAccount(String account){
		this.account = account;
	}
	
	public void setPwd(String pwd){
		this.pwd = pwd;
	}
	
	public void setIsOk(int isOk){
		this.isOk = isOk;
	}
	
	public void setSex(int sex){
		this.sex = sex;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	public void setSchool(String school){
		this.school = school;
	}
	
	public String getId(){
		return this.id;
	}
	
	public String getAccount(){
		return this.account;
	}
	
	public String getPwd(){
		return this.pwd;
	}
	
	public int getIsOk(){
		return this.isOk;
	}
	
	public int getSex(){
		return this.sex;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public String getSchool(){
		return this.school;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}

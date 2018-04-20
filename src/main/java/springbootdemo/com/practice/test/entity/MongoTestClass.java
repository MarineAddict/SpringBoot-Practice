package springbootdemo.com.practice.test.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="student")
public class MongoTestClass {

	
	private String name;
    private String sex;
    private Integer age;
    private String des;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
  
    
	
	
	
}

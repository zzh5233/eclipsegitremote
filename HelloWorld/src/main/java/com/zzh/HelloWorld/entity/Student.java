package com.zzh.HelloWorld.entity;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.Email;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@ConfigurationProperties(prefix="student")
//@Validated//开启jsr303数据校验的注解 
//@PropertySource(value= {"classpath:conf.properties"})
public class Student {
	
	@Value("4924622@qq.com") //Value注入也支持JSR303数据检验 
	@Email
	private String email;
	
	//@Value("${student.uname}")
	private String userName;
	
	@Value("ww")
	private String name;
	@Value("33")
	private int age;
	private boolean sex;	//true 男
	private Date birthday;
	private Map<String,String> location;	//{province: 河南，city: 郑州}
	//@Value("[打篮球1, 踢足球1] ")
	private List<String> hobbies;
	private String[] skill;
	
	private Pet pet;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Map<String, String> getLocation() {
		return location;
	}

	public void setLocation(Map<String, String> location) {
		this.location = location;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public String[] getSkill() {
		return skill;
	}

	public void setSkill(String[] skill) {
		this.skill = skill;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Student [email=" + email + ", userName=" + userName + ", name=" + name + ", age=" + age + ", sex=" + sex
				+ ", birthday=" + birthday + ", location=" + location + ", hobbies=" + hobbies + ", skill="
				+ Arrays.toString(skill) + ", pet=" + pet + "]";
	}
}

package com.yuqiyu.chapter444.entity.test1;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.alibaba.fastjson.annotation.JSONType;
@Entity
@Table(name="t_user")
public class UserEntity implements Serializable{
	@Id
	//@GeneratedValue
	//Table 'test.hibernate_sequence' doesn't exist 解决方法
	@GeneratedValue(strategy = GenerationType.IDENTITY)//
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private int age;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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

}

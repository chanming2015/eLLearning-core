/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.xms.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Project:eLearning-core
 * Package:com.dyr.xms.test.model
 * FileName:Group.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-3-27 下午4:29:07
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
@Entity
@Table(name="t_group")
public class Group {

	private Integer id;
	private String name;
	private String descr;
	public Group(){
		
	}
	/**
	 * Project:eLearning-core
	 * Package:com.dyr.xms.test.model
	 * FileName:Group.java
	 * Comments:
	 * JDK Version:
	 * Author XuMaoSen
	 * Create Date:2015-3-27 下午4:41:07
	 * Modified By:XuMaoSen
	 * Modified Time:
	 * What is Modified:
	 * Version:
	 */
	public Group(Integer id, String name, String descr) {
		super();
		this.id = id;
		this.name = name;
		this.descr = descr;
	}
	/**
	 * Author XuMaoSen
	 * @return the id
	 */
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	/**
	 * Author XuMaoSen
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * Author XuMaoSen
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Author XuMaoSen
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Author XuMaoSen
	 * @return the descr
	 */
	public String getDescr() {
		return descr;
	}
	/**
	 * Author XuMaoSen
	 * @param descr the descr to set
	 */
	public void setDescr(String descr) {
		this.descr = descr;
	}
}

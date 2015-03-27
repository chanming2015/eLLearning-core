/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.xms.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Project:eLearning-core
 * Package:com.dyr.xms.test.model
 * FileName:Role.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-3-27 下午4:33:11
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
@Entity
@Table(name="t_role")
public class Role {
	
	private Integer id;
	private String name;
	private RoleType roleType;
	
	public Role(){
		
	}
	public Role(Integer id, String name, RoleType roleType) {
		this.id = id;
		this.name = name;
		this.roleType = roleType;
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
	 * @return the roleType
	 */
	@Enumerated(EnumType.STRING)
	@Column(name="role_type")
	public RoleType getRoleType() {
		return roleType;
	}
	/**
	 * Author XuMaoSen
	 * @param roleType the roleType to set
	 */
	public void setRoleType(RoleType roleType) {
		this.roleType = roleType;
	}

}

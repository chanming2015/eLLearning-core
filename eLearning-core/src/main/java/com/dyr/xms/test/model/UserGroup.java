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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Project:eLearning-core
 * Package:com.dyr.xms.test.model
 * FileName:UserGroup.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-3-27 下午4:43:42
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
@Entity
@Table(name="t_user")
public class UserGroup {

	private Integer id;
	private User user;
	private Group group;
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
	 * @return the user
	 */
	@ManyToOne
	@JoinColumn(name="u_id")
	public User getUser() {
		return user;
	}
	/**
	 * Author XuMaoSen
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	/**
	 * Author XuMaoSen
	 * @return the group
	 */
	@ManyToOne
	@JoinColumn(name="g_id")
	public Group getGroup() {
		return group;
	}
	/**
	 * Author XuMaoSen
	 * @param group the group to set
	 */
	public void setGroup(Group group) {
		this.group = group;
	}
}

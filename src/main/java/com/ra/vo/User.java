package com.ra.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class User {
	
	@Id
	private String id;
	private String pwd;
	private boolean enabled;
	private String role;
	private String nickname;
	
}

package com.housematch.user.model.dto;

import java.util.List;

import com.housematch.interest.model.dto.InterestTypeDto;

import lombok.Data;

@Data
public class UserDto {

	private String id;
	private String pw;
	private String name;
	private String email;
	private String regTime; // 자동 생성
	private List<InterestTypeDto> types;

	public UserDto(String id, String pw, String name, String email, String regTime) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.regTime = regTime;
	}

	public UserDto(String id, String name, String email, String regTime) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.regTime = regTime;
	}

	public UserDto(String id, String pw, String name, String email, List<InterestTypeDto> types) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.types = types;
	}

	public UserDto() {
		super();
	}

}

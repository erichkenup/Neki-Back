package com.neki.api.dto;

import java.time.LocalDate;

public class UserDto {

	  	private Integer id;
	    private String login;
	    private String password;
	    private LocalDate lastLoginDate;

		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public LocalDate getLastLoginDate() {
			return lastLoginDate;
		}
		public void setLastLoginDate(LocalDate lastLoginDate) {
			this.lastLoginDate = lastLoginDate;
		}
}

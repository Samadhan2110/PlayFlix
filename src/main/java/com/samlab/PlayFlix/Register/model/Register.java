package com.samlab.PlayFlix.Register.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="registerr")


public class Register {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long userId;
		public Long getUserId() {
			return userId;
		}
		public void setUserId(Long userId) {
			this.userId = userId;
		}
		private String userName;
		private String userEmailAdress;
		private String userPassword;
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserEmailAdress() {
			return userEmailAdress;
		}
		public void setUserEmailAdress(String userEmailAdress) {
			this.userEmailAdress = userEmailAdress;
		}
		public String getUserPassword() {
			return userPassword;
		}
		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}
		
}

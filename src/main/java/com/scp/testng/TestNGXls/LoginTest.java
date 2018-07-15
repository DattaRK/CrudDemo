		package com.scp.testng.TestNGXls;
		
		import javax.persistence.Entity;
		import javax.persistence.Inheritance;
		import javax.persistence.InheritanceType;
		import javax.persistence.Table;
		
		@Entity
		@Table(name="LoginTest_info")
		@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
		
		public class LoginTest {
		
				String username;
				String password;
				String msg;
				
				@Override
				public String toString() {
					return "loginTest [username=" + username + ", password=" + password + ", msg=" + msg + "]";
				}
		
			LoginTest(String username, String password, String msg) {
					super();
					this.username = username;
					this.password = password;
					this.msg = msg;
				}
		
				public String getUsername() {
					return username;
				}
		
				public void setUsername(String username) {
					this.username = username;
				}
		
				public String getPassword() {
					return password;
				}
		
				public void setPassword(String password) {
					this.password = password;
				}
		
				public String getMsg() {
					return msg;
				}
		
				public void setMsg(String msg) {
					this.msg = msg;
				}
				
		
			
		
		}

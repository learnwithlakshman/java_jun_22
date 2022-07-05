package com.careerit.cj.day19;

import java.util.UUID;

public class Contact {
		
		private UUID cid;
		private String name;
		private String email;
		private String mobile;
		private String city;
		
		public Contact(String name, String email, String mobile, String city) {
			this.name = name;
			this.email = email;
			this.mobile = mobile;
			this.city = city;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}

		public UUID getCid() {
			return cid;
		}

		public void setCid(UUID cid) {
			this.cid = cid;
		}

		
		
}

   package com.pepcus.employee.modal;

	import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
	import javax.persistence.Table;

	@Entity
	@Table(name = "Employee")
	public class Employee {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int empid;
		private String name;
		private String email;	
		@OneToMany(targetEntity = Address.class,cascade = CascadeType.ALL)
		@JoinColumn(name="id")
		private List<Address> address;

		public int getEmpid() {
			return empid;
		}

		public void setEmpid(int empid) {
			this.empid = empid;
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

		public List<Address> getAddress() {
			return address;
		}

		public void setAddress(List<Address> address) {
			this.address = address;
		}

	}




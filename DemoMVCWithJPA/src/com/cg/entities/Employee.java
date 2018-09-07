package com.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name="employee")
public class Employee 
{
	@Id
	@Column(name="empno")
	@NotNull(message="Employee number is mandatory")
	private Integer empno;
	
	@Column(name="empname")
	@NotEmpty(message="Name is mandatory")
	private String empname;
	
	@Column(name="age")
	@NotNull(message="age is required")
	private Integer age;

	public Integer getempno() {
		return empno;
	}

	public void setempno(Integer empno) {
		this.empno = empno;
	}

	public String getempname() {
		return empname;
	}

	public void setempname(String empname) {
		this.empname = empname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}

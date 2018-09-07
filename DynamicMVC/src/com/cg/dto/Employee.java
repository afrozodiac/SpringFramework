package com.cg.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class Employee 
{
    @NotNull(message="Empno is manadatory")
    private Integer empno;
    
    @NotEmpty(message="Name is manadatory")
    @Pattern(regexp="[A-Za-z]{3,15}", message="Name should contain min 3 to max 15 letters")
    private String empName;
    
    @NotNull(message="Age is manadatory")
    private Integer age;
    
    public Employee() 
    {
        
    }

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee [empno=" + empno + ", empName=" + empName + ", age="
                + age + "]";
    }
    
    
    
    
}

package com.example.jspdemo.model;

import javax.persistence.*;

@Entity
@Table(name="EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String emp_name;

    @Column
    private String emp_email;
    
    @Column
    private String emp_phone;
    
    @Override
	public String toString() {
		return "Employee [id=" + id + ", emp_name=" + emp_name + ", emp_email=" + emp_email + ", emp_phone=" + emp_phone
				+ ", emp_address=" + emp_address + "]";
	}

	public Employee(Long id, String emp_name, String emp_email, String emp_phone, String emp_address) {
		super();
		this.id = id;
		this.emp_name = emp_name;
		this.emp_email = emp_email;
		this.emp_phone = emp_phone;
		this.emp_address = emp_address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Column
    private String emp_address;
   

    public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_email() {
		return emp_email;
	}

	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}

	public String getEmp_phone() {
		return emp_phone;
	}

	public void setEmp_phone(String emp_phone) {
		this.emp_phone = emp_phone;
	}

	public String getEmp_address() {
		return emp_address;
	}

	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}

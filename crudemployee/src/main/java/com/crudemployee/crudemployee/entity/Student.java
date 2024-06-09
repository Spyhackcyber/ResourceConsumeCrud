package com.crudemployee.crudemployee.entity;

	import jakarta.persistence.Column;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Entity;
	import jakarta.persistence.Table;
	import lombok.Data;
	import lombok.Getter;
	import lombok.Setter;

	@Data
	@Entity
	@Table(name = "Student2")
	public class Student {


		    @Id
		   // @GeneratedValue(strategy = GenerationType.IDENTITY)
		    @Column(name="STD_ID")
		    private Long id;

		    @Column(name="STD_NAME")
		    private String emp_name;
		    
		    @Column(name="STD_ADDRESS")
		    private String emp_address;
		
	}

	
	


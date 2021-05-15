package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

 @Data
 @Entity
 @Table(name="employer_phones")
  public class EmployerPhone{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private int id;
	
	@ManyToOne()
	@JsonIgnoreProperties(value = {"phones"})
	private Employer employer;

	@Column(name = "phone_number")
	private String phoneNumber ;
	
 }




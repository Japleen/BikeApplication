package com.example.bike.models;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Bike {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	private String name;
	private String email;
	private String phone;
	private String model;
	private String serialNumber;
	private BigDecimal purchasePrice;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern ="YYYY-MM-DD")
	private Date purchaseDate;
	private Boolean contact;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	//@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public Boolean getContact() {
		return contact;
	}
	public void setContact(Boolean contact) {
		this.contact = contact;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	@Override
	public String toString() {
		return "Bike [name=" + name + ", email=" + email + ", phone=" + phone + ", model=" + model + ", serialNumber="
				+ serialNumber + ", purchasePrice=" + purchasePrice + ", purchaseDate=" + purchaseDate + ", contact="
				+ contact + "]";
	}
	
//	@Autowired Environment env;
//	 
//	@Bean
//	public DataSource dataSource() {
//	    final DriverManagerDataSource dataSource = new DriverManagerDataSource();
//	    dataSource.setDriverClassName(env.getProperty("driverClassName"));
//	    dataSource.setUrl(env.getProperty("url"));
//	    dataSource.setUsername(env.getProperty("user"));
//	    dataSource.setPassword(env.getProperty("password"));
//	    return dataSource;
//	}

	
}

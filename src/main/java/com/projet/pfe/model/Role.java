package com.projet.pfe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity  
//defining class name as Table name  
@Table 
//Defining book id as primary key 
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id") 
	private int ID_ROLE;  
	@Column  (name="ROLE")
	private String LIB_ROLE;
	public int getID_ROLE() {
		return ID_ROLE;
	}
	public void setID_ROLE(int iD_ROLE) {
		ID_ROLE = iD_ROLE;
	}
	public String getLIB_ROLE() {
		return LIB_ROLE;
	}
	public void setLIB_ROLE(String lIB_ROLE) {
		LIB_ROLE = lIB_ROLE;
	}
	@Override
	public String toString() {
		return "Role [ID_ROLE=" + ID_ROLE + ", LIB_ROLE=" + LIB_ROLE + "]";
	}
	

}

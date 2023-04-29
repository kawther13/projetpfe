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
public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id") 
	private int ID_CAT;  
	@Column  (name="libelle")
	private int LIB_CAT;
	public int getID_CAT() {
		return ID_CAT;
	}
	public void setID_CAT(int iD_CAT) {
		ID_CAT = iD_CAT;
	}
	public int getLIB_CAT() {
		return LIB_CAT;
	}
	public void setLIB_CAT(int lIB_CAT) {
		LIB_CAT = lIB_CAT;
	}
	@Override
	public String toString() {
		return "Categorie [ID_CAT=" + ID_CAT + ", LIB_CAT=" + LIB_CAT + "]";
	} 
	
}

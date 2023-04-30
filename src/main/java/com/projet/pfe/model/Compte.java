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
public class Compte {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id") 
	private int ID_COMPTE;  
	@Column  (name="nom ")
	private String MDP_COMPTE;
	public int getID_COMPTE() {
		return ID_COMPTE;
	}
	public void setID_COMPTE(int iD_COMPTE) {
		ID_COMPTE = iD_COMPTE;
	}
	public String getMDP_COMPTE() {
		return MDP_COMPTE;
	}
	public void setMDP_COMPTE(String mDP_COMPTE) {
		MDP_COMPTE = mDP_COMPTE;
	}
	@Override
	public String toString() {
		return "Compte [ID_COMPTE=" + ID_COMPTE + ", MDP_COMPTE=" + MDP_COMPTE + "]";
	}
	
}

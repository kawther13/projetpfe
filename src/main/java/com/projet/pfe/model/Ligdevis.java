package com.projet.pfe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity  
//defining class name as Table name  
@Table 
//Defining book id as primary key
public class Ligdevis {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id") 
	private int NUM_LIG_DEV;  
	@Column  (name="quantite ")
	private int QTE_LIG_DEV;
	@Column  (name="SOMME ")
	private int SOMME_LIG_DEV;
	@ManyToOne 
	private Devis devis;
	public int getNUM_LIG_DEV() {
		return NUM_LIG_DEV;
	}
	public void setNUM_LIG_DEV(int nUM_LIG_DEV) {
		NUM_LIG_DEV = nUM_LIG_DEV;
	}
	public int getQTE_LIG_DEV() {
		return QTE_LIG_DEV;
	}
	public void setQTE_LIG_DEV(int qTE_LIG_DEV) {
		QTE_LIG_DEV = qTE_LIG_DEV;
	}
	public int getSOMME_LIG_DEV() {
		return SOMME_LIG_DEV;
	}
	public void setSOMME_LIG_DEV(int sOMME_LIG_DEV) {
		SOMME_LIG_DEV = sOMME_LIG_DEV;
	}
	@Override
	public String toString() {
		return "Ligdevis [NUM_LIG_DEV=" + NUM_LIG_DEV + ", QTE_LIG_DEV=" + QTE_LIG_DEV + ", SOMME_LIG_DEV="
				+ SOMME_LIG_DEV + "]";
	}
	
}

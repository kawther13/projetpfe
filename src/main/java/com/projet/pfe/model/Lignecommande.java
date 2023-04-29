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
public class Lignecommande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id") 
	private int NUM_LIG_CMD;  
	@Column  (name="quantite ")
	private int QTE_LIG_CMD;
	@Column  (name="SOMME ")
	private int SOMME_LIG_CMD;
	@ManyToOne 
	private Commande commande;
	public int getNUM_LIG_CMD() {
		return NUM_LIG_CMD;
	}
	public void setNUM_LIG_CMD(int nUM_LIG_CMD) {
		NUM_LIG_CMD = nUM_LIG_CMD;
	}
	public int getQTE_LIG_CMD() {
		return QTE_LIG_CMD;
	}
	public void setQTE_LIG_CMD(int qTE_LIG_CMD) {
		QTE_LIG_CMD = qTE_LIG_CMD;
	}
	public int getSOMME_LIG_CMD() {
		return SOMME_LIG_CMD;
	}
	public void setSOMME_LIG_CMD(int sOMME_LIG_CMD) {
		SOMME_LIG_CMD = sOMME_LIG_CMD;
	}
	@Override
	public String toString() {
		return "Lignecommande [NUM_LIG_CMD=" + NUM_LIG_CMD + ", QTE_LIG_CMD=" + QTE_LIG_CMD + ", SOMME_LIG_CMD="
				+ SOMME_LIG_CMD + "]";
	}
	
}

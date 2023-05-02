package com.projet.pfe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//mark class as an Entity   
import javax.persistence.Table;
@Entity  
//defining class name as Table name  
@Table 
//Defining book id as primary key 
public class Utilisateur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="Id") 
	private int ID_UT;  
	@Column  (name="nom ")
	private String NOM_UT;  
	@Column (name =" prenom")
	private String PRE_UT; 
	@Column (name =" telephone")
	private String TEL_UT;
	@Column (name =" e-mail")
	private String MAIL_UT;
	public int getID_UT() {
		return ID_UT;
	}
	public void setID_UT(int iD_UT) {
		ID_UT = iD_UT;
	}
	public String getNOM_UT() {
		return NOM_UT;
	}
	public void setNOM_UT(String nOM_UT) {
		NOM_UT = nOM_UT;
	}
	public String getPRE_UT() {
		return PRE_UT;
	}
	public void setPRE_UT(String pRE_UT) {
		PRE_UT = pRE_UT;
	}
	public String getTEL_UT() {
		return TEL_UT;
	}
	public void setTEL_UT(String tEL_UT) {
		TEL_UT = tEL_UT;
	}
	public String getMAIL_UT() {
		return MAIL_UT;
	}
	public void setMAIL_UT(String mAIL_UT) {
		MAIL_UT = mAIL_UT;
	}
	@Override
	public String toString() {
		return "Utilisateur [ID_UT=" + ID_UT + ", NOM_UT=" + NOM_UT + ", PRE_UT=" + PRE_UT + ", TEL_UT=" + TEL_UT
				+ ", MAIL_UT=" + MAIL_UT + "]";
	}
	
	
}

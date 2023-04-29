package com.projet.pfe.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table 
//Defining book id as primary key 
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id") 
	private int ID_clt;  
	@Column  (name="nom ")
	private String NOM_clt;  
	@Column (name =" prenom")  
	private String PRENOM_CLT;  
	@Column  (name="adress ")
	private String  ADR_CLT;
	@Column  (name="numéro ")
	private String NUM_TEL_CLT;
	
	
	@OneToMany(mappedBy="client")
	private List<Devis> devis;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_client_id", referencedColumnName="ID_clt")
	private List<Commande> commandes;
	
	
	public List<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}
	public int getID_clt() {
		return ID_clt;
	}
	public void setID_clt(int iD_clt) {
		ID_clt = iD_clt;
	}
	public String getNOM_clt() {
		return NOM_clt;
	}
	public void setNOM_clt(String nOM_clt) {
		NOM_clt = nOM_clt;
	}
	public String getPRENOM_CLT() {
		return PRENOM_CLT;
	}
	public void setPRENOM_CLT(String pRENOM_CLT) {
		PRENOM_CLT = pRENOM_CLT;
	}
	public String getADR_CLT() {
		return ADR_CLT;
	}
	public void setADR_CLT(String aDR_CLT) {
		ADR_CLT = aDR_CLT;
	}
	public String getNUM_TEL_CLT() {
		return NUM_TEL_CLT;
	}
	public void setNUM_TEL_CLT(String nUM_TEL_CLT) {
		NUM_TEL_CLT = nUM_TEL_CLT;
	}
	@Override
	public String toString() {
		return "Client [ID_clt=" + ID_clt + ", NOM_clt=" + NOM_clt + ", PRENOM_CLT=" + PRENOM_CLT + ", ADR_CLT="
				+ ADR_CLT + ", NUM_TEL_CLT=" + NUM_TEL_CLT + ", commandes=" + commandes + "]";
	}
	

}

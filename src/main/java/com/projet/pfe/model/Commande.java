package com.projet.pfe.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity  
//defining class name as Table name  
@Table 
//Defining book id as primary key 
public class Commande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id") 
	private int ID_CMD;  
	@Column  (name="date")
	private String DATE_CMD;
	@ManyToOne 
	private Client client;
	@OneToMany(mappedBy="commande")
	private List<Lignecommande> lignecommande;
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public int getID_CMD() {
		return ID_CMD;
	}
	public void setID_CMD(int iD_CMD) {
		ID_CMD = iD_CMD;
	}
	public String getDATE_CMD() {
		return DATE_CMD;
	}
	public void setDATE_CMD(String dATE_CMD) {
		DATE_CMD = dATE_CMD;
	}
	@Override
	public String toString() {
		return "Commande [ID_CMD=" + ID_CMD + ", DATE_CMD=" + DATE_CMD + ", client=" + client + "]";
	}  
	
}

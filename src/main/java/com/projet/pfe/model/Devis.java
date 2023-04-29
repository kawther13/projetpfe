package com.projet.pfe.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Devis {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id") 
	private int NUM_DEV;  
	@Column  (name="Date devis  ")
	private String DATE_DEV;  
	@Column (name =" TOTAL DEVIS")  
	private double TOTAL_DEV;  
	@Column  (name="remise ")
	private double  remise;
	@Column  (name="taux remis ")
	private double taux_HT_rem;
	@ManyToOne 
	private Client client;
	@OneToMany(mappedBy="devis")
	private List<Ligdevis> ligdevis;
	public int getNUM_DEV() {
		return NUM_DEV;
	}
	public void setNUM_DEV(int nUM_DEV) {
		NUM_DEV = nUM_DEV;
	}
	public String getDATE_DEV() {
		return DATE_DEV;
	}
	public void setDATE_DEV(String dATE_DEV) {
		DATE_DEV = dATE_DEV;
	}
	public double getTOTAL_DEV() {
		return TOTAL_DEV;
	}
	public void setTOTAL_DEV(double tOTAL_DEV) {
		TOTAL_DEV = tOTAL_DEV;
	}
	public double getRemise() {
		return remise;
	}
	public void setRemise(double remise) {
		this.remise = remise;
	}
	public double getTaux_HT_rem() {
		return taux_HT_rem;
	}
	public void setTaux_HT_rem(double taux_HT_rem) {
		this.taux_HT_rem = taux_HT_rem;
	}
	@Override
	public String toString() {
		return "Devis [NUM_DEV=" + NUM_DEV + ", DATE_DEV=" + DATE_DEV + ", TOTAL_DEV=" + TOTAL_DEV + ", remise="
				+ remise + ", taux_HT_rem=" + taux_HT_rem + "]";
	}
	
}

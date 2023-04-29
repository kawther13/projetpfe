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
public class Facture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id") 
	private int ID_fact;  
	@Column  (name="Montant fact")
	private double MONTANT_FACT;
	@Column  (name="Total TV")
	private double TOTAL_HT ;
	@Column  (name="Total ttc")
	private double TOTAL_ttc ;
	@Column  (name="quantit")
	private int qte_fact ;
	public int getID_fact() {
		return ID_fact;
	}
	public void setID_fact(int iD_fact) {
		ID_fact = iD_fact;
	}
	public double getMONTANT_FACT() {
		return MONTANT_FACT;
	}
	public void setMONTANT_FACT(double mONTANT_FACT) {
		MONTANT_FACT = mONTANT_FACT;
	}
	public double getTOTAL_HT() {
		return TOTAL_HT;
	}
	public void setTOTAL_HT(double tOTAL_HT) {
		TOTAL_HT = tOTAL_HT;
	}
	public double getTOTAL_ttc() {
		return TOTAL_ttc;
	}
	public void setTOTAL_ttc(double tOTAL_ttc) {
		TOTAL_ttc = tOTAL_ttc;
	}
	public int getQte_fact() {
		return qte_fact;
	}
	public void setQte_fact(int qte_fact) {
		this.qte_fact = qte_fact;
	}
	@Override
	public String toString() {
		return "Facture [ID_fact=" + ID_fact + ", MONTANT_FACT=" + MONTANT_FACT + ", TOTAL_HT=" + TOTAL_HT
				+ ", TOTAL_ttc=" + TOTAL_ttc + ", qte_fact=" + qte_fact + "]";
	}
	
	

}

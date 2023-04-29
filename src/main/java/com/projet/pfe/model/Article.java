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
public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id") 
	private int ID_ART;  
	@Column  (name="libelle")
	private String LIB_ART;
	@Column  (name="description")
	private String DESC_ART;
	@Column  (name="SOLDE")
	private double SOLD_ART;
	@Column  (name="TAX")
	private double TAX_ART;
	@Column  (name="prix")
	private double PRIX_ART;
	@Column  (name="quantit")
	private String Qte_stock_ART;
	public int getID_ART() {
		return ID_ART;
	}
	public void setID_ART(int iD_ART) {
		ID_ART = iD_ART;
	}
	public String getLIB_ART() {
		return LIB_ART;
	}
	public void setLIB_ART(String lIB_ART) {
		LIB_ART = lIB_ART;
	}
	public String getDESC_ART() {
		return DESC_ART;
	}
	public void setDESC_ART(String dESC_ART) {
		DESC_ART = dESC_ART;
	}
	public double getSOLD_ART() {
		return SOLD_ART;
	}
	public void setSOLD_ART(double sOLD_ART) {
		SOLD_ART = sOLD_ART;
	}
	public double getTAX_ART() {
		return TAX_ART;
	}
	public void setTAX_ART(double tAX_ART) {
		TAX_ART = tAX_ART;
	}
	public double getPRIX_ART() {
		return PRIX_ART;
	}
	public void setPRIX_ART(double pRIX_ART) {
		PRIX_ART = pRIX_ART;
	}
	public String getQte_stock_ART() {
		return Qte_stock_ART;
	}
	public void setQte_stock_ART(String qte_stock_ART) {
		Qte_stock_ART = qte_stock_ART;
	}
	@Override
	public String toString() {
		return "Article [ID_ART=" + ID_ART + ", LIB_ART=" + LIB_ART + ", DESC_ART=" + DESC_ART + ", SOLD_ART="
				+ SOLD_ART + ", TAX_ART=" + TAX_ART + ", PRIX_ART=" + PRIX_ART + ", Qte_stock_ART=" + Qte_stock_ART
				+ "]";
	}
	
	
	

}

package src;

import java.util.Date;
import java.util.List;

public class Commande implements Comparable<Commande>{
 private int NumCommande;
 private Date DateCommande;
 private String NomFournisseur;
 
 public Commande(int NumCommande,Date DateCommande,String NomFournisseur){
	 this.NumCommande=NumCommande;
	 this.DateCommande=DateCommande;
	 this.NomFournisseur=NomFournisseur;
 }

 // geter and setare
public int getNumCommande() {
	return NumCommande;
}

public void setNumCommande(int numCommande) {
	NumCommande = numCommande;
}

public Date getDateCommande() {
	return DateCommande;
}

public void setDateCommande(Date dateCommande) {
	DateCommande = dateCommande;
}

public String getNomFournisseur() {
	return NomFournisseur;
}

public void setNomFournisseur(String nomFournisseur) {
	NomFournisseur = nomFournisseur;
}
 
 public String toString() {
	return "le nom de fourniseur est "+NomFournisseur+"la date de commande est "+DateCommande+"le numero de commande est "+	NumCommande+".";
	 
 }

 public boolean equals(Object obj) {
	 if(this==obj) {
		 return true;
	 }
	 if(obj==null||  getClass()!= obj.getClass()) {
		 return false;
	 }
	 Commande c= (Commande)obj;
	return this.NumCommande==c.NumCommande;
 }

@Override
public int compareTo(Commande o) {
    return this.DateCommande.compareTo(o.DateCommande);
}

}

 
 



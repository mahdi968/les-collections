package src;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private int CodeClient;
	private String NomClient;
	private String AdrClient;
	private String TelClient;
     private List<String> ListCommandes;
	
	public Client(int CodeClient,String NomClient,String AdrClient) {
		this.CodeClient=CodeClient;
		this.NomClient=NomClient;
		this.AdrClient=AdrClient;
		this.ListCommandes= new ArrayList<>();
	}



public int getCodeClient() {
		return CodeClient;
	}

	public void setCodeClient(int codeClient) {
		this.CodeClient = codeClient;
	}
	public String getNomClient() {
		return NomClient;
	}

	public void setNomClient(String nomClient) {
		this.NomClient = nomClient;
	}

	public String getAdrClient() {
		return AdrClient;
	}

	public void setAdrClient(String adrClient) {
		this.AdrClient = adrClient;
	}

	public String getTelClient() {
		return TelClient;
	}

	public void setTelClient(String telClient) {
		this.TelClient = telClient;
	}





	public List<String> getListCommandes() {
		return ListCommandes;
	}


	public void setListCommandes(List<String> listCommandes) {
		ListCommandes = listCommandes;
	}





public void Ajouter(String commande) {
	ListCommandes.add(commande);
}


public boolean supprimerCommande(String numCommande) {
    if (ListCommandes.contains(numCommande)) {
    	ListCommandes.remove(numCommande);
        return true; 
    }
    return false; 
}

@Override
public String toString() {
    return "Code Client: " + CodeClient + 
           "\nNom Client: " + NomClient + 
           "\nAdresse Client: " + AdrClient + 
           "\nTéléphone Client: " + TelClient + ".";
       
}
}

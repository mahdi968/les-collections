package src;

public class ClientFidel extends Client{
private  String CodeFidelite;
private double TauxReduction;
	public ClientFidel(int CodeClient, String NomClient, String AdrClient,String CodeFidelite,double TauxReduction) {
		super(CodeClient, NomClient, AdrClient);
		this.CodeFidelite=CodeFidelite;
		this.TauxReduction=TauxReduction;
	}
	
	
	
		  public String getCodeFidelite() {
		return CodeFidelite;
	}



	public void setCodeFidelite(String codeFidelite) {
		CodeFidelite = codeFidelite;
	}



	public double getTauxReduction() {
		return TauxReduction;
	}



	public void setTauxReduction(double tauxReduction) {
		TauxReduction = tauxReduction;
	}



		@Override
		    public String toString() {
		        return super.toString() +  "\nCode de Fidélité: " + CodeFidelite +  "\nTaux de Réduction: " + TauxReduction + "%";
		    }
		
	}



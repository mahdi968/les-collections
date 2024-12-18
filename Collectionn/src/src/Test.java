package src;

import java.io.File;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Commande c1 = new Commande(1, new Date(), "Fournisseur1");
        Commande c2= new Commande(2, new Date(), "Fournisseur2");
        Commande c3 = new Commande(3, new Date(), "Fournisseur3");
      
        
        Client cl1 = new Client(1, "Client1", "Adresse1");
        Client cl2= new Client(2, "Client2", "Adresse2");
     
        
        cl1.Ajouter("c1");
        cl2.Ajouter("c2");
        
        System.out.println(c1);
        System.out.println(c2);

        // Utilisation de Collections.sort pour trier les commandes
        Collections.sort(cl1.getListCommandes());
        System.out.println("Commandes triées pour client1: " + cl1.getListCommandes());
        // Utilisation de Set pour éviter les doublons
        
        Set<Commande> commandesSet = new HashSet();
        commandesSet.add(c1);
        commandesSet.add(c2);
        commandesSet.add(c1); // Test duplication
        System.out.println("Commandes sans doublons: " + commandesSet);

        // Utilisation de Map pour associer les clients à leurs codes
        
        Map<String, Client> clientsMap = new HashMap();
        clientsMap.put(cl1.toString(), cl1);
        clientsMap.put(cl2.toString(), cl2);

        // Écriture dans un fichier texte
        
        try (PrintWriter writer = new PrintWriter("clients.txt")) {
            for (Client client : clientsMap.values()) {
                writer.println(client);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Lecture du fichier texte
        try (Scanner scanner = new Scanner(new File("clients.txt"))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
	}

}

package initJava;

import java.util.LinkedList;
import java.util.Queue;

public class InitQueue {
	public static void main(String[] args) {
		// Création d'une file d'attente (queue) en utilisant LinkedList
		Queue<String> queue = new LinkedList<>();
		
		// Enfilez des éléments dans la file d'attente
		queue.add("Client 1");
		queue.add("Client 2");
		queue.add("Client 3");
		
		// Affichage de la file d'attente
		System.out.println("File d'attente initiale : "+queue);
		
		// Defilez des éléments (retirez de la tête de la file)
		String clientServi = queue.poll();
		System.out.println(clientServi+ " est servi.");
		
		// Affichez la file d'attente après le service
		System.out.println("File d'attente après service : " + queue);
		
		
		// Accédez à l'élément en tête de la file sans le retirer
		String prochainClient = queue.peek();
		System.out.println("Prochain client en attente : "+ prochainClient);
	}
}

package initJava;

import java.util.LinkedList;

public class InitLinkedList {

	public static void main(String[] args) {
		// Cr�ation d'une liste cha�n�e (LinkedList)
		LinkedList<String> linkedList = new LinkedList<>();
		
		//Ajout d'�l�ments � la liste
		linkedList.add("�l�ment 1");
		linkedList.add("�l�ment 2");
		linkedList.add("�l�ment 3");
		
		// Affichage de la liste
		System.out.println("Liste cha�n�e initiale : "+linkedList);
		
		//Ajout d'un �l�ment � la premi�re position
		linkedList.addFirst("Nouvel �l�ment en premier");
		
		// Ajout d'un �l�ment � la derni�re position
		linkedList.addLast("Nouvel �lement en dernier");
		
		//Suppression du deuxi�me �l�ment
		linkedList.remove(1);
		
		// Affichage de la liste mise � jour
		System.out.println("Liste cha�n�e apr�s modifications : "+ linkedList);
	}

}

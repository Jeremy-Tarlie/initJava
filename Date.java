package initJava;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {

	public static void main(String[] args) {
		// Exemple 1 : Afficher la date actuelle
		LocalDate currentDate = LocalDate.now();
		System.out.println("Date actuelle "+currentDate);
		
		// Exemple 2: Afficher l'aheure actuelle
		LocalTime currentTime = LocalTime.now();
		System.out.println("Heure actuelle : "+currentTime);
		
		// Exemple 3 : Afficher la date et l'haure actuelles
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Date et heure actuelles : " + currentDateTime);
		
		// Exemple 4 : Formater la date et l'heure actuelles
		LocalDateTime formattedDateTime = LocalDateTime.now();
		System.out.println("Avant le changmeent : "+formattedDateTime);
		
		// Créez un objet DateTimeFormatter avec le format souhaité
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		//Utilisez le formateur pour obtenir la date et l'heure au format spécifié
		String formattedDate = formattedDateTime.format(myFormatObj);
		System.out.println("Après le formatage : "+formattedDate);

	}

}

package initJava;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable
		int num;
		num = 15;
		
		//Data types
		int chiffre = 5;
		float monFloat = 4.50f;
		char monCaractere = 'a';
		boolean veriter = true; //or false
		String monTexte = "Java";
		
		//Type avancé Java
		byte chiffreByte = 127; // Entre -128 jusqu'à 127
		short chiffreShort = 32000; //Entre -32,768 jusqu'a 32.767
		long chiffreLong = 900000; // entre -2^63 and a maximum value of 2^63-1		
		double chiffreDouble = 15234545; //suffisant pour 15 decimal
		
		//Type Casting
		// Du plus petit type
		// byte-> short -> char -> int -> long -> float -> double
		// Du plus gran au plus petit
		// double -> float -> long -> int-> char -> short-> byte
		
		
		//Operators
		// + addition
		// * multiplication 
		// - soustraire
		// / division
		// % modulo
		// ++ increment
		// -- decrement
		
		
		//Operateur d'assigement
		// =   x = 5
		// +=  x +=5
		// -=  x -=5
		// *=  x*=5
		// /=  x /=5 
		// %=  x %=3
		
		
		//Operateur de comparaison
		// ==
		// ===
		// !=
		// !==
		// <
		// >
		// <=
		// >=
		
		
		//Operateur logique
		// &&
		// ||

		
		String prenom = "Jérémy";
		
		System.out.println("hello");
		System.out.println(num);
		System.out.println("la taille du texte est : "+prenom.length());
		System.out.println(prenom.toUpperCase());
		System.out.println(prenom.toLowerCase());
		
		
		//variable swapping
		int x = 100;
		int y = 200;
		System.out.println("Avant Swap");
		System.out.println("x : "+ x);
		System.out.println("y : "+ y);
		
		int tempo;
		tempo = x;
		x = y;
		y = tempo;
		
		System.out.println("Après Swap");
		System.out.println("x : "+ x);
		System.out.println("y : "+ y);
		
		
		
		//Exemple de try catch
		try
		{
		int data=50/0; //may throw exception 
		}
            //handling the exception
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code");
	
	}

}

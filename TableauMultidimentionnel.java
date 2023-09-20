package initJava;

public class TableauMultidimentionnel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String[][] tableauPokemons = {
						{"Bulbizarre","Herbizare","Florizarre"},
						{"Salamèche","Reptincel","Dracaufeu"},
						{"Carapuce","Carabaffe","Tortank"}
						
				};
				for (String[] pokemons : tableauPokemons) {
					for (String unPokemon : pokemons) {
						System.out.println(unPokemon);
					}
					System.out.println();
				}
	}

}

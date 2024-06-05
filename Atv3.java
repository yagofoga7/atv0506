package atv0506;
import java.util.ArrayList;

public class Atv3 {

	public static void main(String[] args) {

		ArrayList<String> frutas = new ArrayList <String>();

		frutas.add("Banana");
		frutas.add("Maçã");
		frutas.add("Jabuticaba");
		frutas.add("Melão");
		frutas.add("Manga");
		frutas.add("Pera");
		frutas.add("Abacate");
		frutas.add("Caqui");
		frutas.add("Uva");
		frutas.add("Abacaxi");
		frutas.add("Morango");
		System.out.println(frutas);
		frutas.remove(0);
		frutas.remove(1);
		frutas.remove(2);
		frutas.remove(3);
		frutas.remove(4);
		System.out.println(frutas);
		System.out.println(frutas.size());
	}
}

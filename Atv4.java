package atv0506;
import java.util.ArrayList;
import java.util.Scanner;
public class Atv4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		ArrayList<String> carro = new ArrayList<> ();
		int i=0;
		
		carro.add("Uno");
		carro.add("Camaro verde");
		carro.add("Jeep Renegade");
		carro.add("Bugatti");
		carro.add("Civic");
		carro.add("Silverado");
		carro.add("S10");
		carro.add("Tesla");
		carro.add("Porche");
		carro.add("Ferrari");
		
		System.out.println(carro);
		System.out.println("qual carro deseja ver?");
		i = ler.nextInt();
		System.out.println(carro.get(i));
		ler.close();


		

	}

}

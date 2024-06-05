package atv0506;

import java.util.ArrayList;
import java.util.Random;

public class Atv1 {

	public static void main(String[] args) {
		
	    int negativo = 0;	
		
		ArrayList<Integer> numeros = new ArrayList<> ();
		
		Random random = new Random() ;
		
		for (int i = 0; i < 5; i++) {
			int numeroAleatorio = random.nextInt();
			numeros.add(numeroAleatorio);
		}
	
        for (Integer num:numeros ) {
        	if (num < 0) {
        		negativo++;
        		System.out.println(num);
        	}
        	
        }
        System.out.println("A soma dos negativos é " + negativo);
	}

}

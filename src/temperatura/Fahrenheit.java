package temperatura;

import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {

    Scanner Scanner = new Scanner(System.in);	
    
	double c;
	
	System.out.println("Qual  a temperatura em graus Celsius ");
	c = Scanner.nextDouble();
	
	double  f = ((c * 9) + 160) / 5;
	
	System.out.println("A temperatura em graus Celsius convertida para Fahrenheit = " + f);
	 
	

	}

}

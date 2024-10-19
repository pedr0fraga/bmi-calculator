package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	  Locale.setDefault(Locale.US);
	  Scanner sc = new Scanner(System.in);
		
	  System.out.println("---------------------");
      System.out.println("Calculadora de IMC");
      System.out.println("---------------------");
      
      System.out.print("Sua altura: ");
      double height = sc.nextDouble();
      
      System.out.print("Seu peso: ");
      double weight = sc.nextDouble();
      
      double imc = weight / (height * height);
      
      System.out.printf("\nSeu IMC é = %.2f%n", imc);
      
      if(imc < 18.5) {
    	  System.out.println("Voce está abaixo do peso normal.");
      }else if (imc >= 18.5 && imc <= 24.9) {
    	  System.out.println("Você está no peso ideal.");
      }else if (imc >= 25.0 && imc <= 29.9) {
       System.out.println("Você está com sobrepeso.");
      }else {
    	  System.out.println("Você está com obesidade.");
      }
      
      
	  sc.close();
	}

}

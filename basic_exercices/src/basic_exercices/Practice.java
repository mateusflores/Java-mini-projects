package basic_exercices;
import java.util.Scanner;


public class Practice {

	public static void main(String[] args) {
		User u = new User();	
		u.name = "Peter";
		u.age = 23;
		System.out.println("Nome: " + u.name + " | Idade: "+ u.age);
		
	}

	public static void somaPares(int total) {
		int soma = 0;

		for (int i=0; i<=total; i++) {
			if (i%2 == 0) {
				soma += i;
			}
		}
		
		System.out.println("A soma dos números pares até " + total + " é " + soma);
	}
	
	public static void operacoes() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Insira dois números: ");
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		
		int soma = n1 + n2;
		int dif = n1 - n2;
		int prod = n1 * n2;
		double quo = n1 / n2;
		
		scn.close();
		
		System.out.println("SOMA: " + soma);
		System.out.println("DIFERENÇA: " + dif);
		System.out.println("PRODUTO: " + prod);
		System.out.println("QUOCIENTE: " + String.format("%.2f", quo));
	}
	
	public static void vogais(String word) {
		char[] arr = word.toCharArray();
		int tam = word.length();
		int quant = 0;
		
		for (int i=0; i<tam; i++) {
			if (arr[i] == 'a')
				quant++;
			else if (arr[i] == 'e')
				quant++;
			else if (arr[i] == 'i')
				quant++;
			else if (arr[i] == 'o')
				quant++;
			else if (arr[i] == 'u')
				quant++;
		}
		
		System.out.println("A palavra " + word + " tem " + quant + " vogais.");
	}
	
	public static void somaDig(int num) {
		int pot = 10;
		int lastNum = 0;
		int sum = 0;
		
		while (num/(pot/10) >= 1) {
			if (num%pot <= 9) {
				sum += num%pot;
				lastNum = num%pot;
				pot *= 10;
			}
			else {
				sum += (num%pot - lastNum)/(pot/10);
				lastNum = num%pot;
				pot *= 10;
				
			}
		}
		System.out.println("A soma dos algarismos de " + num + " é " + sum);
	}

	public void showHi() {
		System.out.println("Hello!");
	}
}

class User {
	String name;
	int age;
}




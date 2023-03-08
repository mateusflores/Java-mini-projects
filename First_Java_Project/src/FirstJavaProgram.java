
public class FirstJavaProgram {

	public static void main(String[] args) {		
		String word = "a";
		word = word.toUpperCase();
		
		
		boolean valor = isPalindrome(word);
		
		if (valor) {
			System.out.println("A palavra é um palindromo!");
		} else {
			System.out.println("A palavra NÃO é um palindromo...");
		}
	}

	
	public static boolean isPalindrome(String word) {
		char[] arr = word.toCharArray();
		int tam = word.length();
		char rev[] = new char[tam];
		
		int j = 0;
		
		for (int i = tam-1; i>=0; i--) {
			rev[i] = arr[j];
			j++;
		}
		
		for (int i=0; i<tam; i++) {
			if (rev[i] != arr[i]) {
				return false;
			}
		}
				
		return true;
	}
}

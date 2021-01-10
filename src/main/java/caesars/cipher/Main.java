package caesars.cipher;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		System.out.println("Enter the word to be encrypted :");
//		Scanner sc = new Scanner(System.in);
//		String message = sc.nextLine();
//		System.out.println("Enter the offset :");
//		int offset = sc.nextInt();
//		
		String message = "how are you doing today";
		int offset = 12;
		
		//created instances of class CaesarsCipher
		CaesarsCipher caesarsCipher = new CaesarsCipher();
		String cipheredMessage = caesarsCipher.cipher(message, offset);
		
		System.out.println("Message: " + message);
		System.out.println("offset: " + offset);
		System.out.println("Ciphered message: " + cipheredMessage);
		

	}

}

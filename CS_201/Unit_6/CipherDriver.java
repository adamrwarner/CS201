package Unit_6;

import java.util.*;

public class CipherDriver {
	
	public static void main(String[] args) {
		
		int menu1, menu2;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter (1) to encode a message");
		System.out.println("\nEnter (2) to decode a message");
		System.out.println("\nEnter (3) to exit");			
		menu1 = input.nextInt();

		if (menu1 == 3){				
			System.exit(0);				
		}		

		if (menu1 == 1 ){
			
			int n;
			System.out.println("\nEnter (1) for substitution cipher");
			System.out.println("\nEnter (2) for shuffle cipher");
			System.out.println("\nEnter (3) to exit");			

			menu2 = input.nextInt();

			System.out.print("\nEnter text to be encoded: ");
			Scanner encodeText = new Scanner(System.in);
			String encode_text = encodeText.nextLine();

			if (menu2 == 3)
				System.exit(0);
			if (menu2 == 1){
				
				System.out.print("\nEnter shift value: ");
				n = input.nextInt();
				input.nextLine();
				SubstitutionCipher sub = new SubstitutionCipher(n);
				String encodedMessage = sub.encode(encode_text);
				System.out.println("Encode Message: " + encodedMessage);						
			}			
			if (menu2 == 2){
				
				System.out.print("Enter number of shuffles: ");
				n = input.nextInt();
				input.nextLine();
				ShuffleCipher shuffleCipher = new ShuffleCipher(n);
				String encodedText = shuffleCipher.encode(encode_text);
				System.out.println("Encode Message: " + encodedText);								
			}
			encodeText.close();
		}
		if (menu1 == 2){

			int n;
			System.out.println("\nEnter (1) for substitution cipher");
			System.out.println("\nEnter (2) for shuffle cipher");
			System.out.println("\nEnter (3) to exit");			
			
			menu2 = input.nextInt();
			
			System.out.print("Enter text to be decode: ");
			Scanner decodeText = new Scanner(System.in);
			String decode_text = decodeText.nextLine();

			if (menu2 == 3)
				System.exit(0);
			if (menu2 == 1){
				System.out.print("Enter shift value: ");
				n = input.nextInt();
				input.nextLine();
				SubstitutionCipher substitution = new SubstitutionCipher(n);
				String decodedText = substitution.decode(decode_text);
				System.out.println("Decoded Message: " + decodedText);						
			}			
			if (menu2 == 2){
				System.out.print("Enter number of shuffles: ");
				n = input.nextInt();
				input.nextLine();
				ShuffleCipher shuffleCipher = new ShuffleCipher(n);
				String decodedText = shuffleCipher.decode(decode_text);
				System.out.println("Decoded Message: " + decodedText);								
			}
			decodeText.close();
		}
		input.close();
	}
}
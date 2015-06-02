package Unit_6;

//Create a class SubstitutionCipher that implements the interface MessageEncoder
public class SubstitutionCipher implements MessageEncoder, MessageDecoder {

	// The constructor should have one parameter called shift
	private int shift;   

	// The constructor with an argument
	public SubstitutionCipher (int shift){
		this.shift = shift;
	}

	//  private method that shifts a single character
	private char shift(char letter, int shiftValue){
		
		char shiftedLetter = letter;       
		shiftedLetter = (char) ( 'a' + ( letter - 'a' + shiftValue ) % 26 );
		return shiftedLetter;
	}

	// Define the method encode so that each letter is shifted by the value in shift
	public String encode(String plainText ){
		
		String encodedText = "";
		for( int i = 0; i < plainText .length(); i++){
			char letter = plainText .charAt(i);
			encodedText += shift(letter, shift);
		}
		return encodedText;
	}
	
	// decodes and returns the given ciphertext
	public String decode(String cipherText){
		
		String decodedText = "";
		for( int i = 0; i < cipherText.length(); i++){
			char letter = cipherText.charAt(i);
			decodedText += shift(letter, - shift);
		}
		return decodedText;
	}
}
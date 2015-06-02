package Unit_6;

// Create a class ShuffleCipher that implements the interface MessageEncoder
public class ShuffleCipher implements MessageEncoder, MessageDecoder {

	// The constructor should have one parameter called n
	private int n;

	// The constructor which takes the shuffle value
	public ShuffleCipher (int n){
		this.n = n;
	}

	// Performs single shuffle
	private String shuffle(String text){

		int splitLetter;
		
		if (text.length() % 2 == 0)
			splitLetter = text.length() / 2;
		else
			splitLetter = ((text.length() + 1) / 2);
		String first = text.substring(0, splitLetter);
		String second = text.substring(splitLetter);
		String shuffleText = "";
		
		for(int i = 0, j = 0; i < first.length(); i++, j++){			
			shuffleText += first.charAt(i);
			if(j < second.length())
				shuffleText += second.charAt(i);           
		}
		return shuffleText;
	}

	// Decodes the shuffled message
	private String decodeShuffle(String text){
		String firstHalf = "", secondHalf = "";
		for(int i=0;i<text.length();i++)
		{
			if(i % 2==0)
				firstHalf += text.charAt(i);
			else
				secondHalf += text.charAt(i);               
		}   
		return firstHalf + secondHalf;
	}

	// Define the method encode so that the message is shuffled n times
	public String encode(String plainText){
		
		String encodedText = plainText;
		for(int i = 0; i < n; i++)
			encodedText = shuffle(encodedText);
		return encodedText;
	}
	
	//decode and returns the cipher text
	public String decode(String cipherText){
		
		String decodedText = cipherText;
		for(int i = 0; i < n; i++)
			decodedText = decodeShuffle(decodedText);
		return decodedText;
	}
} 
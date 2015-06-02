package Unit_6;

// Create an interface MessageDecoder that has a single abstract method decode(cipherText), where cipherText is the message to be decoded.
public interface MessageDecoder {
	
	// decode and returns the given cipher text
	public abstract String decode(String cipherText);

}
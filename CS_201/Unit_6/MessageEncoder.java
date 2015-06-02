package Unit_6;

// Create an interface MessageEncoder that has a single abstract method encode(plainText), where plainText is the message to be encoded. 
public interface MessageEncoder {
	
	// The method will return the given plainText.
	public abstract String encode(String plainText);
}

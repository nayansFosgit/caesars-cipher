package caesars.cipher;

public class CaesarsCipher {
	
	private static final char LETTER_A = 'a';
	private static final char LETTER_Z = 'z';
	private static final int ALPHABET_SIZE = 26;
	
	//Encrypted Message- we need original message and the offset in which you are applying to message
	public String cipher(String message, int offset) {
		//since offset can't exceed after 26 inorder to void overflow over 25
		offset %= ALPHABET_SIZE;
		//converting message to char and storing all of the character into char[]
		char[] character = message.toCharArray();
		offsetBy(character, offset);
		return new String(character);
	}

	private void offsetBy(char[] character, int offset) {
		// TODO Auto-generated method stub
		for(int i = 0; i < character.length; ++i ) {
			if(character[i] != ' ') {
			//running through each and every element in message 
			character[i] = offsetChar(character[i], offset, LETTER_A, LETTER_Z);
			}
		}
		
	}
    
	//message traversal
	private char offsetChar(char c, int offset, char letterA, char letterZ) {
		// TODO Auto-generated method stub
		c += offset;
		//Left rotation
		if(c < letterA) {
			return (char) (c + ALPHABET_SIZE);
		}
		//Right rotation
		if(c > letterZ) {
			return (char) (c - ALPHABET_SIZE);
		} 
		return c;
	}
	

}

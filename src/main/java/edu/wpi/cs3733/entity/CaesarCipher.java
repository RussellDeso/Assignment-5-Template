package edu.wpi.cs3733.entity;

/**
 * Caesar cipher; you must implement the cipher and the observer pattern
 */
public class CaesarCipher implements Observer {
	private String text;
	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	@Override
	public void notify(Object object){
		setText(encode((String) object));
	}

	public String encode(String toEncode){
		String toReturn = "";
		for (int i = 0; i < toEncode.length(); i++) {
			char currentChar = toEncode.charAt(i);
			if(!(((int) currentChar > 64 && (int) currentChar < 91) ||
					((int) currentChar > 96 && (int) currentChar < 123) ||
					(int) currentChar == 32)){
				return "INVALID INPUT";
			}
			if((int) currentChar == 32){
				toReturn += ' ';
			}
			else if(Character.isUpperCase(currentChar)){
				if((int) currentChar < 70) {
					toReturn += (char) (currentChar+21);
				}
				else {toReturn += (char) (currentChar-5);}
			}
			else if(Character.isLowerCase(currentChar)){
				if((int) currentChar < 102) {
					toReturn += (char) (currentChar+21);
				}
				else {toReturn += (char) (currentChar-5);}
			}
		}
		return toReturn;
	}
}

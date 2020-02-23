package edu.wpi.cs3733.entity;

/**
 * Elbonian cipher; you must implement the cipher and the observer pattern
 */
public class ElbonianCipher implements Observer {
	char[] alphabet ={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

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
		if(toEncode.length() > 140){
			return "INVALID INPUT";
		}
		for(int i=0; i < toEncode.length(); i++){
			if((int) toEncode.charAt(i) > 90 && (int) toEncode.charAt(i) < 97){
				return "INVALID INPUT";
			}
			if((int) toEncode.charAt(i) > 122)
			{
				return "INVALID INPUT";
			}
			if((int) toEncode.charAt(i) < 65 && (int) toEncode.charAt(i) > 32)
			{
				return "INVALID INPUT";
			}
			for(int q=0; q < alphabet.length; q++){
				boolean foundMatch = false;
				if((toEncode.toUpperCase().charAt(i)) == alphabet[q]){
					toReturn += String.format("%02d", (q+1));
					foundMatch = true;
				}
				else if((toEncode.charAt(i) == (' '))){
					toReturn += "S";
					foundMatch = true;
					break;
				}
				else if(foundMatch = false){
					return "INVALID INPUT";
				}
			}

		}
		return toReturn;
	}
}

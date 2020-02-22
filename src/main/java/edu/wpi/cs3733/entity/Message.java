package edu.wpi.cs3733.entity;

/**
 * Message class to hold clear text; you must implement the rest of the class
 */
public class Message implements Observable {
	private String text;
//	private
	public void setText(String text){

	}

	public String getText(){
		return null;
	}

	@Override
	public void register(Observer o){

	}

	@Override
	public void notifyObservers(){

	}
}

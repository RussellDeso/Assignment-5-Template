package edu.wpi.cs3733.entity;

import java.util.LinkedList;

/**
 * Message class to hold clear text; you must implement the rest of the class
 */
public class Message implements Observable {
	private String text;
	private LinkedList<Observer> observers = new LinkedList<>();
	public void setText(String text){
		this.text = text;
		notifyObservers();
	}

	public String getText(){
		return text;
	}

	@Override
	public void register(Observer o){
		this.observers.add(o);
	}

	@Override
	public void notifyObservers(){
		for (Observer o: observers) {
			o.notify(text);
		}
	}
}

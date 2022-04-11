package com.jspiders.pkg;

public class Student {

	private int id;
	private MathsCheat cheat;

	public void setId(int id) {
		this.id = id;
	}

	public void setCheat(MathsCheat cheat) {
		this.cheat = cheat;
	}
   
	public void cheating() {
		cheat.MathsCheat();
		System.out.println("Maths cheatingn is started....");
	}
}

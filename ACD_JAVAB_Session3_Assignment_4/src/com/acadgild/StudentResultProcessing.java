package com.acadgild;

public class StudentResultProcessing extends Student {

	private int result;
	private int physicsmarks;
	private int chemistrymarks;
	private int mathsmarks;
	
	//Getters and Setters
	
	public int getPhysicsmarks() {
		return physicsmarks;
	}

	public void setPhysicsmarks(int physicsmarks) {
		this.physicsmarks = physicsmarks;
	}

	public int getChemistrymarks() {
		return chemistrymarks;
	}

	public void setChemistrymarks(int chemistrymarks) {
		this.chemistrymarks = chemistrymarks;
	}

	public int getMathsmarks() {
		return mathsmarks;
	}

	public void setMathsmarks(int mathsmarks) {
		this.mathsmarks = mathsmarks;
	}

	StudentResultProcessing(){
		
	}
	
	public int processResult(){
		
		int result=(physicsmarks+chemistrymarks+mathsmarks)/3;
		return result;
	}
	
}

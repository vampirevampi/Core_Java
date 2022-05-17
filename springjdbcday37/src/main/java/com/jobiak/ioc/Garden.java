 package com.jobiak.ioc;
import java.util.*;

public class Garden {
	ArrayList<String>fruits;//fruits is an instance variable
	ArrayList<String>flowers;  
	HashSet<String> trees;//in spring instances are known as dependencies
	HashMap<String,String> cityFruit;
	public Garden() {
		
	}
	public Garden(ArrayList<String>flowers) {
		this.flowers=flowers;
	}
	
	public void setCityFruit(HashMap<String,String>cityFruit) {
		this.cityFruit=cityFruit;
	}
	public HashMap<String,String> getCityFruit(){
		return this.cityFruit;
	}
	
	
	
	
	
	public void setTrees(HashSet<String> trees) {
		this.trees=trees;
	}
	
	public HashSet<String> getTrees(){
		return this.trees;
	}
	
	public void setFruits(ArrayList<String>fruits) {
		
		System.out.println("printing garden..");
		this.fruits=fruits;
	}
	@Override
	public String toString() {
		return "Garden [fruits=" + fruits + ", flowers=" + flowers + ", trees=" + trees + ", cityFruit=" + cityFruit
				+ "]";
	}
	
	
}
package ru.andraft.base;

import java.awt.Color;

public class BaseClassAuto {

	private String name = "";
	private int number_of_wheels = 0;
	private int weight = 0;
	private int number_of_doors = 0;
	private Color color_of_auto = Color.BLACK;
	private int power = 0;
	
	public BaseClassAuto(){
		}

	public BaseClassAuto(String name, int number_of_wheels, int weight,
			int number_of_doors, Color color_of_auto, int power) {
		this.name = name;
		this.number_of_wheels = number_of_wheels;
		this.weight = weight;
		this.number_of_doors = number_of_doors;
		this.color_of_auto = color_of_auto;
		this.power = power;
	}

	


   public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public int getNumber_of_wheels() {
		return number_of_wheels;
	}

	protected void setNumber_of_wheels(int number_of_wheels) {
		this.number_of_wheels = number_of_wheels;
	}

	public int getWeight() {
		return weight;
	}

	protected void setWeight(int weight) {
		this.weight = weight;
	}

	public int getNumber_of_doors() {
		return number_of_doors;
	}

	protected void setNumber_of_doors(int number_of_doors) {
		this.number_of_doors = number_of_doors;
	}

	public Color getColor_of_auto() {
		return color_of_auto;
	}

	protected void setColor_of_auto(Color color_of_auto) {
		this.color_of_auto = color_of_auto;
	}

	public int getPower() {
		return power;
	}

	protected void setPower(int power) {
		this.power = power;
	}

public String showinfo(){
	
	return "lal";
};
}

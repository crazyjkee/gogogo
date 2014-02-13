package com.andraft.work;

import java.awt.Color;

import ru.andraft.base.BaseClassAuto;

public class VolgaAuto extends BaseClassAuto {


	private String complect = "";
	private String model="";
	

	public VolgaAuto() {
		super();
	}

	public VolgaAuto(String name, int number_of_wheels, int weight,
			int number_of_doors, Color color_of_auto, int power,String complect,String model) {
		super(name, number_of_wheels, weight, number_of_doors, color_of_auto, power);
		this.complect=complect;
		this.model=model;
	}

	@Override
	public String showinfo() {
		return "Марка:"+this.getName()+",Вес:"+this.getWeight()+",Цвет:"+this.getColor_of_auto()+",Мощность:"+this.getPower()+"Комплект:"+this.getComplect()+",Модель:"+this.getModel();
		
	}	
	public String getComplect() {
		return complect;
	}

	protected void setComplect(String complect) {
		this.complect = complect;
	}

	public String getModel() {
		return model;
	}

	protected void setModel(String model) {
		this.model = model;
	}
	
	
	

}

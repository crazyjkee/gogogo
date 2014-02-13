package com.andraft.work;

import java.awt.Color;

import ru.andraft.base.BaseClassAuto;

public class HondaAuto extends BaseClassAuto {

	boolean sedan = false;

	public HondaAuto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HondaAuto(String name, int number_of_wheels, int weight,
			int number_of_doors, Color color_of_auto, int power,boolean sedan) {
		super(name, number_of_wheels, weight, number_of_doors, color_of_auto,
				power);
		this.sedan=sedan;
	}

	public boolean isSedan() {
		return sedan;
	}

	protected void setSedan(boolean sedan) {
		this.sedan = sedan;
	}

	@Override
	public String showinfo() {
		return "Марка:"+this.getName()+",Вес:"+this.getWeight()+",Цвет:"+this.getColor_of_auto()+",Мощность:"+this.getPower()+"Седан:"+this.isSedan();

	}

}

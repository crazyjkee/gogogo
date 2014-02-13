package com.andraft.work;

import java.awt.Color;

import ru.andraft.base.BaseClassAuto;

public class LadaAuto extends BaseClassAuto {
	private double engine = 0.0;

	public LadaAuto() {
		super();
	}

	public LadaAuto(String name, int number_of_wheels, int weight,
			int number_of_doors, Color color_of_auto, int power, double engine) {
		super(name, number_of_wheels, weight, number_of_doors, color_of_auto,
				power);
		this.engine = engine;
	}

	public double getEngine() {
		return engine;
	}

	protected void setEngine(double engine) {
		this.engine = engine;
	}

	@Override
	public String showinfo() {
		return "Марка:"+this.getName()+",Вес:"+this.getWeight()+",Цвет:"+this.getColor_of_auto()+",Мощность:"+this.getPower()+"Объем двигателя:"+this.getEngine();

	}

}

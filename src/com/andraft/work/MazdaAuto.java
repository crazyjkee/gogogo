package com.andraft.work;

import java.awt.Color;

import ru.andraft.base.BaseClassAuto;

public class MazdaAuto extends BaseClassAuto {
	private double trunk_volume=0.0;

	public double getTrunk_volume() {
		return trunk_volume;
	}

	protected void setTrunk_volume(double trunk_volume) {
		this.trunk_volume = trunk_volume;
	}

	@Override
	public String showinfo() {
		return "Марка:"+this.getName()+",Вес:"+this.getWeight()+",Цвет:"+this.getColor_of_auto()+",Мощность:"+this.getPower()+"Объем багажника:"+this.getTrunk_volume();
		
	}

	public MazdaAuto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MazdaAuto(String name, int number_of_wheels, int weight,
			int number_of_doors, Color color_of_auto, int power,double trunk_volume) {
		super(name, number_of_wheels, weight, number_of_doors, color_of_auto, power);
		this.trunk_volume=trunk_volume;
	}

}

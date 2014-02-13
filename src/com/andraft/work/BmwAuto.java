package com.andraft.work;

import java.awt.Color;

import ru.andraft.base.BaseClassAuto;

public class BmwAuto extends BaseClassAuto {
	private boolean wide_wheels = false;

	public BmwAuto() {
		super();
	}

	public BmwAuto(String name, int number_of_wheels, int weight,
			int number_of_doors, Color color_of_auto, int power,boolean wide_wheels) {
		super(name, number_of_wheels, weight, number_of_doors, color_of_auto,
				power);
		this.wide_wheels=wide_wheels;
	}

	public boolean isWide_wheels() {
		return wide_wheels;
	}

	protected void setWide_wheels(boolean wide_wheels) {
		this.wide_wheels = wide_wheels;
	}

	@Override
	public String showinfo() {
		return "Марка:"+this.getName()+",Вес:"+this.getWeight()+",Цвет:"+this.getColor_of_auto()+",Широкие колеса:"+this.isWide_wheels();

	}

}

package com.andraft.out;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import ru.andraft.base.BaseClassAuto;

import com.andraft.work.BmwAuto;
import com.andraft.work.HondaAuto;
import com.andraft.work.LadaAuto;
import com.andraft.work.MazdaAuto;
import com.andraft.work.VolgaAuto;

public class OutWork implements Comparator<BaseClassAuto>{

	private static ArrayList<BaseClassAuto> bmw;
	private static ArrayList<BaseClassAuto> mazda;
	private static ArrayList<BaseClassAuto> volga;
	private static ArrayList<BaseClassAuto> lada;
	private static ArrayList<BaseClassAuto> honda;

	public static void main(String args[]) {	
		random();
		Collections.sort(bmw, new OutWork());
		Collections.sort(mazda,new OutWork());
		Collections.sort(volga,new OutWork());
		Collections.sort(lada,new OutWork());
		Collections.sort(honda,new OutWork());
		for(BaseClassAuto parent:bmw){
			System.out.println(parent.showinfo());
		}
		
	}
	
	@Override
	public int compare(BaseClassAuto o1, BaseClassAuto o2) {
		// TODO Auto-generated method stub
		return (o1.getPower()<o2.getPower())?-1:
			(o1.getPower()>o2.getPower())?1:0;
	}
	
	

	public static void random() {
		int rdn_weight;
		int rdn_doors;
		int rdn_power;
		int rdn_nomer;
		int rdn_color;
		double rdn_engine;
		boolean rdn_wheels;
		boolean sedan;
		Color[] c = { Color.BLUE, Color.BLACK, Color.CYAN, Color.GRAY,
				Color.ORANGE };
		String[] compl = { "Basic", "Middle", "Middle_Manual",
				"Middle_Automatic", "Sport" };
		String[] model = { "Sedan", "Universal", "Mini", "Sport", "Jeep" };
		 honda = new ArrayList<BaseClassAuto>();
		 bmw = new ArrayList<BaseClassAuto>();
		 lada = new ArrayList<BaseClassAuto>();
		 mazda = new ArrayList<BaseClassAuto>();
		 volga = new ArrayList<BaseClassAuto>();
		for (int i = 0; i < 100; i++) {
			rdn_weight = (7 + (int) (Math.random() * ((20 - 7) + 1))) * 100;
			rdn_doors = 3 + (int) (Math.random() * ((5 - 3) + 1));
			rdn_power = 1 + (int) (Math.random() * (10 - 1) + 1);
			rdn_nomer = 1 + (int) (Math.random() * ((30 - 1) + 1));
			rdn_wheels = rdn_nomer< 15;
			rdn_color = 0 + (int) (Math.random() * ((4 - 0) + 1));
			bmw.add(new BmwAuto("X" + String.valueOf(rdn_nomer), 4,
					rdn_weight, rdn_doors, c[rdn_color], rdn_power, rdn_wheels));
		}
		for (int i = 0; i < 100; i++) {
			rdn_weight = (7 + (int) (Math.random() * ((20 - 7) + 1))) * 100;
			rdn_doors = 3 + (int) (Math.random() * ((5 - 3) + 1));
			rdn_power = 1 + (int) (Math.random() * (10 - 1) + 1);
			rdn_nomer = 1 + (int) (Math.random() * ((30 - 1) + 1));
			rdn_wheels = rdn_weight < 16;
			rdn_color = 0 + (int) (Math.random() * ((4 - 0) + 1));
			volga.add(new VolgaAuto("3110" + String.valueOf(rdn_nomer),
					4, rdn_weight, rdn_doors, c[rdn_color], rdn_power,
					compl[rdn_color], model[rdn_color]));
		}
		for (int i = 0; i < 100; i++) {
			rdn_weight = (7 + (int) (Math.random() * ((20 - 7) + 1))) * 100;
			rdn_doors = 3 + (int) (Math.random() * ((5 - 3) + 1));
			rdn_power = 1 + (int) (Math.random() * (10 - 1) + 1);
			rdn_nomer = 1 + (int) (Math.random() * ((30 - 1) + 1));
			rdn_wheels = rdn_weight < 16;
			rdn_color = 0 + (int) (Math.random() * ((4 - 0) + 1));
			rdn_engine = Math.floor(Math.random() * (2.5 - 1.5 + 1.0)) + 1.5;
			lada.add( new LadaAuto("211" + String.valueOf(rdn_nomer), 4,
					rdn_weight, rdn_doors, c[rdn_color], rdn_power, rdn_engine));
		}
		for (int i = 0; i < 100; i++) {
			rdn_weight = (7 + (int) (Math.random() * ((20 - 7) + 1))) * 100;
			rdn_doors = 3 + (int) (Math.random() * ((5 - 3) + 1));
			rdn_power = 1 + (int) (Math.random() * (10 - 1) + 1);
			rdn_nomer = 1 + (int) (Math.random() * ((30 - 1) + 1));
			rdn_wheels = rdn_weight < 16;
			rdn_color = 0 + (int) (Math.random() * ((4 - 0) + 1));
			rdn_engine = Math.floor(Math.random() * (2.5 - 1.5 + 1.0)) + 1.5;
			sedan = rdn_weight < 10;
			honda.add(new HondaAuto("H" + String.valueOf(rdn_nomer), 4,
					rdn_weight, rdn_doors, c[rdn_color], rdn_power, sedan));
		}
		for (int i = 0; i < 100; i++) {
			rdn_weight = (7 + (int) (Math.random() * ((20 - 7) + 1))) * 100;
			rdn_doors = 3 + (int) (Math.random() * ((5 - 3) + 1));
			rdn_power = 1 + (int) (Math.random() * (10 - 1) + 1);
			rdn_nomer = 1 + (int) (Math.random() * ((30 - 1) + 1));
			rdn_wheels = rdn_weight < 16;
			rdn_color = 0 + (int) (Math.random() * ((4 - 0) + 1));
			rdn_engine = Math.floor(Math.random() * (2.5 - 1.5 + 1.0)) + 1.5;
			sedan = rdn_weight < 10;
			mazda.add(new MazdaAuto(""+String.valueOf(rdn_nomer), 4, rdn_weight, rdn_doors, c[rdn_color], rdn_power, rdn_doors));
		}

	}



	





	
}

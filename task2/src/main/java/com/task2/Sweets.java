package com.task2;

import java.util.*;
public class Sweets {
	String name;
	int sweetness,cost,weigth;
	Sweets(String name,int sweetness,int cost, int weigth){
		this.name=name;
		this.sweetness=sweetness;
		this.cost=cost;
		this.weigth=weigth;
	}
}
class SortBySweetness implements Comparator<Sweets>{		//sort by sweetness of sweets
	public int compare(Sweets x,Sweets y){   
		return x.sweetness-y.sweetness;
		}
}
	
class SortByCost implements Comparator<Sweets>{		//sort by cost of sweets
	public int compare(Sweets x,Sweets y) {
		return x.cost-y.cost;
	}
}
	
class SortByWeigth implements Comparator<Sweets>{		//sort by weigth of sweets
	public int compare(Sweets x, Sweets y) {
		return  x.weigth-y.weigth;			
	}
}

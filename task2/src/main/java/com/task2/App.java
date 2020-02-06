package com.task2;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	
		Scanner sc=new Scanner(System.in);
        List<Sweets> gifts=new ArrayList<>();
        gifts.add(new Chocolate("Daily Milk",100,10,15));
        gifts.add(new Chocolate("5star",95,10,25));
        gifts.add(new Chocolate("Milkybar",60,5,10));
        gifts.add(new Candy("topico",70,2,5));
        gifts.add(new Candy("Nuggets",80,1,2));
        gifts.add(new Candy("choco",100,2,1));
        gifts.add(new Cookies("Kitsilano",40,5,4));
        gifts.add(new Cookies("Pie Crust",10,8,6));
        gifts.add(new Cookies("Apple Pie",90,5,8));
        List<Sweets> chocolate=new ArrayList<>();
        for(int i=0;i<gifts.size();i++){
            if(gifts.get(i) instanceof Chocolate){
                chocolate.add(gifts.get(i));
            }
        }
        
        System.out.println("Enter your option to sort according to:\nWeight-1\nCost-2\nSweetness-3");
        int option=sc.nextInt();
        if(option==1)
        	Collections.sort(chocolate,new SortByWeigth());	//sort by weigth
        else if(option==2)
        	Collections.sort(chocolate,new SortByCost()); //sort by cost
        else if(option==3)
        	Collections.sort(chocolate,new SortBySweetness());  //aort by sweetness
        
        for(int i=0;i<chocolate.size();i++){
            System.out.println(chocolate.get(i).name+" choco% is "+chocolate.get(i).sweetness+" cost is "+chocolate.get(i).cost+" weigth of chocolate is "+chocolate.get(i).weigth+"gms");
        }
        int tot_weigth=0;
        for(int i=0;i<gifts.size();i++){
            tot_weigth+=gifts.get(i).weigth;
        }
        System.out.println("\nTotal weight of gifts -"+tot_weigth+"\n");
        System.out.println("Enter the option on which you want to display candies :\nWeight-1\nCost-2\nSweetness-3");
        int op=sc.nextInt();
        System.out.println("Enter min and max range of your option");
        int mini=sc.nextInt();
        int maxi=sc.nextInt();
        Sweets curr;
        if(op==1) {
			for(int i=0;i<gifts.size();i++) {
				curr=gifts.get(i);
				if(curr instanceof Candy && curr.cost>=mini && curr.cost<=maxi){
					System.out.println(curr.name+"-Sweetness % is "+curr.sweetness+" cost is "+curr.cost+" weigth of chocolate is "+curr.weigth+"gms");
				}
			}
		}
		else if(op==2) {
			for(int i=0;i<gifts.size();i++) {
				curr=gifts.get(i);
				if(curr instanceof Candy && curr.weigth>=mini && curr.weigth<=maxi){
					System.out.println(curr.name+"-Sweetness % is "+curr.sweetness+" cost is "+curr.cost+" weigth of chocolate is "+curr.weigth+"gms");
				}
			}
		}
		else if(op==3){
			for(int i=0;i<gifts.size();i++) {
				curr=gifts.get(i);
				if(curr instanceof Candy && curr.sweetness>=mini && curr.sweetness<=maxi){
					System.out.println(curr.name+"-Sweetness % is "+curr.sweetness+" cost is "+curr.cost+" weigth of chocolate is "+curr.weigth+"gms");
				}
			}
		}
        sc.close();
     }
}
        

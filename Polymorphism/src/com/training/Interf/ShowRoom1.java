package com.training.Interf;
import com.training.Interf.Automobiles;
public class ShowRoom1 extends ShowRoom{
	public Automobiles getItem(int key)
	{
		/*switch(key){
		case 1:
			return new PassengerCar();
		case 2:
			return new LuxuryCar();
		case 3:
			return new SportsCar();
		case 4:
			return new SportsBike();	
		default:
			return null;*/
		if (key==4){
			return new SportsBike();}
		else
			{return super.getItem(key);}
		}
	}



package Test1;

import Test2.Boots;
import Test2.Pullower;
import Test2.Sneakers;
import Test2.Things;

public class Main {

	public static void main(String[] args) {
		
		Sneakers sneakers = new Sneakers("Summer");
		sneakers.setCategory("Cross");
		sneakers.setBrand("Adidas");
		System.out.println(sneakers);
		
		Things things = new Sneakers("Winter");
		things.setBrand("Stradivari");
		things.setColor("Green");
		System.out.println(things);
		
		Boots boots = new Boots("Winter");
		boots.setBrand("Puma");
		boots.setColor("black");
		System.out.println(boots);
		
		Pullower pullower = new Pullower("Knitted");
		pullower.setColor("Red");
		pullower.setBrand("Zara");
		System.out.println(pullower);

	}

}

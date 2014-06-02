import Product;
import Coin;

import java.util.Random;

public class VendingMachine {
	
	private static double customerCredit = 0;
	//vending machine balance
	private static double vmBalance = 500.00;
	private int id;
	Product[] products;
	Coin coin;

	public VendingMachine(){
		Random rnd = new Random();
		id = 100000 + rnd.nextInt(900000);
		products = generateProducts();
	}

	public VendingMachine(int id){
		this.id = id;
		products = generateProducts();
	}

	//utility method to hard code generating products
	private static Product[] generateProducts(){
		//TODO
	}

	public Coin getCoin(){
		return this.coin;
	}

	public void setCoin(Coin coin){
		this.coin = coin;
	}

	public static void operate(){

	}

	public static String showVendingMachineHeader(){
		return "FOOTHILL VENDING MACHINE";
	}

	public boolean dispenseProduct(int position){

	}

	public void showProduct(){

	}

	public void showMene(){
		
	}
}
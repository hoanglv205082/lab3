package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {

	public static final int MAX_NUMBERS_ORDERED=20;
	private DigitalVideoDisc itemsOrdered[]=new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < 10) {
			itemsOrdered[qtyOrdered]=disc;
			System.out.println("The disc has been added");
			qtyOrdered++;
	
		}else {
			System.out.println("The order is almost full");
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int i=0;
		for(i=0;i<qtyOrdered;i++) {
			if(itemsOrdered[i].equals(disc)==true) {
				break;
			}
		}
		if(i==qtyOrdered) {
			System.out.println("The disc is not in the order");
		}else {
			for(;i<qtyOrdered-1;i++) {
				itemsOrdered[i]=itemsOrdered[i+1];
			}
			System.out.println("The disc has been deleted");
			qtyOrdered--;
		}
		
	}
	public float totalCost() {		
		float total=0;
		for(int i=0;i<qtyOrdered;i++) {
			total+=itemsOrdered[i].getCost();
		}
		return total;
	}
	
	public void print() {
		for(int i=0;i<qtyOrdered;i++) {
			System.out.println(itemsOrdered[i].getTitle());
		}
	}
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
    	
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
    	
    }
    public void displayCart() {
		System.out.println("*******************************************CART*********************************************************");
		
		if(qtyOrdered != 0) {
			for(int i = 0; i < qtyOrdered; ++i) {
				System.out.println((i+1)+". DVD "+itemsOrdered[i].printDetail());
			}
		}
		else {
			System.out.println("Cart is empty! Please add DVD to Cart!");
		}
		
		System.out.println("Total cost: " + totalCost());
		System.out.println("********************************************************************************************************");
	}
	
	public void search(String title) {
		int check = 0;
		for(int i = 0; i < qtyOrdered; ++i) {
			if(itemsOrdered[i].isMatch(title)) {
				check = 1;
				System.out.println(itemsOrdered[i].printDetail());
			}
		}
		
		if(check == 0) {
			System.out.println("not found!");
		}
	}
	
	public void search(int id) {
		int check = 0;
		for(int i = 0; i < qtyOrdered; ++i) {
			if(itemsOrdered[i].isMatch(id)) {
				check = 1;
				System.out.println(itemsOrdered[i].printDetail());
				break;
			}
		}
		
		if(check == 0) {
			System.out.println("not found!");
		}
		
	}
}

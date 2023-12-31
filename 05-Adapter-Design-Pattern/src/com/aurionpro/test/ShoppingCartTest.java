package com.aurionpro.test;

import java.util.List;

import com.aurionpro.model.Biscuit;
import com.aurionpro.model.Hat;
import com.aurionpro.model.HatAdapter;
import com.aurionpro.model.IItems;
import com.aurionpro.model.ShoppingCart;

public class ShoppingCartTest {

	public static void main(String[] args) {

		ShoppingCart cart = new ShoppingCart();
		cart.addItemToCart(new Biscuit("Marie", 20));
		cart.addItemToCart(new HatAdapter(new Hat("Summer", "Desginer", 200, 20)));

		// System.out.println(cart.getCartItem());
		// System.out.println(cart.getCartPrice());
		//
		printCardDetails(cart);

	}

	private static void printCardDetails(ShoppingCart cart) {
		List<IItems> cartItems = cart.getCartItem();
		cartItems.stream().forEach((item) -> {
			System.out.println("Item Name : " + item.getItemName() + ",  Item Price : " + item.getItemPrice());
//			System.out.println("---------------------------------------------");

		});
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Total Cart Price : " + cart.getCartPrice());
	}
}

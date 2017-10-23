package com.creational.builder;

public class LunchOrderTeleDemo {

	public static void main(String[] args) {
		LunchOrderTele orderBean = new LunchOrderTele("Wheat", "Letucce", "Mustard", "Ham");
		
		System.out.println(orderBean.getBread());
		System.out.println(orderBean.getCondiments());
		System.out.println(orderBean.getDressing());
		System.out.println(orderBean.getMeat());

	}

}

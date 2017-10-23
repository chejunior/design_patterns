package com.creational.builder;

public class LunchOrderBeanDemo {

	public static void main(String[] args) {
		LunchOrderBean orderBean = new LunchOrderBean();
		orderBean.setBread("Wheat");
		orderBean.setCondiments("Letucce");
		orderBean.setDressing("Mustard");
		orderBean.setMeat("Ham");
		
		System.out.println(orderBean.getBread());
		System.out.println(orderBean.getCondiments());
		System.out.println(orderBean.getDressing());
		System.out.println(orderBean.getMeat());

	}

}

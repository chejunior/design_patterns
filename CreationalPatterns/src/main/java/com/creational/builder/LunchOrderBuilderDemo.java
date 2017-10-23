package com.creational.builder;

public class LunchOrderBuilderDemo {

	public static void main(String[] args) {
		LunchOrder.Builder builder = new LunchOrder.Builder();
		builder.bread("Wheat").condiments("Letucce").dressing("Mustard").meat("Ham");
		
		LunchOrder orderBean = builder.build();
		
		System.out.println(orderBean.getBread());
		System.out.println(orderBean.getCondiments());
		System.out.println(orderBean.getDressing());
		System.out.println(orderBean.getMeat());

	}

}

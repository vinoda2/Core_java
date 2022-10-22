package com.xworkz;

import com.xworkz.cakes.Cakes;

import lombok.Data;
//we need to use @Data in between public and class
public @Data class CakesRunner {
	public static void main(String[] args) {
	Cakes cake = new Cakes();
	cake.setAvailable(true);
	System.out.println(cake);
	}
}

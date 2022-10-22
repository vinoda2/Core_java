package com.xworkz.cakes;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Cakes {
	private String flovers;
	private double price;
	private String[] itemUsed;
	private boolean available;
}

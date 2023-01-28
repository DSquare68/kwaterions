package com.daniel.kwaterions;

import java.util.ArrayList;

import org.apache.commons.math3.complex.Quaternion;

import lombok.Data;

@Data
public class Equation {

	/**
	 *  0 -> R; 1 -> x; 2 -> x^2; 3 -> x^4; 4 -> ...
	 *  0 is Quaterion as new (a,0,0,0) i.e.
	 */
	private ArrayList<Addend> polynomial;
	public Equation() {
		polynomial = new ArrayList<Addend>();
	}

	@Data
	public class Addend{
		boolean operator, polynomial;
		Object coeffiecient,variable;
		double exponent;
		
		public void readCoeffiecent() {
			// TODO Auto-generated method stub	
		}
	}
}

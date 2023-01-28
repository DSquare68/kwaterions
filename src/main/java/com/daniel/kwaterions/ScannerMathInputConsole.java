package com.daniel.kwaterions;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.DoubleAccumulator;
import java.util.concurrent.atomic.DoubleAdder;

import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.complex.Quaternion;

import com.daniel.kwaterions.Equation.Addend;

public class ScannerMathInputConsole{
	private Scanner s = new Scanner(System.in);
	private Equation.Addend addend;
	public Equation readEquastion() {
		String eq = s.nextLine();
		if(eq.equals("help"))
			printHelp();
		Equation result = new Equation();
		addend = result.new Addend();
		char c;
		while(eq.length()>0) {
			c = eq.charAt(0);
			switch(c) {
				case 'H':
					addend.setCoeffiecient(new Quaternion(0,new double[3]));
					break;
				case 'C':
					addend.setCoeffiecient(new Complex(0,0));
					break;
				case 'R':
					addend.setCoeffiecient(new Double(0.0));
					break;
				case 'Z':
					addend.setCoeffiecient(new AtomicInteger(0));
					break;
				case 'N':
					addend.setCoeffiecient(new AtomicInteger(0));
					break;
				case 'x':
					break;
				case '+':
					result.getPolynomial().add(addend);
					addend = result.new Addend();
					addend.setOperator(true);
					break;
				case '-':
					result.getPolynomial().add(addend);
					addend = result.new Addend();
					addend.setOperator(false);
					break;
				case '^':
					addend.setPolynomial(true);
					break;
				default:
					if(addend.polynomial)
						addend.setExponent(Integer.valueOf(String.valueOf(c)));
					break;
			}
			eq=eq.subSequence(1, eq.length()).toString();
		}
		result.getPolynomial().add(addend);
		for(Addend a : result.getPolynomial()) {
			a.readCoeffiecent();
		}
		return result;
	}
	private void printHelp() {
		System.out.println("H{int} - Quaterion\n"
				+ "{char}x^{int} - Polynomian"
				+ "{char} -  'H'; 'C';'R';'Q';'C';N' ");
	}
	
}

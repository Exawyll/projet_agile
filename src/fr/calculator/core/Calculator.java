package fr.calculator.core;

import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Calculator {

	public static void main(String[] args) {
		getOperation();
	}
	
	public static String getOperation () {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Veuillez saisir votre premier nombre : ");
		double nb1 = reader.nextDouble();
		
		if (nb1 == (double)nb1) {
			System.out.println("Veuillez saisir l'opérateur : ");
			String operator = reader.toString();
			
			if (operator == (String)operator) {
				System.out.println("Veuillez saisir votre secobd nombre : ");
				double nb2 = reader.nextDouble();
			}
		}
		
		return null;
	}
}

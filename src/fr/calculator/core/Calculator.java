package fr.calculator.core;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		getOperation();
	}
	
	public static void calc(float nb1, float nb2, String operator) {
		float result;
		if(operator.equals("+")) {
			result = nb1+nb2;
		} else if (operator.equals("-")) {
			result = nb1-nb2;
		} else if (operator.equals("*")) {
			result = nb1*nb2;
		} else {
			result = nb1/nb2;
		}

		String 	operation = nb1 + operator + nb2;
		
		printResult(operation, String.valueOf(result));
		
	}

    public static void calc(float nb1, float nb2, String operator) {
        float result;
        if (operator.equals("+")) {
            result = nb1 + nb2;
        } else if (operator.equals("-")) {
            result = nb1 - nb2;
        } else if (operator.equals("*")) {
            result = nb1 * nb2;
        } else {
            result = nb1 / nb2;
        }

        String operation = nb1 + operator + nb2;

        printResult(operation, String.valueOf(result));

    }

    public static void getOperation() {
        Scanner reader = new Scanner(System.in);
        float nb1 = 0;
        float nb2 = 0;
        String operator = null;

        System.out.println("Veuillez saisir votre premier nombre : ");
        nb1 = reader.nextFloat();

        if (nb1 == (float) nb1) {
            while (operator != "+" || operator != "-" || operator != "*" || operator != "/") {
                System.out.println("Veuillez saisir l'op�rateur : ");
                operator = reader.next();
            }

            if (operator == (String) operator) {
                System.out.println("Veuillez saisir votre second nombre : ");
                nb2 = reader.nextFloat();
            }
        }
        reader.close();
        calc(nb1, nb2, operator);
    }

    public static void printResult(String operation, String result) {
        System.out.printf("Le r�sultat de l'op�ration " + operation + " est : " + result);
    }
}

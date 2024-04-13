package com.web.java;

import java.util.Scanner;

public class PerimeterOfTriangle_19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of side 1: ");
        double side1 = scanner.nextDouble();

        System.out.println("Enter the length of side 2: ");
        double side2 = scanner.nextDouble();

        System.out.println("Enter the length of side 3: ");
        double side3 = scanner.nextDouble();

       
       double perimeter=side1+side2+side3;
       System.out.println("The perimeter of triangle="+perimeter);
       
    }
	
	}


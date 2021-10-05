package edu.wit.cs.comp1000;
import java.util.Scanner; 
/**
 * Example solution to La1
 * @author Hector Padilla
 * @date 9/25/2019
 */
public class LA1a {
	private static Scanner scnr;
	public static void main(String[] args) {
		// TODO: write your code here
		System.out.print("Enter five numbers: ");
		scnr = new Scanner(System.in);
		
		double var1 = scnr.nextDouble();
		double var2 = scnr.nextDouble();
		double var3 = scnr.nextDouble();
		double var4 = scnr.nextDouble();
		double var5 = scnr.nextDouble();
		
		double sumAll = var1 + var2 + var3 + var4 + var5;
		
		double mean = sumAll / 5.00; 
		
		double a = (var1 - mean);
		double b = (var2 - mean);
		double c = (var3 - mean);
		double d = (var4 - mean);
		double e = (var5 - mean);
		
		double square = Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2) + Math.pow(d, 2) + Math.pow(e, 2);
		
		double squareSum = square / 5.00; 
		
		double PsD = Math.sqrt(squareSum);
		
		System.out.printf("Sum: %.2f%n", sumAll);
		
		System.out.printf("Mean: %.2f%n", mean);
		
		System.out.printf("Population Standard Deviation: %.2f%n", PsD);

	}

}


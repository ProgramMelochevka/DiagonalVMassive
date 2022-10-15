package by.home.maxzzzit;

import java.util.Arrays;

// Диагональ в массиве!
public class DiagonalVMassive {
	public static final int n=8;
	public static void main(String[]args) {
		int [][] mass = new int[n][n];
		for (int i=0; i<mass.length; i++) {
			mass[i][i]=1;
			mass[i][n-i-1]=2;
		}
		for (int i=0; i<mass.length; i++)
			System.out.println(Arrays.toString(mass[i]));
	}
}

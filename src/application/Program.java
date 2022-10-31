package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		int n = sc.nextInt();
		while(n>10) {
			System.out.print("Por favor digite um número menor que 10 :");
			n =sc.nextInt();
		}
		System.out.print("Qual a quantidade de colunas da matriz? ");
		int m = sc.nextInt();
		while(m>10) {
			System.out.print("Por favor digite um número menor que 10 :");
			m =sc.nextInt();
		}
		
		int [][] a = new int [n][m];
		int [][] b = new int [n][m];
		int [][] c = new int [n][m];
		
		System.out.println("Digite os valores da matriz A: ");
		
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				System.out.print("Elemento ["+(i)+","+(j)+"]:");
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite os valores da matriz B: ");
		
		for (int i=0;i<b.length;i++) {
			for (int j=0;j<b[i].length;j++) {
				System.out.print("Elemento ["+(i)+","+(j)+"]:");
				b[i][j] = sc.nextInt();
			}
		}
		
		for (int i=0;i<c.length;i++) {
			for (int j=0;j<c[i].length;j++) {
				c[i][j] = a[i][j] + b [i][j];
			}
		}
		
		
		System.out.println("MATRIZ SOMA: ");
		
		
		
		for (int i=0;i<c.length;i++) {
			for (int j=0;j<c[i].length;j++) {
					System.out.print(c[i][j] + " ");
				}
			System.out.println();
			}
		
		
		
		
		
		
		
		sc.close();

	}

}

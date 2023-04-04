package com.greatlearning.main;

import java.util.Scanner;

public class TransactionsToTarget {
	
	public static int sum;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of transactions");
		int noOfTransactions = sc.nextInt();
		
		int[] transactions = new int[noOfTransactions];
		System.out.print("Enter the transaction amounts : ");
		for(int i = 0; i < noOfTransactions; i++) {
			transactions[i] = sc.nextInt();
		}
		System.out.println();
		
		System.out.println("Enter the number of targets to be achieved : ");
		int noOfTargets = sc.nextInt();
		int flag;
		
		for(int j = 1; j <= noOfTargets; j++) {
			sum = 0;
			flag = 0;
			
			System.out.println("Enter the target amount " + j + " : ");
			int target = sc.nextInt();
			
			for(int k = 0; k < transactions.length; k++) {
				
				sum += transactions[k];
				if(sum >= target) {
					flag = 1;
					System.out.println("Target amount achieved at " + (k+1) + " transactions");
					break;
				}
				
			}
			
			if (flag == 0) 
				System.out.println("This Target is not achievable");
		}
		
		sc.close();
		
	}

}

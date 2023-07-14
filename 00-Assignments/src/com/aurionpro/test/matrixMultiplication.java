package com.aurionpro.test;
public class matrixMultiplication {

	public static void main(String[] args) {
		int count=0;
		int[][] matrix1 = {
				{1,2,5},
				{2,3,5},
				{4,7,1}
		};
		int[][] matrix2 = {
				{1,2,5},
				{2,3,5},
				{4,7,1}
		};
		
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int sum = 0;
                for (int k = 0; k < 3; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];

                }
                if(count==3) {
                	System.out.println("\n");
                	count=0;
            }
                count++;
                System.out.print(" "+sum);

			}
		}
		
		
	}

}

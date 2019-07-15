package javaBasic.Day3.Assignment2;

public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstArrayMatrix[][]={{1,1,1},{1,1,1}}; 
		int secondArrayMatrix[][]={{2,2,2},{2,2,2}};
		int sum[][] = new int[firstArrayMatrix.length][firstArrayMatrix[0].length];
		
		System.out.println("Matrix 1");
		printarr(firstArrayMatrix);


		System.out.println("Matrix 2");
		printarr(secondArrayMatrix);
		
		
		sum = getSum(firstArrayMatrix,secondArrayMatrix);
		
		System.out.println("Sum of the resultant matrixes:");
		printarr(sum);

	}
	
	public static int[][] getSum(int[][] firstArrayMatrix,int[][] secondArrayMatrix){
		int[][] sum = new int[secondArrayMatrix.length][secondArrayMatrix[0].length];

		for(int i=0; i < secondArrayMatrix.length; i++) {
			for(int j = 0; j< secondArrayMatrix[i].length; j++) {
				sum[i][j] = firstArrayMatrix[i][j]+secondArrayMatrix[i][j];
			}
			//System.out.println();
		}
		
		
		return sum;		
	}
	
	static void printarr(int[][] secondArrayMatrix) {
		
		for(int i=0; i < secondArrayMatrix.length; i++) {
			for(int j = 0; j< secondArrayMatrix[i].length; j++) {
				System.out.print(secondArrayMatrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	}



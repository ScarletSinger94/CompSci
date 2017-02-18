
public class MatrixOps {

		 public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
		        int matA = matrix1[0].length;
		        int matB = matrix2[0].length;
		        int mA = matrix1.length;
		        int mB = matrix2.length;
		        double[][] C = new double[mA][mB];
		        if(matA!=mB)
		        	IO.reportBadInput();
		        for (int a = 0; a < mA; a++)
		            for (int b = 0; b < matB; b++)
		                for (int c = 0; c < matA; c++)
		                    C[a][b] += matrix1[a][c] * matrix2[c][b];
				return C;
				

	}

}

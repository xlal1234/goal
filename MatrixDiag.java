public class MatrixDiag{
	public static void main(String[] args){
		int[][] matrix = {{3,2,1},{3,4,4},{-1,0,-1}};
		//handle corner case
		if(matrix.length != matrix[0].length){
			System.out.println("not a good matrix");
		}else{
			int n = matrix.length;
			int trace = 0;
			for (int i = 0; i < n; i++){
				trace += matrix[i][i];

			}
			System.out.println(trace);
			
		}

	}
}

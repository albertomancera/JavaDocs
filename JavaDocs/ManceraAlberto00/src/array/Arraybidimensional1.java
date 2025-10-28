package array;

public class Arraybidimensional1 {
	public static void main(String args[]) {
		
	int [][]matrix=new int[4][5];
	
		matrix[0][1]=18;
		matrix[0][2]=0;
		matrix[0][1]=8;
		matrix[0][2]=0;
		
		matrix[1][1]=18;
		matrix[1][2]=0;
		matrix[1][1]=1;
		matrix[1][2]=8;
		
		System.out.println(matrix[0][1]);
		
		for(int i=0; i<4;i++) {
			System.out.println();
			for(int j=0; j<5;j++) {

			System.out.print(matrix[i][j]);		
			}}
	}
}

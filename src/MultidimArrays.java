
public class MultidimArrays {
	public static void main(String[]args){
		int [] values = {5,87,8942};
		System.out.println(values[2]);
		
		int [][] grid = {
				{5,87,8942},
				{2,45,567},
				{43,56,45,33}
				
		};
		System.out.println(grid [1][1]);
		System.out.println(grid [0][2]);
		
		String[][] text = new String[2][3];
		
		text[0][1] = "Hello there";
		System.out.println(text [0][2]);
		System.out.println(text [0][1]);
		
		for(int row=0; row< grid.length ; row++){
			for(int col=0; col<grid[row].length; col++){
				System.out.print(grid[row][col] + "\t");
				
			}
			System.out.println();
		};
		String [][] words = new String [2][];
		
		System.out.println(words[0]);
		
		words[0] = new String [3];
		words [0][1] = "hello gents and ladies";
		System.out.println(words [0][1]);
		
	}

}

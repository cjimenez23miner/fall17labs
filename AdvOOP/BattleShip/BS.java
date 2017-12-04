import java.util.Scanner;

public class BS{
	public static int GRID_SIZE= 9;
	public static void main(String[] args){
		setValues();
	}
	static void setValues(){
		for(int l= 0; l< GRID_SIZE-1; l++){
			System.out.print("|");
			for(int h= 0; h< GRID_SIZE-1; h++){
				System.out.print("_|");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Indicate the coordinates of a square inside the grid as (x,y) where 1 starts at the bottom left coprner.");

		Scanner in= new Scanner(System.in);
		String input= in.nextLine();	 
		int[] coor= verify(input);
		if(coor[0]==10){
			System.out.print("Make sure your coordinates are not off the grid.");
			looper();
		} else {
			edgeAdj(coor);
			cornAdj(coor);
			unrelated(coor);
		}
	}
	
    static void looper(){
            System.out.println("Would you like to try it again?");
            System.out.println("Enter Y or N.");

            Scanner in = new Scanner(System.in);
            String answer= in.nextLine();
            System.out.println();

            if(answer.equals("Y")||answer.equals("y"))
                setValues();
            else if(answer.equals("N")||answer.equals("n"))
                System.exit(0);
            else {
                System.out.println("Please enter a valid answer.");
                looper();
            }
    }
	
	static int[] verify(String in){
		String clean= in.toLowerCase();
		clean= clean.replaceAll("[*%$!?(:.,);'0abcdefghijklmnopqrstuvwxyz]","");
		int[] coor= new int[2];
		int length= clean.length();
		if(length!=2){
			coor[0]=10;
		}else{
			coor[0]= Integer.parseInt(clean.substring(0,1));
			coor[1]= Integer.parseInt(clean.substring(1,2));
		}
		return coor;
	}
	
	static void edgeAdj(int[] coor){
		System.out.println("The boxes that are edge adfjecent to the indicated box are:");
		boolean edge[]= new boolean[4];
		edge[0]= coor[1]%9!=0; //UP
		edge[1]= coor[1]!=1; //DOWN
		edge[2]= coor[0]%9!=0; //RIGHT
		edge[3]= coor[0]!=1; //LEFT
		
		if(edge[0])
			System.out.println((coor[0])+", "+(coor[1]+1));
		if(edge[1])
			System.out.println((coor[0])+", "+(coor[1]-1));
		if(edge[2])
			System.out.println((coor[0]+1)+", "+(coor[1]));
		if(edge[3])
			System.out.println((coor[0]-1)+", "+(coor[1]));
	}
	
	static void cornAdj(int[] coor){
		System.out.println("The boxes that are corner adfjecent to the indicated box are:");
		boolean edge[]= new boolean[4];
		edge[0]= coor[1]%9!=0; //UP
		edge[1]= coor[1]!=1; //DOWN
		edge[2]= coor[0]%9!=0; //RIGHT
		edge[3]= coor[0]!=1; //LEFT

		if(edge[0] && edge[3])
			System.out.println((coor[0]-1)+", "+(coor[1]+1));
		if(edge[0] && edge[2])
			System.out.println((coor[0]+1)+", "+(coor[1]+1));
		if(edge[1] && edge[2])
			System.out.println((coor[0]+1)+", "+(coor[1]-1));
		if(edge[1] && edge[3])
			System.out.println((coor[0]-1)+", "+(coor[1]-1));
		System.out.println();
	}
	
	static void unrelated(int[] coor){
		boolean[][] grid= new boolean[GRID_SIZE][GRID_SIZE];
		int testX= 0;
		int testY= 0;
		System.out.println("The set of boxes not adjacent to the selected box:");
		for(int x=1; x<=GRID_SIZE; x++){
			for(int y=1; y<=GRID_SIZE; y++){
				testY= Math.abs(y-coor[1]);
				testX= Math.abs(x-coor[0]);
				if((coor[0]!=y&&coor[1]!=x) && !((testY==1||testY==0)&&(testX==1||testX==0)))
					System.out.print("("+x+", "+y+")"+", ");
			}
		}
	}
}
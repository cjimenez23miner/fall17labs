public class TRANSFORM{
	int m;
	int n;
	public static void main(String[] args){
		int m=  3;
		int n= 2;
		int[][] trans= new int[m][n];
		trans[0][0]= 2;
		trans[0][1]= 1;
		trans[1][0]= 2;
		trans[1][1]= 1;
		trans[2][0]= 2;
		trans[2][1]= 1;
		
		boolean[] finalSs= {false, false, true};
		findPath(0, 0, trans, finalSs, "", m+1, n);
		
	}
	static void findPath(int currS, int currIn, int[][] trans, boolean[] finalS, String path, int prev, int n){
		if(prev==trans[currS][currIn])
			return;
		if(finalS[currS])
			System.out.println(path+" leads to the final state "+currS+".");
		if(!finalS[currS]){
			path+= ", "+currS;
			for(int i= 0; i< n; i++)
				if(i!=currIn)
				findPath(trans[currS][currIn], i, trans, finalS, path, currS, n);
		}
	}
}
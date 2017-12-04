public class TuringMachine{
    public static void main(String args[]){
        char R='R';
        char L= 'L';
        int[][] state= {{1,1,1},
                        {3,2,5},
                        {3,2,5},
                        {3,2,4},
                        {5,5,5},
                        {5,5,5}};
        int[][] symbol= {{0,0,0},
                        {0},
                        {0},
                        {0},
                        {0},
                        {0}};
        char[][] movement= {{R,R,R},
                        {L,R,R},
                        {L,R,R},
                        {L,R,R},
                        {L,L,L},
                        {L,L,L}};
        int[] input= {2,1,1,0,1,2};

        for(int i: input)
            System.out.print(i+" ");
            System.out.println();
        turingSimulator(state, symbol, movement, input);
    }

    public static void turingSimulator(int[][] state, int[][] symbol, char[][] movement, int[] input){ //, int states, int symbols){

        int currS= 0;
        char currDir= ' ';
        for(int i =0; i< input.length; i++){
            if(i==input.length && symbol[0][input[i]]!=input[i+1]){
                System.out.println("Rejected Input");
                return;
            }
            
            System.out.print("State "+currS+", input "+input[i]+"--> ");
            currDir= movement[currS][input[i]];
            currS= state[currS][input[i]];
            System.out.println("State "+currS+", Moving "+currDir);
        }
        if(currS==4)
            System.out.println("Input Accepted");
        else 
            System.out.println("Input Rejected");
    }
}
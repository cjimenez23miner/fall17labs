/**
 * 
 * 
 * @author Carlos Jimenez
 *
 */
public class musicBox{
    public static void main(String[] args){
        String[] list1= {"do", "mi","sol","si","do-octave"};
        String[] list2= {"re","fa","la","do-octave"};
        int[] seq= {1,2,1,2,1,2,1,0};
        song(list1, list2, seq);

        String[] list3= {"do","do","sol","sol","sol","mi","mi","do"
                        ,"sol","sol","mi","mi","sol","sol","mi","mi"
                        ,"do","do","sol","sol","sol","mi","mi","do"};
        String[] list4= {"la","la","fa","fa","re","re"
                        ,"fa","fa","re","fa","fa","re"
                        ,"la","la","fa","fa","re","re"};
        int[] seq2= {1,1,1,1,2,2,1,2,2,1,1,2,2,1
                    ,1,1,2,2,1,1,2,1,1,2,2,1,1,2
                    ,1,1,1,1,2,2,1,2,2,1,1,2,2,1};
        song(list3, list4, seq2);
    }

    public static void song(String[] list1, String[] list2, int[]seq){
        PlayList doremifa = new PlayList(list1, seq, 1);
        PlayList sollasido = new PlayList(list2, seq, 2);

        doremifa.start();
        sollasido.start();
    }
}


class PlayList extends Thread {
    private String[] note;
    FilePlayer FP;
    int[] seq;
    int num;
 
    PlayList(String[] note, int[] seq, int num) {
        FP = new FilePlayer();
        this.note = note;
        this.seq=seq;
        this.num=num;
    }   

    public void run() {
        synchronized(FP) {
            seq();
        }
    }

    public void seq(){
        int x=0;
        for(int i= 0; i<seq.length; i++){
            if(seq[i]==num || seq[i]==0){
                FP.play("C:\\Users\\1\\Documents\\GitHub\\fall17labs\\AdvOOP\\Multithreads\\Assignment 7 Resources\\Sounds\\"+note[x]+".wav");
                System.out.print(note[x]+" ");
                x++;
            } else{
                try{
                    sleep(1000);
                } catch (Exception e) {
                    System.out.println("Error with playing sound.");
                    e.printStackTrace();
                }
            }
        }
    }
}
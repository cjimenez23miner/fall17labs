public class musicBox{
    public static void main(String[] args){
        String[] list1= {"do", "mi","sol","si","do-octave"};
        String[] list2= {"re","fa","la","do-octave"};
        FilePlayer player= new FilePlayer();
        PlayList doremifa = new PlayList(list1, player);
        PlayList sollasido = new PlayList(list2, player);
        
        doremifa.start();
        sollasido.start();        
        
        // wait for threads to end
        try {
            doremifa.join(1000);
        //    sollasido.join(1000);
        //    Thread.sleep(1000);
            //Thread.yield();
        } catch ( Exception e) {
            System.out.println("Interrupted");
        }
    }
}

class PlayList extends Thread {
    private String[] note;
    FilePlayer FP;
 
    PlayList(String[] note,  FilePlayer fp) {
        this.note = note;
        FP = fp;
    }
    
    public void run() {
       // synchronized(FP) {
            seq();
       // }
    }

    public synchronized void seq(){
		for(int i= 0; i<note.length; i++){
            //interrupt();
			FP.play("C:\\Users\\1\\Desktop\\fall17labs\\AdvOOP\\Multithreads\\Assignment 7 Resources\\Sounds\\"+note[i]+".wav");
            System.out.println(note[i]);
            try{    
                sleep(100);
            //   yield();
            } catch (Exception e) {
                System.out.println("Error with playing sound.");
                e.printStackTrace();
            }
    
        }
    }
}
import java.util.Scanner;
/**Facade is the class in charge of operating the ROVER objects.*/
public class Facade{
	/**Main mathod with user interface for asking for input used for selecting between the ROVER and the Camara and Drill.*/
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		System.out.println("Type ROVER to operate the rover's movement.");
		System.out.println("DNC to operate the Drill and Camara features.");
		String choice = scnr.nextLine().toUpperCase();
		//RUNS LUNAR ROVER OR EXTRA CREDIT
		if(choice.equalsIgnoreCase("ROVER")){
			lunar();
		}else if(choice.equalsIgnoreCase("DNC")){
			System.out.print("This option was removed form this lab on purpose.");
		}else{
			 System.out.println("Input not recognized.");
		}
		scnr.close();
	}
	
	/**Method responsible for initiating the ROVER class. */
	public static void lunar(){
		LunarRover car = new LunarRover();
		Scanner scnr= new Scanner(System.in);
		String pedal = "";
		String flag = "Y";
		while(flag.equalsIgnoreCase("Y")){
			System.out.println("Decribe the action prformed in the Rover. Example: 2-R-0, Press TWO times the RIGHT pedal for ZERO seconcds each pressing (TAP).");
			pedal = scnr.nextLine().toUpperCase().replaceAll(" ", "");
			car.setIN(pedal);
			System.out.println(car.setState());
			System.out.println("Continue operating this device? Y or N");
			flag= scnr.nextLine().toUpperCase();
		}
		scnr.close();
	}
}

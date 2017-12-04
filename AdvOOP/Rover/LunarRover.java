

import java.util.Scanner;

public class LunarRover{
	private final String  REST= "Zero acceleration";
	private final String  FOW= "Accelerating foward";
	private final String  BACK= "Accelerating backwards";

	private String prev;
	private String curr;
	String[] listIN;

	/**Constructor for the LunarRover class. Initiates the state of the Rover to REST.*/
	public LunarRover(){
		curr = REST;
	}

	/**Method setIN receives a Strinsg parameter which is separated on every character which the populates an array.*/
	public void setIN(String button){
		listIN= button.split("-");
	}
	/**Method states uses the array populated in setIN ad sets the state for the current iteration*/
	public String setState(){
		String result="";
		if(curr.equals(REST))
			if(	listIN[0].equals("1") &&
				listIN[1].equals("R") &&
				listIN[2].equals("0")){
				curr = FOW;
				prev = REST;
			}else if(	listIN[0].equals("1") &&
						listIN[1].equals("L") &&
						listIN[2].equals("5")){
				curr = BACK;
				prev = REST;
			}
		else if(curr.equals(FOW))
			if(	listIN[0].equals("1") && 
				(listIN[2].equals("5") || 
				 listIN[2].equals("0"))){
				curr = REST;
				prev = FOW;
			}else if(listIN[0].equals("2") &&
					listIN[1].equals("R") &&
					listIN[2].equals("0")){
				curr = BACK;
				prev = REST;
			}
		else if(curr.equals(BACK))
			if(	(listIN[0].equals("1") &&
				 listIN[1].equals("L") &&
				 listIN[2].equals("0")) ||
				 (prev.equals(FOW))){
				curr = REST;
				prev = BACK;
			}
		else
			prev = "";
		
		if(prev.equals(""))
			result = "Invalid Input";
		else
			result = "Changing from "+prev+" to "+curr+".";
		return result;		
	}
}

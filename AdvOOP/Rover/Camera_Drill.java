public class Camera_Drill extends Parent_Class {
	String state;
	int button;
	public void CameraAndDrill(){
		state = "Tdle state";
	}
	public void setButton(int but){
		button = but;
		setState();
	}
	public void setState(){
		if(button==1){
			state = "Color Camera";
			System.out.println("State: "+state);
		}
		if(button==16){
			state="16mm Camera";
		}
		if(button==2){
			state = "Iddle State";
			System.out.println("State: "+state);
		}
		if(button==11){
			state ="Drill";
		}
	}
}

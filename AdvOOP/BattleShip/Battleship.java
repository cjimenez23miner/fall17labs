public class Battleship{
	public static void main(String args[]){
		Game new_Game= new Game();
	}
}

class Game{
	long Start;
	long End;
	Player active;
	
	public Game(){}	
	void PvP(){}
	void PvCPU(){}
	void add_Player(){}
	void remove_Player(){}
	void add_Player(){}
}

class Torpedo{
	int x;
	int y;
	boolean hit;
	
	public Torpedo(){}
	void set_Coordinates(int x, int y){}
	boolean Hit_target(){}
}

class Ship{
	int size;
	int value;
	
	public Ship(){}
}

class Board{
	boolean confirm_Hit;
	boolean comfirm_Win;
	void next_Turn(){}
}

class Player{
	Torpedo arsenal;
	Ship fleet;
	int score;
	
	public Player(){}
	void remove_Ship(){}
	void remove_Torpedo(){}
	void fire_Torpedo(int x, int y){}
}
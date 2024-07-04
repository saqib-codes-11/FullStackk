package test;

import java.util.Scanner;

interface Player{
	void play();
}

class Batsman implements Player{
	
	public void play() {
		System.out.println("Batsman is batting");
	}
}

class Bowler implements Player{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Bowler is bowling");
		
	}
	
}



class Coach{
	Player player;
	
	void setPlayer(Player player) {
		this.player=player;
	}
	
	void coach() {
		player.play();
	}
}


public class Q6 {
	public static void main(String[] args) {
		Coach c=new Coach();
		Batsman bat=new Batsman();
		Bowler bowl=new Bowler();
		
		Scanner in=new Scanner(System.in);
		
		String type=in.nextLine();
		
		if (type.equals("Bowler")) {
			c.setPlayer(bowl);
			c.coach();
		}
		
		else if(type.equals("Batsman")) {
			c.setPlayer(bat);
			c.coach();
		}
		else System.out.println("Invalid Input");
		
	}

}
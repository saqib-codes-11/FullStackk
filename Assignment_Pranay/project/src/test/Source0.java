package test;
class Person{
	String name;
	String game;
	Person(String name, String game){
		this.name = name;
		this.game = game;
	}
}

class Finale{
	
	Person person;
	Finale(Person p){
		person = p;
	}
	
	
	
	public String checkPerson(){
		String[] nameStr = person.name.split(" ");
		String[] gameStr = person.game.split(" ");
		
		if(nameStr.length == 2){
			if(Integer.parseInt(gameStr[0])<=9 && Integer.parseInt(gameStr[1])<=9)
				return "Person valid";
		}
		
		return "Failed";
	}
	
	public int numberOfTrophies(){
		String[] gameStr = person.game.split(" ");
		int res=0;
		String z=gameStr[2];
		System.out.println(z);
		for(int i=0;i<z.length(); i++) {
			if (z.charAt(i)=='W' || z.charAt(i)=='w') {
				res+=Integer.parseInt(gameStr[0]);
			}
			else {
				res-=Integer.parseInt(gameStr[1]);
			}
		}
		return res;	
	}
}
	class Source0{
		static public void main(String[] args){
			Person p = new Person("Ravi teja", "8 4 wl");
			Finale f = new Finale(p);
			System.out.println(f.checkPerson());
		System.out.println(f.numberOfTrophies());
		}
	}

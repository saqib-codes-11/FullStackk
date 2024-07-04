package Polymorphism;

class Sample {
	public void render() {
	    System.out.println("Rendering Polygon...");
	  }
}
class Sample1 extends Sample{
	public void render() {
	    System.out.println("Rendering Square...");
	  }
}
class Sample2 extends Sample{
	public void render() {
	    System.out.println("Rendering circle...");
	  }
}
class Main{
	public static void main(String[] args) {
		Sample1 obj=new Sample1();
		obj.render();
		Sample2 obj1=new Sample2();
		obj1.render();
	}
}

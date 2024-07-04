package Assignment2;

public class Parameters {
	public static void main(String[] args) {
		Parameter_Return pr=new Parameter_Return();
		int a = 10;
		pr.noPara_noReturn();
		System.out.println("without parameter and without return");
		pr.noPara_Return();
		System.out.println("without parameter and with return");
		pr.Para_noReturn(a);
		System.out.println("with parameter and with return");
		pr.Para_Return(a);
		System.out.println("with parameter and without return");

	}

}

class Parameter_Return {
	public void noPara_noReturn() {
		System.out.println("without parameter and without return type");
	}
	public boolean noPara_Return() {
		return true;
	}
	public void Para_noReturn(int a) {
		if(a==10) {
			System.out.println("Value of a is "+a);
					}
	}
	public boolean Para_Return(int a) {
		if(a==0) {
			return true;
		}
		else {
			return false;
		}
	}

}

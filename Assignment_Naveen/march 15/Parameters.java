package assignments;
class Para {
	public void noPara_noReturn() {
		System.out.println("without parameter and without return type");
	}
	public boolean noPara_Return() {
		return true;
	}
	public void Para_noReturn(int n) {
		if(n==10) {
			System.out.println("Value of n is "+n);
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
public class Parameters {
	public static void main(String[] args) {
		Para p=new Para();
		int n = 1;
		p.noPara_noReturn();
		System.out.println("without parameter and without return");
		p.noPara_Return();
		System.out.println("without parameter and with return");
		p.Para_noReturn(n);
		System.out.println("with parameter and with return");
		p.Para_Return(n);
		System.out.println("with parameter and without return");

	}

}



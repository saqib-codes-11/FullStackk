package strings;

public class ToString {
	int id;
	String name;
	
	ToString(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return id + " " + name;
	}
}

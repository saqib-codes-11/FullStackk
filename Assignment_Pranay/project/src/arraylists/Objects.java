package arraylists;

public class Objects {
	int id;
	String name;
	int sal;
	
	public Objects(int id, String name, int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}

	@Override
	public String toString() {
		return "Objects [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
}

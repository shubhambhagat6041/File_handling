package File_HandingApp;
import java.io.*;
import java.util.*;
class Employee implements Serializable
{
	private int id;
	private String name;
	private int sal;
	public void setid(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public void setsal(int sal)
	{
		this.sal=sal;
	}
	public int getsal()
	{
		return sal;
	}
	
}
public class Serialization 
{	public static void main(String[] args) throws IOException
	{
		Scanner xyz=new Scanner(System.in);
		
		FileOutputStream fo=new FileOutputStream("E:\\FileHandTxt\\seriali.txt");
		ObjectOutputStream oo=new ObjectOutputStream(fo);
		Employee e1=new Employee();
		e1.setid(1);
		e1.setname("Mno");
		e1.setsal(15000);
		oo.writeObject(e1);
		oo.close();
		fo.close();
		System.out.println("Success............");
		
	}

}

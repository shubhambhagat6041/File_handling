package File_HandingApp;
import java.io.*;
public class Deseilization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fi=new FileInputStream("E:\\FileHandTxt\\seriali.txt");
		ObjectInputStream oi=new ObjectInputStream(fi);
		Object obj=oi.readObject();
		if(obj!=null)
		{
			Employee e=(Employee)obj;
			System.out.println(e.getid()+"\t"+e.getname()+"\t"+e.getsal());
		}
	}

}

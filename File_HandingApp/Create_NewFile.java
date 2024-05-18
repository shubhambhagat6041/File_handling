package File_HandingApp;
import java.io.*;
public class Create_NewFile 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("E:\\FileHandTxt\\demo.txt");
		boolean b=f.createNewFile();
		if(b)
		{
			System.out.println("File Created Succesfully..");
		}
		else
		{
			System.out.println("Not Created");
		}
	}

}

package File_HandingApp;
import java.io.*;
public class Create_Folder
{
	public static void main(String x[])
	{
		File f=new File("E:\\FileHandTxt");
		boolean b=f.mkdir();
		if(b)
		{
			System.out.println("Folder Created Succesfully");
		}
		else
		{
			System.out.println("Not Created");
		}
	}
}

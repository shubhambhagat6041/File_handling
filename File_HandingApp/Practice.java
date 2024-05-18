package File_HandingApp;
import java.io.*;
public class Practice {
	public static void main(String x[])
	{
		File f=new File("E:\\FileHandTxt");
		boolean b=f.exists();
		if(b)
		{
			System.out.println("Already Present");
		}
		else
		{
			b=f.mkdir();
			if(b)
			{
				System.out.println("Folder Created");
			}
			else
			{
				System.out.println("Not Created");
			}
		}
	}
}

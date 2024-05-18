package File_HandingApp;
import java.io.*;
public class Fetch_Files_Folder {
	public static void main(String[] args) {
		File f=new File("C:\\Html");
		File f1[]=f.listFiles();
		for(int i=0;i<f1.length;i++)
		{
			System.out.println(f1[i]);
		}
	}

}

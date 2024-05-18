package File_HandingApp;
import java.io.*;
public class Read_data {
	public static void main(String[] args)throws IOException{
	File f=new File("E:\\FileHandTxt\\newline.txt");
	FileReader fr=new FileReader(f);
	int data;
	
		while((data=fr.read())!=-1)
		{
			System.out.println((char)data);
		}

	}

}

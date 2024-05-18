package File_HandingApp;
import java.io.*;
public class ImageCopyPasteUsingReader_Writer 
{
	public static void main(String x[]) throws IOException
	{
		FileReader fr=new FileReader("E:\\view.png");
		FileWriter fw=new FileWriter("E:\\FileHandTxt\\view.png");
		int data;
		while((data=fr.read())!=-1)
		{
			fw.write(data);
		}
		fw.close();
		fr.close();
		System.out.println("Image Copy Paste Successfully");
	}
}

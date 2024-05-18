package File_HandingApp;
import java.io.*;
public class ImgcopypaseusingStream {
	public static void main(String x[]) throws IOException
	{
		FileInputStream fi=new FileInputStream("E:\\view.png");
		FileOutputStream fo=new FileOutputStream("E:\\FileHandTxt\\view2.png");
		int data;
		while((data=fi.read())!=-1)
		{
			fo.write(data);
		}
		fo.close();
		fi.close();
		System.out.println("Success");
	}
}

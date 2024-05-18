package File_HandingApp;
import java.io.*;
public class InputStream_class {
	public static void main(String[] args) throws IOException {
	FileInputStream fi=new FileInputStream("E:\\FileHandTxt\\outstream.txt");
	int data;
		while((data=fi.read())!=-1)
		{
			System.out.println((char)data);
		}
	}

}

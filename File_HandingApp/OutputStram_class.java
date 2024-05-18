package File_HandingApp;
import java.io.*;
import java.util.*;
public class OutputStram_class {
	public static void main(String[] args) throws IOException {
		Scanner xyz=new Scanner(System.in);
		FileOutputStream fo=new FileOutputStream("E:\\FileHandTxt\\outstream.txt",true);
		System.out.println("Enter the  Data");
		String msg=xyz.nextLine();
		byte b[]=msg.getBytes();
		fo.write(b);
		fo.close();
		System.out.println("Stream Data Save Succesfully...........");
	}

}

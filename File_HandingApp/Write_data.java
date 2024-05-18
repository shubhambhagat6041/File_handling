package File_HandingApp;
import java.io.*;
import java.util.*;
public class Write_data {
	public static void main(String[] args) throws IOException {
		Scanner xyz=new Scanner(System.in);
		File f=new File("E:\\FileHandTxt\\write.txt");
		FileWriter fw=new FileWriter(f,true);
		System.out.println("Enter the String Data");
		String data=xyz.nextLine();
		fw.write(data);
		fw.close();
		System.out.println("Data Save Sucess");
	}

}

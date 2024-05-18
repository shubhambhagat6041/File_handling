package File_HandingApp;
import java.io.*;
import java.util.*;
public class Write_data_new_Line_Bufferedwriter {
	public static void main(String[] args) throws IOException {
		Scanner xyz=new Scanner(System.in);
		FileWriter fw=new FileWriter("E:\\FileHandTxt\\newline.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		System.out.println("Enter the String Data");
		String data=xyz.nextLine();
		bw.write(data);
		bw.newLine();
		bw.close();
		fw.close();
		System.out.println("Data Save Sucessfully..........");
		
	}

}

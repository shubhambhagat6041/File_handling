package File_HandingApp;
import java.io.*;
public class Read_LinebyLine {

	public static void main(String[] args)throws Exception {
		FileReader fr=new FileReader("E:\\FileHandTxt\\newline.txt");
		BufferedReader br=new BufferedReader(fr);
		String data;
		while((data=br.readLine())!=null)
		{
			System.out.println(data);
		}

	}

}

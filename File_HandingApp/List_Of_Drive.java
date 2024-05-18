package File_HandingApp;
import java.io.File;
import java.util.*;
public class List_Of_Drive
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		File f[]=File.listRoots();
		System.out.println("Dname\tTotal\tFree");
		for(int i=0;i<f.length;i++)
		{
			long totalSpace=f[i].getTotalSpace();
			long freespace=f[i].getFreeSpace();
			
			System.out.println(f[i]+"\t"+(totalSpace/1073741824)+"GB\t"+(freespace/1073741824)+"GB");
		}
	}
}

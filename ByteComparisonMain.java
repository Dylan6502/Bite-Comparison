import java.util.Scanner;
import java.io.*;
import javax.swing.*;
import java.nio.file;

public class ByteComparisonMain extends JFrame
{
	File dir;
	Scanner in;
	
	//Strings
	String rawInput;
	String filePath;
	
	public ByteComparisonMain()
	{
		rawInput = JOptionPane.showInputDialog("Enter 1st file name and path.");
		filePath = rawInput;
		
		try
		{
			PathMatcher matcher =
				FileSystems.getDefault().getPathMatcher("glob:*.{java,class}");

			Path filename = filePath;
			if (matcher.matches(filename)) {
			System.out.println(filename);
			}
			
		}catch(FileNotFoundException e){
			JOptionPane.showMessageDialog(null,"Damn!!");
		}
		
	
	
	}
	public static void main(String args[])throws IOException
	{	
		new ByteComparisonMain();
	}
		
}	

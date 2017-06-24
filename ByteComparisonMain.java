import java.util.Scanner;
import java.io.*;
import javax.swing.*;
import java.nio.file.Path;
import java.nio.file.Files;

public class ByteComparisonMain extends JFrame
{
	// Files
	File firstFile;
	File secondFile;
	
	
	// Strings
	String rawInput;
	String filePath;
	String output;
	
	// Numbers
	double firstSize;
	double secondSize;
	
	public ByteComparisonMain()
	{
		rawInput = JOptionPane.showInputDialog("Enter 1st filename and path.");
		File firstFile = new File(rawInput);
		
		rawInput = JOptionPane.showInputDialog("Enter another filename");
		File secondFile = new File(rawInput);
		
		if(firstFile.exists() && secondFile.exists()) {
			
			firstSize = firstFile.length();
			secondSize = secondFile.length();
			
			if(firstSize == secondSize) {
				
				JOptionPane.showMessageDialog(null, "Files are the same.");
			}
			else
				JOptionPane.showMessageDialog(null, "Files are different.");
				
			JOptionPane.showMessageDialog(null, firstSize + "\n" + secondSize);
		}
		else {
			JOptionPane.showMessageDialog(null,"404");
		}
	
	}
	public static void main(String args[])throws IOException
	{	
		new ByteComparisonMain();
	}
		
}	

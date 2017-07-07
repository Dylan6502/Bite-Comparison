import java.util.*;
import java.io.*;
import javax.swing.*;


public class ByteComparisonMain extends JFrame
{
	// Files
	File firstFile;
	File secondFile;
	File filePath;
	
	
	// Strings
	String rawInput;
	//String filePath;
	String output = "";
	
	// Numbers
	double firstSize;
	double secondSize;
	
	public ByteComparisonMain()
	{
		// Input
		rawInput = JOptionPane.showInputDialog("Enter 1st filename and path.");
		File firstFile = new File(rawInput);
		
		rawInput = JOptionPane.showInputDialog("Enter another filename");
		File secondFile = new File(rawInput);
		
		FileList(firstFile, secondFile);
		
		// Checking for Existance
		FileComparing(firstFile, secondFile);
		
		JOptionPane.showMessageDialog(null, output);
	}
	
	public void FileList(File folder1, File folder2) {
		
		List<File> resultList1 = new ArrayList<File>();
		
		File[] allFilesDir1 = folder1.listFiles();
		resultList1.addAll(Arrays.asList(allFilesDir1));
		
		List<File> resultList2 = new ArrayList<File>();
		
		File[] allFilesDir2 = folder2.listFiles();
		resultList2.addAll(Arrays.asList(allFilesDir2));
		
		
		/*for(File b : resultList) {
			if(b.isFile()){
				System.out.println("File");
				//filePath = b.getAbsolutePath;
			}
			else if(b.isDirectory()){
				System.out.println(b.getAbsolutePath());
			}
			
		}*/
		
	}
	
	public String FileComparing(File[] file1, File[] file2) {
		
		for(int i = 0; i < file1.length; i++) {
			for(int j = 0; j < file2.length; j++) {
			
			firstSize = firstFile.length();
			secondSize = secondFile.length();
			
			// Comparing File Sizes
			if(firstSize == secondSize) {
				
				output = output + "Files are the same.";
			}
			else
				output = output + "Files are different.";
				
			output = output + firstSize + "\n" + secondSize;
			
			}
		}
		
		
		
		return output;
	}
	public static void main(String args[])throws IOException
	{	
		new ByteComparisonMain();
	}
		
}	

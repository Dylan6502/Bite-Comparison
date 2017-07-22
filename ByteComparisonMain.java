/*
 * Dylan Paul
 * Compares file size from two user given directories.
*/


import java.util.*;
import java.io.*;
import javax.swing.*;


public class ByteComparisonMain extends JFrame {
	
///////////////////////////////////////////////////////-VARIABLES-//////////////////////////////////////////////////
	
	// Files
	File firstFile;
	File secondFile;
	File filePath;	
	
	// Strings
	String rawInput;
	String output = "";
	
	// Numbers
	double firstSize;
	double secondSize;
	
	// Arrays
	File[] subDir;
	
	ByteComparisonManager ByteOut;
//////////////////////////////////////////////////////-INPUT METHOD-///////////////////////////////////////////////////////	
	
	public ByteComparisonMain(File x, File y)
	{
		
		FileList(x, y);
		
		
	}
	
////////////////////////////////////////////////////-FILE LIST METHOD-/////////////////////////////////////////////////////	
	
	public void FileList(File folder1, File folder2) {
		
		List<File> resultList1 = new ArrayList<File>();
		
		File[] allFilesDir1 = folder1.listFiles();
		resultList1.addAll(Arrays.asList(allFilesDir1));
		
		List<File> resultList2 = new ArrayList<File>();
		
		for(int i = 0; i < allFilesDir1.length; i++) {
			
			if(allFilesDir1[i].isDirectory()) {
				subDir = allFilesDir1[i].listFiles();
				resultList1.addAll(Arrays.asList(subDir));
			}
			allFilesDir1 = resultList1.toArray(new File[0]);
		}
		
		
		
		File[] allFilesDir2 = folder2.listFiles();
		resultList2.addAll(Arrays.asList(allFilesDir2));
		
		for(int i = 0; i < allFilesDir2.length; i++) {
			
			if(allFilesDir2[i].isDirectory()) {
				subDir = allFilesDir2[i].listFiles();
				resultList2.addAll(Arrays.asList(subDir));
			}
			allFilesDir2 = resultList2.toArray(new File[0]);
		}
		
		
		
		output = FileComparing(allFilesDir1, allFilesDir2);
		
	}
	
///////////////////////////////////////////////////////////-FILE COMPARING METHOD-//////////////////////////////////////	
	
	public String FileComparing(File[] file1, File[] file2) {
		for(int i = 0; i < file1.length; i++) {
			for(int j = 0; j < file2.length; j++) {
			
			firstSize = file1[i].length();
			secondSize = file2[j].length();
			
			// Comparing File Sizes
			if(firstSize == secondSize) {
				
				output = output + "Files are the same";
			}
			else
				output = output + "Files are different";
				
			output = output+ ":\n" + file1[i] + ": " + firstSize + "\n" + file2[j] + ": " + secondSize + "\n\n";
			
			}
		}
		System.out.println(output);
		return output;
		
	}	
	
	public String getOut() {
		return output;
	}
		
}	

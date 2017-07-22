import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ByteComparisonManager {
	ByteComparisonGraphics ByteGraph;
	private File file1;
	private File file2;
	private String passingOutput;
	
	
	public ByteComparisonManager() {
		
		new ByteComparisonGraphics();	
	
	}
	
	
	public static void main(String args[])throws IOException {	
		new ByteComparisonManager();
		
		
	}
}

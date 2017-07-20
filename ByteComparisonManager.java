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
	
	public void pausedCiruit(String passedOut) {
		
		passingOutput = passedOut;											    					  
		JOptionPane.showMessageDialog(null,"MADE IT");													  
		ByteGraph.newOut(passingOutput);
	}
	
	
	public static void main(String args[])throws IOException {	
		new ByteComparisonManager();
		
		
	}
}

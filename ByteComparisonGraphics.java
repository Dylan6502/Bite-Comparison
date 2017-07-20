import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class ByteComparisonGraphics extends JFrame {

//////////////////////////////////////////////////////-VARIABLES-//////////////////////////////////////////////////

	// Strings
	private String newOut;
	private String firstInput;
	private String secondInput;
	
	// File
	private File firstFile;
	private File secondFile;
	
	// Integers
	private int width = 800;
	private int height = 200;
	
	// Input Panels
	private JPanel inputPanel;
	private JPanel inputTextPanel;
	private JPanel inputButtonPanel;
	
	// Output Panels
	private JPanel outputPanel;
	private JPanel outputTextPanel;
	private JPanel outputButtonPanel;
	
	// Textbox for input
	private static JTextField topInputBox = new JTextField(10);
	private static JTextField bottomInputBox = new JTextField(10);
	
	// TextBox for output
	private JTextArea outputBox = new JTextArea();
	
	// Labels
	private JLabel topInputLabel = new JLabel("Enter First Directory.");
	private JLabel bottomInputLabel = new JLabel("Enter Second Directory.");
	
	// Buttons
	private JButton processButton = new JButton("Process");;
	private JButton logButton = new JButton("Log");
	
	// Objects
	ByteComparisonMain ByteMain;// only used to get output
	

/////////////////////////////////////////////////////////-UI BUILDING-//////////////////////////////////////////////////////
	
	public ByteComparisonGraphics() {
	
	
      // Sets title of the window
      setTitle("Byte Comparer Supreme!");
      
      // Sets the size of the window
      setSize(width, height);
      
      // Specified action on close
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //Layout type
      setLayout(new BorderLayout());
      
      // Builds Input Panel
      buildInputPanel();
      buildOutputButtonPanel();
      
      // adds to main panel
      add(inputPanel);
      add(outputButtonPanel, BorderLayout.SOUTH);
      
      // Shows content
      setVisible(true);
   }
   
/////////////////////////////////////////////////////////-INPUT PANEL-///////////////////////////////////////////////////
   
   public void buildInputPanel() {
	   
	   inputPanel = new JPanel();
	   
	   buildInputTextPanel();
	   buildInputButtonPanel();
	   
	   inputPanel.add(inputTextPanel);
	   inputPanel.add(inputButtonPanel);
	}
	
///////////////////////////////////////////////////////-INPUT TEXT BOXES AND LABELS-///////////////////////////////////////
	
	public void buildInputTextPanel() {
		
		inputTextPanel = new JPanel();
		
		inputTextPanel.add(topInputLabel);
		inputTextPanel.add(topInputBox);
		inputTextPanel.add(bottomInputLabel);
		inputTextPanel.add(bottomInputBox);
	}
	
//////////////////////////////////////////////////////-INPUT BUTTON-///////////////////////////////////////////////////////
	
	public void buildInputButtonPanel() {
		
		inputButtonPanel = new JPanel();
		
		processButton.addActionListener(new InputButtonListener());
		
		inputButtonPanel.add(processButton);
	}
	
///////////////////////////////////////////////////////////-OUTPUT PANEL POSSIBLY NEEDS OWN UI BUILD-///////////////////////////
	
	public void buildOutputButtonPanel() {
		
		outputButtonPanel = new JPanel();
		
		logButton.addActionListener(new OutputButtonListener());
		
		outputButtonPanel.add(outputBox);
		outputButtonPanel.add(logButton);
	}
	
/////////////////////////////////////////////////////////////-INPUT BUTTON ACTION-///////////////////////////////////////
	
	private class InputButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			firstInput = topInputBox.getText();
			secondInput = bottomInputBox.getText();
			
			firstFile = new File(firstInput);
			secondFile = new File(secondInput);
			
			ByteMain = new ByteComparisonMain(firstFile, secondFile);
			
		}
	}
	
	public File getFirstFile() {
		return firstFile;
	}
	
	public File getSecondFile() {
		return secondFile;
	}
	
	public void newOut() {
		 newOut = ByteMain.getOut();
	}
	
////////////////////////////////////////////////////////////////-OUTPUT BUTTON ACTION WOULD ALSO NEED MOVED-////////////////////
	
	private class OutputButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			newOut();
			outputBox.setText(newOut);
		}
	}
}  
   
   
   
   
   
   
   
   
   
   

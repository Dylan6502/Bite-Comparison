import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ByteComparisonGraphics extends JFrame {

	// Strings
	private String filePathName;
	private String output;
	
	// Integers
	private int width = 900;
	private int height = 200;
	
	// Input Panels
	private JPanel inputPanel;
	private JPanel inputTextPanel;
	private JPanel inputButtonPanel;
	
	// Output Panels
	private JPanel outputPanel;
	private JPanel outputTextPanel;
	private JPanel outputButtonPanel;
	
	// Textbox
	private static JTextField topInputBox = new JTextField(10);
	private static JTextField bottomInputBox = new JTextField(10);
	
	// Labels
	private JLabel topInputLabel = new JLabel("Enter First Directory.");
	private JLabel bottomInputLabel = new JLabel("Enter Second Directory.");
	
	// Buttons
	private JButton processButton = new JButton("Process");;
	private JButton logButton = new JButton("Log");
	
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
      
      add(inputPanel);
      
      // Shows content
      setVisible(true);
   }
   
   public void buildInputPanel() {
	   
	   inputPanel = new JPanel();
	   
	   buildInputTextPanel();
	   buildInputButtonPanel();
	   
	   inputPanel.add(inputTextPanel, BorderLayout.PAGE_START);
	   inputPanel.add(inputButtonPanel, BorderLayout.PAGE_END);
	}
	
	public void buildInputTextPanel() {
		
		inputTextPanel = new JPanel();
		
		inputTextPanel.add(topInputLabel);
		inputTextPanel.add(topInputBox);
		inputTextPanel.add(bottomInputLabel);
		inputTextPanel.add(bottomInputBox);
	}
	
	public void buildInputButtonPanel() {
		
		inputButtonPanel = new JPanel();
		
		processButton.addActionListener(new InputButtonListener());
		
		inputButtonPanel.add(processButton);
	}
	
	private class InputButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			dispose();
		}
	}
 
public static void main(String args[]) {
	new ByteComparisonGraphics();
}
}  
   
   
   
   
   
   
   
   
   
   

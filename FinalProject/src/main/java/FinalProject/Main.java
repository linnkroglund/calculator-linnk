package FinalProject;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;

/**
 * @author      Linn Kroglund - linn@kroglund.se
 * @version     1.0
 * @since       2018-12-13
 */

public class Main {

	private JFrame frmStandardCalculator;
	private JTextField textField;

	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Main-metoden i klassen Main startar kalkylatorn
	 * 
	 * @param args Standardparameter för main
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmStandardCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Skapar applikationen.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initierar innehållet i ramen
	 */
	
	private void initialize() {
		frmStandardCalculator = new JFrame();
		frmStandardCalculator.getContentPane().setForeground(SystemColor.activeCaption);
		frmStandardCalculator.setTitle("Standard Calculator");
		frmStandardCalculator.setBounds(100, 100, 255, 440);
		frmStandardCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStandardCalculator.getContentPane().setLayout(null);
		frmStandardCalculator.setResizable(false);

		textField = new JTextField();
		textField.setBounds(10, 11, 230, 50);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		frmStandardCalculator.getContentPane().add(textField);
		textField.setColumns(10);

		//--------------Rad 1 med knappar-------------
		
		// Button AC
		
		JButton buttonAC = new JButton(""); //backspace
		buttonAC.setToolTipText("Backspace");
		buttonAC.setBackground(SystemColor.inactiveCaption);
		buttonAC.setForeground(new Color(0, 0, 0));
		buttonAC.setIcon(new ImageIcon(Main.class.getResource("/com/sun/javafx/scene/control/skin/caspian/images/backspace-icon.png")));
		buttonAC.setBounds(10, 75, 50, 50);
		buttonAC.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

				String buttonAC = null;

				if(textField.getText().length() > 0) {
				StringBuilder strB = new StringBuilder(textField.getText());
				strB.deleteCharAt(textField.getText().length()-1);
				buttonAC = strB.toString();
				textField.setText(buttonAC);

				}
			}
		});

		buttonAC.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmStandardCalculator.getContentPane().add(buttonAC);

		// Button C
		
		JButton buttonC = new JButton("C");
		buttonC.setToolTipText("Clear");
		buttonC.setBackground(SystemColor.inactiveCaption);
		buttonC.setForeground(Color.WHITE);
		buttonC.setBounds(70, 75, 50, 50);
		buttonC.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {

				textField.setText(null);
			}
		});
		buttonC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmStandardCalculator.getContentPane().add(buttonC);

		// Button SqRt
		
		JButton buttonPro = new JButton("Sqr");
		buttonPro.setForeground(Color.WHITE);
		buttonPro.setBackground(SystemColor.inactiveCaption);
		buttonPro.setBounds(130, 75, 50, 50);
		buttonPro.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			String answer;
			firstnum = Double.parseDouble(textField.getText());
		    
		    // Creates Basic Class Instance
		    Advanced a = new Advanced (firstnum, "Root");

		    // Calls the class methods
		    a.doCalculation();
		    answer = a.getResult();
		    
		    // Sets answer to textfield
			textField.setText(answer);
			}
		});
		buttonPro.setFont(new Font("Tahoma", Font.PLAIN, 10));
		frmStandardCalculator.getContentPane().add(buttonPro);

		JButton buttonDiv = new JButton("/");
		buttonDiv.setForeground(Color.WHITE);
		buttonDiv.setBackground(SystemColor.inactiveCaption);
		buttonDiv.setBounds(190, 75, 50, 50);
		buttonDiv.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {

				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		buttonDiv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmStandardCalculator.getContentPane().add(buttonDiv);

		//--------------Rad 2 med knappar -------------
		
		// Button 7
		
		final JButton btn7 = new JButton("7");
		btn7.setBounds(10, 136, 50, 50);
		btn7.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {

				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmStandardCalculator.getContentPane().add(btn7);

		// Button 8
		
		final JButton btn8 = new JButton("8");
		btn8.setBounds(70, 136, 50, 50);
		btn8.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {

				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});

		btn8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmStandardCalculator.getContentPane().add(btn8);

		// Button 9

		final JButton btn9 = new JButton("9");
		btn9.setBounds(130, 136, 50, 50);
		btn9.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {

				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmStandardCalculator.getContentPane().add(btn9);

		// Button +
		
		JButton btnPlus = new JButton("+");
		btnPlus.setForeground(Color.WHITE);
		btnPlus.setBackground(SystemColor.inactiveCaption);
		btnPlus.setBounds(190, 136, 50, 50);
		btnPlus.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmStandardCalculator.getContentPane().add(btnPlus);

		//--------------Rad 3 -------------
		
		// Button 4

		final JButton btn4 = new JButton("4");
		btn4.setBounds(10, 197, 50, 50);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmStandardCalculator.getContentPane().add(btn4);

		// Button 5
		
		final JButton btn5 = new JButton("5");
		btn5.setBounds(70, 197, 50, 50);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmStandardCalculator.getContentPane().add(btn5);

		// Button 6
		
		final JButton btn6 = new JButton("6");
		btn6.setBounds(130, 197, 50, 50);
		btn6.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {

				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmStandardCalculator.getContentPane().add(btn6);

		// Button -
		
		JButton btnSub = new JButton("-");
		btnSub.setForeground(Color.WHITE);
		btnSub.setBackground(SystemColor.inactiveCaption);
		btnSub.setBounds(190, 197, 50, 50);
		btnSub.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {

				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmStandardCalculator.getContentPane().add(btnSub);

		//--------------Rad 4 -------------
		
		// Button 1

		final JButton btn1 = new JButton("1");
		btn1.setBounds(10, 258, 50, 50);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmStandardCalculator.getContentPane().add(btn1);
		
		// Button 2

		final JButton btn2 = new JButton("2");
		btn2.setBounds(70, 258, 50, 50);
		btn2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {

				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmStandardCalculator.getContentPane().add(btn2);
		
		// Button 3

		final JButton btn3 = new JButton("3");
		btn3.setBounds(130, 258, 50, 50);
		btn3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {

				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmStandardCalculator.getContentPane().add(btn3);
		
		// Button *

		JButton btnMult = new JButton("*");
		btnMult.setForeground(Color.WHITE);
		btnMult.setBackground(SystemColor.inactiveCaption);
		btnMult.setBounds(190, 258, 50, 50);
		btnMult.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {

				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmStandardCalculator.getContentPane().add(btnMult);

		//--------------Rad 5 -------------
		
		// Button 0

		final JButton btn0 = new JButton("0");
		btn0.setBounds(10, 319, 50, 50);
		btn0.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {

				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmStandardCalculator.getContentPane().add(btn0);
		
		// Button ,

		JButton btnDot = new JButton(",");
		btnDot.setBounds(70, 319, 50, 50);
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDot.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {

				String EnterNumber = textField.getText() + ".";
				textField.setText(EnterNumber);
			}
		});
		frmStandardCalculator.getContentPane().add(btnDot);

		// Button + -
		
		JButton btnPM = new JButton("+ -");
		btnPM.setBounds(130, 319, 50, 50);
		btnPM.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {

				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));

			}
		});
		btnPM.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmStandardCalculator.getContentPane().add(btnPM);
		
		//--------------Equal -------------

		JButton btnEqual = new JButton("="); 
		btnEqual.setForeground(Color.WHITE);
		btnEqual.setBackground(SystemColor.inactiveCaption);
		btnEqual.setBounds(190, 319, 50, 50);
		btnEqual.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent arg0) {
			
			String answer;
			secondnum = Double.parseDouble(textField.getText());

		    // Convert Operations from string to char
		    char c=operations.charAt(0);
		    
		    // Creates Basic Class Instance
		    Basic b = new Basic (firstnum, c, secondnum);

		    // Calls the class methods
		    b.doCalculation();
		    answer = b.getResult();
		    
		    // Sets answer to textfield
			textField.setText(answer);
		    
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmStandardCalculator.getContentPane().add(btnEqual);
		
		//-------------- Advanced button -------------

		// Button X2
		
		JButton btnRot = new JButton("X^2");
		btnRot.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			String answer;
			firstnum = Double.parseDouble(textField.getText());
		    
		    // Creates Basic Class Instance
		    Advanced a = new Advanced (firstnum, "X2");

		    // Calls the class methods
		    a.doCalculation();
		    answer = a.getResult();
		    
		    // Sets answer to textfield
			textField.setText(answer);
			
			}
		});
		btnRot.setForeground(Color.WHITE);
		btnRot.setBackground(SystemColor.inactiveCaption);
		btnRot.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRot.setBounds(250, 75, 64, 50);
		frmStandardCalculator.getContentPane().add(btnRot);
		
		// Button X3
		
		JButton btnPi = new JButton("X^3");
		btnPi.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String answer;
			firstnum = Double.parseDouble(textField.getText());
		    
		    // Creates Basic Class Instance
		    Advanced a = new Advanced (firstnum, "X3");

		    // Calls the class methods
		    a.doCalculation();
		    answer = a.getResult();
		    
		    // Sets answer to textfield
			textField.setText(answer);
			}
		});
		btnPi.setForeground(Color.WHITE);
		btnPi.setBackground(SystemColor.inactiveCaption);
		btnPi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPi.setBounds(250, 136, 64, 50);
		frmStandardCalculator.getContentPane().add(btnPi);
		
		// Button Sin
		
		JButton btnX = new JButton("Sin");
		btnX.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String answer;
			firstnum = Double.parseDouble(textField.getText());
		    
		    // Creates Basic Class Instance
		    Advanced a = new Advanced (firstnum, "Sin");

		    // Calls the class methods
		    a.doCalculation();
		    answer = a.getResult();
		    
		    // Sets answer to textfield
			textField.setText(answer);
			}
		});
		btnX.setForeground(Color.WHITE);
		btnX.setBackground(SystemColor.inactiveCaption);
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnX.setBounds(250, 197, 64, 50);
		frmStandardCalculator.getContentPane().add(btnX);
		
		// Button Cos
		
		JButton btnY = new JButton("Cos");
		btnY.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String answer;
			firstnum = Double.parseDouble(textField.getText());
		    
		    // Creates Basic Class Instance
		    Advanced a = new Advanced (firstnum, "Cos");

		    // Calls the class methods
		    a.doCalculation();
		    answer = a.getResult();
		    
		    // Sets answer to textfield
			textField.setText(answer);
			}
		});
		btnY.setForeground(Color.WHITE);
		btnY.setBackground(SystemColor.inactiveCaption);
		btnY.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnY.setBounds(250, 258, 64, 50);
		frmStandardCalculator.getContentPane().add(btnY);
		
		// Button Tan
		
		JButton btnCos = new JButton("Tan");
		btnCos.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String answer;
			firstnum = Double.parseDouble(textField.getText());
		    
		    // Creates Basic Class Instance
		    Advanced a = new Advanced (firstnum, "Tan");

		    // Calls the class methods
		    a.doCalculation();
		    answer = a.getResult();
		    
		    // Sets answer to textfield
			textField.setText(answer);
			}
		});
		btnCos.setForeground(Color.WHITE);
		btnCos.setBackground(SystemColor.inactiveCaption);
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCos.setBounds(250, 319, 64, 50);
		frmStandardCalculator.getContentPane().add(btnCos);
		
		//-------------- Menu Bar -------------
		
		JMenuBar menuBar = new JMenuBar();
		frmStandardCalculator.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		mnNewMenu.setIcon(new ImageIcon(Main.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-more-details.png")));
		mnNewMenu.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Standard");
		mntmNewMenuItem.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			frmStandardCalculator.setTitle("Standard Calculator");
			frmStandardCalculator.setBounds(100, 100, 255, 440);
			textField.setBounds(10, 11, 230, 37);
			}
		});
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmAdvanced = new JMenuItem("Advanced");
		mntmAdvanced.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				
				frmStandardCalculator.setTitle("Advanced Calculator");
				frmStandardCalculator.setBounds(100, 100, 330, 440);
				textField.setBounds(10, 11, 300, 37);
			}
		});
		mntmAdvanced.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu.add(mntmAdvanced);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mntmExit.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu.add(mntmExit);
		
		
	}	
}
	

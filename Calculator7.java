import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.*;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.*;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.Math;


public class Calculator7 implements ActionListener
{

	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JTextArea textarea=new JTextArea(3,26);


	boolean lastCharIsNumberOrBracket = false;

	
	JButton buttonCut = new JButton();
	JButton buttonsquareroot=new JButton();
	JButton buttonbrackets=new JButton();
	JButton buttonpercent=new JButton();
	JButton buttonbracketleft=new JButton();
	JButton buttonbracketright=new JButton();
	JButton buttonsin=new JButton();
	JButton buttoncos=new JButton();
	JButton buttontan=new JButton();
	JButton buttonln=new JButton();
	JButton buttonlog=new JButton();
	JButton buttonpi=new JButton();
	JButton buttonexp=new JButton();


	JButton button1=new JButton();
	JButton button2=new JButton();
	JButton button3=new JButton();
        JButton button4=new JButton();
        JButton button5=new JButton();
        JButton button6=new JButton();
	JButton button7=new JButton();
	JButton button8=new JButton();
	JButton button9=new JButton();
	JButton button0=new JButton();


	JButton buttonadd=new JButton();
	JButton buttonsub=new JButton();
	JButton buttonmul=new JButton();
	JButton buttonclear=new JButton();
	JButton buttondiv=new JButton();
	JButton buttondot=new JButton();
	JButton buttonequal=new JButton();
	JButton buttonRad=new JButton();
	JButton buttononebyx=new JButton();
	JButton buttonexpo=new JButton();
	JButton buttonxsq=new JButton();
	JButton buttonxpowery=new JButton();
	JButton buttonmodofx=new JButton();
	JButton buttonplusminus=new JButton();
	JButton buttonsininverse=new JButton();
	JButton buttoncosinverse=new JButton();
	JButton buttontaninverse=new JButton();
	JButton button2powx=new JButton();
	JButton buttonxcube=new JButton();
	JButton buttonxfactorial=new JButton();
	JButton buttoncuberoot=new JButton();



	double number1,number2,result;
	int addc=0,mulc=0,divc=0,subc=0;



public Calculator7()
{

	frame.setSize(780,450);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.setTitle("Scientific Calculator");
	frame.setResizable(false);
	frame.add(panel);
	//panel.setBackground(Color.BLACK);


	Border redBorder = BorderFactory.createLineBorder(Color.RED, 2);


	panel.add(textarea);
	panel.setBackground(Color.BLACK);

	
	Border tborder=BorderFactory.createLineBorder(Color.RED,3);
	textarea.setBorder(tborder);
	Font font=new Font("arial",Font.BOLD,33);
	textarea.setFont(font);
	textarea.setForeground(Color.WHITE);
	textarea.setBackground(Color.BLACK);
	textarea.setPreferredSize(new Dimension(6,60));
	textarea.setLineWrap(true);



	buttonCut.setPreferredSize(new Dimension(100, 40));
	buttonCut.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\buttonCut.png")); // Set appropriate icon
	buttonCut.setBackground(Color.WHITE);
	buttonCut.setBorder(redBorder);




	buttonsquareroot.setPreferredSize(new Dimension(100,40));
	buttonsquareroot.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\buttonsquareroot.png"));
	buttonsquareroot.setBackground(Color.WHITE); 
	buttonsquareroot.setBorder(redBorder);




	/*buttonbrackets.setPreferredSize(new Dimension(100,40));
	buttonbrackets.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\buttonbrackets.png"));
	buttonbrackets.setBackground(Color.WHITE); 
	buttonbrackets.setBorder(redBorder);*/




	buttonpercent.setPreferredSize(new Dimension(100,40));
	buttonpercent.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\buttonpercent.png"));
	buttonpercent.setBackground(Color.WHITE); 
	buttonpercent.setBorder(redBorder);




	buttonbracketleft.setPreferredSize(new Dimension(100,40));
	buttonbracketleft.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\buttonbracketleft.png"));
	buttonbracketleft.setBackground(Color.WHITE); // Change the background color to black
	buttonbracketleft.setForeground(Color.BLACK);
	buttonbracketleft.setBorder(redBorder);




	buttonbracketright.setPreferredSize(new Dimension(100,40));
	buttonbracketright.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\buttonbracketright.png"));
	buttonbracketright.setBackground(Color.WHITE); // Change the background color to black
	buttonbracketright.setForeground(Color.BLACK);
	buttonbracketright.setBorder(redBorder);




	buttonsin.setPreferredSize(new Dimension(100,40));
	buttonsin.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\buttonsin.png"));
	buttonsin.setBackground(Color.WHITE); 
	buttonsin.setBorder(redBorder);




	buttoncos.setPreferredSize(new Dimension(100,40));
	buttoncos.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\buttoncos.png"));
	buttoncos.setBackground(Color.WHITE); 
	buttoncos.setBorder(redBorder);




	buttontan.setPreferredSize(new Dimension(100,40));
	buttontan.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\buttontan.png"));
	buttontan.setBackground(Color.WHITE); 
	buttontan.setBorder(redBorder);




	buttonln.setPreferredSize(new Dimension(100,40));
	buttonln.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\buttonln.png"));
	buttonln.setBackground(Color.WHITE); 
	buttonln.setBorder(redBorder);




	buttonlog.setPreferredSize(new Dimension(100,40));
	buttonlog.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\buttonlog.png"));
	buttonlog.setBackground(Color.WHITE); 
	buttonlog.setBorder(redBorder);




	buttonpi.setPreferredSize(new Dimension(100,40));
	buttonpi.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\buttonpi.png"));
	buttonpi.setBackground(Color.WHITE); 
	buttonpi.setBorder(redBorder);




	buttonexp.setPreferredSize(new Dimension(100,40));
	buttonexp.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\buttonexp.png"));
	buttonexp.setBackground(Color.WHITE); 
	buttonexp.setBorder(redBorder);




	button1.setPreferredSize(new Dimension(100,40));
	button1.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\button1.png"));
	button1.setBackground(Color.WHITE); 
	button1.setBorder(redBorder);




	button2.setPreferredSize(new Dimension(100,40));
	button2.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\button2.png"));
	button2.setBorder(redBorder);




	button3.setPreferredSize(new Dimension(100,40));
	button3.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\button3.png"));
	button3.setBorder(redBorder);




	button4.setPreferredSize(new Dimension(100,40));
	button4.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\button4.png"));
	button4.setBorder(redBorder);




	button5.setPreferredSize(new Dimension(100,40));
	button5.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\button5.png"));
	button5.setBorder(redBorder);




	button6.setPreferredSize(new Dimension(100,40));
	button6.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\button6.png"));
	button6.setBorder(redBorder);




	button7.setPreferredSize(new Dimension(100,40));
	button7.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\button7.png"));
	button7.setBorder(redBorder);




	button8.setPreferredSize(new Dimension(100,40));
	button8.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\button8.png"));
	button8.setBorder(redBorder);



	button9.setPreferredSize(new Dimension(100,40));
	button9.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\button9.png"));
	button9.setBorder(redBorder);




	button0.setPreferredSize(new Dimension(100,40));
	button0.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\button0.png"));
	button0.setBorder(redBorder);




	buttonadd.setPreferredSize(new Dimension(100,40));
	buttonadd.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\buttonadd.png"));
	buttonadd.setBackground(Color.WHITE); 
	buttonadd.setBorder(redBorder);




	buttonclear.setPreferredSize(new Dimension(100,40));
	buttonclear.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\buttonclear.png"));
	buttonclear.setBackground(Color.WHITE); 
	buttonclear.setBorder(redBorder);




	buttondiv.setPreferredSize(new Dimension(100,40));
	buttondiv.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\buttondiv.png"));
	buttondiv.setBackground(Color.WHITE); 
	buttondiv.setBorder(redBorder);




	buttondot.setPreferredSize(new Dimension(100,40));
	buttondot.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\buttondot.png"));
	buttondot.setBackground(Color.WHITE); // Change the background color to black
	buttondot.setBorder(redBorder);




	buttonequal.setPreferredSize(new Dimension(100,40));
	buttonequal.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\buttonequal.png"));
	buttonequal.setBackground(Color.GREEN); // Change the background color to black
	buttonequal.setForeground(Color.BLACK);
	buttonequal.setBorder(redBorder);




	buttonmul.setPreferredSize(new Dimension(100,40));
	buttonmul.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\buttonmul.png"));
	buttonmul.setBackground(Color.WHITE); // Change the background color to black
	buttonmul.setBorder(redBorder);




	buttonsub.setPreferredSize(new Dimension(100,40));
	buttonsub.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\buttonsub.png"));
	buttonsub.setBackground(Color.WHITE); 
	buttonsub.setBorder(redBorder);




	buttononebyx.setPreferredSize(new Dimension(100,40));
	buttononebyx.setText("1/x");
	buttononebyx.setFont(new Font("Arial", Font.BOLD, 26)); // Adjust font size as needed
	buttononebyx.setBackground(Color.WHITE); // Change the background color to black
	buttononebyx.setForeground(Color.BLACK);
	buttononebyx.setBorder(redBorder);



	buttonexpo.setPreferredSize(new Dimension(100,40));
	buttonexpo.setText("e^x");
	buttonexpo.setFont(new Font("Arial", Font.BOLD, 26)); // Adjust font size as needed
	buttonexpo.setBackground(Color.WHITE); // Change the background color to black
	buttonexpo.setForeground(Color.BLACK);
	buttonexpo.setBorder(redBorder);



	buttonxsq.setPreferredSize(new Dimension(100,40));
	buttonxsq.setText("x^2");
	buttonxsq.setFont(new Font("Arial", Font.BOLD, 26)); // Adjust font size as needed
	buttonxsq.setBackground(Color.WHITE); // Change the background color to black
	buttonxsq.setForeground(Color.BLACK);
	buttonxsq.setBorder(redBorder);
	

	
	buttonxpowery.setPreferredSize(new Dimension(100,40));
	buttonxpowery.setText("x^y");
	buttonxpowery.setFont(new Font("Arial", Font.BOLD, 26)); // Adjust font size as needed
	buttonxpowery.setBackground(Color.WHITE); // Change the background color to black
	buttonxpowery.setForeground(Color.BLACK);
	buttonxpowery.setBorder(redBorder);



	buttonmodofx.setPreferredSize(new Dimension(100,40));
	buttonmodofx.setText("|x|");
	buttonmodofx.setFont(new Font("Arial", Font.BOLD, 26)); // Adjust font size as needed
	buttonmodofx.setBackground(Color.WHITE); // Change the background color to black
	buttonmodofx.setForeground(Color.BLACK);
	buttonmodofx.setBorder(redBorder);


	buttonplusminus.setPreferredSize(new Dimension(100,40));
	buttonplusminus.setText("+/-");
	buttonplusminus.setFont(new Font("Arial", Font.BOLD, 26)); // Adjust font size as needed
	buttonplusminus.setBackground(Color.WHITE); // Change the background color to black
	buttonplusminus.setForeground(Color.BLACK);
	buttonplusminus.setBorder(redBorder);


	buttonsininverse.setPreferredSize(new Dimension(100,40));
	buttonsininverse.setText("sin^-1");
	buttonsininverse.setFont(new Font("Arial", Font.BOLD, 26)); // Adjust font size as needed
	buttonsininverse.setBackground(Color.WHITE); // Change the background color to black
	buttonsininverse.setForeground(Color.BLACK);
	buttonsininverse.setBorder(redBorder);


	buttoncosinverse.setPreferredSize(new Dimension(100,40));
	buttoncosinverse.setText("cos^-1");
	buttoncosinverse.setFont(new Font("Arial", Font.BOLD, 26)); // Adjust font size as needed
	buttoncosinverse.setBackground(Color.WHITE); // Change the background color to black
	buttoncosinverse.setForeground(Color.BLACK);
	buttoncosinverse.setBorder(redBorder);


	buttontaninverse.setPreferredSize(new Dimension(100,40));
	buttontaninverse.setText("tan^-1");
	buttontaninverse.setFont(new Font("Arial", Font.BOLD, 26)); // Adjust font size as needed
	buttontaninverse.setBackground(Color.WHITE); // Change the background color to black
	buttontaninverse.setForeground(Color.BLACK);
	buttontaninverse.setBorder(redBorder);


	button2powx.setPreferredSize(new Dimension(100,40));
	button2powx.setText("2^x");
	button2powx.setFont(new Font("Arial", Font.BOLD, 26)); // Adjust font size as needed
	button2powx.setBackground(Color.WHITE); // Change the background color to black
	button2powx.setForeground(Color.BLACK);
	button2powx.setBorder(redBorder);

	
	buttonxcube.setPreferredSize(new Dimension(100,40));
	buttonxcube.setText("x^3");
	buttonxcube.setFont(new Font("Arial", Font.BOLD, 26)); // Adjust font size as needed
	buttonxcube.setBackground(Color.WHITE); // Change the background color to black
	buttonxcube.setForeground(Color.BLACK);
	buttonxcube.setBorder(redBorder);


	buttonxfactorial.setPreferredSize(new Dimension(100,40));
	buttonxfactorial.setText("X!");
	buttonxfactorial.setFont(new Font("Arial", Font.BOLD, 26)); // Adjust font size as needed
	buttonxfactorial.setBackground(Color.WHITE); // Change the background color to black
	buttonxfactorial.setForeground(Color.BLACK);
	buttonxfactorial.setBorder(redBorder);


	buttoncuberoot.setPreferredSize(new Dimension(100,40));
	buttoncuberoot.setText("cuberoot");
	buttoncuberoot.setFont(new Font("Arial", Font.BOLD, 20)); // Adjust font size as needed
	buttoncuberoot.setBackground(Color.WHITE); // Change the background color to black
	buttoncuberoot.setForeground(Color.BLACK);
	buttoncuberoot.setBorder(redBorder);

	//Initialize buttonbrackets
        buttonbrackets.setPreferredSize(new Dimension(100, 40));
        buttonbrackets.setText("()");
        buttonbrackets.setFont(new Font("Arial", Font.BOLD, 26));
        buttonbrackets.setBackground(Color.WHITE);
        buttonbrackets.setForeground(Color.BLACK);
        buttonbrackets.setBorder(BorderFactory.createLineBorder(Color.RED, 2));

	buttonRad.setPreferredSize(new Dimension(100,40));
	buttonRad.setText("Rad");
	buttonRad.setFont(new Font("Arial", Font.BOLD, 26)); // Adjust font size as needed
	buttonRad.setBackground(Color.WHITE); // Change the background color to black
	buttonRad.setForeground(Color.BLACK);
	buttonRad.setBorder(redBorder);



    	//panel.add(buttonarrow);
	panel.add(buttonCut);
	//panel.add(buttonradian);
	panel.add(buttonsquareroot);
	panel.add(buttonclear);
	//panel.add(buttonbracketleft);
	panel.add(buttonbrackets);
	panel.add(buttonRad);
	//panel.add(buttonbracketright);
	panel.add(buttonpercent);
	panel.add(buttondiv);
	panel.add(buttonsininverse);
	panel.add(buttoncosinverse);
	panel.add(buttontaninverse);
	panel.add(button2powx);
	panel.add(buttonxcube);
	panel.add(buttonxfactorial);
	panel.add(buttoncuberoot);
	panel.add(buttonsin);
	panel.add(buttoncos);
	panel.add(buttontan);
	panel.add(button7);
	panel.add(button8);
	panel.add(button9);
	panel.add(buttonmul);
	panel.add(buttonln);
	panel.add(buttonlog);
	panel.add(buttononebyx);
	panel.add(button4);
	panel.add(button5);
	panel.add(button6);
	panel.add(buttonsub);
	panel.add(buttonexpo);
	panel.add(buttonxsq);
	panel.add(buttonxpowery);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(buttonadd);
	panel.add(buttonmodofx);
	panel.add(buttonpi);
	panel.add(buttonexp);
	panel.add(buttonplusminus);
	panel.add(button0);
	panel.add(buttondot);
	panel.add(buttonequal);	
	


	
	//buttonarrow.addActionListener((ActionListener)this);
	buttonCut.addActionListener((ActionListener)this);
	buttonsquareroot.addActionListener((ActionListener)this);
	buttonbrackets.addActionListener((ActionListener)this);
	//buttonbrackets.addActionListener(this);
	buttonpercent.addActionListener((ActionListener)this);
	buttonbracketleft.addActionListener((ActionListener)this);
	buttonbracketright.addActionListener((ActionListener)this);
	buttonsin.addActionListener((ActionListener)this);
	buttoncos.addActionListener((ActionListener)this);
	buttontan.addActionListener((ActionListener)this);
	buttonln.addActionListener((ActionListener)this);
	buttonlog.addActionListener((ActionListener)this);
	button1.addActionListener((ActionListener)this);
	buttonpi.addActionListener((ActionListener)this);
	buttonexp.addActionListener((ActionListener)this);
	button2.addActionListener((ActionListener)this);
	button3.addActionListener((ActionListener)this);
	button4.addActionListener((ActionListener)this);
	button5.addActionListener((ActionListener)this);
	button6.addActionListener((ActionListener)this);
	button7.addActionListener((ActionListener)this);
	button8.addActionListener((ActionListener)this);
	button9.addActionListener((ActionListener)this);
	button0.addActionListener((ActionListener)this);
	buttonadd.addActionListener((ActionListener)this);
	buttonsub.addActionListener((ActionListener)this);
	buttonmul.addActionListener((ActionListener)this);
	buttondiv.addActionListener((ActionListener)this);
	buttonequal.addActionListener((ActionListener)this);
	buttondot.addActionListener((ActionListener)this);
	buttonclear.addActionListener((ActionListener)this);
	buttonRad.addActionListener((ActionListener)this);
	buttononebyx.addActionListener((ActionListener)this);
	buttonexpo.addActionListener((ActionListener)this);
	buttonxsq.addActionListener((ActionListener)this);
	buttonxpowery.addActionListener((ActionListener)this);
	buttonmodofx.addActionListener((ActionListener)this);
	buttonplusminus.addActionListener((ActionListener)this);
	buttonsininverse.addActionListener((ActionListener)this);
	buttoncosinverse.addActionListener((ActionListener)this);
	buttontaninverse.addActionListener((ActionListener)this);
	button2powx.addActionListener((ActionListener)this);
	buttonxcube.addActionListener((ActionListener)this);
	buttonxfactorial.addActionListener((ActionListener)this);
	buttoncuberoot.addActionListener((ActionListener)this);


	
}


public void actionPerformed(ActionEvent e)
{

	Object source=e.getSource();

	if(source==buttonclear)
	{
		number1=0.0;
		number2=0.0;
		textarea.setText("");
	}

	if(source==button1)
	{
		textarea.append("1");
	}

	if(source==button2)
	{
		textarea.append("2");
	}

	if(source==button3)
	{
		textarea.append("3");
	}

	if(source==button4)
	{
		textarea.append("4");
	}

	if(source==button5)
	{
		textarea.append("5");
	}

	if(source==button6)
	{
		textarea.append("6");
	}

	if(source==button7)
	{
		textarea.append("7");
	}

	if(source==button8)
	{
		textarea.append("8");
	}

	if(source==button9)
	{
		textarea.append("9");
	}

	if(source==button0)
	{
		textarea.append("0");
	}

	if(source==buttondot)
	{
		textarea.append(".");
	}

	/*if (source == buttonbracketleft) 
	{
    	textarea.append("(");
	}

	if (source == buttonbracketright) 
	{
   	 textarea.append(")");
	}*/


	if(source==buttonadd)
	{
		number1=number_reader();
		textarea.setText(" ");
		addc=1;
		divc=0;
		subc=0;
		mulc=0;
	}

	if(source==buttondiv)
	{
		number1=number_reader();
		textarea.setText(" ");
		addc=0;
		divc=1;
		subc=0;
		mulc=0;
	}

	if(source==buttonsub)
	{
		number1=number_reader();
		textarea.setText(" ");
		addc=0;
		divc=0;
		subc=1;
		mulc=0;
	}

	 
	if(source==buttonmul)
	{
		number1=number_reader();
		textarea.setText(" ");
		addc=0;
		divc=0;
		subc=0;
		mulc=1;
	}
			
	  if (source == buttonequal) {
  	  number2 = number_reader();
    	String expression = ""; // Initialize expression to an empty string

   	 if (addc > 0) {
        result = number1 + number2;
        expression = Double.toString(number1) + " + " + Double.toString(number2); // Create the expression
   	 } else if (subc > 0) {
        result = number1 - number2;
        expression = Double.toString(number1) + " - " + Double.toString(number2); // Create the expression
   	 } else if (mulc > 0) {
        result = number1 * number2;
        expression = Double.toString(number1) + " x " + Double.toString(number2); // Create the expression
   	 } else if (divc > 0) {
        result = number1 / number2;
        expression = Double.toString(number1) + " / " + Double.toString(number2); // Create the expression
    	}

    	String resultText = expression + " = " + Double.toString(result); // Concatenate the expression with the result
        textarea.setText(resultText); // Set the textarea text to the expression with the result
}



	

	if (source == buttonsin) {
            double angle = Double.parseDouble(textarea.getText());
            result = Math.sin(Math.toRadians(angle));
            textarea.setText(Double.toString(result));
        }

        if (source == buttoncos) {
            double angle = Double.parseDouble(textarea.getText());
            result = Math.cos(Math.toRadians(angle));
            textarea.setText(Double.toString(result));
        }

        if (source == buttontan) {
            double angle = Double.parseDouble(textarea.getText());
            result = Math.tan(Math.toRadians(angle));
            textarea.setText(Double.toString(result));
        }

        if (source == buttonlog) {
            double number = Double.parseDouble(textarea.getText());
            result = Math.log10(number);
            textarea.setText(Double.toString(result));
        }

        if (source == buttonln) {
            double number = Double.parseDouble(textarea.getText());
            result = Math.log(number);
            textarea.setText(Double.toString(result));
        }

	if (source == buttonpi) {
            textarea.append(String.valueOf(Math.PI));
        }

        if (source == buttonsquareroot) {
            double number = Double.parseDouble(textarea.getText());
            result = Math.sqrt(number);
            textarea.setText(Double.toString(result));
	}

	if (source == buttonpercent) {
            double number = Double.parseDouble(textarea.getText());
            result = number / 100;
            textarea.setText(Double.toString(result));
        }

        if (source == buttonexp) {
            textarea.append(String.valueOf(Math.E));
        }

	if (source == buttonexpo) {
            double number = Double.parseDouble(textarea.getText());
            result = Math.exp(number);
            textarea.setText(Double.toString(result));
        }

        if (source == buttonmodofx) {
            double number = Double.parseDouble(textarea.getText());
            result = Math.abs(number);
            textarea.setText(Double.toString(result));
        }   

	if (source == buttononebyx) {
            double number = Double.parseDouble(textarea.getText());
            result = 1 / number;
            textarea.setText(Double.toString(result));
        }

        if (source == buttonxsq) {
            double number = Double.parseDouble(textarea.getText());
            result = Math.pow(number, 2);
            textarea.setText(Double.toString(result));
        }

	if (source == buttonxpowery) {
            number1 = Double.parseDouble(textarea.getText());
            textarea.setText("");
            addc = 0;
            divc = 0;
            subc = 0;
            mulc = 0;
        }

        
    if (source == buttonplusminus) {
        double number = Double.parseDouble(textarea.getText());
        result = -number;
        textarea.setText(Double.toString(result));
    }

	
if (source == buttonsininverse) {
    double angle = Double.parseDouble(textarea.getText());
    result=Math.toDegrees(Math.asin(angle));
    textarea.setText(Double.toString(result));
}

if (source == buttoncosinverse) {
    double angle = Double.parseDouble(textarea.getText());
    result=Math.toDegrees(Math.acos(angle));
    textarea.setText(Double.toString(result));
}

if (source == buttontaninverse) {
    double angle = Double.parseDouble(textarea.getText());
    result=Math.toDegrees(Math.atan(angle));
    textarea.setText(Double.toString(result));
}

if (source == button2powx) {
    double x = Double.parseDouble(textarea.getText());
    result = Math.pow(2, x);
    textarea.setText(Double.toString(result));
}

if (source == buttonxcube) {
    double x = Double.parseDouble(textarea.getText());
    result = Math.pow(x, 3);
    textarea.setText(Double.toString(result));
}

if (source == buttonxfactorial) {
    int x = Integer.parseInt(textarea.getText());
    result = factorial(x);
    textarea.setText(Double.toString(result));
}

if (source == buttoncuberoot) {
    double x = Double.parseDouble(textarea.getText());
    result = Math.cbrt(x);
    textarea.setText(Double.toString(result));
}

if (source == buttonCut) {
    String text = textarea.getText();
    if (!text.isEmpty()) {
        // Remove the last character from the text
        String newText = text.substring(0, text.length() - 1);
        textarea.setText(newText);
    }
}

if (source == buttonbrackets) {
            if (lastCharIsNumberOrBracket) {
                textarea.append(")");
                lastCharIsNumberOrBracket = false;
            } else {
                textarea.append("(");
                lastCharIsNumberOrBracket = true;
            }
        }


if (source == buttonRad) {
        double number = Double.parseDouble(textarea.getText());
        double result = Math.toRadians(number);
        textarea.setText(Double.toString(result));
    }


}
  
        public static void main(String args[])
	{
    	  new Calculator7();
	}


	// Define the power method within the Calculator7 class
	public double power(double x, double y)
        {
    		return Math.pow(x, y);
	}


	public double factorial(int n) 
	{
   	 if (n == 0)
         	return 1;
   	 else
         	return n * factorial(n - 1);
	}


	public double number_reader()
	{
		double num1;
		String s;
		s=textarea.getText();
		num1=Double.valueOf(s);
		return num1;
	}

	 
}

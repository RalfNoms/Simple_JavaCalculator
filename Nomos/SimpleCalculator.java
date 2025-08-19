package JavaSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator{
	
 static class Calculator extends JFrame{
	 JLabel l1, l2;
	 JTextField t1, t2;
	 JButton b1, b2, b3, b4;
	 Calculator(){
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setLayout(null);
		 l1 = new JLabel("Simple Calculator ni Sir Rendel Jeff Gerongco ");
		 l1.setBounds(60, 10, 300, 30);
		 add(l1);
		 
		 t1 = new JTextField(60);
		 t1.setBounds(100, 60, 120, 30);
		 add(t1);
		 
		 t2 = new JTextField(60);
		 t2.setBounds(100, 100, 120, 30);
		 add(t2);
		 
		 b1 = new JButton("+");
		 b1.setBounds(100, 140, 60, 30);
		 add(b1);
		 
		 b2 = new JButton("-");
		 b2.setBounds(160, 140, 60, 30);
		 add(b2);
		 
		 b3 = new JButton("*");
		 b3.setBounds(100, 180, 60, 30);
		 add(b3);
		 
		 b4 = new JButton("/");
		 b4.setBounds(160, 180, 60, 30);
		 add(b4);
		 
		 l2 = new JLabel("");
		 l2.setBounds(250, 80, 300, 30);
		 add(l2);
		 
		 b1.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent ae) {
				 int n1 = Integer.parseInt(t1.getText());
				 int n2 = Integer.parseInt(t2.getText());
				 l2.setText("Result: "+ n1 + n2);
				 
			 }
		 });
		 b2.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent ae) {
				 int n1 = Integer.parseInt(t1.getText());
				 int n2 = Integer.parseInt(t2.getText());
				 l2.setText("Result: "+ (n1 - n2));
				 
			 }
		 });
		 b3.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent ae) {
				 int n1 = Integer.parseInt(t1.getText());
				 int n2 = Integer.parseInt(t2.getText());
				 l2.setText("Result: "+ n1 * n2);
				 
			 }
		 });
		 b4.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent ae) {
				 int n1 = Integer.parseInt(t1.getText());
				 int n2 = Integer.parseInt(t2.getText());
				 l2.setText("Result: "+ n1 / n2);
				 
			 }
		 });
		 
	 }
 }

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setBounds(400, 200, 400, 250);
		c.setVisible(true);
         
         
     

	
	
}
	

}

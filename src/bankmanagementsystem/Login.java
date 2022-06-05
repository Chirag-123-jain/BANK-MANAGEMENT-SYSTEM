

package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
  JButton Login,clear,signup;
  JTextField  cardTextField;
  JPasswordField pinTextField;
    Login()
  {
      setTitle("AUTOMATED TELLER MACHINE");
      
      setLayout(null);//it will not take default layout it will take coustom layout
      
      ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));//import image
      Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
      ImageIcon i3=new ImageIcon(i2);
      JLabel label=new JLabel(i3);//
      label.setBounds(70, 10, 100, 100);
      add(label);// it will place object in frame 
      
      JLabel text=new JLabel("Welcome to Atm");//put text in frame
      text.setFont(new Font("Osward",Font.BOLD,38));
      text.setBounds(200,40,400,40);
      add(text);
      
      JLabel Cardno=new JLabel("Card No:");//put text in frame
      Cardno.setFont(new Font("Raleway",Font.BOLD,28));
      Cardno.setBounds(120,150,150,30);
      add(Cardno);
      
      cardTextField=new JTextField();
      cardTextField.setBounds(300,150,230,30);
      cardTextField.setFont(new Font("Arial",Font.BOLD,14));
      add(cardTextField);
      
      
      JLabel Pin=new JLabel("PIN:");//put text in frame
      Pin.setFont(new Font("Raleway",Font.BOLD,28));
      Pin.setBounds(120,220,250,30);
      add(Pin);
      
      pinTextField=new JPasswordField();
      pinTextField.setBounds(300,220,230,30);
      pinTextField.setFont(new Font("Arial",Font.BOLD,14));
      add(pinTextField);
      
      Login=new JButton("SIGN IN");
      Login.setBackground(Color.BLACK);
      Login.setForeground(Color.WHITE);
      Login.setBounds(300,300,100,30);
      Login.addActionListener(this); 
      add(Login);
      
      clear=new JButton("Clear");
      clear.setBackground(Color.BLACK);
      clear.setForeground(Color.WHITE);
      clear.setBounds(430,300,100,30);
      clear.addActionListener(this); 
      add(clear);
      
      signup=new JButton("SIGN UP");
      signup.setBackground(Color.BLACK);
      signup.setForeground(Color.WHITE);
      signup.setBounds(300,350,230,30);
      signup.addActionListener(this); 
      add(signup);
      
      
      
      
      
      getContentPane().setBackground(Color.white);
      
      setSize(800,480);//frame length breath
      setVisible(true);
      setLocation(350,200);//frame location change
     
  }
  
    public void actionPerformed(ActionEvent ae)//Override from the actionListner class
  {
      if(ae.getSource()==clear)
      {
          cardTextField.setText("");
          pinTextField.setText("");
      }else if(ae.getSource()==Login){
          Conn c=new Conn();
          String cardnumber=cardTextField.getText();
          String pinnumber= pinTextField.getText();//we cannot use getText in password
          String qurey="select *from login where cardnumber='"+cardnumber+"' and pin='"+pinnumber+"' ";
          try{
          ResultSet rs=c.s.executeQuery(qurey);//for storing result if it matches the qurey condition
          if(rs.next())
          {
          setVisible(false);
          new Transactions(pinnumber).setVisible(true);
          }else
          {
          JOptionPane.showMessageDialog(null, "Incorrect Card Number and Pin");
          }
          }
          catch(Exception e)
          {
          System.out.println(e);
          }
      
      }else if(ae.getSource()==signup){
          setVisible(false);
          new SignupOne().setVisible(true);
          } 
  }

  public static void main(String args[]){
    new Login();
}

}


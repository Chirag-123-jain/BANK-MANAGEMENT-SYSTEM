
package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {
     long random;
      JTextField nametext,fnametext,emailtext,adresstext,citytext,statetext,pintext;
      JDateChooser datechooser;
      JRadioButton male,female, married, Unmarried,other;
      JButton next;
      
     
    
    SignupOne(){
        
        setLayout(null);
        
        Random ran=new Random();
        
        random=Math.abs(ran.nextLong()%9000L+1000L);//gives us the 4 digit random no
        JLabel formno=new JLabel("APPLICATION FORM NO"+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
         JLabel Personal=new JLabel("Page 1:Pesronal Details");
        Personal.setFont(new Font("Raleway",Font.BOLD,22));
        Personal.setBounds(290,80,400,30);
        add(Personal);
        
        JLabel name=new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        nametext=new JTextField();
        nametext.setFont(new Font("Raleway",Font.BOLD,14));
        nametext.setBounds(300,140,400,30);
        add(nametext);
        
        
         
        JLabel fname=new JLabel("Father Name:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        fnametext=new JTextField();
        fnametext.setFont(new Font("Raleway",Font.BOLD,14));
        fnametext.setBounds(300,190,400,30);
        add(fnametext);
        
        JLabel dob=new JLabel("Date of Birth");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        datechooser=new JDateChooser();
        datechooser.setBounds(300,240,400,30);
        datechooser.setForeground(Color.BLACK);
        add(datechooser);
        
        JLabel gender=new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        male=new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female=new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        
        ButtonGroup gendergroup=new  ButtonGroup();
        gendergroup.add(male);
         gendergroup.add(female);
        
        JLabel email=new JLabel("Email Adress:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,230,30);
        add(email);
        
        emailtext=new JTextField();
        emailtext.setFont(new Font("Raleway",Font.BOLD,14));
        emailtext.setBounds(300,340,400,30);
        add(emailtext);
        
        JLabel marital=new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        married=new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        Unmarried=new JRadioButton("UnMarried");
        Unmarried.setBounds(450,390,100,30);
        Unmarried.setBackground(Color.WHITE);
        add(Unmarried);
        
        other=new JRadioButton("Other");
        other.setBounds(630,390,100,30);
        other.setBackground(Color.WHITE);
        add(other);
        
        
        ButtonGroup Maritalgroup=new  ButtonGroup();
         Maritalgroup.add(married);
         Maritalgroup.add(Unmarried);
         Maritalgroup.add(other);
        
        
        JLabel adress=new JLabel("Adress:");
        adress.setFont(new Font("Raleway",Font.BOLD,20));
        adress.setBounds(100,440,200,30);
        add(adress);
        
        adresstext=new JTextField();
        adresstext.setFont(new Font("Raleway",Font.BOLD,14));
        adresstext.setBounds(300,440,400,30);
        add(adresstext);
        
        JLabel city=new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        citytext=new JTextField();
        citytext.setFont(new Font("Raleway",Font.BOLD,14));
        citytext.setBounds(300,490,400,30);
        add(citytext);
        
        JLabel state=new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        statetext=new JTextField();
        statetext.setFont(new Font("Raleway",Font.BOLD,14));
        statetext.setBounds(300,540,400,30);
        add(statetext);
        
        JLabel pincode=new JLabel("Pincode:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        pintext=new JTextField();
        pintext.setFont(new Font("Raleway",Font.BOLD,14));
        pintext.setBounds(300,590,400,30);
        add(pintext);
        
         JButton next=new JButton("Next");
      next.setBackground(Color.BLACK);
      next.setForeground(Color.WHITE);
      next.setBounds(620,660,80,30);
      next.addActionListener(this);
      add(next);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        

}
    
   public void actionPerformed(ActionEvent ae){
       String formno= " "+random;
       String name=nametext.getText();
       String fname=fnametext.getText();
       String adress=emailtext.getText();
       String state=statetext.getText();
       String city=citytext.getText();
       String pin=pintext.getText();
       String dob= ((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
       String gender=null;
       if(male.isSelected())
       {
           gender="Male";
       }else if(female.isSelected())
       {
       gender="Female";
       }
    String marital=null;
    if(married.isSelected())
    {
        marital="Married";
    }else if(Unmarried.isSelected())
    {
    marital="Unmarried";
    }else if(other.isSelected())
    {
    marital="Other";
    }
    try{
    if(name.equals("")){
     JOptionPane.showMessageDialog(null, "Name is Required");
    }
    else
    {
        Conn c=new Conn();
       
       String qurey="insert into Signup values('"+formno+"' , '"+name+"' , '"+fname+"' , '"+adress+"' , '"+state+"' , '"+city+"' , '"+dob+"' , '"+gender+"' , '"+marital+"' , '"+pin+"')";
       c.s.executeUpdate(qurey);
       //next for sign up 2 page
       setVisible(false);
       new SignupTwo(formno).setVisible(true);
    }
    }
    catch(Exception e)
    {
    System.out.print(e);
    }
   } 

public static void main(String args[]){
    new SignupOne();
}

   
}
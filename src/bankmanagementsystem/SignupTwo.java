
package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
     
      JTextField pantext, aadhartext;
      JRadioButton syes,sno,exyes,exno;
      JButton next;
      JComboBox Religion,Category,Income,Qualification,Occupation;
      String  formno;
      
       SignupTwo(String formno ){
        this.formno=formno;
        setLayout(null);
       
        setTitle("NEW ACCOUNT APPLICATION FORM :Page 2");
        
        
        
        JLabel additionadetails=new JLabel("Page 2:Additional Details");
        additionadetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionadetails.setBounds(290,80,400,30);
        add(additionadetails);
        
        JLabel religion=new JLabel("Religion:");
        religion.setFont(new Font("Raleway",Font.BOLD,20));
        religion.setBounds(100,140,100,30);
        add(religion);
        
        String varReligion[]={"Hindu","Muslim","Sikh","Jainism","other"};
        Religion=new JComboBox(varReligion);
        Religion.setBounds(300,140,400,30);
        Religion.setBackground(Color.WHITE);
        add(Religion);
        
        
        JLabel category=new JLabel("Category:");
        category.setFont(new Font("Raleway",Font.BOLD,20));
        category.setBounds(100,190,200,30);
        add(category);
        
        String varcategory[]={"GENERAL","OBC","ST","SC","other"};
        Category=new JComboBox(varcategory);
        Category.setBounds(300,190,400,30);
        Category.setBackground(Color.WHITE);
        add(Category);
        
        
        JLabel income=new JLabel("Income");
        income.setFont(new Font("Raleway",Font.BOLD,20));
        income.setBounds(100,240,200,30);
        add(income);
        
        String varincome[]={"Null","0-1Lakh","2-5Lakh","other"};
        Income=new JComboBox(varincome);
        Income.setBounds(300,240,400,30);
        Income.setBackground(Color.WHITE);
        add(Income);
        
       
        
        JLabel education=new JLabel("Education");
        education.setFont(new Font("Raleway",Font.BOLD,20));
        education.setBounds(100,290,200,30);
        add(education);
        
        JLabel qualification=new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway",Font.BOLD,20));
        qualification.setBounds(100,315,200,30);
        add(qualification);
        
        String varqualification[]={"NON-Graduate","Graduate","Post-Graduate","Other"};
        Qualification=new JComboBox(varqualification);
        Qualification.setBounds(300,310,400,30);
        Qualification.setBackground(Color.WHITE);
        add(Qualification);
       
        
        JLabel occupation=new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway",Font.BOLD,20));
        occupation.setBounds(100,390,200,30);
        add(occupation);
        
        String varoccupation[]={"Salaried","Self-Employed","Bussiness","Other"};
        Occupation=new JComboBox(varoccupation);
        Occupation.setBounds(300,390,400,30);
        Occupation.setBackground(Color.WHITE);
        add(Occupation);
        
       
        JLabel pannumber=new JLabel("PAN Number:");
        pannumber.setFont(new Font("Raleway",Font.BOLD,20));
        pannumber.setBounds(100,440,200,30);
        add(pannumber);
        
        pantext=new JTextField();
        pantext.setFont(new Font("Raleway",Font.BOLD,14));
        pantext.setBounds(300,440,400,30);
        add(pantext);
        
        JLabel aadharno=new JLabel("Aadhar No:");
        aadharno.setFont(new Font("Raleway",Font.BOLD,20));
        aadharno.setBounds(100,490,200,30);
        add(aadharno);
        
        aadhartext=new JTextField();
        aadhartext.setFont(new Font("Raleway",Font.BOLD,14));
        aadhartext.setBounds(300,490,400,30);
        add(aadhartext);
        
        JLabel seniorcitizen=new JLabel("Senior Citizen:");
        seniorcitizen.setFont(new Font("Raleway",Font.BOLD,20));
        seniorcitizen.setBounds(100,540,200,30);
        add(seniorcitizen);
        
        syes=new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno=new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup Seniorcitizen=new  ButtonGroup();
         Seniorcitizen.add(syes);
         Seniorcitizen.add(sno);
        
       
        JLabel exisitingaccount=new JLabel("Exisiting Account:");
        exisitingaccount.setFont(new Font("Raleway",Font.BOLD,20));
        exisitingaccount.setBounds(100,590,200,30);
        add(exisitingaccount);
        
        exyes=new JRadioButton("Yes");
        exyes.setBounds(300,590,100,30);
        exyes.setBackground(Color.WHITE);
        add(exyes);
        
        exno=new JRadioButton("No");
        exno.setBounds(450,590,100,30);
        exno.setBackground(Color.WHITE);
        add(exno);
        
         ButtonGroup Exisitingaccount=new  ButtonGroup();
         Exisitingaccount.add(exyes);
         Exisitingaccount.add(exno);
        
        
       
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
       
       String sreligion=(String)Religion.getSelectedItem();
       String scategory=(String)Category.getSelectedItem();
       String sincome=(String)Income.getSelectedItem();
       String soccupation=(String)Occupation.getSelectedItem();
       String seniorcitizen=null;
       if(syes.isSelected())
       {
           seniorcitizen="Yes";
       }else if(sno.isSelected())
       {
       seniorcitizen="No";
       }
    String existingaccount=null;

       if(exyes.isSelected())
       {
           seniorcitizen="Yes";
       }else if(exno.isSelected())
       {
       seniorcitizen="No";
       }
       String span=pantext.getText();
       String saadhar=aadhartext.getText();
     
    try{
   
       Conn c=new Conn();
        
       String qurey="insert into Signuptwo values('"+formno+"' , '"+sreligion+"' , '"+scategory+"' , '"+sincome+"'  , '"+soccupation+"' , '"+seniorcitizen+"' , '"+existingaccount+"' , '"+span+"' , '"+saadhar+"')";
       c.s.executeUpdate(qurey);
       
       setVisible(false);
       new SignupThree(formno).setVisible(true);
    
    }
    catch(Exception e)
    {
    System.out.print(e);
    }
   } 

public static void main(String args[]){
    new SignupTwo("");
}
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spl;

/**
 *
 * @author 88018
 */
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Normal_Calculator  extends JFrame implements ActionListener{
    
    
    private Container c;
     private ImageIcon icon;
     private JTextField t;
     private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr;
 
      double a=0,b=0,result=0;
      int operator=0;
      
    
    Normal_Calculator()
    {
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setBounds(100,200,373,500);
       this.setTitle("Normal Calculator");
       
       c= this.getContentPane();
       c.setLayout(null);
       c.setBackground(Color.black);
       
       icon = new ImageIcon(getClass().getResource("NC.png"));
       this.setIconImage(icon.getImage());
       
       
       t=new JTextField();
       t.setBounds(30,40,290,30);
       t.setBackground(Color.white);
       c.add(t);
       
       
       b1=new JButton("1");
       b1.setBounds(40,240,60,40);
       b1.setBackground(Color.white);
       c.add(b1);
       b1.addActionListener(this);
       
       
       b2=new JButton("2");
       b2.setBounds(110,240,60,40);
       b2.setBackground(Color.white);
       c.add(b2);
       b2.addActionListener(this);
       
       
       b3=new JButton("3");
       b3.setBounds(180,240,60,40);
       b3.setBackground(Color.white);
       c.add(b3);
       b3.addActionListener(this);
       
       
       b4=new JButton("4"); 
       b4.setBounds(40,170,60,40);
       b4.setBackground(Color.white);
       c.add(b4);
       b4.addActionListener(this);
       
       
       b5=new JButton("5");
       b5.setBounds(110,170,60,40);
       b5.setBackground(Color.white);
       c.add(b5);
       b5.addActionListener(this);
       
       
       
       b6=new JButton("6");
       b6.setBounds(180,170,60,40);
       b6.setBackground(Color.white);
       c.add(b6);
       b6.addActionListener(this);
       
       
       
       b7=new JButton("7");
       b7.setBounds(40,100,60,40);
       b7.setBackground(Color.white);
       c.add(b7);
       b7.addActionListener(this);
       
       
       
       b8=new JButton("8");
       b8.setBounds(110,100,60,40);
       b8.setBackground(Color.white);
       c.add(b8);
       b8.addActionListener(this);
       
       
       b9=new JButton("9");
       b9.setBounds(180,100,60,40);
       b9.setBackground(Color.white);
       c.add(b9);
       b9.addActionListener(this);
       
       
       b0=new JButton("0");
       b0.setBounds(110,310,60,40);
       b0.setBackground(Color.white);
       c.add(b0);
       b0.addActionListener(this);
       
       
       bdiv=new JButton("/");
       bdiv.setBounds(250,100,60,40);
       bdiv.setBackground(Color.white);
       c.add(bdiv);
       bdiv.addActionListener(this);
       
       
       bmul=new JButton("*");
       bmul.setBounds(250,170,60,40);
       bmul.setBackground(Color.white);
       c.add(bmul);
       bmul.addActionListener(this);
       
       
       bsub=new JButton("-");
       bsub.setBounds(250,240,60,40);
       bsub.setBackground(Color.white);
       c.add(bsub);
       bsub.addActionListener(this);
       

       badd=new JButton("+");
       badd.setBounds(250,310,60,40);
       badd.setBackground(Color.white);
       c.add(badd);
       badd.addActionListener(this);
       
       
       bdec=new JButton(".");
       bdec.setBounds(40,310,60,40);
       bdec.setBackground(Color.white);
       c.add(bdec);
       bdec.addActionListener(this);
       
       

       beq=new JButton("=");
       beq.setBounds(180,310,60,40);
       beq.setBackground(Color.white);
       c.add(beq);
       beq.addActionListener(this);
       

       bdel=new JButton("Delete");
       bdel.setBounds(60,380,110,40);
       bdel.setBackground(Color.white);
       c.add(bdel);
       bdel.addActionListener(this);
       
       

       bclr=new JButton("Clear");
       bclr.setBounds(180,380,110,40);
       bclr.setBackground(Color.white);
       c.add(bclr);
       bclr.addActionListener(this);


       


}
    
    
    
       public void actionPerformed(ActionEvent e){
       
           if(e.getSource()==b1)

               t.setText(t.getText().concat("1"));

           if(e.getSource()==b2)

               t.setText(t.getText().concat("2"));

           if(e.getSource()==b3)

               t.setText(t.getText().concat("3"));

           if(e.getSource()==b4)

               t.setText(t.getText().concat("4"));

           if(e.getSource()==b5)

               t.setText(t.getText().concat("5"));

           if(e.getSource()==b6)

               t.setText(t.getText().concat("6"));

           if(e.getSource()==b7)

               t.setText(t.getText().concat("7"));

           if(e.getSource()==b8)

               t.setText(t.getText().concat("8"));

           if(e.getSource()==b9)

               t.setText(t.getText().concat("9"));

           if(e.getSource()==b0)

               t.setText(t.getText().concat("0"));

           if(e.getSource()==bdec)

               t.setText(t.getText().concat("."));

           if(e.getSource()==badd)

           {  
    
               a=Double.parseDouble(t.getText());

               operator=1;

               t.setText("");

           }

           if(e.getSource()==bsub)

           {

               a=Double.parseDouble(t.getText());

               operator=2;

               t.setText("");

           }

           if(e.getSource()==bmul)

           {

               a=Double.parseDouble(t.getText());

               operator=3;

               t.setText("");

           }

           if(e.getSource()==bdiv)

           {

               a=Double.parseDouble(t.getText());

               operator=4;

               t.setText("");

           }

           if(e.getSource()==beq)

           {

               b=Double.parseDouble(t.getText());

               switch(operator)

               {
    
                   case 1: result=a+b;
                   break;

                   case 2: result=a-b;
                   break;

                   case 3: result=a*b;
                   break;

                   case 4: result=a/b;
                   break;

                   default: result=0;

               }

               t.setText(""+result);

           }

           if(e.getSource()==bclr)

               t.setText("");

           if(e.getSource()==bdel)

           {

               String s=t.getText();

               t.setText("");

               for(int i=0;i<s.length()-1;i++)

                   t.setText(t.getText()+s.charAt(i));

           }

       }

}     
       
    
    
    
   class Main {
    public static void main(String []args)
    {
       Normal_Calculator nc = new Normal_Calculator();
       nc.setVisible(true);
       nc.setResizable(false);
       
    }
   

    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}


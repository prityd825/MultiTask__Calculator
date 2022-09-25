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
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class BMI_Calculator extends JFrame {
    
    
     private Container c;
     private JLabel l,lweight,lheight,l3,l4,linches,l6,lage,lyears;
     private JTextField tweight,tinches,tbmi,t4,tfeet,tage;
     private JButton bCal,bclear;
     private ImageIcon icon;
     
     
    
     
     BMI_Calculator()
    {
        
        
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setBounds(100,200,700,550);
       this.setTitle("BMI Calculator");
       
       
       
       c= this.getContentPane();
       c.setLayout(null);
       c.setBackground(Color.black);
       
       
       
       icon = new ImageIcon(getClass().getResource("NC.png"));
       this.setIconImage(icon.getImage());
       
       
       
       l = new JLabel("Calculate Your BMI");
       l.setBounds(250,1,350,100);
       l.setForeground(Color.white);
       c.add(l);
       
       
       
       lweight = new JLabel("Weight");
       lweight.setBounds(80,50,100,100);
       lweight.setForeground(Color.white);
       c.add(lweight);
       
       
       l4 = new JLabel("Kg");
       l4.setBounds(420,46,100,100);
       l4.setForeground(Color.white);
       c.add(l4);
       
       
       tweight = new JTextField(" ");
       tweight.setBounds(170,80,200,30);
       tweight.setBackground(Color.white);
       c.add(tweight);
       
       
       lheight = new JLabel("Height");
       lheight.setBounds(80,100,100,100);
       lheight.setForeground(Color.white);
       c.add(lheight);
       
       
       linches = new JLabel("inches");
       linches.setBounds(420,100,100,100);
       linches.setForeground(Color.white);
       c.add(linches);
       
       
       tinches = new JTextField(" ");
       tinches.setBounds(170,135,70,30);
       tinches.setBackground(Color.white);
       c.add(tinches);
       
       
       l6 = new JLabel("Feet");
       l6.setBounds(260,100,100,100);
       l6.setForeground(Color.white);
       c.add(l6);
       
       
       tfeet = new JTextField(" ");
       tfeet.setBounds(320,135,70,30);
       tfeet.setBackground(Color.white);
       c.add(tfeet);
       
       
       lage = new JLabel("Age");
       lage.setBounds(80,170,100,100);
       lage.setForeground(Color.white);
       c.add(lage);
       
       
       tage = new JTextField(" ");
       tage.setBounds(170,205,70,30);
       tage.setBackground(Color.white);
       c.add(tage);
       
       
       lyears = new JLabel("Years");
       lyears.setBounds(260,170,100,100);
       lyears.setForeground(Color.white);
       c.add(lyears);
       
       
       
       l3 = new JLabel("Your BMI");
       l3.setBounds(80,239,100,100);
       l3.setForeground(Color.white);
       c.add(l3);
       
       
       tbmi = new JTextField(" ");
       tbmi.setBounds(170,275,200,30);
       tbmi.setForeground(Color.black);
       c.add(tbmi);
       
       
       
       t4 = new JTextField(" ");
       t4.setBounds(170,331,430,70);
       t4.setBackground(Color.white);
       c.add(t4);
       
       
       bCal = new JButton("Calculate ");
       bCal.setBounds(170,431,100,30);
       bCal.setBackground(Color.white);
       c.add(bCal);
       
       
       bclear = new JButton("Clear");
       bclear.setBounds(290,431,100,30);
       bclear.setBackground(Color.white);
       c.add(bclear);
       
       
       bCal.addActionListener(new ActionListener(){
            @Override
            
            
             public void actionPerformed(ActionEvent e){
             
                
                float s1=Float.parseFloat(tweight.getText());
                float s2=Float.parseFloat(tinches.getText());
                float s3=Float.parseFloat(tfeet.getText());
                float s4 = Float.parseFloat(tage.getText());
                
                //weight/height*height ;
                //Converting feet to metre and inches to metres
                
                float c = (float) (s1/(((s2*0.305)+(s3*0.0254))*((s2*0.305)+(s3*0.0254))));
                String BMI =String.valueOf(c);
                tbmi.setText(BMI);
                
                
                if(c<=18.4)
                {
                    t4.setText("Underweight.You have a lower than normal body weight.You should eat more.");
                }
                else if(18.5<= c && c<=24.9)
                {
                     t4.setText("Normal.You have normal body weight.Good Job!.");
                }
                else if(25.0<= c && c<=39.9)
                {
                    t4.setText("Overweight.You have a higher than normal body weight.Try to exercise more.");  
                }
                else if(c>=40.0)
                {
                    t4.setText("Obese.You should control your weight");
                }
               
                 }
              
     });
       
       
       
       
       bclear.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e){
             
            tweight.setText("");
                  tinches.setText("");
                      tbmi.setText("");
                      t4.setText("");
                      tfeet.setText("");
                      tage.setText("");
              
        }     
     });
       }
     
     
       
    public static void main(String []args)
    {
       BMI_Calculator bc = new BMI_Calculator ();
       bc.setVisible(true);
       bc.setResizable(false);
       
    }
    
}



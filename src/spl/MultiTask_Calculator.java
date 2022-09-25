/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spl;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.text.StyleConstants.Bold;


public class MultiTask_Calculator  extends JFrame{
    private Container c;
    private JButton b1,b2,b3,b4,b5;
    private JLabel l1;
    private ImageIcon icon;
    
    
     MultiTask_Calculator ()
     {
         initComponents();
     }
     public void initComponents()
     {
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.black);
         
         icon = new ImageIcon(getClass().getResource("NC.png"));
         this.setIconImage(icon.getImage());
         
         
         l1 =new JLabel("Choose your calculator ");
         l1.setForeground(Color.white);
         l1.setFont(new Font("Verdana", Font.PLAIN, 18));
         l1.setBounds(240,10,250,50);
         l1.setLayout(null);
         c.add(l1);
         
         
         
         b1 = new JButton("Normal Calculator");
         b1.setBounds(100,100,200,50);
         b1.setBackground(Color.white);
         b1.setLayout(null);
         c.add(b1);
         
         
         b2 = new JButton("Scientific Calculator");
         b2.setBounds(360,100,200,50);
         b2.setBackground(Color.white);
         b2.setLayout(null);
         c.add(b2);
         
         
         b3 = new JButton("Complexity Calculator");
         b3.setBounds(100,220,200,50);
         b3.setBackground(Color.white);
         b3.setLayout(null);
         c.add(b3);
         
         
         b4 = new JButton("BMI Calculator");
         b4.setBounds(360,220,200,50);
         b4.setBackground(Color.white);
         b4.setLayout(null);
         c.add(b4);
         
         b5 = new JButton("Currency Convertor");
         b5.setBounds(230,340,200,50);
         b5.setBackground(Color.white);
         b5.setLayout(null);
         c.add(b5);
         
         
         
         b1.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e){
               Normal_Calculator nc = new Normal_Calculator();
               nc.setVisible(true);
               nc.setResizable(false);
                 }
              
     });
         
         
         
         b2.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e){
               Scientific_Calculator sc = new Scientific_Calculator();
               sc.setVisible(true);
               sc.setResizable(false);
                 }     
     });
         
         
         
          b3.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e){
               Complexity_Calculator cc = new Complexity_Calculator();
               cc.setVisible(true);
               cc.setResizable(false);
                 }    
     });
          
          
          
      b4.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e){
               BMI_Calculator bc = new BMI_Calculator();
               bc.setVisible(true);
               bc.setResizable(false);
                 }    
     });  
      
      
      
      b5.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e){
              Currency_Convertor ccc = new Currency_Convertor();
               ccc.setVisible(true);
               ccc.setResizable(false);
                 }    
     });  
      
      
          
     }            
     public static void main(String[] args){
       MultiTask_Calculator frame = new MultiTask_Calculator();
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setBounds(100,100,700,500);
       frame.setResizable(false);
       frame.setTitle("MultiTask Calculator");
   }

   
}

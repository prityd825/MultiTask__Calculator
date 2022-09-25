
package spl;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import static java.lang.Math.log10;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Complexity_Calculator extends JFrame{
    
    
    
    public static int a,b,k,p;
    public static boolean checkNegative(String s){
        int j=0;
        for(j=0;j<s.length();j++){
            if(s.charAt(j)=='-'){
                return true;
            }
        }
        return false;
    }
    
   
    
      private Container c;
      private JButton b1,b2;
      private JLabel l, l1,l2,la,lb,lk,lp;
      private JTextField t1,t2,ta,tb,tk,tp;
      private ImageIcon icon;
      
      
       Complexity_Calculator()
    {
        
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setBounds(100,200,700,500);
       this.setTitle("Complexity Calculator");
       
       c= this.getContentPane();
       c.setLayout(null);
       c.setBackground(Color.black);
       
       
       icon = new ImageIcon(getClass().getResource("NC.png"));
       this.setIconImage(icon.getImage());
       
       
       l = new JLabel("Find the complexity ");
       l.setBounds(290,30,250,50);
       l.setForeground(Color.white);
       l.setLayout(null);
       c.add(l);
       
       l1= new JLabel("Recurrence Equation");
       l1.setBounds(100,80,250,30);
       l1.setForeground(Color.white);
       l1.setLayout(null);
       c.add(l1);
       
       
       la= new JLabel ("a");
       la.setBounds(100,180,100,20);
       la.setFont(new Font("Verdana", Font.PLAIN, 18));
       la.setForeground(Color.white);
       la.setLayout(null);
       c.add(la);
       
       
       ta = new JTextField("");
       ta.setBackground(Color.white);
       ta.setBounds(130,182,50,23);
       ta.setLayout(null);
       c.add(ta);
       
       lb= new JLabel ("b");
       lb.setBounds(215,180,100,20);
       lb.setFont(new Font("Verdana", Font.PLAIN, 18));
       lb.setForeground(Color.white);
       lb.setLayout(null);
       c.add(lb);
       
       
       tb = new JTextField("");
       tb.setBackground(Color.white);
       tb.setBounds(245,182,50,23);
       tb.setLayout(null);
       c.add(tb);
       
       
       lk= new JLabel ("k");
       lk.setBounds(335,180,100,20);
       lk.setFont(new Font("Verdana", Font.PLAIN, 18));
       lk.setForeground(Color.white);
       lk.setLayout(null);
       c.add(lk);
       
       
       tk = new JTextField("");
       tk.setBackground(Color.white);
       tk.setBounds(355,182,60,23);
       tk.setLayout(null);
       c.add(tk);
       
       
       lp= new JLabel ("p");
       lp.setBounds(455,180,107,30);
       lp.setFont(new Font("Verdana", Font.PLAIN, 18));
       lp.setForeground(Color.white);
       lp.setLayout(null);
       c.add(lp);
       
       
       tp = new JTextField("");
       tp.setBackground(Color.white);
       tp.setBounds(490,182,60,23);
       tp.setLayout(null);
       c.add(tp);
       
       
       
       t1 = new JTextField("");
       t1.setBackground(Color.white);
       t1.setBounds(250,80,320,60);
       t1.setLayout(null);
       c.add(t1);
       
       
       l2 = new JLabel("Complexity ");
       l2.setBounds(100,250,250,50);
       l2.setForeground(Color.white);
       l2.setLayout(null);
       c.add(l2);
       
       
       t2 =new JTextField("");
       t2.setBounds(250,250,320,60);
       t2.setBackground(Color.white);
       t2.setLayout(null);
       c.add(t2);
       
       
       
       b1 = new JButton ("Calculate");
       b1.setBounds(190,350,100,40);
       b1.setBackground(Color.white);
       b1.setLayout(null);
       c.add(b1);
       
       
       b2 = new JButton("Clear");
       b2.setBounds(350,350,100,40);
       b2.setLayout(null);
       b2.setBackground(Color.white);
       c.add(b2);
       
       
       b1.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e){
                 
                 int i=0;
                 String s ="";
                 s=t1.getText();
                 String A="", B="", K="", P="";
                 
                
                 
                   //INPUT FORMAT : T(n)=aT(n/b)+(n^k)*(logn)^p
                 
                 
       
        while(s.charAt(i)!='='){
            i++;
        }
        i++;
        
        
        while(s.charAt(i)!='T'){
            A=A+s.charAt(i);
            i++;
        }
        
        
        String a =String.valueOf(A);
        ta.setText(a);
               
        
        while(s.charAt(i)!='/'){
            i++;
        }
        i++;
        
        
        while(s.charAt(i)!=')'){
            B=B+s.charAt(i);
            i++;
        }
        
        
        String b =String.valueOf(B);
        tb.setText(b);
        
        
        while(s.charAt(i)!='^'){
            i++;
        }
        i++;
        
        
        while(s.charAt(i)!=')'){
            K=K+s.charAt(i);
            i++;
        }
        
        
        String k =String.valueOf(K);
        tk.setText(k);
      
        while(s.charAt(i)!='^'){
            i++;
        } 
        i++;
        
        
        while(i<s.length()){
            P=P+s.charAt(i);
            i++;
        }
        
        
        String p =String.valueOf(P);
        tp.setText(p);
       
        
        int ai=parseInt(A);
        int bi=parseInt(B);
        int ki=parseInt(K);
        int pi=parseInt(P);
        
        
        if(ai<1 || bi<1 || checkNegative(s)){
                t2.setText("\t"+"is invalid Equation");
            }
        
             else{
                double logvalue = log10(ai)/log10(bi);
                
                
                if(logvalue>ki)
                {
                    t2.setText("\t"+"T(n) = Theta(n^"+logvalue+")");
                }
                
                
                else if(logvalue == ki)
                {
                    if(pi>-1)
                    {
                       t2.setText("\t T(n)= Theta(n^"+ki +" log^"+(pi+1)+"n)");
                      }
                else if(pi==-1)
                {
                   t2.setText("\t T(n) = Theta(n^"+ki+"loglogn)");
                }
                else if(pi<-1)
                {
                   t2.setText("\t T(n) = Theta(n^"+ki+")");
                }
            }
        
         
                else
                {
                 if(logvalue <ki)
                    {
                        if(pi>=0)
                            t2.setText("\t T(n) = Theta(n^"+ki+"log^"+pi+" n)");
                        else if(pi<0)
                            t2.setText("\t T(n) = O(n^"+ki+")");
                    }
        } 
               
                }
        }
              
     });
       
       
        
        b2.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e){
             
                
                t1.setText(" ");
                t2.setText(" ");
                ta.setText(" ");
                tb.setText(" ");
                tk.setText(" ");
                tp.setText(" ");
              
                 }
              
     });
        
       
       
        
      
        
        
       
    }
       
    public static void main(String []args)
    {
       Complexity_Calculator cc = new Complexity_Calculator();
       cc.setVisible(true);
       cc.setResizable(false);
       
    }
}

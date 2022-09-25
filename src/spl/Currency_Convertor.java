/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spl;

/**
 *
 * @author 88018
 */
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Currency_Convertor extends JFrame{
    
    private Container c;
    private JLabel l1,l2,l3,l4,l5,l6;
    private JButton bcalculate,b2,bCon1,bCon2;
    private JTextField t1,t2;
    private JTextArea ta1;
    private JTextField tfrom,tto;
   /* private String[]currency={"Taka","US Dollar","Indian Rupee","British Pound","Euro","Canadian Dollar",
                              "Emirati Dirham","Chinese Yaun"};  */
    
     private ImageIcon icon;
      private String currency = "";
       private String currency1 = "";
     private int rate =0;
    // private String s="";
      
       Currency_Convertor()
    {
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setBounds(100,200,700,500);
       this.setTitle("Currency Convertor");
       
       c= this.getContentPane();
       c.setLayout(null);
       c.setBackground(Color.black);
       
       icon = new ImageIcon(getClass().getResource("NC.png"));
       this.setIconImage(icon.getImage());
       
       l1 = new JLabel("Currency Convertor");
       l1.setFont(new Font("Verdana", Font.PLAIN, 15));
       l1.setBounds(245,0,350,100);
       l1.setForeground(Color.white);
       c.add(l1);
       
       
       
        tfrom = new JTextField("");
        tfrom.setBounds(290,85,120,30);
        tfrom.setBackground(Color.white);
        c.add(tfrom);
       
       
       
       l2 = new JLabel("select the input Country : ");
       l2.setBounds(80,50,300,100);
       l2.setForeground(Color.white);
       c.add(l2);
       
       
       l5 = new JLabel("From ");
       l5.setBounds(250,50,300,100);
       l5.setForeground(Color.white);
       c.add(l5);
       
       l6 = new JLabel("To ");
       l6.setBounds(430,50,300,100);
       l6.setForeground(Color.white);
       c.add(l6);
       
       
       tto = new JTextField("");
       tto.setBounds(470,85,120,30);
       tto.setBackground(Color.white);
       c.add(tto);
       
       
       l3 = new JLabel("Enter the amount ");
       l3.setBounds(80,150,300,100);
       l3.setForeground(Color.white);
       c.add(l3);
       
       
       
       t1 = new JTextField(" ");
       t1.setBounds(250,180,300,30);
       t1.setForeground(Color.black);
       c.add(t1);
       
       
       
       l4 = new JLabel("Results ");
       l4.setBounds(80,200,300,100);
       l4.setForeground(Color.white);
       c.add(l4);
       
       
       
       ta1 = new JTextArea("");
       ta1.setBounds(250,230,300,100);
       ta1.setForeground(Color.black);
       c.add(ta1);
       
       
       bcalculate = new JButton("Calculate ");
       bcalculate.setBounds(170,351,100,30);
       bcalculate.setBackground(Color.white);
       c.add(bcalculate);
       
       
       
       b2 = new JButton("Clear");
       b2.setBounds(290,351,100,30);
       b2.setBackground(Color.white);
       c.add(b2);
       
       
       
       bCon1 = new JButton("Converting From ");
       bCon1.setBounds(250,131,170,30);
       bCon1.setBackground(Color.white);
       c.add(bCon1);
       
       
       bCon2 = new JButton("Converting To");
       bCon2.setBounds(450,131,170,30);
       bCon2.setBackground(Color.white);
       c.add(bCon2);
       
       
       
     
       //This bCon1 button will perform for Converting from button
       //In From : BANGLADESH then click the calculationg from button,it will show Taka
      bCon1.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e){
            
            TreeMap<String, String> t=new TreeMap<>();
            try {
              File f=new File("\\C:\\Users\\HP\\Downloads\\Currency-name (2).txt");
				BufferedReader br=new BufferedReader(new FileReader(f));
				String c = br.readLine();
				while (c != null) {
					String[] s=c.split("\t");
					t.put(s[0],s[1]);
					c = br.readLine();
				}
				br.close();
				tfrom.setText(t.get(tfrom.getText()));
				 currency=tfrom.getText();
            }
			 catch (FileNotFoundException e1) {
				
				e1.printStackTrace();
			} catch (IOException e1) {
			
				e1.printStackTrace();
			}
       
                 }     
     }); 
      
      
      // this bcon2 button will perfrom for converting to button
      //In From : BELGIUM then click the calculationg from button,it will show Euro
       bCon2.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e){
            
            TreeMap<String, String> t1=new TreeMap<>();
            try {
              File f=new File("\\C:\\Users\\HP\\Downloads\\Currency-name (2).txt");
				BufferedReader br=new BufferedReader(new FileReader(f));
				String c = br.readLine();
				while (c != null) {
					String[] s=c.split("\t");
					t1.put(s[0],s[1]);
					c = br.readLine();
				}
				br.close();
				tto.setText(t1.get(tto.getText()));
				String currency1=tto.getText();
            }
			 catch (FileNotFoundException e1) {
			
				e1.printStackTrace();
			} catch (IOException e1) {
			
				e1.printStackTrace();
			}
       
                 }     
     });
     
       
       // this bcalculate button will perform for calculate button
   bcalculate.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e){
            
                
                      double a,ans=0;
	             a=Double.valueOf(t1.getText());
		     String currency = tfrom.getText();
                       String currency1 = tto.getText();
		     
		    if(currency.equalsIgnoreCase("Taka") && currency1.equalsIgnoreCase("Afghani") )
        {
            ans=a*0.86;
          
        } else if(currency.equalsIgnoreCase("Taka") && currency1.equalsIgnoreCase("Algerian Dinar"))
        {
            ans=a*1.36;
        }
        else if(currency.equalsIgnoreCase("Taka") && currency1.equalsIgnoreCase("US Dollar"))
        {
            ans= a*0.0096;
        }
        else if(currency.equalsIgnoreCase("Taka") && currency1.equalsIgnoreCase("Kwanza"))
        {
            ans= a*4.16;
        }else if(currency.equalsIgnoreCase("Taka") && currency1.equalsIgnoreCase("Taka"))
        {
            ans= a*1;
        }
        else if(currency.equalsIgnoreCase("Taka") && currency1.equalsIgnoreCase("Barbados Dollar"))
        {
            ans= a*0.020;
        }else if(currency.equalsIgnoreCase("Taka") && currency1.equalsIgnoreCase("Belarussian Ruble"))
        {
            ans= a*0.024;
        }
        else if(currency.equalsIgnoreCase("Taka") && currency1.equalsIgnoreCase("Euro"))
        {
            ans= a*0.0100;
        }
        else if(currency.equalsIgnoreCase("Taka") && currency1.equalsIgnoreCase("Canadian Dollar"))
        {
            ans= a*76.36;
        }else if(currency.equalsIgnoreCase("Taka") && currency1.equalsIgnoreCase("Nakfa"))
        {
            ans= a*0.145;
        }
        else if(currency.equalsIgnoreCase("Taka") && currency1.equalsIgnoreCase("Indian Rupee"))
        {
            ans= a*0.78;
        }else if(currency.equalsIgnoreCase("Taka") && currency1.equalsIgnoreCase("Rupiah"))
        {
            ans= a*145.70;
        }
        else if(currency.equalsIgnoreCase("Taka") && currency1.equalsIgnoreCase("Euro"))
        {
            ans= a*0.0100;
        }
        else if(currency.equalsIgnoreCase("Taka") && currency1.equalsIgnoreCase("Yen"))
        {
            ans= a*1.38;
        }else if(currency.equalsIgnoreCase("Taka") && currency1.equalsIgnoreCase("Pound Sterling"))
        {
            ans= a*0.0089;
        }
        else if(currency.equalsIgnoreCase("Taka") && currency1.equalsIgnoreCase("Jordanian Dinar"))
        {
            ans= a*0.0068;
        }
        else if(currency.equalsIgnoreCase("Taka") && currency1.equalsIgnoreCase("Australian Dollar"))
        {
            ans= a*67.94;
        }
        else if(currency.equalsIgnoreCase("Taka") && currency1.equalsIgnoreCase("Kuwaiti Dinar"))
        {
            ans= a*0.0030;
        }
        else if(currency.equalsIgnoreCase("Taka") && currency1.equalsIgnoreCase("Som"))
        {
            ans= a*106.83;
        }
        else if(currency.equalsIgnoreCase("Taka") && currency1.equalsIgnoreCase("Euro"))
        {
            ans= a*1.03;
        }
         else if(currency.equalsIgnoreCase("Taka") && currency1.equalsIgnoreCase("Lebanese Pound"))
        {
            ans= a*14.67;
        }
         else if(currency.equalsIgnoreCase("Taka") && currency1.equalsIgnoreCase("Euro"))
        {
            ans= a*0.0100;
        }
         else if(currency.equalsIgnoreCase("Taka") && currency1.equalsIgnoreCase("Kwacha"))
        {
            ans= a*0.16;
        }
         else if(currency.equalsIgnoreCase("Taka") && currency1.equalsIgnoreCase("Malaysian Ringgit"))
        {
            ans= a*0.044;
        }
        else if(currency.equalsIgnoreCase("Taka") && currency1.equalsIgnoreCase("Zimbabwe Dollar"))
        {
            ans= a*3.544812;
        }
        
       
        else if(currency.equalsIgnoreCase("Afghani") && currency1.equalsIgnoreCase("Malaysian Ringgit"))
        {
            ans= a*0.052;
        }
        else if(currency.equalsIgnoreCase("Afghani") && currency1.equalsIgnoreCase("Kwacha"))
        {
            ans= a*11.74;
        }
        else if(currency.equalsIgnoreCase("Afghani") && currency1.equalsIgnoreCase("Euro"))
        {
            ans= a*0.012;
        }
         else if(currency.equalsIgnoreCase("Afghani") && currency1.equalsIgnoreCase("Lebanese Pound"))
        {
            ans= a*17.30;
        }
        else if(currency.equalsIgnoreCase("Afghani") && currency1.equalsIgnoreCase("Euro"))
        {
            ans= a*0.012;
        }
        else if(currency.equalsIgnoreCase("Afghani") && currency1.equalsIgnoreCase("Som"))
        {
            ans= a*125.97;
        }
        else if(currency.equalsIgnoreCase("Afghani") && currency1.equalsIgnoreCase("Kuwaiti Dinar"))
        {
            ans= a*0.0035;
        }
        else if(currency.equalsIgnoreCase("Afghani") && currency1.equalsIgnoreCase("Austrlian Dollar"))
        {
            ans= a*0.017;
        }else if(currency.equalsIgnoreCase("Afghani") && currency1.equalsIgnoreCase("Kuwaiti Dinar"))
        {
            ans= a*0.0035;
        }
        else if(currency.equalsIgnoreCase("Afghani") && currency1.equalsIgnoreCase("Euro"))
        {
            ans= a*0.012;
        }else if(currency.equalsIgnoreCase("Afghani") && currency1.equalsIgnoreCase("Lebanses Pound"))
        {
            ans= a*17.30;
        }
        else if(currency.equalsIgnoreCase("Afghani") && currency1.equalsIgnoreCase("Euro"))
        {
            ans= a*0.012;
        }
        else if(currency.equalsIgnoreCase("Afghani") && currency1.equalsIgnoreCase("Kwacha"))
        {
            ans= a*11.74;
        }
         else if(currency.equalsIgnoreCase("Afghani") && currency1.equalsIgnoreCase("Malaysian Ringgit"))
        {
            ans= a*0.052;
        }
        else if(currency.equalsIgnoreCase("Afghani") && currency1.equalsIgnoreCase("Zimbabwe"))
        {
            ans= a*0.011;
        }
        
        
        
         else if(currency.equalsIgnoreCase("Algerian Dinar") && currency1.equalsIgnoreCase("Zimbabwe"))
        {
            ans= a*0.0071;
        }
        else if(currency.equalsIgnoreCase("Algerian Dinar") && currency1.equalsIgnoreCase("Malaysian Ringgit"))
        {
            ans= a*0.033;
        }
        else if(currency.equalsIgnoreCase("Algerian Dinar") && currency1.equalsIgnoreCase("Kwacha"))
        {
            ans= a*7.35;
        }
        else if(currency.equalsIgnoreCase("Algerian Dinar") && currency1.equalsIgnoreCase("Euro"))
        {
            ans= a*0.0073;
        }
        else if(currency.equalsIgnoreCase("Algerian Dinar") && currency1.equalsIgnoreCase("Lebanese Pound"))
        {
            ans= a*10.82;
        }
        else if(currency.equalsIgnoreCase("Algerian Dinar") && currency1.equalsIgnoreCase("Euro"))
        {
            ans= a*10.0073;
        }
        else if(currency.equalsIgnoreCase("Algerian Dinar") && currency1.equalsIgnoreCase("Som"))
        {
            ans= a*0.58;
        }
        else if(currency.equalsIgnoreCase("Algerian Dinar") && currency1.equalsIgnoreCase("Kuwaiti Dinar"))
        {
            ans= a*0.0022;
        }
        else if(currency.equalsIgnoreCase("Algerian Dinar") && currency1.equalsIgnoreCase("Australian Dollar"))
        {
            ans= a*0.011;
        }
        else if(currency.equalsIgnoreCase("Algerian Dinar") && currency1.equalsIgnoreCase("Jordanian Dinar"))
        {
            ans= a*0.0050;
        }
        else if(currency.equalsIgnoreCase("Algerian Dinar") && currency1.equalsIgnoreCase("Pound Sterling"))
        {
            ans= a*0.0065;
        }
        else if(currency.equalsIgnoreCase("Algerian Dinar") && currency1.equalsIgnoreCase("Yen"))
        {
            ans= a*1.02;
        }
        else if(currency.equalsIgnoreCase("Algerian Dinar") && currency1.equalsIgnoreCase("Euro"))
        {
            ans= a*0.0073;
        }
        else if(currency.equalsIgnoreCase("Algerian Dinar") && currency1.equalsIgnoreCase("Rupiah"))
        {
            ans= a*107.47;
        }
        else if(currency.equalsIgnoreCase("Algerian Dinar") && currency1.equalsIgnoreCase("Indian Rupee"))
        {
            ans= a*0.58;
        }
        else if(currency.equalsIgnoreCase("Algerian Dinar") && currency1.equalsIgnoreCase("Nakfa"))
        {
            ans= a*1.06;
        }
         else if(currency.equalsIgnoreCase("Algerian Dinar") && currency1.equalsIgnoreCase("Nakfa"))
        {
            ans= a*1.06;
        }
        else if(currency.equalsIgnoreCase("Algerian Dinar") && currency1.equalsIgnoreCase("Canadian Dollar"))
        {
            ans= a*0.0097;
        }
        else if(currency.equalsIgnoreCase("Algerian Dinar") && currency1.equalsIgnoreCase("Euro"))
        {
            ans= a*0.0073;
        }
         else if(currency.equalsIgnoreCase("Algerian Dinar") && currency1.equalsIgnoreCase("Belarussian Ruble"))
        {
            ans= a*0.018;
        }
        
          else if(currency.equalsIgnoreCase("Algerian Dinar") && currency1.equalsIgnoreCase("Barbados Dollar"))
        {
            ans= a*0.0014;
        }
        else if(currency.equalsIgnoreCase("Algerian Dinar") && currency1.equalsIgnoreCase("Taka"))
        {
            ans= a*0.74;
        }
        else if(currency.equalsIgnoreCase("Algerian Dinar") && currency1.equalsIgnoreCase("Kwanza"))
        {
            ans= a*3.07;
        }
        else if(currency.equalsIgnoreCase("Algerian Dinar") && currency1.equalsIgnoreCase("US Dollar"))
        {
            ans= a*0.0071;
        }
        else if(currency.equalsIgnoreCase("Algerian Dinar") && currency1.equalsIgnoreCase("Algerian Dinar"))
        {
            ans= a*0.0022;
        }
        else if(currency.equalsIgnoreCase("Algerian Dinar") && currency1.equalsIgnoreCase("Afghani"))
        {
            ans= a*0.63;
        }
        
        
        else if(currency.equalsIgnoreCase("US Dollar") && currency1.equalsIgnoreCase("Afghani"))
        {
            ans= a*88.91;
        }
        else if(currency.equalsIgnoreCase("US Dollar") && currency1.equalsIgnoreCase("Algerian Dinar"))
        {
            ans= a*140.62;
        }
        else if(currency.equalsIgnoreCase("US Dollar") && currency1.equalsIgnoreCase("Kwanza"))
        {
            ans= a*431.15;
        }
        else if(currency.equalsIgnoreCase("US Dollar") && currency1.equalsIgnoreCase("Taka"))
        {
            ans= a*103.75;
        }
        else if(currency.equalsIgnoreCase("US Dollar") && currency1.equalsIgnoreCase("Barbados Dollar"))
        {
            ans= a*0.49;
        }
        else if(currency.equalsIgnoreCase("US Dollar") && currency1.equalsIgnoreCase("Belarussian Ruble"))
        {
            ans= a*02.54;
        }
        else if(currency.equalsIgnoreCase("US Dollar") && currency1.equalsIgnoreCase("Euro"))
        {
            ans= a*1.03;
        }
        else if(currency.equalsIgnoreCase("US Dollar") && currency1.equalsIgnoreCase("Canadian Dollar"))
        {
            ans= a*1.36;
        }
        else if(currency.equalsIgnoreCase("US Dollar") && currency1.equalsIgnoreCase("Nakfa"))
        {
            ans= a*0.066666;
        }
        else if(currency.equalsIgnoreCase("US Dollar") && currency1.equalsIgnoreCase("Indian Rupee"))
        {
            ans= a*81.26;
        }
        else if(currency.equalsIgnoreCase("US Dollar") && currency1.equalsIgnoreCase("Rupiah"))
        {
            ans= a*15112.10;
        }
        
                
       
     
        ta1.setText(String.valueOf(ans));
	    
		
   }

           private int ParseInt(Set<String> r) {
               throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
           }
                 });   
      
      
      
 
       
       
    }   
       
       public static void main(String []args)
    {
      Currency_Convertor ccc = new Currency_Convertor();
       ccc.setVisible(true);
       ccc.setResizable(false);
       
    }
}



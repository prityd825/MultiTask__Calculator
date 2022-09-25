/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spl;

/**
 *
 * @author hp
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Scientific_Calculator extends JFrame  implements ActionListener{
    
        
    private Container c;
     
    private JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    
    
	
    private JButton bMul,bDiv,bAdd,bSub,bEqual, bPoint,bDel, bClear,bSquare,bCube,bSqrt, 
                        bPercent,bMod,bOneByN,bPlusMinus,bPowerOfTen,bSin,bCos,bTan,bAsin,bAcos,
                        bAtan,bLog,bLn,bAbs,bExit,ShowMatResult,bMatrixOperation;
    
    
        
    private JLabel lMatrix,lrow,lcol,lInte,lDif;
    private JComboBox MatrixOp;
    private String matrixOp[]={"Multiplication","Addition","Substraction"};	
    private JTextField tfDisplay,Input;
    
    
    
    private String button = "";
    private String sDisplay = "";

    
    private boolean isPlus = true;
    private boolean isPoint = false; 
    private boolean isOperation = false;
	
    private double number1 = 0;
    private double number2 = 0;
    private double result = 0;
    private char operation = ' ';
    
    
    
    
    Scientific_Calculator()
    {
    
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setBounds(100,200,410,550);
       this.setTitle("Scientific Calculator");
       
       
       c= this.getContentPane();
       c.setLayout(null);
       c.setBackground(Color.darkGray);
       
    
            b0 = new JButton("0");
            b0.setBounds(10, 252, 64, 38);	
            b0.setBackground(Color.LIGHT_GRAY);	
            b0.setFocusable(false);
            c.add(b0);
            b0.addActionListener((ActionListener)this);
       
       
            b1 = new JButton("1");
            b1.setBounds(10, 214, 64, 38);	
            b1.setBackground(Color.LIGHT_GRAY);	
            b1.setFocusable(false);
            c.add(b1);
            b1.addActionListener((ActionListener)this);
            
            
            b2 = new JButton("2");
            b2.setBounds(74, 214, 64, 38);
            b2.setBackground(Color.LIGHT_GRAY);	
            b2.setFocusable(false);
            c.add(b2);
            b2.addActionListener((ActionListener)this);
            
            
            b3 = new JButton("3");
            b3.setBounds(134,214, 64, 38);
            b3.setBackground(Color.LIGHT_GRAY);	
            b3.setFocusable(false);
            c.add(b3);
            b3.addActionListener((ActionListener)this);
            
            
            b4 = new JButton("4");
            b4.setBounds(10, 176, 64, 38);
            b4.setBackground(Color.LIGHT_GRAY);	
            b4.setFocusable(false);
            c.add(b4);
            b4.addActionListener((ActionListener)this);
            
            
            b5 = new JButton("5");
            b5.setBounds(74, 176, 64, 38);
            b5.setBackground(Color.LIGHT_GRAY);	
            b5.setFocusable(false);
            c.add(b5);
            b5.addActionListener((ActionListener)this);
            
            
            b6 = new JButton("6");
            b6.setBounds(135, 176, 64, 38);
            b6.setBackground(Color.LIGHT_GRAY);	
            b6.setFocusable(false);
            c.add(b6);
            b6.addActionListener((ActionListener)this);
            
            
            b7 = new JButton("7");
            b7.setBounds(10, 138, 64, 38);
            b7.setBackground(Color.LIGHT_GRAY);	
            b7.setFocusable(false);
            c.add(b7);
            b7.addActionListener((ActionListener)this);
            
            
            b8 = new JButton("8");
            b8.setBounds(74, 138, 64, 38);
            b8.setBackground(Color.LIGHT_GRAY);	
            b8.setFocusable(false);
            c.add(b8);
            b8.addActionListener((ActionListener)this);
            
            
            b9 = new JButton("9");
            b9.setBounds(135, 138, 64, 38);
            b9.setBackground(Color.LIGHT_GRAY);	
            b9.setFocusable(false);
            c.add(b9);
            b9.addActionListener((ActionListener)this);
            
            
            bMul = new JButton("*");
            bMul.setBounds(198, 138, 64, 38);
            bMul.setBackground(Color.LIGHT_GRAY);	
            bMul.setFocusable(false);
            c.add(bMul);
            bMul.addActionListener((ActionListener)this);
            
            
            bDiv = new JButton("/");
            bDiv.setBounds(257, 138, 64, 38);
            bDiv.setBackground(Color.LIGHT_GRAY);	
            bDiv.setFocusable(false);
            c.add(bDiv);
            bDiv.addActionListener((ActionListener)this);
            
            
            bAdd = new JButton("+");
            bAdd.setBounds(198, 176, 64, 38);
            bAdd.setBackground(Color.LIGHT_GRAY);	
            bAdd.setFocusable(false);
            c.add(bAdd);
            bAdd.addActionListener((ActionListener)this);
            
            
            bSub = new JButton("-");
            bSub.setBounds(257, 176, 64, 38);
            bSub.setBackground(Color.LIGHT_GRAY);	
            bSub.setFocusable(false);
            c.add(bSub);
            bSub.addActionListener((ActionListener)this);
            
            
            bEqual = new JButton("=");
            bEqual.setBounds(198, 214, 123, 38);
            bEqual.setBackground(Color.LIGHT_GRAY);	
            bEqual.setFocusable(false);
            c.add(bEqual);
            bEqual.addActionListener((ActionListener)this);
            
            bPoint = new JButton(".");
            bPoint.setBounds(74, 252, 64, 38);
            bPoint.setBackground(Color.LIGHT_GRAY);	
            bPoint.setFocusable(false);
            c.add(bPoint);
            bPoint.addActionListener((ActionListener)this);
            
            
            bDel = new JButton("Delete");
            bDel.setBounds(10, 430, 94, 38);
            bDel.setBackground(Color.LIGHT_GRAY);	
            bDel.setFocusable(false);
            c.add(bDel);
            bDel.addActionListener((ActionListener) this);
            
            
            bClear = new JButton("Clear");
            bClear.setBounds(110, 430, 102, 38);
            bClear.setBackground(Color.LIGHT_GRAY);	
            bClear.setFocusable(false);
            c.add(bClear);
            bClear.addActionListener((ActionListener) this);
            
            
            bMatrixOperation = new JButton("Matrix Operation");
            bMatrixOperation.setBounds(220, 430, 152, 38);
            bMatrixOperation.setBackground(Color.LIGHT_GRAY);	
            bMatrixOperation.setFocusable(false);
            c.add(bMatrixOperation);
            bMatrixOperation.addActionListener((ActionListener) this);
            
            
            bSquare = new JButton("x^2");
            bSquare.setBounds(320, 138, 64, 38);
            bSquare.setBackground(Color.LIGHT_GRAY);	
            bSquare.setFocusable(false);
            c.add(bSquare);
            bSquare.addActionListener((ActionListener) this);
            
            
            bCube = new JButton("x^3");
            bCube.setBounds(320, 176, 64, 38);
            bCube.setBackground(Color.LIGHT_GRAY);	
            bCube.setFocusable(false);
            c.add(bCube);
            bCube.addActionListener((ActionListener) this);
            
            
            bSqrt = new JButton("Sqrt");
            bSqrt.setBounds(250, 252, 135, 38);
            bSqrt.setBackground(Color.LIGHT_GRAY);	
            bSqrt.setFocusable(false);
            c.add(bSqrt);
            bSqrt.addActionListener((ActionListener) this);
            
           
            bMod = new JButton("Mod");
            bMod.setBounds(320, 214, 64, 38);
            bMod.setBackground(Color.LIGHT_GRAY);	
            bMod.setFocusable(false);
            c.add(bMod);
            bMod.addActionListener((ActionListener) this);
            
            
            
            bOneByN = new JButton("1/n");
            bOneByN.setBounds(197, 252, 64, 38);
            bOneByN.setBackground(Color.LIGHT_GRAY);	
            bOneByN.setFocusable(false);
            c.add(bOneByN);
            bOneByN.addActionListener((ActionListener) this);
            
            
            
            bPowerOfTen = new JButton("10^n");
            bPowerOfTen.setBounds(135, 252, 62, 38);
            bPowerOfTen.setBackground(Color.LIGHT_GRAY);	
            bPowerOfTen.setFocusable(false);
            c.add(bPowerOfTen);
            bPowerOfTen.addActionListener((ActionListener) this);
            
            
            
            bSin = new JButton("Sin");
            bSin.setBounds(10, 322, 75, 38);
            bSin.setBackground(Color.LIGHT_GRAY);	
            bSin.setFocusable(false);
            c.add(bSin);
            bSin.addActionListener((ActionListener) this);
            
        
	    
            bCos = new JButton("Cos");
            bCos.setBounds(85, 322, 75, 38);
            bCos.setBackground(Color.LIGHT_GRAY);	
            bCos.setFocusable(false);
            c.add(bCos);
            bCos.addActionListener((ActionListener) this);
            
            
            
            bTan = new JButton("Tan");
            bTan.setBounds(160,322, 75, 38);
            bTan.setBackground(Color.LIGHT_GRAY);	
            bTan.setFocusable(false);
            c.add(bTan);
            bTan.addActionListener((ActionListener) this);
            
            
            
            bLog = new JButton("log");
            bLog.setBounds(235, 322, 75, 38);
            bLog.setBackground(Color.LIGHT_GRAY);	
            bLog.setFocusable(false);
            c.add(bLog);
            bLog.addActionListener((ActionListener) this);
            
            
             
            bAsin = new JButton("Asin");
            bAsin.setBounds(10, 360, 75, 38);
            bAsin.setBackground(Color.LIGHT_GRAY);	
            bAsin.setFocusable(false);
            c.add(bAsin);
            bAsin.addActionListener((ActionListener) this);
            
             
            bAcos = new JButton("Acos");
            bAcos.setBounds(85,360, 75, 38);
            bAcos.setBackground(Color.LIGHT_GRAY);	
            bAcos.setFocusable(false);
            c.add(bAcos);
            bAcos.addActionListener((ActionListener) this);
            
            
            bAtan = new JButton("Atan");
            bAtan.setBounds(160, 360, 75, 38);
            bAtan.setBackground(Color.LIGHT_GRAY);	
            bAtan.setFocusable(false);
            c.add(bAtan);
            bAtan.addActionListener((ActionListener) this);
            
             
            bLn = new JButton("ln");
            bLn.setBounds(310, 322, 77, 38);
            bLn.setBackground(Color.LIGHT_GRAY);	
            bLn.setFocusable(false);
            c.add(bLn);
            bLn.addActionListener((ActionListener) this);
            
            
               
            bAbs = new JButton("abs");
            bAbs.setBounds(235, 360, 74, 38);
            bAbs.setBackground(Color.LIGHT_GRAY);	
            bAbs.setFocusable(false);
            c.add(bAbs);
            bAbs.addActionListener((ActionListener) this);
            
               
            bExit = new JButton("EXIT");
            bExit.setBounds(310, 360, 77, 38);
            bExit.setBackground(Color.LIGHT_GRAY);	
            bExit.setFocusable(false);
            c.add(bExit);
            bExit.addActionListener((ActionListener) this);
            
            
            tfDisplay = new JTextField(" ");
            tfDisplay.setBounds(10, 30, 370, 55);
	    tfDisplay.setHorizontalAlignment(JTextField.RIGHT);
            tfDisplay.setText("0");
            tfDisplay.setLayout(null);
	    tfDisplay.setEditable(false);
	    tfDisplay.setBackground(Color.white);
	    tfDisplay.setForeground(Color.BLACK);
            c.add(tfDisplay);
            
            
            Input = new JTextField(" ");
            Input.setBounds(10, 1, 370, 35);
	    Input.setHorizontalAlignment(JTextField.LEFT);
	    Input.setText("0");
	    Input.setEditable(false);
	    Input.setBackground(Color.white);
	    Input.setForeground(Color.black);
            c.add(Input);
            
      
            
        }
    
    
     @Override
	public void actionPerformed(ActionEvent e)
	{
             
		if (e.getSource() == b1) 
		{
			if(operation == '=')
			{
				sDisplay = "1";
                                
				button = "1";
                                
				Input.setText(button);
				operation = ' ';
			}
			else 
			{
				sDisplay = sDisplay + "1";
				button += "1";
                                
				Input.setText(button);
			}
		}
                
		else if (e.getSource() == b2) 
		{
			
                    if(operation == '=')
			{
				
                            sDisplay = "2";
				
                            button = "2";
				
                            Input.setText(button);
				
                            operation = ' ';
			}
			
                    
                    else 
			{
				sDisplay = sDisplay + "2";
				button += "2";
				Input.setText(button);
			}
		} 
		else if (e.getSource() == b3)
		{
			
                    if(operation == '=')
			{
				
                            sDisplay = "3";
				
                            button = "3";
				
                            Input.setText(button);
				
                            operation = ' ';
			}
			else 
			{
				
                            sDisplay = sDisplay + "3";
				
                            button += "3";
				
                            Input.setText(button);
			}
		} 
		else if (e.getSource() == b4) 
		{
			if(operation == '=')
			{
				
                            sDisplay = "4";
				
                            button = "4";
				
                            Input.setText(button);
				
                            operation = ' ';
			}
			else 
			{
				
                            sDisplay = sDisplay + "4";
				
                            button += "4";
				
                            Input.setText(button);
			}
		} 
		else if (e.getSource() == b5) 
		{
			if(operation == '=')
			{
				
                            sDisplay = "5";
				
                            button = "5";
				
                            Input.setText(button);
				
                            operation = ' ';
			}
			else 
			{
				
                            sDisplay = sDisplay + "5";
				
                            button += "5";
				
                            Input.setText(button);
			}
		}
		else if (e.getSource() == b6) 
		{
			if(operation == '=')
			{
				
                            sDisplay = "6";
				
                            button = "6";
				
                            Input.setText(button);
				
                            operation = ' ';
			}
			
                        
                        
                        else 
			{
				
                            sDisplay = sDisplay + "6";
				
                            button += "6";
				
                            Input.setText(button);
			}
		} 
		
                else if (e.getSource() == b7) 
		{
			
                    if(operation == '=')
			{
				
                            sDisplay = "7";
				
                            button = "7";
				
                            Input.setText(button);
				
                            operation = ' ';
			}
			
                    else 
			{
				
                            sDisplay = sDisplay + "7";
				
                            button += "7";
				
                            Input.setText(button);
			}
		}
		
                
                else if (e.getSource() == b8) 
		{
			if(operation == '=')
			{
				
                            sDisplay = "8";
				
                            button = "8";
				
                            Input.setText(button);
				
                            operation = ' ';
			}
			
                        else 
			{
				
                            sDisplay = sDisplay + "8";
				
                            button += "8";
				
                            Input.setText(button);
			}
		} 
		
                else if (e.getSource() == b9) 
		{
			if(operation == '=')
			{
				
                            sDisplay = "9";
				
                            button = "9";
				
                            Input.setText(button);
				
                            operation = ' ';
			}
			
                        else 
			{
				
                            sDisplay = sDisplay + "9";
				
                            button += "9";
				
                            Input.setText(button);
			}
		} 
		
                else if (e.getSource() == b0) 
		{
			if(sDisplay.equals(""))//zero at first
			{
				
                            sDisplay = "0";
				
                            button += "0";
				
                            Input.setText(button);
			}
			
                        else
			{
				
                            sDisplay = sDisplay + "0";
				
                            button += "0";
				
                            Input.setText(button);
			}
		} 
		else if (e.getSource() == bPoint) 
		{
			if(sDisplay.equals(""))
			{
				
                            sDisplay = "0.";
				
                            button += "0.";
				
                            Input.setText(button);
			}
			else if(!isPoint)
			{
				
                            sDisplay = sDisplay + ".";
				
                            button += ".";
				
                            Input.setText(button);
			}
			isPoint = true;
		} 
		
		
                
                else if (e.getSource() == bAdd && (!sDisplay.equals("") || operation == '=')) 
		{
			if(!isOperation)
			{
				
                            number1 = Double.parseDouble(sDisplay);
				
                            sDisplay = "";
				
                            operation = '+';
				
                            isPlus = true;
				
                            button += " + ";
				
                            Input.setText(button);
				
                            if(isPoint)
				{
					tfDisplay.setText(""+number1);
				}
				else if(!isPoint)
				{
					tfDisplay.setText(""+(long)number1);
				}
			}
			
                        else if(isOperation && operation != '=')
			{
				number2  = Double.parseDouble(sDisplay);
				
				if(operation == '+')
				{
					result = number1 + number2;
				}
				else if(operation == '-')
				{
					result = number1 - number2;
				}
				else if(operation == '*')
				{
					result = number1 * number2;
				}
				else if(operation == '/')
				{
					result = number1 / number2;
				}
				else if(operation == '%')
				{
					result = number1 % number2;
				}
				else
				{
					result = number2;
				}
				String temp = "";
				if(isPoint || operation == '/')
				{
					tfDisplay.setText(""+result);
					temp = ""+result;
				}
				else if(!isPoint)
				{
					tfDisplay.setText(""+(long)result);
					temp = ""+(long)result;
				}
				
                                operation = '+';
				
                                sDisplay = "";
				
                                number1 = result;
				
                                isPlus = true;
				
                                isPoint = false;
				
                                isOperation = true;
				
                                button += " + ";
				
                                Input.setText(button);
				
                                button = temp + " + ";
			}
			
                        else if(operation == '=')
			{
				
                            sDisplay = "";
				
                            operation = '+';
				
                            isPlus = true;
				
                            isOperation = true;
				
                            button += " + ";
				
                            Input.setText(button);
			}
			isOperation = true;
		}
		else if (e.getSource() == bSub && (!sDisplay.equals("") || operation == '='))  
		{
			if(!isOperation)
			{
				
                            number1 = Double.parseDouble(sDisplay);
				
                            sDisplay = "";
				
                            operation = '-';
				
                            isPlus = true;
				
                            button += " - ";
				
                            Input.setText(button);
				
                            
                            if(isPoint)
				{
					tfDisplay.setText(""+number1);
				}
				else if(!isPoint)
				{
					tfDisplay.setText(""+(long)number1);
				}
			}
			
                        
                        else if(isOperation && operation != '=')
			{
				number2  = Double.parseDouble(sDisplay);
				
                            switch (operation) {
                                case '+':
                                    result = number1 + number2;
                                    break;
                                case '-':
                                    result = number1 - number2;
                                    break;
                                case '*':
                                    result = number1 * number2;
                                    break;
                                case '/':
                                    result = number1 / number2;
                                    break;
                                case '%':
                                    result = number1 % number2;
                                    break;
                                default:
                                    result = number2;
                                    break;
                            }
				
                            
                            String temp = "";
				
                            if(isPoint || operation == '/')
				{
					tfDisplay.setText(""+result);
					temp = ""+result;
				}
				else if(!isPoint)
				{
					tfDisplay.setText(""+(long)result);
					temp = ""+(long)result;
				}
				
                            
                            operation = '-';
				
                            sDisplay = "";
				
                            number1 = result;
				
                            isPlus = true;
				
                            isPoint = false;
				
                            isOperation = true;
				
                            button += " - ";
				
                            Input.setText(button);
				
                            button = temp + " + ";
			}
			
                        else if(operation == '=')
			{
				
                            sDisplay = "";
				
                            operation = '-';
				
                            isPlus = true;
				
                            isOperation = true;
				
                            button += " - ";
				
                            Input.setText(button);
			}
			isOperation = true;
		}
		
                else if (e.getSource() == bMul && (!sDisplay.equals("") || operation == '=')) 
		{
			if(!isOperation)
			{
				
                            number1 = Double.parseDouble(sDisplay);
				
                            sDisplay = "";
				
                            operation = '*';
				
                            isPlus = true;
				
                            button += "*";
				
                            Input.setText(button);
				
                            if(isPoint)
				{
					tfDisplay.setText(""+number1);
				}
				else if(!isPoint)
				{
					tfDisplay.setText(""+(long)number1);
				}
			}
			else if(isOperation && operation != '=')
			{
				
                            number2  = Double.parseDouble(sDisplay);
				
				if(operation == '+')
				{
					result = number1 + number2;
				}
				else if(operation == '-')
				{
					result = number1 - number2;
				}
				else if(operation == '*')
				{
					result = number1 * number2;
				}
				else if(operation == '/')
				{
					result = number1 / number2;
				}
				else if(operation == '%')
				{
					result = number1 % number2;
				}
				else
				{
					result = number2;
				}
				String temp = "";
				if(isPoint || operation == '/')
				{
					tfDisplay.setText(""+result);
					temp = ""+result;
				}
				else if(!isPoint)
				{
					tfDisplay.setText(""+(long)result);
					temp = ""+(long)result;
				}
				operation = '*';
				
                                 sDisplay = "";
				
                                 number1 = result;
				
                                 isPlus = true;
				
                                 isPoint = false;
				
                                 isOperation = true;
				
                                 button += "*";
				
                                 Input.setText(button);
				button = temp + "*";
			}
			else if(operation == '=')
			{
				
                            sDisplay = "";
				
                            operation = '*';
				
                            isPlus = true;
				
                            isOperation = true;
				
                            button += "*";
				
                            Input.setText(button);
			}
			isOperation = true;
		}
		else if (e.getSource() == bDiv && (!sDisplay.equals("") || operation == '=')) 
		{
			if(!isOperation)
			{
				number1 = Double.parseDouble(sDisplay);
				
                                sDisplay = "";
				
                                
                                operation = '/';
				
                                isPlus = true;
				
                                button += " / ";
				
                                Input.setText(button);
				
                                if(isPoint)
				{
					tfDisplay.setText(""+number1);
				}
				else if(!isPoint)
				{
					tfDisplay.setText(""+(long)number1);
				}
			}
			else if(isOperation && operation != '=')
			{
				number2  = Double.parseDouble(sDisplay);
				
				if(operation == '+')
				{
					result = number1 + number2;
				}
				else if(operation == '-')
				{
					result = number1 - number2;
				}
				else if(operation == '*')
				{
					result = number1 * number2;
				}
				else if(operation == '/')
				{
					result = number1 / number2;
				}
				else if(operation == '%')
				{
					result = number1 % number2;
				}
				else
				{
					result = number2;
				}
				String temp = "";
				
                                if(isPoint || operation == '/')
				{
					tfDisplay.setText(""+result);
					
                                        temp = ""+result;
				}
				else if(!isPoint)
				{
					
                                    tfDisplay.setText(""+(long)result);
					
                                    temp = ""+(long)result;
				}
				operation = '*';
				
                                sDisplay = "";
			number1 = result;
			
                        isPlus = true;
			
                        isPoint = false;
			
                        isOperation = true;
			
                        button += " / ";
				Input.setText(button);
				button = temp + " / ";
			}
			else if(operation == '=')
			{
				
                            sDisplay = "";
				
                            operation = '/';
				
                            isPlus = true;
				
                            isOperation = true;
				
                            button += " / ";
				
                            Input.setText(button);
			}
			isOperation = true;
		} 
		else if (e.getSource() == bMod && (!sDisplay.equals("") || operation == '='))
		{
			if(!isOperation)
			{
				
                            number1 = Double.parseDouble(sDisplay);
				
                            sDisplay = "";
				
                            operation = '%';
				
                            isPlus = true;
			button += " mod ";
				
                        Input.setText(button);
			if(isPoint)
				{
					tfDisplay.setText(""+number1);
				}
				else if(!isPoint)
				{
					tfDisplay.setText(""+(long)number1);
				}
			}
			else if(isOperation && operation != '=')
			{
				number2  = Double.parseDouble(sDisplay);
				
				if(operation == '+')
				{
					result = number1 + number2;
				}
				else if(operation == '-')
				{
					result = number1 - number2;
				}
				else if(operation == '*')
				{
					result = number1 * number2;
				}
				else if(operation == '/')
				{
					result = number1 / number2;
				}
				else if(operation == '%')
				{
					result = number1 % number2;
				}
				else
				{
					result = number2;
				}
				String temp = "";
				
                                if(isPoint || operation == '/')
				{
					tfDisplay.setText(""+result);
					temp = ""+result;
				}
				else if(!isPoint)
				{
					tfDisplay.setText(""+(long)result);
					temp = ""+(long)result;
				}
				operation = '%';
				
                                sDisplay = "";
				
                                number1 = result;
				isPlus = true;
				isPoint = false;
				
                                isOperation = true;
				button += " mod ";
				
                                Input.setText(button);
				button = temp + " * ";
			}
			else if(operation == '=')
			{
				
                            sDisplay = "";
				
                            operation = '%';
				
                            isPlus = true;
				
                            isOperation = true;
				
                            button += " mod ";
				
                            Input.setText(button);
			}
			isOperation = true;
		}
		else if (e.getSource() == bEqual && !sDisplay.equals(""))
		{
			number2  = Double.parseDouble(sDisplay);
			
			if(operation == '+')
			{
				result = number1 + number2;
			}
			else if(operation == '-')
			{
				result = number1 - number2;
			}
			else if(operation == '*')
			{
				result = number1 * number2;
			}
			else if(operation == '/')
			{
				result = number1 / number2;
			}
			else if(operation == '%')
			{
				result = number1 % number2;
			}
			else
			{
				result = number2;
			}
			String temp = "";
			
                        if(isPoint || operation == '/')
			{
				tfDisplay.setText(""+result);
				
                                temp = ""+result;
			}
			else if(!isPoint)
			{
				
                            tfDisplay.setText(""+(long)result);
				
                            temp = ""+(long)result;
			}
			sDisplay = "";
			
                        number1 = result;
			
                        isPlus = true;
			
                        isPoint = false;
			
                        isOperation = true;
			
                        button += " = ";
			
                        Input.setText(button);
			
                        button = temp;
			
                        operation = '=';
		} 
		else if (e.getSource() == bDel && !sDisplay.equals(""))
		{
			
                    sDisplay = sDisplay.substring(0, sDisplay.length()-1);
			
                    button = button.substring(0, button.length()-1);
			
                    if(button.equals(""))
			{
				//tfDisplay.setText("0");
				Input.setText("0");
			}
			else 
			{
				//tfDisplay.setText(sDisplay);
				Input.setText(button);
			}
		} 
		else if (e.getSource() == bClear)
		{
			
                    number1 = number2 = result = 0;
			
                    sDisplay = "";
			
                    operation = ' ';
			
                    tfDisplay.setText("0");
			
                    isPoint = false;
			
                    isPlus = true;
			
                    isOperation = false;
			
                    button = "";
			
                    Input.setText("0");
		} 
		else if (e.getSource() == bSquare && !sDisplay.equals(""))
		{
			
                    number1 = Double.parseDouble(sDisplay);
			
                    result = Math.pow(number1, 2);
			
                    String temp = "";
			
                    if(!isPoint)
			{
				
                            tfDisplay.setText(""+(long)result);
				
                            temp = ""+(long)result;
			}
			else 
			{
				tfDisplay.setText(""+result);
				temp = ""+result;
			}
			button += "^2 = ";
			
                        Input.setText(button);
			
                        button = temp;
			
                        sDisplay = "";
			
                        number1 = result;
			
                        operation = '=';
			
                        isPoint = false;
			
                        isOperation = true;
			
                        isPlus = true;
		} 
		else if (e.getSource() == bSqrt && !sDisplay.equals(""))
		{
			number1 = Double.parseDouble(sDisplay);
			
                        result = Math.sqrt(number1);
			
                        button =  "Sqrt" + button;
			
                        Input.setText(button);
			
                        tfDisplay.setText(""+result);
			
                        button = ""+result;
			
                        sDisplay = "";
			
                        number1 = result;
			
                        operation = '=';
			
                        isPoint = true;
			
                        isOperation = true;
			
                        isPlus = true;
		}
		else if (e.getSource() == bCube && !sDisplay.equals("")) 
		{
			number1 = Double.parseDouble(sDisplay);
			
                        result = Math.pow(number1, 3);
			
                        String temp = "";
			
                        if(!isPoint)
			{
				tfDisplay.setText(""+(long)result);
				
                                temp = ""+(long)result;
			}
			else 
			{
				tfDisplay.setText(""+result);
				temp = ""+result;
			}
			button +="^3 = ";
			
                        Input.setText(button);
			
                        button = temp;
			
                        sDisplay = "";
			
                        number1 = result;
			
                        operation = '=';
			
                        isPoint = false;
			
                        isOperation = true;
			
                        isPlus = true;
			
		}
		else if (e.getSource() == bOneByN && !sDisplay.equals(""))
		{
			number1 = Double.parseDouble(sDisplay);
			result = 1 / number1;
			if(isPoint)
			{
				button = "1 / " + number1;
			}
			else 
			{
				button = "1 / " + (long)number1;
			}
			Input.setText(button);
			
                        tfDisplay.setText(""+result);
			
                        sDisplay = "";
			
                        button = ""+result;
			
                        number1 = result;
			
                        operation = '=';
			
                        isPoint = true;
			
                        isOperation = true;
			
                        isPlus = true;
		}
		
		else if(e.getSource() == bSin && !sDisplay.equals(""))
		{
			number1 = Double.parseDouble(sDisplay);
			if(number1 == 30)
			{
				result = Math.sin(Math.toRadians(number1)) + 0.0000000000000001;
			}
			else
			{
				result = Math.sin(Math.toRadians(number1));
			}
			button =  "sin("+button+")";
			
                        Input.setText(button);
			
                        tfDisplay.setText(""+result);
			
                        button = ""+result;
			
                        sDisplay = "";
			
                        number1 = result;
			
                        operation = '=';
			
                        isPoint = true;
			
                        isOperation = true;
			
                        isPlus = true;
		}
		else if(e.getSource() == bCos && !sDisplay.equals(""))
		{
			number1 = Double.parseDouble(sDisplay);
			
                        if(number1 == 60)
			{
				result = Math.cos(Math.toRadians(number1)) - 0.0000000000000001;
			}
			else if (number1 == 90)
			{
				result = 0;
			}
			else 
			{
				result = Math.cos(Math.toRadians(number1));
			}
			button =  "cos("+button+")";
			
                        Input.setText(button);
			
                        tfDisplay.setText(""+result);
			
                        button = ""+result;
			
                        sDisplay = "";
			
                        number1 = result;
			
                        operation = '=';
			
                        isPoint = true;
			
                        isOperation = true;
			
                        isPlus = true;
		}
		else if(e.getSource() == bTan && !sDisplay.equals(""))
		{
			number1 = Double.parseDouble(sDisplay);
			if(number1 == 45)
			{
				
                            result = Math.tan(Math.toRadians(number1)) + 0.0000000000000001;
			}
			else if(number1 == 90)
			{
				result = 0;
				tfDisplay.setText("Invalid");
			}
			else
			{
				result = Math.tan(Math.toRadians(number1));
			}
			button =  "tan("+button+")";
			
                        Input.setText(button);
			if(number1 != 90)
			{
				tfDisplay.setText(""+result);
			}
			
                        button = ""+result;
			
                        sDisplay = "";
			
                        number1 = result;
			
                        operation = '=';
			
                        isPoint = true;
			
                        isOperation = true;
			
                        isPlus = true;
		}
		
		else if(e.getSource() == bAsin && !sDisplay.equals(""))//asin function
		{
			
                    number1 = Double.parseDouble(sDisplay);
			
                    result = Math.asin(Math.toRadians(number1));
			
                    button =  "asin("+button+")";
			
                    Input.setText(button);
			
                    tfDisplay.setText(""+result);
			
                    button = ""+result;
			
                    sDisplay = "";
			
                    number1 = result;
			
                    operation = '=';
			
                    isPoint = true;
			
                    isOperation = true;
			
                    isPlus = true;
		}
		else if(e.getSource() == bAcos && !sDisplay.equals(""))
		{
			
                    number1 = Double.parseDouble(sDisplay);
			
                    result = Math.acos(Math.toRadians(number1));
			
                    button =  "acos("+button+")";
		Input.setText(button);
		
                tfDisplay.setText(""+result);
		
                button = ""+result;
		
                sDisplay = "";
		
                number1 = result;
			
                operation = '=';
			
                isPoint = true;
			
                isOperation = true;
			
                isPlus = true;
		}
		else if(e.getSource() == bAtan && !sDisplay.equals(""))
		{
			
                    number1 = Double.parseDouble(sDisplay);
			
                    result = Math.atan(Math.toRadians(number1));
			
                    button =  "atan("+button+")";
			
                    Input.setText(button);
			
                    tfDisplay.setText(""+result);
			
                    button = ""+result;
			
                    sDisplay = "";
		
                    number1 = result;
		
                    operation = '=';
		
                    isPoint = true;
		
                    isOperation = true;
		
                    isPlus = true;
		}
		else if(e.getSource() == bLog && !sDisplay.equals(""))
		{
			
                    number1 = Double.parseDouble(sDisplay);
			
                    result = Math.log10(number1);
			
                    button =  "log"+button;
			
                    Input.setText(button);
			
                    tfDisplay.setText(""+result);
		button = ""+result;
			
               sDisplay = "";
			
               number1 = result;
			
               operation = '=';
			
               isPoint = true;
			
               isOperation = true;
			
               isPlus = true;
		}
                
		else if(e.getSource() == bLn && !sDisplay.equals(""))
		{
			
                    number1 = Double.parseDouble(sDisplay);
			
                    result = Math.log(number1);
			
                    button =  "ln"+button;
		
                    Input.setText(button);
		
                    tfDisplay.setText(""+result);
		
                    button = ""+result;
		
                    sDisplay = "";
		
                    number1 = result;
		
                    operation = '=';
			
                    isPoint = true;
		
                    isOperation = true;
			
                    isPlus = true;
		}
                
		else if(e.getSource() == bAbs && !sDisplay.equals(""))
		{
			
                    
                    number1 = Double.parseDouble(sDisplay);
                    
                    result = Math.abs(number1);
                    
                    button =  "abs("+button+")";
		
                    Input.setText(button);
		
                    tfDisplay.setText(""+result);
		
                    button = ""+result;
		
                    sDisplay = "";
			
                    number1 = result;
			
                    operation = '=';
			
                    isPoint = true;
			
                    isOperation = true;
			
                    isPlus = true;
		}
		else if(e.getSource() == bPowerOfTen && !sDisplay.equals(""))
		{
			
                    number1 = Double.parseDouble(sDisplay);
			
                    result = Math.pow(10, number1);
			
                    button =  "10^"+button;
			
                    Input.setText(button);
			
                    tfDisplay.setText(""+result);
			
                    button = ""+result;
			
                    sDisplay = "";
		
                    number1 = result;
		
                    operation = '=';
		
                    isPoint = true;
		
                    isOperation = true;
		
                    isPlus = true;
		}
		else if(e.getSource() == bExit)
		{
			System.exit(0);
		}
                else if(e.getSource()==bMatrixOperation)
                {
               
                    Matrix_Calculation mc = new Matrix_Calculation ();
              
                    mc.setVisible(true);
               
                    mc.setResizable(false);
                }
               
	}
}
    
    
   
     class Main{
    
    public static void main(String []args)
    {
       Scientific_Calculator sc = new Scientific_Calculator();
       sc.setVisible(true);
       sc.setResizable(false);
       
    }

    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

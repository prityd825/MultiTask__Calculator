/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spl;

/**
 *
 * @author HP
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//import static jdk.internal.org.jline.utils.Log.debug;

public class Matrix_Calculation extends JFrame {
    
    
     private Container c;
    
     private JButton bCal,bclear;
    
     
     
     
        private String matrixOp[]={"Multiplication","Addition","Substraction","Transpose"};
        private JButton ShowMatResult, bClear;
        private JLabel lMatrix,lrow,lcol,lInte,lDif,lMatrixResults,MatrixA,MatrixB;
        private JComboBox MatrixOp;
       // private String[] matrixOp={"Multiplication","Addition","Substraction"};	
	private JTextArea MatrixResult,MatrixInput_A,MatrixInput_B,trow,tcol ; 
        private boolean debug;
     
     
    
     
     Matrix_Calculation()
    {
        
        
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setBounds(100,200,460,550);
       this.setTitle("");
       
       
       
       c= this.getContentPane();
       c.setLayout(null);
       c.setBackground(Color.black);
       
       
       
      /* icon = new ImageIcon(getClass().getResource("NC.png"));
       this.setIconImage(icon.getImage()); */
            
            lMatrix = new JLabel("Matrix operation");
            lMatrix.setBounds(100,0,300,50);
            lMatrix.setForeground(Color.white);
            c.add(lMatrix);
       
       
            MatrixA = new JLabel("Matrix A : ");
            MatrixA.setBounds(100,35,300,50);
            MatrixA.setForeground(Color.white);
            c.add(MatrixA);
            
            
            MatrixB = new JLabel("Matrix B : ");
            MatrixB.setBounds(100,160,300,50);
            MatrixB.setForeground(Color.white);
            c.add(MatrixB);
            
            
            
            MatrixOp = new JComboBox(matrixOp);
	    MatrixOp.setBounds(220,15,130,20);
	    c.add(MatrixOp);
            
            MatrixInput_A = new JTextArea("");
            MatrixInput_A.setBounds(100,80,250,80);
	    //MatrixInput_A.setHorizontalAlignment(JTextField.LEFT);
	    MatrixInput_A.setEditable(true);
	    MatrixInput_A.setBackground(Color.white);
	    MatrixInput_A.setForeground(Color.black);
            c.add(MatrixInput_A);
            
            
            MatrixInput_B = new JTextArea("");
            MatrixInput_B.setBounds(100,200,250,80);
	    //MatrixInput_B.setHorizontalAlignment(JTextField.LEFT);
	    MatrixInput_B.setEditable(true);
	    MatrixInput_B.setBackground(Color.white);
	    MatrixInput_B.setForeground(Color.black);
            c.add(MatrixInput_B);
            
            
            lMatrixResults = new JLabel("Result : ");
            lMatrixResults.setBounds(100,277,300,50);
            lMatrixResults.setForeground(Color.white);
            c.add(lMatrixResults);
            
               
            ShowMatResult = new JButton("Show Result");
            ShowMatResult.setBounds(100,440,120,22);
            ShowMatResult.setBackground(Color.white);	
            ShowMatResult.setFocusable(false);
            c.add(ShowMatResult);
            
            
            
            
            MatrixResult = new JTextArea("");
            MatrixResult.setBounds(100,330,250,90);
	    //MatrixResult.setHorizontalAlignment(JTextField.LEFT);
	    MatrixResult.setEditable(false);
	    MatrixResult.setBackground(Color.white);
	    MatrixResult.setForeground(Color.black);
            c.add(MatrixResult);
            
            
            bClear = new JButton("Clear");
            bClear.setBounds(230,440,120,22);
            bClear.setBackground(Color.white);	
            bClear.setFocusable(false);
            c.add(bClear);
       
       
       
     
       
       
       ShowMatResult.addActionListener(new ActionListener(){
            @Override
            
            
             public void actionPerformed(ActionEvent e){
             
                 if(MatrixOp.getSelectedIndex()==0)
                 {
                     try{
                         DisplayMatrix(MultiplyMatrix(ReadInMatrix(MatrixInput_A),ReadInMatrix(MatrixInput_B)),MatrixResult);
                     }
                     catch(Exception E)
                     {
                         System.out.println("Error: "+E);
                     }
                 } else if(MatrixOp.getSelectedIndex()==1)
                 {
                     try{
                         DisplayMatrix(AddMatrix(ReadInMatrix(MatrixInput_A),ReadInMatrix(MatrixInput_B)),MatrixResult);
                     }
                     catch(Exception E)
                     {
                         System.out.println("Error: "+E);
                     }
                 }
                 else if(MatrixOp.getSelectedIndex()==2)
                 {
                     try{
                         DisplayMatrix(SubtractMatrix(ReadInMatrix(MatrixInput_A),ReadInMatrix(MatrixInput_B)),MatrixResult);
                     }
                     catch(Exception E)
                     {
                         System.out.println("Error: "+E);
                     }
                 }
                 else if(MatrixOp.getSelectedIndex()==3)
                 {
                     try{
                         DisplayMatrix(TransposeMatrix(ReadInMatrix(MatrixInput_A)),MatrixResult);
                     }
                     catch(Exception E)
                     {
                         System.out.println("Error: "+E);
                     }
                 }
                 
                
                 }

        });  
       
       
       
       
       bClear.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e){
             //{
                 //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                 //}
               // dispose();
                MatrixInput_A.setText("");
                MatrixInput_B.setText("");
                MatrixResult.setText("");
              
                 }     
     });
       
       }
     
     
     
    
     
     
        public float[][] ReadInMatrix(JTextArea ta) throws Exception {
                
            String rawtext = ta.getText();
            String value = "";
            int i = 0;
            int j = 0;
            int max = 10000;
            int[] rowSize = new int[max];

                StringTokenizer ts = new StringTokenizer(rawtext, "\n");
                    
                while (ts.hasMoreTokens()) {
                StringTokenizer ts2 = new StringTokenizer(ts.nextToken());
                     
                while (ts2.hasMoreTokens()) {
                    ts2.nextToken();
                        j++;
                            
                }
                    rowSize[i] = j;
                        
                    i++;
                        
                    j = 0;
            }
                
                //ta.setText("Matrix Size: " +i+"x"+rowSize[0]);
                           
                    int row = i;
                    int col = rowSize[0];
                    float matrix[][] = new float[row][col];
                    i = j = 0;
                    value = "";

                StringTokenizer st = new StringTokenizer(rawtext, "\n");
                
                   
                while (st.hasMoreTokens()) {
                StringTokenizer st2 = new StringTokenizer(st.nextToken());
                    
                while (st2.hasMoreTokens()) {
                     
                    value = st2.nextToken();
                               
                     try {
                                 
                         matrix[i][j] = Float.valueOf(value).floatValue();
                                  
                     } catch (Exception exception) {
                                
                         ta.setText("Invalid Number Format");
                                 
                     }
                                    
                     j++;
                                  
                    }
                                 
                    i++;
                                 
                    j = 0;
                                  
                   }

                return matrix;
                                 }



             
        public void DisplayMatrix(float[][] matrix, JTextArea ta) {

                       
            String resultString ="";
                       
            String subResult = "";

                   
            for (int i = 0; i < matrix.length; i++) {
                      
                for (int j = 0; j < matrix[i].length; j++) {
                   
                    subResult = String.valueOf(matrix[i][j]);
                   
                    resultString = resultString.concat(subResult + "  ");
                     
                }

                       
                resultString = resultString.concat("\n");
                       
                      
            }
                   
            ta.setText(resultString);
                           
        }



     
          
        public float[][] AddMatrix(float[][] a, float[][] b) throws Exception {
                
            int row_a = a.length;
                
            int col_a = a[0].length;
                
            int row_b = b.length;
                
            int col_b = b[0].length;
                if (row_a != row_b || col_a!=col_b) {
                     
                    MatrixResult.setText("Matrix Size Mismatch");
                           
                }

                        
                float matrix[][] = new float[row_a][col_a];

                      for (int i = 0; i < row_a; i++)
                            for (int j = 0; j < col_a; j++) {
                                matrix[i][j] = a[i][j] + b[i][j];
                                     }

                                return matrix;
                                     }



            
        public float[][] SubtractMatrix(float[][] a, float[][] b) throws Exception {
                          
            int row_a = a.length;
                              
            int col_a = a[0].length;
                                
            int row_b = b.length;
                                    
            int col_b = b[0].length;
                              
            if (row_a != row_b || col_a!=col_b) {
                                  
                MatrixResult.setText("Matrix Size Mismatch");
                                      
            }

                                
            float matrix[][] = new float[row_a][col_a];

                for (int i = 0; i < row_a; i++)
                              
                    for (int j = 0; j < col_a; j++) {
                           
                        matrix[i][j] = a[i][j] - b[i][j];
                           }

                           return matrix;
                             }
 
 
            
           
        public float[][] MultiplyMatrix(float[][] a, float[][] b) throws Exception {

                          
            if(a[0].length != b.length)
                          
                throw new Exception("Matrices incompatible for multiplication");
                           //MatrixResult.setText("Matrices incompatible for multiplication");
                          
                           
                           float matrix[][] = new float[a.length][b[0].length];

                                  
                           for (int i = 0; i < a.length; i++)
                                     
                               for (int j = 0; j < b[i].length; j++)
                                         
                                   matrix[i][j] = 0;

                                  
                           for(int i = 0; i < a.length; i++){
                                     
                               for(int j = 0; j < b[i].length; j++){
                            
                                   for(int k = 0; k < b.length;k++){
                                
                                       matrix[i][j] += a[i][k]*b[k][j];
                            }
                             }
                         }
                    return matrix;
                         }
        
        
        
        public float[][] TransposeMatrix(float[][] a) throws Exception {
                          
            int row_a = a.length;
                              
            int col_a = a[0].length;
            
            float matrix1[][] = new float[row_a][col_a];
            
            float matrix2[][] = new float[col_a][row_a];
            if(row_a==col_a){                    
           // float matrix1[][] = new float[row_a][col_a];
               
                for (int i = 0; i < row_a; i++)
                              
                    for (int j = 0; j < col_a; j++) {
                           
                        matrix1[i][j] = a[j][i];
                           }

                           return matrix1;
                             }
            else
            {
                //float matrix2[][] = new float[col_a][row_a];
                for(int i=0; i< row_a; i++)
                {
                    for(int j=0; j< col_a; j++)
                    {
                        matrix2[j][i] = a[i][j];
                    }
                    return matrix2;
                }
            }
            
         //return null;
         if(row_a==col_a)
             return matrix1;
             
         else
             return matrix2;
        }
  
     
     
       
    public static void main(String []args)
    {
      Matrix_Calculation mc = new Matrix_Calculation ();
       mc.setVisible(true);
       mc.setResizable(false);
       
    }
    
}
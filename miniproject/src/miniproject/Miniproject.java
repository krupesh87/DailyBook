/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static java.lang.Class.forName;
import java.sql.*;
import javax.swing.JFrame;


public class Miniproject {
    Miniproject()
            {
                Home re= new Home();
                re.setVisible(true);
                re.pack();
                re.setLocationRelativeTo(null);
                re.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
            }
     public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
       
    }
    
}
 

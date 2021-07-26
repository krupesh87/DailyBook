
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Statistics extends javax.swing.JFrame {

   
     
    public Statistics() {
        initComponents();
        this.setLocationRelativeTo(null);
         try{
            String url="jdbc:mysql://localhost:3306/javaproject";
            String user="root";
            String pass="Ankit@0409";
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection(url,user,pass);
            Statement stmt=conn.createStatement();
            ResultSet R = stmt.executeQuery("select * from addtransaction");
            
            
            String Date1 = "";
            
            
            
                int AvgExp = 0;
                int AvgInc = 0;
                int countExp =0;
                int countInc =0;
                char expOrInc = 'N';
                int amount = 0;
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                Date date = new Date();
                
            
            while(R.next())
            {
                Date1 = R.getString("Date");
                if(Date1.equals(formatter.format(date).toString())){
              
                expOrInc = R.getString("ExpOrInc").charAt(0);
                amount = R.getInt("Amount");
                
                if(expOrInc == 'E')
                {
                    countExp++;
                    AvgExp = (AvgExp + amount)/countExp;
                }
                else if(expOrInc == 'I')
                {   
                    countInc++;
                    AvgInc = (AvgInc + amount)/countInc;
                }
                }
                
            }
            
            DailyEx.setText(String.valueOf(AvgExp));
            DailyIn.setText(String.valueOf(AvgInc));
            AvgExp = 0;
            AvgInc = 0;
            countExp =0;
            countInc =0;
            ResultSet DM = stmt.executeQuery("select * from addtransaction where Date like('__-12-2020')");
            while(DM.next())
            {
              
                expOrInc = DM.getString("ExpOrInc").charAt(0);
                amount = DM.getInt("Amount");
                
                if(expOrInc == 'E')
                {
                    countExp++;
                    AvgExp = (AvgExp + amount)/countExp;
                }
                else if(expOrInc == 'I')
                {   
                    countInc++;
                    AvgInc = (AvgInc + amount)/countInc;
                }
                
                
            }
            
            MonthlyEx.setText(String.valueOf(AvgExp));
            MonthlyIn.setText(String.valueOf(AvgInc));
            AvgExp = 0;
            AvgInc = 0;
            countExp =0;
            countInc =0;
            ResultSet DY = stmt.executeQuery("select * from addtransaction where Date like('__-__-2020')");
             while(DY.next())
            {
              
                expOrInc = DY.getString("ExpOrInc").charAt(0);
                amount = DY.getInt("Amount");
                
                if(expOrInc == 'E')
                {
                    countExp++;
                    AvgExp = (AvgExp + amount)/countExp;
                }
                else if(expOrInc == 'I')
                {   
                    countInc++;
                    AvgInc = (AvgInc + amount)/countInc;
                }
                
                
            }
            
            AnnualEx.setText(String.valueOf(AvgExp));
            AnnualIn.setText(String.valueOf(AvgInc));
            
         }
            catch(Exception ex)
{
    System.out.println("Something Went wrong, Error : " + ex);
}
       
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        Stats = new javax.swing.JLabel();
        Me = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Expenses = new javax.swing.JLabel();
        Income = new javax.swing.JLabel();
        Daily = new javax.swing.JLabel();
        Monthly = new javax.swing.JLabel();
        Annual = new javax.swing.JLabel();
        DailyIn = new javax.swing.JLabel();
        MonthlyEx = new javax.swing.JLabel();
        MonthlyIn = new javax.swing.JLabel();
        AnnualEx = new javax.swing.JLabel();
        AnnualIn = new javax.swing.JLabel();
        DailyEx = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 32768));

        Title.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Title.setText("Daily book");

        Home.setBackground(new java.awt.Color(255, 255, 255));
        Home.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Home.setText("        Home");
        Home.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Home.setOpaque(true);
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeMouseExited(evt);
            }
        });

        Stats.setBackground(new java.awt.Color(255, 51, 0));
        Stats.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Stats.setText("        Stats");
        Stats.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Stats.setOpaque(true);
        Stats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StatsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StatsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StatsMouseExited(evt);
            }
        });

        Me.setBackground(new java.awt.Color(255, 255, 255));
        Me.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Me.setText("           Me");
        Me.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Me.setOpaque(true);
        Me.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MeMouseExited(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Expenses.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Expenses.setText("Expenses");

        Income.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Income.setText("Income");

        Daily.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Daily.setText("Daily");

        Monthly.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Monthly.setText("Monthly");

        Annual.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Annual.setText("Annual");

        DailyIn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DailyIn.setText("0");

        MonthlyEx.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        MonthlyEx.setText("0");

        MonthlyIn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        MonthlyIn.setText("0");

        AnnualEx.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AnnualEx.setText("0");

        AnnualIn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AnnualIn.setText("0");

        DailyEx.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DailyEx.setText("0");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Average Statistics");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Daily, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Monthly, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(Annual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MonthlyEx, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DailyEx, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AnnualEx, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Expenses, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(DailyIn, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                .addComponent(MonthlyIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AnnualIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Income, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Expenses, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Income, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Daily, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DailyEx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DailyIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(MonthlyEx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Monthly, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MonthlyIn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Annual, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnnualEx, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnnualIn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Stats, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Me, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Me, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(Stats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered
       Home.setCursor(new Cursor(Cursor.HAND_CURSOR));
       Home.setBackground(Color.pink);
    }//GEN-LAST:event_HomeMouseEntered

    private void StatsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatsMouseEntered
        Stats.setCursor(new Cursor(Cursor.HAND_CURSOR));

    }//GEN-LAST:event_StatsMouseEntered

    private void MeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MeMouseEntered
             Me.setCursor(new Cursor(Cursor.HAND_CURSOR));
             Me.setBackground(Color.pink);
            
    }//GEN-LAST:event_MeMouseEntered

    private void StatsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatsMouseExited
      
    }//GEN-LAST:event_StatsMouseExited

    private void MeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MeMouseExited
        Me.setBackground(Color.white);
        
    }//GEN-LAST:event_MeMouseExited

    private void StatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatsMouseClicked
           
    }//GEN-LAST:event_StatsMouseClicked

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
     Home.setBackground(Color.white);
    }//GEN-LAST:event_HomeMouseExited

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
Home re= new Home();
                re.setVisible(true);
                re.pack();
                re.setLocationRelativeTo(null);
                re.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
    }//GEN-LAST:event_HomeMouseClicked

    private void MeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MeMouseClicked
 try{
            int p =0;
            String url="jdbc:mysql://localhost:3306/javaproject";
            String user="root";
            String pass="Ankit@0409";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection(url,user,pass);
            Statement stmt=conn.createStatement();
            ResultSet Rs = stmt.executeQuery("select * from active");
        while(Rs.next()){
             p = Rs.getInt("LoginStatus");
        }
        if(p==1){
        MeWelcome re= new MeWelcome();
        re.setVisible(true);
        re.pack();
        re.setLocationRelativeTo(null);
        re.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        }
        else
        {
            MeSignIn re= new MeSignIn();
        re.setVisible(true);
        re.pack();
        re.setLocationRelativeTo(null);
        re.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        }
        conn.close();
        }
              catch(Exception ex)
{
    System.out.println("Went wrong" + ex);
}
    }//GEN-LAST:event_MeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Statistics().setVisible(true);
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Annual;
    public javax.swing.JLabel AnnualEx;
    public javax.swing.JLabel AnnualIn;
    private javax.swing.JLabel Daily;
    public javax.swing.JLabel DailyEx;
    public javax.swing.JLabel DailyIn;
    private javax.swing.JLabel Expenses;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Income;
    private javax.swing.JLabel Me;
    private javax.swing.JLabel Monthly;
    public javax.swing.JLabel MonthlyEx;
    public javax.swing.JLabel MonthlyIn;
    private javax.swing.JLabel Stats;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}


import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;

public class AddTransaction extends javax.swing.JFrame {
    public AddTransaction() {
        initComponents();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        DateText.setText(formatter.format(date));
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Amount = new javax.swing.JLabel();
        AmountText = new javax.swing.JTextField();
        Details = new javax.swing.JLabel();
        ExpenseRadio = new javax.swing.JRadioButton();
        IncomeRadio = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        Done = new javax.swing.JButton();
        Category = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        DetailsText = new javax.swing.JTextArea();
        DateText = new javax.swing.JTextField();
        Details1 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 255, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Add Transcation");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Amount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Amount.setText("Amount");

        AmountText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        Details.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Details.setText("Details");

        ExpenseRadio.setBackground(new java.awt.Color(255, 255, 255));
        ExpenseRadio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ExpenseRadio.setText("Expense");
        ExpenseRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExpenseRadioMouseClicked(evt);
            }
        });
        ExpenseRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpenseRadioActionPerformed(evt);
            }
        });

        IncomeRadio.setBackground(new java.awt.Color(255, 255, 255));
        IncomeRadio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        IncomeRadio.setText("Income");
        IncomeRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IncomeRadioMouseClicked(evt);
            }
        });
        IncomeRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncomeRadioActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Done.setBackground(new java.awt.Color(0, 255, 0));
        Done.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Done.setText("Done");
        Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneActionPerformed(evt);
            }
        });

        Category.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Category" }));

        DetailsText.setColumns(20);
        DetailsText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailsText.setRows(5);
        jScrollPane1.setViewportView(DetailsText);

        DateText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        Details1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Details1.setText("Date");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(Details1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(DateText, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Details, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(128, 128, 128)
                                            .addComponent(Done)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AmountText, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(IncomeRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(ExpenseRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IncomeRadio, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(ExpenseRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AmountText)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Details1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Details, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Done)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(26, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IncomeRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncomeRadioActionPerformed
          if(IncomeRadio.isSelected())
         {
             ExpenseRadio.setSelected(false);
         }
          AmountText.setText("+");
          AmountText.setFont(new Font("Arial",Font.BOLD,20));
    }//GEN-LAST:event_IncomeRadioActionPerformed

    private void ExpenseRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpenseRadioActionPerformed
         if(ExpenseRadio.isSelected())
         {
             IncomeRadio.setSelected(false);
         }
         AmountText.setText("-");
         AmountText.setFont(new Font("Arial",Font.BOLD,20));
    
    }//GEN-LAST:event_ExpenseRadioActionPerformed

    private void DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneActionPerformed
        String url="jdbc:mysql://localhost:3306/javaproject";
        String user="root";
        String pass="Ankit@0409";
        String amount = (AmountText.getText().replace("+", "")).replace("-","");
        String category = Category.getSelectedItem().toString();
        String details = DetailsText.getText();
        String Date1 = DateText.getText();
        int count = 0;
        char expOrInc = 'N';
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection(url,user,pass);
            Statement stmt=conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from addtransaction");
            while(rs.next())
                    count = rs.getInt("count");
             if(ExpenseRadio.isSelected())
                expOrInc = 'E';
            else if(IncomeRadio.isSelected())
                expOrInc = 'I';
            
            
           
             
            if(!amount.equals("")&&!category.equals("Category")&&!details.equals(""))
            {   
                count++;
                stmt.executeUpdate("insert AddTransaction values ('" + expOrInc + "','" +Integer.parseInt(amount) + "','" + category + "','"  + details + "','" + count++ +"','" + Date1 +  "')");
                
                Home re= new Home();
                re.setVisible(true);
                re.pack();
                re.setLocationRelativeTo(null);
                re.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
            }
            else if(expOrInc == 'N')
                JOptionPane.showMessageDialog(this,"Select Expense or Income!","Message",JOptionPane.OK_OPTION);
            
            else if(amount.equals(""))
                JOptionPane.showMessageDialog(this,"Please Enter Amount!","Message",JOptionPane.OK_OPTION);
            
            else if(category.equals("Category"))
                JOptionPane.showMessageDialog(this,"Please Select Category!","Message",JOptionPane.OK_OPTION);
            
            
             else if(details.equals(""))
                 JOptionPane.showMessageDialog(this,"Please Enter Details!","Message",JOptionPane.OK_OPTION);
            
            
                 
        }catch (Exception ex)
        {
            System.out.println("Something went Wrong" + ex);   
        }
    }//GEN-LAST:event_DoneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Home re= new Home();
                re.setVisible(true);
                re.pack();
                re.setLocationRelativeTo(null);
                re.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ExpenseRadioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExpenseRadioMouseClicked
       Category.removeAllItems();
       Category.addItem("Category");
       Category.addItem("Food");
       Category.addItem("Shopping");
       Category.addItem("Medical");
       Category.addItem("Entertainment");
       Category.addItem("Daily use");
       Category.addItem("Vegetables");
       Category.addItem("Electricity");
       Category.addItem("Rent");
       Category.addItem("Elders");
       Category.addItem("Books");
       Category.addItem("Travel");
       Category.addItem("Wine");
    }//GEN-LAST:event_ExpenseRadioMouseClicked

    private void IncomeRadioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IncomeRadioMouseClicked
       Category.removeAllItems();
       Category.addItem("Category");
       Category.addItem("Salary");
       Category.addItem("Interest");
       Category.addItem("Investment");
       Category.addItem("Bonus");
       Category.addItem("Part-TimeJob");
       Category.addItem("Red Envolope");
    }//GEN-LAST:event_IncomeRadioMouseClicked

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
            java.util.logging.Logger.getLogger(AddTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTransaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amount;
    private javax.swing.JTextField AmountText;
    private javax.swing.JComboBox<String> Category;
    private javax.swing.JTextField DateText;
    private javax.swing.JLabel Details;
    private javax.swing.JLabel Details1;
    private javax.swing.JTextArea DetailsText;
    private javax.swing.JButton Done;
    private javax.swing.JRadioButton ExpenseRadio;
    private javax.swing.JRadioButton IncomeRadio;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

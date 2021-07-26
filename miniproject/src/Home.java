
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

   
     
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
        try{
            String url="jdbc:mysql://localhost:3306/javaproject";
            String user="root";
            String pass="Ankit@0409";
            String category = "";
            int amount =0;
            char S = 'w';

            int Total =0;
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection(url,user,pass);
            Statement stmt=conn.createStatement();
            ResultSet R = stmt.executeQuery("select * from addtransaction");
            if(R.next()){
            category = R.getString("Category");
            amount = R.getInt("Amount");
            S = R.getString("ExpOrInc").charAt(0);
            Cat1.setText(category);
            
            if(S == 'E'){
            Amt1.setText("-" + String.valueOf(amount));
            Total -= amount;
            ExpOrInc1.setText("Expense");
            }
            else
            {
                ExpOrInc1.setText("Income");
                Amt1.setText("+" + String.valueOf(amount));
                Total+= amount;
            }
            }
            if(R.next()){
            category = R.getString("Category");
            amount = R.getInt("Amount");
            S = R.getString("ExpOrInc").charAt(0);
            Cat2.setText(category);
            if(S == 'E'){
            Amt2.setText("-" + String.valueOf(amount));
            ExpOrInc2.setText("Expense");
            Total -= amount;
            }
            else
            {
                ExpOrInc2.setText("Income");
                Amt2.setText("+" + String.valueOf(amount));
                Total+= amount;
            }
            }
            if(R.next()){
            category = R.getString("Category");
            amount = R.getInt("Amount");
            S = R.getString("ExpOrInc").charAt(0);
            Cat3.setText(category);
            if(S == 'E'){
            Amt3.setText("-" + String.valueOf(amount));
            ExpOrInc3.setText("Expense");
            Total -= amount;
            }
            else
            {
                ExpOrInc3.setText("Income");
                Amt3.setText("+" + String.valueOf(amount));
                Total+= amount;
            }
            }
            if(R.next()){
            category = R.getString("Category");
            amount = R.getInt("Amount");
            S = R.getString("ExpOrInc").charAt(0);
            Cat4.setText(category);
            if(S == 'E'){
            Amt4.setText("-" + String.valueOf(amount));
            ExpOrInc4.setText("Expense");
            Total -= amount;    
            }
            else
            {
                ExpOrInc4.setText("Income");
                Amt4.setText("+" + String.valueOf(amount));
                Total+= amount;
            }
            }
            Total1.setText(String.valueOf(Total));
}
            catch(Exception ex)
{
    System.out.println("Went wrong" + ex);
}
       
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Add = new javax.swing.JButton();
        AddHere = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Cat1 = new javax.swing.JLabel();
        Amt1 = new javax.swing.JLabel();
        ExpOrInc1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Cat2 = new javax.swing.JLabel();
        Amt2 = new javax.swing.JLabel();
        ExpOrInc2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Cat3 = new javax.swing.JLabel();
        Amt3 = new javax.swing.JLabel();
        ExpOrInc3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        Cat4 = new javax.swing.JLabel();
        Amt4 = new javax.swing.JLabel();
        ExpOrInc4 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        Total1 = new javax.swing.JLabel();
        DeleteAll = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        Stats = new javax.swing.JLabel();
        Me = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 32768));

        Title.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Title.setText("Daily book");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Add.setBackground(new java.awt.Color(0, 255, 0));
        Add.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Add.setText("+");
        Add.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddMouseEntered(evt);
            }
        });
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        AddHere.setBackground(new java.awt.Color(255, 255, 255));
        AddHere.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AddHere.setOpaque(true);
        AddHere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddHereMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddHereMouseEntered(evt);
            }
        });

        Cat1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Amt1.setBackground(new java.awt.Color(255, 204, 102));
        Amt1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExpOrInc1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cat1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addComponent(Amt1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Cat1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExpOrInc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Amt1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 23, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("All Transactions");

        Cat2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Amt2.setBackground(new java.awt.Color(255, 153, 153));
        Amt2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(ExpOrInc2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Cat2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Amt2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cat2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Amt2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExpOrInc2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        Cat3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Amt3.setBackground(new java.awt.Color(102, 255, 0));
        Amt3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExpOrInc3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cat3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Amt3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addComponent(Amt3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addComponent(Cat3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExpOrInc3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Cat4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Amt4.setBackground(new java.awt.Color(0, 255, 51));
        Amt4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExpOrInc4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cat4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Amt4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(Amt4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(Cat4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExpOrInc4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        total.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        total.setText("Total :");

        Total1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        DeleteAll.setBackground(new java.awt.Color(255, 255, 255));
        DeleteAll.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DeleteAll.setText("   Delete All");
        DeleteAll.setOpaque(true);
        DeleteAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteAllMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteAllMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteAllMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DeleteAll, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Total1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(151, 151, 151)
                    .addComponent(AddHere)
                    .addContainerGap(470, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DeleteAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Total1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(182, 182, 182)
                    .addComponent(AddHere, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(297, Short.MAX_VALUE)))
        );

        Home.setBackground(new java.awt.Color(255, 51, 0));
        Home.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Home.setText("        Home");
        Home.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Home.setOpaque(true);
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeMouseEntered(evt);
            }
        });

        Stats.setBackground(new java.awt.Color(255, 255, 255));
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
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Stats, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Me, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Me, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Stats, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered
       Home.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_HomeMouseEntered

    private void StatsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatsMouseEntered
        Stats.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Stats.setBackground(Color.pink);
    }//GEN-LAST:event_StatsMouseEntered

    private void MeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MeMouseEntered
             Me.setCursor(new Cursor(Cursor.HAND_CURSOR));
             Me.setBackground(Color.pink);
            
    }//GEN-LAST:event_MeMouseEntered

    private void StatsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatsMouseExited
       Stats.setBackground(Color.white);
    }//GEN-LAST:event_StatsMouseExited

    private void MeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MeMouseExited
        Me.setBackground(Color.white);
        
    }//GEN-LAST:event_MeMouseExited

    private void StatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatsMouseClicked
            Statistics St= new Statistics();
            St.setVisible(true);
            St.pack();
            St.setLocationRelativeTo(null);
            St.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
    }//GEN-LAST:event_StatsMouseClicked

    private void AddHereMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddHereMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddHereMouseEntered

    private void AddHereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddHereMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AddHereMouseClicked

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
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
        if(p!=1){
        loginform re= new loginform();
        re.setVisible(true);
        re.pack();
        re.setLocationRelativeTo(null);
        re.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        }
        else
        {
            AddTransaction re= new AddTransaction();
        re.setVisible(true);
        re.pack();
        re.setLocationRelativeTo(null);
        re.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        }
        }
              catch(Exception ex)
{
    System.out.println("Went wrong" + ex);
}
        
    }//GEN-LAST:event_AddActionPerformed

    private void AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseEntered
        Add.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_AddMouseEntered

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

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AddMouseClicked

    private void DeleteAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteAllMouseClicked
     try{
            int p =0;
            String url="jdbc:mysql://localhost:3306/javaproject";
            String user="root";
            String pass="Ankit@0409";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection(url,user,pass);
            Statement stmt=conn.createStatement();
            stmt.executeUpdate("truncate addtransaction");
            conn.close();
              Home re= new Home();
        re.setVisible(true);
        re.pack();
        re.setLocationRelativeTo(null);
        re.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
            
     }
           catch(Exception ex)
{
    System.out.println("Went wrong" + ex);
}
    }//GEN-LAST:event_DeleteAllMouseClicked

    private void DeleteAllMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteAllMouseEntered
       DeleteAll.setCursor(new Cursor(Cursor.HAND_CURSOR));
        DeleteAll.setBackground(Color.pink);
    }//GEN-LAST:event_DeleteAllMouseEntered

    private void DeleteAllMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteAllMouseExited
       DeleteAll.setBackground(Color.white);
    }//GEN-LAST:event_DeleteAllMouseExited

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    public javax.swing.JLabel AddHere;
    private javax.swing.JLabel Amt1;
    private javax.swing.JLabel Amt2;
    private javax.swing.JLabel Amt3;
    private javax.swing.JLabel Amt4;
    private javax.swing.JLabel Cat1;
    private javax.swing.JLabel Cat2;
    private javax.swing.JLabel Cat3;
    private javax.swing.JLabel Cat4;
    private javax.swing.JLabel DeleteAll;
    private javax.swing.JLabel ExpOrInc1;
    private javax.swing.JLabel ExpOrInc2;
    private javax.swing.JLabel ExpOrInc3;
    private javax.swing.JLabel ExpOrInc4;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Me;
    private javax.swing.JLabel Stats;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Total1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * employee.java
 *
 * Created on Jul 28, 2016, 10:32:29 AM
 */

/**
 *
 * @author PC
 */
public class employee extends javax.swing.JFrame {

    /** Creates new form employee */
    public employee() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));
        jPanel1.setForeground(new java.awt.Color(0, 51, 204));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 26));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EMPLOYEE");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 18));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee Code");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 3, 18));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Employee Name");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 18));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Designation");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 3, 18));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Salary");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 3, 18));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date Of Joining");

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 3, 20));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SAVE");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 3, 20));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SEARCH");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 3, 20));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("DELETE");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 3, 20));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("CLEAR");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Comic Sans MS", 3, 20));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("EXIT");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                        .addContainerGap(259, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton4)
                .addGap(38, 38, 38)
                .addComponent(jButton5)
                .addContainerGap(384, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(270, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         // TODO add your handling code here:
          String code=jTextField1.getText();
        if (code.isEmpty())
        {
            jTextField2.setText(" ");
            jTextField3.setText(" ");
            jTextField4.setText(" ");
            jTextField5.setText(" ");
            JOptionPane.showMessageDialog(null,"Enter the employee code");
        }
        else
        {
            try
            {
                Class.forName("java.sql.DriverManager");
                Connection con = (Connection)
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/retail","root","1980");
                Statement stmt = (Statement) con.createStatement();
                String query="SELECT EMP_NAME,DESIGNATION,SALARY,  DATE_OF_JOIN FROM EM WHERE EMP_CODE='"+code+"';";
                ResultSet rs=stmt.executeQuery(query);
                if (rs.next())
                {
                    String name=rs.getString("emp_name");
                    String designation=rs.getString("designation");
                    String sal=rs.getString("salary");
                    String doj=rs.getString("date_of_join");

                    jTextField2.setText(name);
                    jTextField3.setText(designation);
                    jTextField4.setText(sal);
                    jTextField5.setText(doj);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry! No such employee");
                }
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         // TODO add your handling code here:
         String code=jTextField1.getText();
        String name=jTextField2.getText();
        String designation=jTextField3.getText();
        String sal=jTextField4.getText();
        String doj=jTextField5.getText();
        if (code.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Code not entered");
            jTextField1.requestFocus();
        }
        else if(name.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Name not entered");
            jTextField2.requestFocus();
        }
        else if (designation.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Cost not entered");
            jTextField3.requestFocus();
        }
        else if (sal.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Quantity not entered");
            jTextField4.requestFocus();
        }
        else if (doj.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"date of  joining not eneterd.");
            jTextField5.requestFocus();

        }
        else
        {
            try
            {
                Class.forName("java.sql.DriverManager");
                Connection con = (Connection)
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/retail","root","1980");
                Statement stmt = (Statement) con.createStatement();
                int confirm=JOptionPane.showConfirmDialog(null,"Are you sure you want to add the record?",
                        "Confirmation Dialog Box",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
                if (confirm==JOptionPane.YES_OPTION)
                {
                    String query="INSERT INTO EM VALUES('"+code+"','"+name+"','"+designation+"','"+sal+"','"+doj+"' );";
                    int rowseffected=stmt.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Record added");
                }
                con.close();
                stmt.close();
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        String code=jTextField1.getText();
        String name=jTextField2.getText();
        String designation=jTextField3.getText();
        String sal=jTextField4.getText();
        String doj=jTextField5.getText();
        if (code.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Code not entered");
            jTextField1.requestFocus();
        }
        else if(name.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Name not entered");
            jTextField2.requestFocus();
        }
        else if (designation.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Designation  not entered");
            jTextField3.requestFocus();
        }
        else if (sal.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Salary not entered");
            jTextField4.requestFocus();
        }
         else if (doj.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "doj not entered");
            jTextField5.requestFocus();
        }
        else
        {
            try
            {
                Class.forName("java.sql.DriverManager");
                Connection con = (Connection)
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/retail","root","1980");
                Statement stmt = (Statement) con.createStatement();
                int confirm=JOptionPane.showConfirmDialog(null,"Are you sure you want to delete the record?",
                        "Confirmation Dialog Box",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
                if (confirm==JOptionPane.YES_OPTION)
                {
                    String query="DELETE FROM EM WHERE EMP_CODE='"+code+"';";
                    int rowseffected=stmt.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Record deleted");
        jTextField1.setText(" ");
        jTextField2.setText(" ");
        jTextField3.setText(" ");
        jTextField4.setText(" ");
        jTextField5.setText(" ");
                }
                con.close();
                stmt.close();
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:




        jTextField1.setText(" ");
        jTextField2.setText(" ");
        jTextField3.setText(" ");
        jTextField4.setText(" ");
        jTextField5.setText(" ");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

           int confirm=JOptionPane.showConfirmDialog(null,"Are you sure you want to exit?",
                "Confirmation Dialog Box",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
        if (confirm==JOptionPane.YES_OPTION)
        {
            this .setVisible(false);
            new main_page().setVisible(true);
        }
        else
        {
            this.setVisible(true);
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

}

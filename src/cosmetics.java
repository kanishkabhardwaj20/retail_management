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
 * cosmetics.java
 *
 * Created on Jul 28, 2016, 10:31:32 AM
 */

/**
 *
 * @author PC
 */
public class cosmetics extends javax.swing.JFrame {

    /** Creates new form cosmetics */
    public cosmetics() {
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
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 26));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("COSMETICS");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 18));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Item Code");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 3, 18));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Item Name");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 18));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cost");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 3, 18));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity");

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 3, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SAVE");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 3, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CLEAR");
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
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 3, 20));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("SEARCH");
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Comic Sans MS", 3, 20)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("EXIT");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Documents and Settings\\123\\Desktop\\RIDDHI, PRATHIT\\cosmetic1.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jButton2)
                        .addGap(55, 55, 55)
                        .addComponent(jButton5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jButton1)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(27, 27, 27)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jButton3)
                                .addGap(45, 45, 45)
                                .addComponent(jButton4)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton2))
                .addContainerGap(43, Short.MAX_VALUE))
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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

   

        String code=jTextField1.getText();
        if (code.isEmpty()) {
            jTextField2.setText(" ");
            jTextField3.setText(" ");
            jTextField4.setText(" ");

            JOptionPane.showMessageDialog(null,"Enter the item code");
        } else {
            try {
                Class.forName("java.sql.DriverManager");
                Connection con = (Connection)
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/retail","root","1980");
                Statement stmt = (Statement) con.createStatement();
                String query="SELECT ITEM_NAME, COST, QUANTITY FROM COSMETIC WHERE ITEM_CODE='"+code+"';";
                ResultSet rs=stmt.executeQuery(query);
                if (rs.next()) {
                    String name=rs.getString("item_name");
                    String cost=rs.getString("cost");
                    String quantity=rs.getString("quantity");

                    jTextField2.setText(name);
                    jTextField3.setText(cost);
                    jTextField4.setText(quantity);

                } else {
                    JOptionPane.showMessageDialog(null,"Sorry! No such item code");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        jTextField1.setText(" ");
        jTextField2.setText(" ");
        jTextField3.setText(" ");
        jTextField4.setText(" ");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        String code=jTextField1.getText();
        String name=jTextField2.getText();
        String cost=jTextField3.getText();
        String quantity=jTextField4.getText();
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
        else if (cost.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Cost not entered");
            jTextField3.requestFocus();
        }
        else if (quantity.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Quantity not entered");
            jTextField4.requestFocus();
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
                    String query="DELETE FROM COSMETIC WHERE ITEM_CODE='"+code+"';";
                    int rowseffected=stmt.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Record deleted");
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
  String code=jTextField1.getText();
        String name=jTextField2.getText();
        String cost=jTextField3.getText();
        String quantity=jTextField4.getText();

        if (code.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Code not entered");
            jTextField1.requestFocus();
        } else if(name.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Name not entered");
            jTextField2.requestFocus();
        } else if (cost.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cost not entered");
            jTextField3.requestFocus();
        } else if (quantity.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Quantity not entered");
            jTextField4.requestFocus();
        }

        else {
            try {
                Class.forName("java.sql.DriverManager");
                Connection con = (Connection)
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/retail","root","1980");
                Statement stmt = (Statement) con.createStatement();
                int confirm=JOptionPane.showConfirmDialog(null,"Are you sure you want to add the record?",
                        "Confirmation Dialog Box",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
                if (confirm==JOptionPane.YES_OPTION) {
                    String query="INSERT INTO COSMETIC VALUES('"+code+"','"+name+"','"+cost+"','"+quantity+"');";
                    int rowseffected=stmt.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Record added");
                }
                con.close();
                stmt.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }

        }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cosmetics().setVisible(true);
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
    // End of variables declaration//GEN-END:variables

}

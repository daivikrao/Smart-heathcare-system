/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.company.MyConnection;

import javax.swing.*;
import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAIVIK
 */
public class NewJFrame1 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public NewJFrame1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 31)); // NOI18N
        jLabel1.setText("SMART HEALTHCARE SYSTEM");

        jPasswordField1.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jPasswordField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPasswordField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel2.setText("PHONE NUMBER");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel3.setText("PASSWORD");

        jButton2.setBackground(new java.awt.Color(44, 62, 80));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("LOGIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setText("CLICK TO SIGNUP");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("CLICK TO ADMIN LOGIN");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(127, 127, 127)
                                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel5)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel4))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(jLabel2)
                                                                                        .addGap(18, 18, 18))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(30, 30, 30)))
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        PreparedStatement ps;
        ResultSet rs;
        String phonenumber = jTextField1.getText();
        String password = String.valueOf(jPasswordField1.getPassword());

        if(phonenumber.equals("") && password.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Add PHONE NUMBER and PASSWORD.");
        }
        else if(phonenumber.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Add PHONE NUMBER.");
        }
        else if(phonenumber.length() != 10)
        {
            JOptionPane.showMessageDialog(null,"Enter a VALID PHONE NUMBER.");
        }
        else if(password.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Add PASSWORD.");
        }
        else
        {
            String query = "SELECT * FROM `login_signup` WHERE `phonenumber` =? AND `password` =?";

            try {
                ps = MyConnection.getConnection().prepareStatement(query);

                ps.setString(1, phonenumber);
                ps.setString(2, password);

                rs = ps.executeQuery();

                if(rs.next())
                {
                    NewJFrame2 mf = new NewJFrame2();   //MAKE CHANGES TO GET REDIRECTED TO THE USER OR THE ADMIN
                    mf.setVisible(true);
                    mf.pack();
                    mf.setLocationRelativeTo(null);
                    PreparedStatement ps1 = null;
                    PreparedStatement ps2 = null;
                    PreparedStatement ps3 = null;
                    PreparedStatement ps4 = null;
                    ResultSet rs1;
                    ResultSet rs2;
                    ResultSet rs3;
                    ResultSet rs4;
                    String query1 = "SELECT `c_id` FROM `phone` WHERE phone_no = ?";
                    String query2 = "SELECT * FROM `citizen` WHERE c_id = (SELECT `c_id` FROM `phone` WHERE phone_no = ?)";
                    String query3 = "SELECT `i_id`,`name`,`date` FROM `insurance` WHERE ci_id =(SELECT `c_id` FROM `phone` WHERE phone_no = ?)";
                    String query4 = "SELECT `desc` FROM history WHERE c_id = (SELECT `c_id` FROM `phone` WHERE phone_no = ?)";
                    ps1 = MyConnection.getConnection().prepareStatement(query1);
                    ps2 = MyConnection.getConnection().prepareStatement(query2);
                    ps3 = MyConnection.getConnection().prepareStatement(query3);
                    ps4 = MyConnection.getConnection().prepareStatement(query4);
                    ps1.setString(1,phonenumber);
                    ps2.setString(1, phonenumber);
                    ps3.setString(1, phonenumber);
                    ps4.setString(1, phonenumber);
                    rs1 = ps1.executeQuery();
                    rs2 = ps2.executeQuery();
                    rs3 = ps3.executeQuery();
                    rs4 = ps4.executeQuery();
                    while(rs1.next() && rs2.next())
                    {
                        mf.jLabel9.setText(String.valueOf("PATIENT ID : " + rs1.getInt("c_id")));
                        mf.jLabel3.setText(rs2.getString("f_name") +  " " + rs2.getString("l_name"));


                    }
                    int count1 = 1;
                    if(rs4.next()==false)
                    {
                        mf.jTextArea1.setLineWrap(true);
                        mf.jTextArea2.insert("The Doctor hasn't updated the medical description yet.",mf.jTextArea2.getCaretPosition());
                    }
                    else
                    {
                        mf.jTextArea1.setLineWrap(false);
                        mf.jTextArea2.insert(count1 + ")" + " " + rs4.getString("desc"),mf.jTextArea2.getCaretPosition());
                        count1 += 1;
                    }
                    //ArrayList<String> arr = new ArrayList<>();
                    int count = 1;
                    if(rs3.next()==false)
                    {
                        mf.jTextArea1.insert("The patient has no insurance taken from any company.",mf.jTextArea1.getCaretPosition());
                    }
                    else
                    {
                        while(rs3.next())
                        {

                            //String ans = rs3.getInt("i_id") +  "    " + rs3.getString("name") + "    " + rs3.getString("date");
                            mf.jTextArea1.insert(count + ")" + " " + rs3.getInt("i_id") +  "    " + rs3.getString("name") + "    " + rs3.getString("date")+"\n\n",mf.jTextArea1.getCaretPosition());
                            //mf.jTextPane1.setText(rs3.getInt("i_id") +  "    " + rs3.getString("name") + "    " + rs3.getString("date") + "\n");
                            //mf.jLabel11("<html><br></html>");
                            //arr.add(rs3.getInt("i_id") +  "    " + rs3.getString("name") + "    " + rs3.getString("date"));
                            //mf.jTextPane1.setText("daivik" + "\n" + "shruesh" +   "\n" + "djhfgh");
                            //obj.jTextArea1.insert(rs3.getInt("i_id") +  "    " + rs3.getString("name") + "    " + rs3.getString("date") + "\n",obj.jTextArea1.getCaretPosition());
                            //mf.jTextPane1.setCaretPosition(19);
                            count += 1;
                        }

                    }

                }
                else{
                    JLabel label = new JLabel("INCORRECT PHONE NUMBER or PASSWORD.");

                    label.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
                    //JOptionPane.showMessageDialog(null,label,"", JOptionPane.WARNING_MESSAGE);
                    JOptionPane.showMessageDialog(null, label, "LOGIN FAILED.", 2);
                }

            }
            catch (SQLException ex)
            {
                Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        this.dispose();
        NewJFrame obj = new NewJFrame();
        obj.setVisible(true);
    }

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        this.dispose();
        NewJFrame5 obj = new NewJFrame5();
        obj.setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration
}

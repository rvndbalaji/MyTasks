
import java.awt.Color;




public class Rim extends javax.swing.JFrame {

    
    public Rim() 
    {
        initComponents();
        cont.setVisible(false);
        this.setLocationRelativeTo(null);
         myname.setText(Strt.getUserName() + ", you have something to do remember?");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        myname = new javax.swing.JLabel();
        sub = new javax.swing.JLabel();
        dt = new javax.swing.JLabel();
        ok = new javax.swing.JLabel();
        later = new javax.swing.JLabel();
        cont = new javax.swing.JPanel();
        totime1 = new javax.swing.JLabel();
        mytime = new javax.swing.JFormattedTextField();
        amp = new javax.swing.JToggleButton();
        totime2 = new javax.swing.JLabel();
        mydate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(java.awt.Color.white);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(229, 229, 229));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myname.setBackground(new java.awt.Color(28, 28, 28));
        myname.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        myname.setForeground(java.awt.Color.white);
        myname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myname.setText("You have something to do remember?");
        myname.setToolTipText("");
        myname.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        myname.setOpaque(true);
        jPanel1.add(myname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 50));

        sub.setBackground(java.awt.Color.white);
        sub.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        sub.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sub.setText("The quick brown fox jumps over the lazy dog");
        sub.setToolTipText(""); // NOI18N
        sub.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 80, 570, 40));

        dt.setBackground(java.awt.Color.white);
        dt.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        dt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1408105738_Clock.png"))); // NOI18N
        dt.setText("4:16:26 AM , 02 Oct 2014");
        dt.setToolTipText("");
        dt.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(dt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 600, 40));

        ok.setBackground(new java.awt.Color(28, 28, 28));
        ok.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        ok.setForeground(java.awt.Color.white);
        ok.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tick.png"))); // NOI18N
        ok.setText("Thanks for reminding!");
        ok.setToolTipText("");
        ok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ok.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ok.setOpaque(true);
        ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                okMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                okMouseExited(evt);
            }
        });
        jPanel1.add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 310, 50));

        later.setBackground(new java.awt.Color(28, 28, 28));
        later.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        later.setForeground(java.awt.Color.white);
        later.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        later.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taskx.png"))); // NOI18N
        later.setText("Remind me later");
        later.setToolTipText("");
        later.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        later.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        later.setOpaque(true);
        later.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                laterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                laterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                laterMouseExited(evt);
            }
        });
        jPanel1.add(later, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 290, 50));

        cont.setBackground(java.awt.Color.black);
        cont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totime1.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        totime1.setForeground(java.awt.Color.white);
        totime1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totime1.setText("TIME :  ");
        totime1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cont.add(totime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 7, 70, 35));

        mytime.setBackground(java.awt.Color.lightGray);
        try {
            mytime.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("## : ## : ##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        mytime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mytime.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        cont.add(mytime, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 7, 120, 35));

        amp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        amp.setText("AM");
        amp.setActionCommand("PM");
        amp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ampActionPerformed(evt);
            }
        });
        cont.add(amp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 6, 60, 38));

        totime2.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        totime2.setForeground(java.awt.Color.white);
        totime2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totime2.setText("DATE :  ");
        totime2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cont.add(totime2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 7, 70, 35));

        mydate.setBackground(java.awt.Color.lightGray);
        mydate.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        mydate.setText("03 Oct 2014");
        cont.add(mydate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 7, 200, 35));

        jPanel1.add(cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 600, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void okMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseEntered
        
        ok.setBackground(Color.GRAY);
        ok.setForeground(Color.WHITE);
    }//GEN-LAST:event_okMouseEntered

    private void laterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laterMouseEntered
         
    if(cont.isVisible()==false)
      {
        later.setBackground(Color.GRAY);
       later.setForeground(Color.WHITE);   
      }
      else if(cont.isVisible())
      {
         later.setBackground(Color.BLACK); 
         later.setForeground(Color.WHITE);   
      }
    }//GEN-LAST:event_laterMouseEntered

    private void okMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseExited
       
        ok.setBackground(new java.awt.Color(28,28,28));
        ok.setForeground(Color.WHITE);
    }//GEN-LAST:event_okMouseExited

    private void laterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laterMouseExited
 if(cont.isVisible()==false)
      {
       later.setBackground(new java.awt.Color(28,28,28));
       later.setForeground(Color.WHITE);   
      }
      else if(cont.isVisible())
      {
         later.setBackground(Color.BLACK); 
         later.setForeground(Color.WHITE);   
      }
        
    }//GEN-LAST:event_laterMouseExited

    private void okMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseClicked

        this.dispose();
    }//GEN-LAST:event_okMouseClicked

    private void laterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laterMouseClicked
 if(cont.isVisible()==false)
 {
     
      cont.setVisible(true);
       ok.setText("Cancel and dismiss");
      ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross.png")));
      later.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save_32.png")));
       later.setText("Save Reminder");       
       later.setBackground(Color.BLACK);
       later.setForeground(Color.WHITE); 
     
      
       
  }
 else if(cont.isVisible())
 {
    cont.setVisible(false);
    ok.setText("Thanks for reminding!");
    ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tick.png")));
    later.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taskx.png")));
    later.setText("Remind me later");  
    later.setBackground(Color.GRAY);
    later.setForeground(Color.WHITE); 
    
     //DrawBook();
 }
       
        
    }//GEN-LAST:event_laterMouseClicked

    public void DrawBook()
    {
        String d = mydate.getText();
        String t = mytime.getText();
        String s = sub.getText();
        String a = amp.getText();
        Strt.setRem(t,d,s,a);
     
       Strt Me = new Strt();
      Me.StartBook();
     }
    
    
    private void ampActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ampActionPerformed
       
        if(amp.getText().equals("AM"))       
        {
            amp.setText("PM");
        }
        else if(amp.getText().equals("PM"))
        {
              amp.setText("AM");
        }
        
    }//GEN-LAST:event_ampActionPerformed
    public static void main(String args[]) 
    {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Rim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Rim().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JToggleButton amp;
    private javax.swing.JPanel cont;
    public javax.swing.JLabel dt;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel later;
    public javax.swing.JTextField mydate;
    public javax.swing.JLabel myname;
    public javax.swing.JFormattedTextField mytime;
    public javax.swing.JLabel ok;
    public javax.swing.JLabel sub;
    private javax.swing.JLabel totime1;
    private javax.swing.JLabel totime2;
    // End of variables declaration//GEN-END:variables
}

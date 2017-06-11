

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import javax.swing.*;
import javax.swing.Timer;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ViewTasks extends javax.swing.JFrame


{
    private static final long serialVersionUID = 1L;
   Rim rim = new Rim();

    
    int interval = 100;
    ActionListener monitor = new ActionListener()
    {  
       @Override
         public void actionPerformed(ActionEvent evt)        
            {
               
              MonitorTask();
              checkCount();                             
            }
        
    };
    
     
    public void checkCount()
    {
        {
        if(table.getRowCount()==0)
              {
                 Tsk.delete();
                  savedit.setEnabled(false);
                  delAll.setEnabled(false);
                  
              }
              else
              {
                   savedit.setEnabled(true);
                   if(savedit.getText().equals(" Save Reminders"))
                   {
                       delAll.setEnabled(false);
                   }
                   else if(savedit.getText().equals(" Edit Reminders"))
                       
                   {
                       delAll.setEnabled(true);
                   }
              }
              
    }
    }
 
    
    public void MonitorTask()
    {
        try {
           
             
          for(int i=0; i<table.getRowCount(); i++)  
          {
              
              String itemno = table.getModel().getValueAt(i,0).toString();
              String d = table.getModel().getValueAt(i,1).toString();
              String t = table.getModel().getValueAt(i,2).toString();
              String subj = table.getModel().getValueAt(i,3).toString();
              
                       
              if(t.equals(Strt.getSysTime()) && d.equals(Strt.getSysDate()))
              {
                //JOptionPane.showMessageDialog(null,itemno + d + t + subj);
                remind(d,t,subj);
                
                RemoveTask(i);
               
              }
                                     
          } 
          
          
        } catch (Exception e) 
        {

          JOptionPane.showMessageDialog(null,"Table monitor has stopped working!\nError in MonitorTask() : " +e.getMessage());
       
        }
    
         
    }
    
    public void remind(String d,String t,String subj)
    {
        rim.dt.setText(t+ " , " +d);
        rim.sub.setText(subj);
        rim.myname.setText(Strt.getUserName() + ", you have something to do remember?");
        rim.mytime.setText(t);       
        rim.mydate.setText(d);
        rim.setVisible(true);
        rim.requestFocusInWindow();
    }
    
    
    Properties save = new Properties();
    public static String path = Strt.path;
    public static String value;    

    int delay = 50;
    ActionListener uptime = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent evt) {

            totime.setText(Strt.getSysTime());

        }

    };

//==============================================================================
     
    File Tsk = new File(path + "VifTasks.properties");
    
    Timer mon = new Timer(delay,monitor); 
    
    public ViewTasks() {

        initComponents();

        setIconImage(new ImageIcon(getClass().getResource("taskx.png")).getImage());

        CenterAlignTable();

        //Update Time onscreen
        Timer UpdateTime = new Timer(delay, uptime);
        UpdateTime.start();
        LoadTask();
         
       mon.start();
       table.setShowGrid(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ThemeGroup = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        cont = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        blacky = new javax.swing.JPanel();
        totime = new javax.swing.JLabel();
        myname = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        delAll = new javax.swing.JButton();
        savedit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("View my reminders");
        setBackground(java.awt.Color.white);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(814, 478));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cont.setBackground(java.awt.Color.white);
        cont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(java.awt.Color.white);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/load2.gif"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cont.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 60, 60));

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setName("cont"); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        cont.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, -1));

        blacky.setBackground(java.awt.Color.white);
        blacky.setBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true));
        blacky.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totime.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        blacky.add(totime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 120, 50));

        myname.setBackground(java.awt.Color.white);
        myname.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        myname.setForeground(new java.awt.Color(0, 153, 0));
        myname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myname.setText("Here are your reminders");
        myname.setToolTipText("");
        myname.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        blacky.add(myname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 880, -1));

        cont.add(blacky, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 881, 50));

        table.setAutoCreateRowSorter(true);
        table.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Date", "Time", "Reminder"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(java.awt.Color.lightGray);
        table.setRowHeight(28);
        table.setSelectionBackground(new java.awt.Color(147, 200, 255));
        table.setSelectionForeground(java.awt.Color.black);
        table.getTableHeader().setResizingAllowed(false);
        table.getTableHeader().setReorderingAllowed(false);
        table.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tableComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                tableComponentRemoved(evt);
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        table.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tablePropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(35);
            table.getColumnModel().getColumn(0).setPreferredWidth(35);
            table.getColumnModel().getColumn(0).setMaxWidth(35);
            table.getColumnModel().getColumn(1).setMinWidth(110);
            table.getColumnModel().getColumn(1).setPreferredWidth(110);
            table.getColumnModel().getColumn(1).setMaxWidth(110);
            table.getColumnModel().getColumn(2).setMinWidth(120);
            table.getColumnModel().getColumn(2).setPreferredWidth(120);
            table.getColumnModel().getColumn(2).setMaxWidth(120);
            table.getColumnModel().getColumn(3).setMinWidth(650);
            table.getColumnModel().getColumn(3).setPreferredWidth(650);
            table.getColumnModel().getColumn(3).setMaxWidth(650);
        }

        cont.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 110, 878, 450));

        delAll.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        delAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recycle Bin Full.png"))); // NOI18N
        delAll.setText(" Delete all reminders");
        delAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delAllActionPerformed(evt);
            }
        });
        cont.add(delAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 58, 190, 43));

        savedit.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        savedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Edit-32.png"))); // NOI18N
        savedit.setText(" Edit Reminders");
        savedit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        savedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveditActionPerformed(evt);
            }
        });
        cont.add(savedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 58, 170, 43));

        getContentPane().add(cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 883, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void CenterAlignTable()
    {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        table.getTableHeader().setDefaultRenderer(centerRenderer);

        int j = table.getColumnCount();
        for (int i = 0; i < j; i++) 
        {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);

        }
    }
    
    public void SaveTask() 
    {
        mon.stop();
        Tsk.delete();
      
        try {
            
            
             FileWriter writer = new FileWriter(Tsk);
             
             int lim = table.getRowCount();
             
             
             for(int i =0; i<lim ;i++)
             {
                
              save.setProperty("No" + table.getModel().getValueAt(i, 0).toString() , table.getModel().getValueAt(i, 0).toString());
              save.setProperty("Date" + table.getModel().getValueAt(i, 0).toString(),  table.getModel().getValueAt(i, 1).toString());
              save.setProperty("Time" + table.getModel().getValueAt(i, 0).toString(),  table.getModel().getValueAt(i, 2).toString());
              save.setProperty("Reminder"+ table.getModel().getValueAt(i, 0).toString(),  table.getModel().getValueAt(i, 3).toString());
             } 
             
             
             
           save.setProperty("Count", String.valueOf(table.getRowCount()));   
           save.store(writer, "MyTasks Saved Reminders (Warning :DO NOT MODIFY/DELETE !!!)\nThese are the reminders saved in MyTasks. Modifying these values may cause problems!!\n\n"); 
           
            writer.close();
            
        } catch (IOException e) {

            JOptionPane.showMessageDialog(null,"Something went wrong while trying to save your reminder.\nError in SaveTask() : " + e.getMessage());
            
        }
             mon.restart();  
    }
    
    public void UpdateTask()
    {
        try{
       int num = table.getRowCount();
       
      for(int i=0;i<num;i++)
      {
      String temp = String.valueOf(i+1);
       table.setValueAt(temp, i, 0);
      }
      }catch(Exception e)
      {
          JOptionPane.showMessageDialog(null, "Unable to update table.\nError in UpdateTask(): " + e.getMessage());
      }
      
       SaveTask(); 
      
    }
    public void AddTask(String d, String t, String subj) 
    {
        mon.stop();
        int number = table.getRowCount() + 1;
        DefaultTableModel ass = (DefaultTableModel) table.getModel();
        ass.addRow(new Object[]{number, d, t, subj});
         mon.restart();
       
        
    }
    public void RemoveTask(int n) 
    {
        mon.stop();
        try{
         
             FileReader reader = new FileReader(Tsk);
             save.load(reader);
             
        DefaultTableModel ass = (DefaultTableModel) table.getModel();
        ass.removeRow(n);
        
       save.remove("No"+n);
       save.remove("Date"+n);
       save.remove("Time"+n);
       save.remove("Reminder"+n);
       
       UpdateTask();
       mon.restart();
       
        
        }catch(IOException e){JOptionPane.showMessageDialog(null, "Past reminder could not be deleted.\nError in RemoveTask() : "+e.getMessage());}
        
    }
        
    public void LoadTask() 
    {   mon.stop();
        ClearRows();
        
          
        try 
        {
           
            try (FileReader reader = new FileReader(Tsk)) {
                save.load(reader);
                int n = Integer.parseInt(save.getProperty("Count"));
                
                for(int i=1; i<=n; i++)
                {
                    
                    String B = save.getProperty("Date"+ i);
                    String C = save.getProperty("Time" + i);
                    String D = save.getProperty("Reminder"+ i);
                    
                    AddTask(B,C,D);
                    
                }
            }

           
        } catch (Exception e) 
            
        {
          
        }
        mon.restart();
    }

    public void setTitle() {
        int num = table.getRowCount();

        if (num == 0) {
            myname.setText("Meh, no reminders here...");
           
        } else if (num == 1) {
            myname.setText(Strt.getUserName() + ", here is your reminder...");
            
        } else if (num > 1) {
            myname.setText(Strt.getUserName() + ", here are your reminders...");
        } else {
            myname.setText(Strt.getUserName() + ", here are your reminder(s)...");
        }
        myname.setForeground(new java.awt.Color(0,153,0));
        blacky.setBackground(Color.white); 
    }
    
public void ClearRows()
{
    DefaultTableModel ass = (DefaultTableModel) table.getModel();
        
      if (ass.getRowCount() > 0)
      {
        for (int i = ass.getRowCount() - 1; i > -1; i--) 
        {
        ass.removeRow(i);
        }
       }
      else
      {
          
      }
}





    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       setTitle();
    }//GEN-LAST:event_formWindowOpened

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

    }//GEN-LAST:event_tableMouseClicked

    private void tableComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tableComponentAdded

    }//GEN-LAST:event_tableComponentAdded

    private void tableComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tableComponentRemoved

    }//GEN-LAST:event_tableComponentRemoved

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
     CloseCheck();
        
    }//GEN-LAST:event_formWindowClosing

    public void CloseCheck()
    {
         this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
       
       
        if(savedit.getText().equals(" Save Reminders"))
        {
           myname.setForeground(Color.red);          
           
           blacky.setBackground(Color.pink); 
           myname.setText("Save your reminders before you quit!");
           
        MatteBorder me = new MatteBorder(1,1,1,1,Color.red);
           table.setBorder(me);
           
        }   
        else
        {
            
            setTitle();
            
            MatteBorder me = new MatteBorder(0,0,0,0,new java.awt.Color(0,153,0));
            table.setBorder(me);
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            
        }
    
    }
   
    
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
      
    }//GEN-LAST:event_formWindowClosed

    private void tablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tablePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tablePropertyChange

    private void delAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delAllActionPerformed

        Object[] op = {"Yes, go ahead","No, wait!"};
       	if (JOptionPane.showOptionDialog(null, Strt.getUserName() +", all your reminders will be deleted! Are you sure you want to delete them all?", "Deleting...", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE,null,op ,op[0])== JOptionPane.YES_OPTION)
	    {
	    	 try
                  {
                    save.clear();
                    Tsk.delete();
                    ClearRows();
                  }catch(Exception e) {}
        
                JOptionPane.showMessageDialog(null,"Your reminders have been deleted");
                
                }
    }//GEN-LAST:event_delAllActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    
        
    private void saveditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveditActionPerformed
    
               if(savedit.getText().equals(" Edit Reminders"))
               {
                   mon.stop();
                   
                 EnableEdit();  
                 LoadTask();
                  myname.setForeground(Color.blue); 
                 blacky.setBackground(new java.awt.Color(183,222,255));
                  myname.setText("Double-click on cells to edit them");
                  MatteBorder me = new MatteBorder(1,1,1,1,Color.BLUE);
                   table.setBorder(me);
                  
                  
                  savedit.setText(" Save Reminders");
                   savedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save_32.png")));
                  table.setColumnSelectionAllowed(true);
                  delAll.setEnabled(false);
                   Tsk.delete();
               }
               else if(savedit.getText().equals(" Save Reminders"))
               {
                   SaveTask();
                   
                   DisableEdit();            
                   LoadTask();
                   setTitle();
                   savedit.setText(" Edit Reminders");
                   savedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Edit-32.png")));     
                   
                    MatteBorder me = new MatteBorder(1,1,1,1,new java.awt.Color(0,153,0));
                    table.setBorder(me);
                    
                         table.setColumnSelectionAllowed(false);            
                     myname.setText("Your changes have been saved");
                     blacky.setBackground(new java.awt.Color(204,255,204)); 
                     delAll.setEnabled(true);
                     mon.restart();
                     
               }
       
    }//GEN-LAST:event_saveditActionPerformed

    
   public void EnableEdit()
   {
       table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Date", "Time", "Reminder"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
       
       ArrangeTable();
   }
   
   
   public void ArrangeTable()
   {
           table.setColumnSelectionAllowed(true);
        table.setGridColor(java.awt.Color.lightGray);
        table.setRowHeight(28);
        table.setSelectionBackground(new java.awt.Color(147, 200, 255));
        table.setSelectionForeground(java.awt.Color.black);
        table.getTableHeader().setResizingAllowed(false);
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        table.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tableComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                tableComponentRemoved(evt);
            }
        });
        table.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tablePropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(35);
            table.getColumnModel().getColumn(0).setPreferredWidth(35);
            table.getColumnModel().getColumn(0).setMaxWidth(35);
            table.getColumnModel().getColumn(1).setMinWidth(110);
            table.getColumnModel().getColumn(1).setPreferredWidth(110);
            table.getColumnModel().getColumn(1).setMaxWidth(110);
            table.getColumnModel().getColumn(2).setMinWidth(120);
            table.getColumnModel().getColumn(2).setPreferredWidth(120);
            table.getColumnModel().getColumn(2).setMaxWidth(120);
            table.getColumnModel().getColumn(3).setMinWidth(650);
            table.getColumnModel().getColumn(3).setPreferredWidth(650);
            table.getColumnModel().getColumn(3).setMaxWidth(650);
        }
        CenterAlignTable();
   }
   
    public void DisableEdit()
   {
       table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Date", "Time", "Reminder"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
       ArrangeTable();
   }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                ViewTasks Me = new ViewTasks();
                Me.setLocationRelativeTo(null);
                Me.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ThemeGroup;
    private javax.swing.JPanel blacky;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel cont;
    public javax.swing.JButton delAll;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel myname;
    public javax.swing.JButton savedit;
    public javax.swing.JTable table;
    private javax.swing.JLabel totime;
    // End of variables declaration//GEN-END:variables
}

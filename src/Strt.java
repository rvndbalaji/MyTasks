
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.*;
import java.text.DateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;


public class Strt extends javax.swing.JFrame 
{

    public String value;
    
    
    public static String dir = System.getProperty("user.home", "Desktop") + "\\Desktop\\";
    public static String path = dir.substring(0, dir.length()-8) + "MyTasks\\";
      
    public String UserName = System.getProperty("user.name");
    public static String SysTime;
    public static String SysDate;
    public static String Time;
    public static String Date;
    public static String MyName;    
    public static int tag = 0;
    public static int count = 0;
    public static boolean completed = false;
    File file = new File(path);
    
    ViewTasks Vt = new ViewTasks();
    Hello Me = new Hello();
   

    public Properties def = new Properties();
    {
      def.setProperty("ColorScheme", "white");
    }
    public Properties prop = new Properties();
    public Properties save = new Properties();
    //Default User Settings
    
    
    
    int delay = 60;
    ActionListener uptime = new ActionListener() 
    {

        @Override
        public void actionPerformed(ActionEvent evt) 
        {

            DateFormat fulltime = new SimpleDateFormat("hh:mm:ss a");
            DateFormat fulldate = new SimpleDateFormat("dd MMM yyyy");
            Date time = new Date();
            Date date = new Date();

            SysTime = fulltime.format(time);
            SysDate = fulldate.format(date);
            today.setText(SysDate);
            totime.setText(SysTime);
            //====================

        }

    };

//=================GETTER/SETTER METHODS STARTS HERE Bitches xD ================
    public static String getSysTime() 
    {
        return SysTime;
    }
    public static String getSysDate() 
    {
        return SysDate;
    }
    public static String getUserName() 
    {
        return MyName;
    }

    public static boolean isCompleted() 
    {
        return completed;
    }
public static String ot;
    public static  String od;
    public static String os;
    public static String a;
    
    public static void setRem(String t,String d,String s,String amp) 
    {
      ot = t;
      od = d;
      os = s;
      a = amp;
      
    }
    
    
    public  void StartBook()
    {
        Time = ot + " " + a;
        Date = od;

        String subj = os;

        String cD = checkDate();

        if (cD.equals("present")) 
        {
            String cT = checkTime();

            if (cT.equals("future")) 
            {
                Vt.AddTask(Date, Time, subj);
                Vt.SaveTask(); 
               
            }

        } else if (cD.equals("future")) {
            Vt.AddTask(Date, Time, subj);
            Vt.SaveTask();
            
            

        }

        Vt.setTitle();
        sub.setText(null);
        mytime.setText(SysTime);
        
        Date date = new Date();
        mydate.setDate(date);
        
       
       
    }
    
    
//==============================================================================
    public Strt() {

        initComponents();
        //jButton1.setVisible(false);
        
        setIconImage(new ImageIcon(getClass().getResource("tasks-64.png")).getImage());
        //C:\Users\Aravind\Desktop\
        //123456789012345678901234567
     if(!file.exists())
     {
         file.mkdir();
     }
        //jButton1.setVisible(false);
        //Update Time onscreen
        Timer UpdateTime = new Timer(delay, uptime);
        UpdateTime.start();

        colwin.setVisible(false);
        nwin.setVisible(false);

        //===========LOAD USER SETTINGS   ==============
        String tempname;
        try {
            tempname = LoadSet("username");

        } catch (Exception e) {
            tempname = UserName;
            colwin.setVisible(false);
            AskName();


            askname.setText(UserName);
            askname.requestFocus();

        }

        if (tempname.equals("") || tempname.equals(" ")) {
            colwin.setVisible(false);
            AskName();


            askname.setText(UserName);
            askname.requestFocus();

        } else {
            myname.setText(tempname);
            MyName = tempname;
        }

       
        //Change USER Scheme
        String scheme = LoadSet("ColorScheme");

        if (scheme.equals("black")) {
            black.doClick();
        } else if (scheme.equals("white")) {
            white.doClick();
        } else if (scheme.equals("default")) {
            white.doClick();
        } else {
            white.doClick();
        }
    
        //===============================================      
        
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ThemeGroup = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        cont = new javax.swing.JPanel();
        bar = new javax.swing.JProgressBar();
        welcome = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        mytime = new javax.swing.JFormattedTextField();
        nm = new javax.swing.JLabel();
        totime1 = new javax.swing.JLabel();
        totime2 = new javax.swing.JLabel();
        blacky = new javax.swing.JPanel();
        today = new javax.swing.JLabel();
        totime = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sub = new javax.swing.JTextField();
        bottom = new GradPanel();
        C = new javax.swing.JPanel();
        sett2 = new javax.swing.JLabel();
        vt = new javax.swing.JLabel();
        A = new javax.swing.JPanel();
        sett1 = new javax.swing.JLabel();
        sett = new javax.swing.JLabel();
        B = new javax.swing.JPanel();
        abt = new javax.swing.JLabel();
        abt1 = new javax.swing.JLabel();
        theme = new javax.swing.JLabel();
        colwin = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        white = new javax.swing.JRadioButton();
        black = new javax.swing.JRadioButton();
        myname = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        book = new javax.swing.JLabel();
        amp = new javax.swing.JLabel();
        nwin = new javax.swing.JPanel();
        ntit = new javax.swing.JLabel();
        askname = new javax.swing.JTextField();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyTasks");
        setBackground(java.awt.Color.white);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(814, 478));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
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

        bar.setForeground(java.awt.Color.white);
        bar.setToolTipText("");
        bar.setValue(100);
        bar.setBorderPainted(false);
        cont.add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 63, 883, 6));

        welcome.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome.setText("Welcome");
        welcome.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        cont.add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 130, 34));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(37, 108, 233));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1408105738_Clock.png"))); // NOI18N
        jLabel9.setText("When should you be reminded?");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cont.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 310, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(37, 108, 233));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Edit-32.png"))); // NOI18N
        jLabel10.setText(" What's the reminder about?");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cont.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 290, 40));

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setName("cont"); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        cont.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, -1));

        try {
            mytime.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("## : ## : ##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        mytime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mytime.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        cont.add(mytime, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 120, 40));

        nm.setBackground(java.awt.Color.gray);
        nm.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        nm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user-32.png"))); // NOI18N
        nm.setToolTipText("");
        nm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nm.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        nm.setOpaque(true);
        nm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nmMouseExited(evt);
            }
        });
        cont.add(nm, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, 70, 40));

        totime1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totime1.setForeground(new java.awt.Color(0, 173, 0));
        totime1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totime1.setText("TIME :  ");
        totime1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cont.add(totime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 70, 40));

        totime2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totime2.setForeground(new java.awt.Color(0, 173, 0));
        totime2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totime2.setText("DATE :  ");
        totime2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cont.add(totime2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 70, 40));

        blacky.setBackground(java.awt.Color.white);
        blacky.setOpaque(false);
        blacky.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        today.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        today.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        today.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calender-32.png"))); // NOI18N
        today.setText("03 Oct 2014");
        today.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        blacky.add(today, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 40));

        totime.setFont(new java.awt.Font("Segoe UI Semibold", 0, 17)); // NOI18N
        totime.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        totime.setText("07:20:54 PM");
        totime.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        blacky.add(totime, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 37, 140, 20));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 27)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(57, 121, 233));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MyTasks");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blacky.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 120, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tasks-64.png"))); // NOI18N
        blacky.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 60, 60));

        cont.add(blacky, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 63));

        sub.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sub.setText("The quick brown fox jumps over the lazy dog");
        sub.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        sub.setSelectionColor(new java.awt.Color(147, 200, 255));
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });
        cont.add(sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 560, 43));

        bottom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bottomMouseExited(evt);
            }
        });
        bottom.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        C.setBackground(java.awt.Color.white);
        C.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C.setOpaque(false);
        C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CMouseExited(evt);
            }
        });
        C.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sett2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        sett2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sett2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/REMINDERS-flat-48.png"))); // NOI18N
        sett2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sett2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        sett2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sett2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sett2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sett2MouseExited(evt);
            }
        });
        C.add(sett2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 110, 50));

        vt.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        vt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vt.setText("My reminders");
        vt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vt.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        vt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vtMouseExited(evt);
            }
        });
        C.add(vt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 62, 110, 30));

        bottom.add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 90));

        A.setBackground(new java.awt.Color(255, 255, 255));
        A.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A.setOpaque(false);
        A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AMouseExited(evt);
            }
        });
        A.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sett1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        sett1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sett1.setText("Settings");
        sett1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sett1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        sett1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sett1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sett1MouseExited(evt);
            }
        });
        A.add(sett1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 61, 100, 30));

        sett.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        sett.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sett.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Settings-flat-circle-48.png"))); // NOI18N
        sett.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sett.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        sett.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settMouseExited(evt);
            }
        });
        A.add(sett, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 100, 50));

        bottom.add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 10, -1, 90));

        B.setBackground(new java.awt.Color(255, 255, 255));
        B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B.setOpaque(false);
        B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BMouseReleased(evt);
            }
        });
        B.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        abt.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        abt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        abt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1408134547_circle_info_more-information_detail_.png"))); // NOI18N
        abt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        abt.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        abt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                abtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                abtMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                abtMouseReleased(evt);
            }
        });
        B.add(abt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 100, 50));

        abt1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        abt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        abt1.setText("About");
        abt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        abt1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        abt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                abt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                abt1MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                abt1MouseReleased(evt);
            }
        });
        B.add(abt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 61, 100, 30));

        bottom.add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 10, -1, 90));

        cont.add(bottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 470, 900, 100));

        theme.setBackground(java.awt.Color.gray);
        theme.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        theme.setForeground(java.awt.Color.white);
        theme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        theme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint-32.png"))); // NOI18N
        theme.setToolTipText("");
        theme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        theme.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        theme.setOpaque(true);
        theme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                themeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                themeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                themeMouseExited(evt);
            }
        });
        cont.add(theme, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, 70, 40));

        colwin.setBackground(java.awt.Color.darkGray);
        colwin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        colwin.setForeground(java.awt.Color.white);
        colwin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(java.awt.Color.black);
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("   Choose a theme...");
        jLabel5.setToolTipText("");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel5.setOpaque(true);
        colwin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 40));

        white.setBackground(java.awt.Color.darkGray);
        buttonGroup1.add(white);
        white.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        white.setForeground(java.awt.Color.white);
        white.setText("Marble White");
        white.setName("Group"); // NOI18N
        white.setOpaque(false);
        white.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteActionPerformed(evt);
            }
        });
        colwin.add(white, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, 40));

        black.setBackground(java.awt.Color.darkGray);
        buttonGroup1.add(black);
        black.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        black.setForeground(java.awt.Color.white);
        black.setText("Sapphire Black");
        black.setName("Group"); // NOI18N
        black.setOpaque(false);
        black.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackActionPerformed(evt);
            }
        });
        colwin.add(black, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 130, 40));

        cont.add(colwin, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 140, 280, 100));

        myname.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        myname.setForeground(new java.awt.Color(0, 173, 0));
        myname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myname.setToolTipText("");
        myname.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        cont.add(myname, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 95, 250, 34));

        jButton1.setText("Remind me!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        cont.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, -1, -1));

        book.setBackground(new java.awt.Color(28, 28, 28));
        book.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        book.setForeground(java.awt.Color.white);
        book.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        book.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save_32.png"))); // NOI18N
        book.setText(" Save Reminder");
        book.setToolTipText("");
        book.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        book.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        book.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        book.setOpaque(true);
        book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bookMouseExited(evt);
            }
        });
        cont.add(book, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 329, 240, 45));

        amp.setBackground(new java.awt.Color(102, 102, 102));
        amp.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        amp.setForeground(java.awt.Color.white);
        amp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        amp.setText("AM");
        amp.setToolTipText("");
        amp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        amp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        amp.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        amp.setOpaque(true);
        amp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ampMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ampMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ampMouseExited(evt);
            }
        });
        cont.add(amp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 60, 40));

        nwin.setBackground(java.awt.Color.darkGray);
        nwin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        nwin.setForeground(java.awt.Color.white);
        nwin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ntit.setBackground(java.awt.Color.black);
        ntit.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ntit.setForeground(java.awt.Color.white);
        ntit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ntit.setText("   What's your name?");
        ntit.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ntit.setOpaque(true);
        nwin.add(ntit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 40));
        ntit.getAccessibleContext().setAccessibleName(" Select a theme");

        askname.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        askname.setText("Aravind Balaji");
        askname.setToolTipText("");
        askname.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        askname.setSelectionColor(new java.awt.Color(147, 200, 255));
        askname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asknameActionPerformed(evt);
            }
        });
        nwin.add(askname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 240, 40));

        cont.add(nwin, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 90, 280, 110));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/light-blue-abstract.jpg"))); // NOI18N
        cont.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 590));

        getContentPane().add(cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 883, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String GetUserSetTime() {
        //11 : 17 : 26 PM
        //1234567890123456

        String temp = mytime.getText();

        String ass = temp.substring(0, 2) + ":" + temp.substring(5, 7) + ":" + temp.substring(10, 12) + " " + amp.getText();

        //returns 11:17:26 PM
        return ass;
    }

    public String GetUserSetDate() {
        //Sat Aug 09 23:14:38 IST 2014
        //12345678901234567890123456789
        //.........11........21........

        String temp = mydate.getDate().toString();

        String ass = temp.substring(8, 10) + " " + temp.substring(4, 7) + " " + temp.substring(24, 28);
        //returns 09 Aug 2014
        return ass;
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        Date date = new Date();
        mydate.setDate(date);

        
        mytime.setText(totime.getText());
        String apm = totime.getText().substring(9, 11);

        if (apm.equals(amp.getText())) 
        {

        } else 
   {
        changeAMP();
   }

        Time = GetUserSetTime();
        Date = GetUserSetDate();

        mytime.requestFocus();

    }//GEN-LAST:event_formWindowOpened

    public void changeAMP()
    {
            
        if(amp.getText().equals("AM"))
      {
          amp.setText("PM");
          amp.setBackground(Color.BLACK);
          
      }
      else if(amp.getText().equals("PM"))
      {
          amp.setText("AM");
          amp.setBackground(new java.awt.Color(102,102,102));
      }
    }
    public String LoadSet(String key) 
    {

        try {

            File Sett = new File(path + "VifSett.properties");
            FileReader reader = new FileReader(Sett);

            prop.load(reader);

            value = prop.getProperty(key);

            reader.close();

            if (value.equals("")) {
                value = CheckAndLoadDef(key);
                return value;

            } else {
                return value;
            }
        } catch (Exception e) {
            return value = CheckAndLoadDef(key);

        }

    }

    public String CheckAndLoadDef(String key) {
        if (key.equals("username")) {
            String myname = UserName;
            SaveSet("username", myname);
            return myname;

        } else if (key.equals("ColorScheme")) {
            SaveSet("ColorScheme", "white");
            return "white";

        } else {
            value = "default";
            return value;
        }
    }

    public void BookTask()
    {
         Time = GetUserSetTime();
        Date = GetUserSetDate();

        String subj = sub.getText();

        String cD = checkDate();

        if (cD.equals("present")) 
        {
            String cT = checkTime();

            if (cT.equals("future")) 
            {
                Vt.AddTask(Date, Time, subj);
                Vt.SaveTask(); 
               
            }

        } else if (cD.equals("future")) {
            Vt.AddTask(Date, Time, subj);
            Vt.SaveTask();
            
            

        }

        Vt.setTitle();
        sub.setText(null);
        mytime.setText(SysTime);
        
        Date date = new Date();
        mydate.setDate(date);
        
       
    }
    public boolean check12hr() {
        boolean ray = false;

        //11:17:26 PM
        //123456789012   
        String h = Time.substring(0, 2);
        String m = Time.substring(3, 5);
        String s = Time.substring(6, 8);

        int H = Integer.parseInt(h);
        int M = Integer.parseInt(m);
        int S = Integer.parseInt(s);

        if (H >= 1 && H <= 12 && M >= 0 && M <= 59 && S >= 0 && S <= 59) {
            ray = true;
            return ray;
        } else {

            JOptionPane.showMessageDialog(null, "The specified format of the Time is incorrect. Please enter the time in 12-hour format (hh:mm:ss a)");
            ray = false;
            return ray;
        }

    }

    public String checkTime() {
        String temp = "error";

        try {
            SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");
            Date systime = format.parse(SysTime);
            Date utime = format.parse(Time);

            if (check12hr() == true) {

                if (utime.before(systime)) {
                    temp = "past";
                    JOptionPane.showMessageDialog(null, "The specified Time has already passed by. Please enter a future time");
                    return temp;
                } else if (utime.equals(systime)) {
                    temp = "present";
                    JOptionPane.showMessageDialog(null, "The Time that you've specified is the present time. Please enter a future time");
                    return temp;

                } else if (utime.after(systime)) {
                    temp = "future";
                    return temp;

                }

            } else {

            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Unable to process the Time.\nErr: Exception caught at checkTime() : "+e.getMessage());
            temp = "error";
            return temp;
        }

        return temp;
    }

    public String checkDate() {
        String temp = "error";

        try {
            SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");
            Date sysdate = format.parse(SysDate);
            Date udate = format.parse(Date);

            if (udate.before(sysdate)) {
                temp = "past";
                JOptionPane.showMessageDialog(null, "The specified Date has already passed by. Please enter present or future date");
                return temp;
            } else if (udate.equals(sysdate)) {
                temp = "present";
                return temp;

            } else if (udate.after(sysdate)) {
                temp = "future";
                return temp;

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Unable to process the Date.\nErr: Exception caught at checkDate() : "+e.getMessage());
            temp = "error";
            return temp;
        }

        return temp;
    }

    
    private void AskName() {
        if (nwin.isVisible()) {
            if (askname.getText().equals("") || askname.getText().equals(" ")) {
                JOptionPane.showMessageDialog(null, "We'd like to know your name, Please?");
                askname.requestFocus();
            } else {

                nm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user-32.png")));
                nm.setText("");
                nwin.setVisible(false);
                theme.setVisible(true);
                MyName = askname.getText();
                myname.setText(MyName);
                Vt.setTitle();
                SaveSet("username", MyName);
            }
        } else {
            askname.setText(myname.getText());
            nwin.setVisible(true);
            nm.setIcon(null);
            nm.setText(" OK ");

            //Changing the "OK" text to BOLD 
            java.awt.Font oldFont = nm.getFont();
            java.awt.Font newFont = new java.awt.Font(oldFont.getName(), java.awt.Font.BOLD, oldFont.getSize());
            nm.setFont(newFont);
            
            theme.setVisible(false);
            askname.requestFocus();
            askname.selectAll();

        }
    }

    public void LoadDefSet() {

        try {

            File Sett = new File(path + "VifSett.properties");
            FileWriter writer = new FileWriter(Sett);

            
            def.setProperty("ColorScheme", "white");

            def.store(writer, "MyTasks User Settings (Warning :DO NOT MODIFY/DELETE !!!)\n\n\nThese are the user settings saved in MyTasks. Modifying these values may crash your computer and burn your house!!\n\n");
            writer.close();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Unable to load Default User Settings\nError in function: LoadDefSet()");
        }
    }

    private void SaveSet(String key, String value) {

        try {

            File Sett = new File(path + "VifSett.properties");
            FileWriter writer = new FileWriter(Sett);

            prop.setProperty(key, value);

            prop.store(writer, "MyTasks User Settings (Warning :DO NOT MODIFY/DELETE !!!)\n\n\nThese are the user settings saved in MyTasks. Modifying these values may crash your computer and burn your house!!\n\n");
            writer.close();

        } catch (Exception e) {
            LoadDefSet();
            JOptionPane.showMessageDialog(null, myname.getText() + ", Something went wrong and your settings have been reset to their default values; Sorry about that");

        }
    }

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
       
    }//GEN-LAST:event_subActionPerformed

    private void asknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asknameActionPerformed
       
    }//GEN-LAST:event_asknameActionPerformed

    private void whiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteActionPerformed
        tag = 0;
        myname.setForeground(new java.awt.Color(0,173,0));
        welcome.setForeground(new java.awt.Color(0, 153, 0));
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/light-blue-abstract.jpg")));
        welcome.setForeground(Color.BLACK);
        sett1.setForeground(Color.black);
        vt.setForeground(Color.black);
        abt1.setForeground(Color.black);
        blacky.setOpaque(false);
        cont.setBackground(Color.white);
        today.setForeground(Color.black);
        totime.setForeground(Color.black);
        jLabel9.setForeground(new java.awt.Color(37, 108, 233));
        jLabel10.setForeground(new java.awt.Color(37, 108, 233));
        mytime.setBackground(Color.white);
        mydate.setBackground(Color.white);
        sub.setBackground(Color.white);

        bottom.setColorA(225, 225, 225, 0);
        bottom.setColorB(147, 200, 255);

        SaveSet("ColorScheme", "white");

    }//GEN-LAST:event_whiteActionPerformed

    private void blackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackActionPerformed
        tag = 1;
        myname.setForeground(new java.awt.Color(255, 153, 0));
        welcome.setForeground(new java.awt.Color(0, 188, 0));
        sett1.setForeground(Color.white);
        vt.setForeground(Color.white);
        abt1.setForeground(Color.white);
        welcome.setForeground(Color.WHITE);
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Black_Shine.png")));
        blacky.setOpaque(true);
        blacky.setBackground(new java.awt.Color(47, 47, 47));
        cont.setBackground(new java.awt.Color(91, 91, 91));
        today.setForeground(java.awt.Color.lightGray);
        totime.setForeground(java.awt.Color.lightGray);
        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel10.setForeground(new java.awt.Color(255, 153, 0));

        mytime.setBackground(java.awt.Color.lightGray);
        mydate.setBackground(java.awt.Color.lightGray);
        sub.setBackground(java.awt.Color.lightGray);

        bottom.setColorA(225, 225, 225, 0);
        bottom.setColorB(0, 0, 0);

        SaveSet("ColorScheme", "black");

    }//GEN-LAST:event_blackActionPerformed

    private void abtMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abtMouseReleased

        Me.setLocationRelativeTo(null);
        Me.setVisible(true);
    }//GEN-LAST:event_abtMouseReleased

    private void AMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseEntered

        A.setOpaque(true);
        A.setBackground(Color.LIGHT_GRAY);
        sett1.setForeground(Color.black);

    }//GEN-LAST:event_AMouseEntered

    private void AMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseExited
        A.setOpaque(false);
        A.setBackground(null);

        if (tag == 0) {
            sett1.setForeground(Color.black);
        } else if (tag == 1) {
            sett1.setForeground(Color.white);
        }
        this.repaint();
    }//GEN-LAST:event_AMouseExited

    private void settMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settMouseClicked

    }//GEN-LAST:event_settMouseClicked

    private void BMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseEntered
        B.setOpaque(true);
        B.setBackground(Color.LIGHT_GRAY);
        abt1.setForeground(Color.black);
    }//GEN-LAST:event_BMouseEntered

    private void BMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseExited
        B.setOpaque(false);
        B.setBackground(null);

        if (tag == 0) {
            abt1.setForeground(Color.black);
        } else if (tag == 1) {
            abt1.setForeground(Color.white);
        }
        this.repaint();
    }//GEN-LAST:event_BMouseExited

    private void BMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseReleased

        Me.setLocationRelativeTo(null);
        Me.setVisible(true);
    }//GEN-LAST:event_BMouseReleased

    private void abt1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abt1MouseReleased

        Me.setLocationRelativeTo(null);
        Me.setVisible(true);
    }//GEN-LAST:event_abt1MouseReleased

    private void settMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settMouseEntered
        A.setOpaque(true);
        A.setBackground(Color.LIGHT_GRAY);
        sett1.setForeground(Color.black);
    }//GEN-LAST:event_settMouseEntered

    private void settMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settMouseExited
        A.setOpaque(false);
        A.setBackground(null);
        if (tag == 0) {
            sett1.setForeground(Color.black);
        } else if (tag == 1) {
            sett1.setForeground(Color.white);
        }
        this.repaint();
    }//GEN-LAST:event_settMouseExited

    private void abtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abtMouseEntered
        B.setOpaque(true);
        B.setBackground(Color.LIGHT_GRAY);
        abt1.setForeground(Color.black);
    }//GEN-LAST:event_abtMouseEntered

    private void abtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abtMouseExited
        B.setOpaque(false);
        B.setBackground(null);
        if (tag == 0) {
            abt1.setForeground(Color.black);
        } else if (tag == 1) {
            abt1.setForeground(Color.white);
        }
        this.repaint();
    }//GEN-LAST:event_abtMouseExited

    private void abt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abt1MouseEntered
        B.setOpaque(true);
        B.setBackground(Color.LIGHT_GRAY);
        abt1.setForeground(Color.black);
    }//GEN-LAST:event_abt1MouseEntered

    private void abt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abt1MouseExited
        B.setOpaque(false);
        B.setBackground(null);
        if (tag == 0) {
            abt1.setForeground(Color.black);
        } else if (tag == 1) {
            abt1.setForeground(Color.white);
        }
        this.repaint();
    }//GEN-LAST:event_abt1MouseExited

    private void sett1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sett1MouseEntered
        A.setOpaque(true);
        A.setBackground(Color.LIGHT_GRAY);
        sett1.setForeground(Color.black);
    }//GEN-LAST:event_sett1MouseEntered

    private void sett1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sett1MouseExited
        A.setOpaque(false);
        A.setBackground(null);
        if (tag == 0) {
            sett1.setForeground(Color.black);
        } else if (tag == 1) {
            sett1.setForeground(Color.white);
        }
        this.repaint();
    }//GEN-LAST:event_sett1MouseExited

    private void sett2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sett2MouseClicked

        Vt.setLocationRelativeTo(null);
        Vt.setVisible(true);
        Vt.checkCount();
        
    }//GEN-LAST:event_sett2MouseClicked

    private void sett2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sett2MouseEntered
        C.setOpaque(true);
        C.setBackground(Color.LIGHT_GRAY);
        vt.setForeground(Color.black);
        
    }//GEN-LAST:event_sett2MouseEntered

    private void sett2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sett2MouseExited
        C.setOpaque(false);
        C.setBackground(null);
        if (tag == 0) {
            vt.setForeground(Color.black);
        } else if (tag == 1) {
            vt.setForeground(Color.white);
        }
        this.repaint();
    }//GEN-LAST:event_sett2MouseExited

    private void vtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtMouseEntered
        C.setOpaque(true);
        C.setBackground(Color.LIGHT_GRAY);
        vt.setForeground(Color.black);
    }//GEN-LAST:event_vtMouseEntered

    private void vtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtMouseExited
        C.setOpaque(false);
        C.setBackground(null);
        if (tag == 0) {
            vt.setForeground(Color.black);
        } else if (tag == 1) {
            vt.setForeground(Color.white);
        }
        this.repaint();
    }//GEN-LAST:event_vtMouseExited

    private void CMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseEntered
        C.setOpaque(true);
        C.setBackground(Color.LIGHT_GRAY);
        vt.setForeground(Color.black);
        this.repaint();
    }//GEN-LAST:event_CMouseEntered

    private void CMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseExited
        C.setOpaque(false);

        C.setBackground(null);
        if (tag == 0) {
            vt.setForeground(Color.black);
        } else if (tag == 1) {
            vt.setForeground(Color.white);
        }
        this.repaint();
    }//GEN-LAST:event_CMouseExited

    private void vtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtMouseClicked
        Vt.setLocationRelativeTo(null);
        Vt.setVisible(true);
         Vt.checkCount();
    }//GEN-LAST:event_vtMouseClicked

    private void CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseClicked
        Vt.setLocationRelativeTo(null);
        Vt.setVisible(true);
         Vt.checkCount();
    }//GEN-LAST:event_CMouseClicked

    private void bottomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bottomMouseExited

    }//GEN-LAST:event_bottomMouseExited

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

      this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
       
       if(Vt.savedit.getText().equals(" Save Reminders"))       
       {
             Vt.CloseCheck();
           Vt.requestFocus();
           
       }
     else
       {
           this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       }
       
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Rim rim = new Rim();
       rim.setVisible(true);
       rim.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookMouseClicked

        BookTask();
    }//GEN-LAST:event_bookMouseClicked

    private void bookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookMouseEntered

        book.setBackground(new java.awt.Color(102,102,102));
        
    }//GEN-LAST:event_bookMouseEntered

    private void bookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookMouseExited

        book.setBackground(new java.awt.Color(28,28,28));
      
    }//GEN-LAST:event_bookMouseExited

    private void ampMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ampMouseClicked
     changeAMP();
    }//GEN-LAST:event_ampMouseClicked

    private void ampMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ampMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ampMouseEntered

    private void ampMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ampMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ampMouseExited

    private void nmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nmMouseClicked
       colwin.setVisible(false);
        AskName();

    }//GEN-LAST:event_nmMouseClicked

    private void nmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nmMouseEntered
        nm.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_nmMouseEntered

    private void nmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nmMouseExited
      nm.setBackground(Color.GRAY);
    }//GEN-LAST:event_nmMouseExited

    private void themeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_themeMouseClicked
     
        if(colwin.isVisible()==false)
        {
            colwin.setVisible(true);
        }
        else if(colwin.isVisible())
        {
            colwin.setVisible(false);
        }
            
    }//GEN-LAST:event_themeMouseClicked

    private void themeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_themeMouseEntered
       theme.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_themeMouseEntered

    private void themeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_themeMouseExited
        theme.setBackground(Color.GRAY);
    }//GEN-LAST:event_themeMouseExited

    
  
 
    public static void main(String args[]) {

        WindowsTheme();
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {

                Strt Me = new Strt();
                Me.setLocationRelativeTo(null);
                Me.setVisible(true);
            }

        });
    }

    //Theme changing Method----------------------------------------------
    public static void WindowsTheme() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Strt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel A;
    private javax.swing.JPanel B;
    private javax.swing.JPanel C;
    private javax.swing.ButtonGroup ThemeGroup;
    private javax.swing.JLabel abt;
    private javax.swing.JLabel abt1;
    public javax.swing.JLabel amp;
    private javax.swing.JTextField askname;
    private javax.swing.JProgressBar bar;
    private javax.swing.JLabel bg;
    private javax.swing.JRadioButton black;
    private javax.swing.JPanel blacky;
    public javax.swing.JLabel book;
    private GradPanel bottom;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel colwin;
    private javax.swing.JPanel cont;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel myname;
    private javax.swing.JFormattedTextField mytime;
    public javax.swing.JLabel nm;
    private javax.swing.JLabel ntit;
    private javax.swing.JPanel nwin;
    private javax.swing.JLabel sett;
    private javax.swing.JLabel sett1;
    private javax.swing.JLabel sett2;
    private javax.swing.JTextField sub;
    public javax.swing.JLabel theme;
    private javax.swing.JLabel today;
    private javax.swing.JLabel totime;
    private javax.swing.JLabel totime1;
    private javax.swing.JLabel totime2;
    private javax.swing.JLabel vt;
    private javax.swing.JLabel welcome;
    private javax.swing.JRadioButton white;
    // End of variables declaration//GEN-END:variables
}
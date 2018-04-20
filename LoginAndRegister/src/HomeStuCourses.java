/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ishan
 */


import java.awt.print.PrinterException;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HomeStuCourses extends javax.swing.JFrame {
    /**
     * Creates new form HomeStu
     */
    public String usearchid,contact2,emailid2,add2;
    public HomeStuCourses( String id ) {
        usearchid = id;
        initComponents();
        this.setLocationRelativeTo(null);
        fillgrades(id);
        FillCourseDropDown();
        Fill2();
        Fill3();
        Fillfac();
        Fillinvent();
        Fillacc();
        Grades.setVisible(false);
        
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root" ,"123");
            ps = con.prepareStatement("select * from student where uiddb = ?");
            ps.setString(1,id);
            rs = ps.executeQuery();
            
            try {
                if (rs.next()){
                    name.setText(rs.getString("fnamedb") + " "+ rs.getString("lnamedb") + ",");
                    user.setText(rs.getString("uiddb"));
                    contact.setText(rs.getString("Contact"));
                    email.setText(rs.getString("eiddb"));
                    daob.setText(rs.getString("dateobdb"));
                    add.setText(rs.getString("adddb"));
                }
            } catch (SQLException e){
                System.out.println(e);
            }           
            
        } catch (SQLException e){
            System.out.println(e);
        }
    }

    private HomeStuCourses() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        left = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DashboardLabel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        GradeLabel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        FacultyLabel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        CoursesLabel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        DepLabel = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        DepLabel1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        Dashboard = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        address = new javax.swing.JScrollPane();
        add = new javax.swing.JTextArea();
        user = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        daob = new javax.swing.JTextField();
        edit = new javax.swing.JPanel();
        labeledit = new javax.swing.JLabel();
        sad = new javax.swing.JPanel();
        change = new javax.swing.JLabel();
        Dep2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        Invent1 = new javax.swing.JPanel();
        facpub1 = new javax.swing.JScrollPane();
        AccTable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        InventTable = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Dep = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        rproselect = new javax.swing.JComboBox<>();
        rpro = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        prof = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        describe = new javax.swing.JTextArea();
        Facpub = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        FacTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        Faculty = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        showit1 = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        searchbar1 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        address1 = new javax.swing.JScrollPane();
        taught2 = new javax.swing.JTextArea();
        emailid = new javax.swing.JLabel();
        cont = new javax.swing.JLabel();
        pname = new javax.swing.JLabel();
        Grades = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablegd = new javax.swing.JTable();
        Courses = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        showit = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        searchbar = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cname = new javax.swing.JLabel();
        taught = new javax.swing.JLabel();
        description = new javax.swing.JScrollPane();
        text2 = new javax.swing.JTextArea();
        searcchbutton = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        top = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        minimise = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        left.setBackground(new java.awt.Color(30, 39, 46));

        jPanel17.setBackground(new java.awt.Color(30, 39, 46));

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("UDI System");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ishan\\Desktop\\UDIS2\\LoginAndRegister\\Icons\\uni.png")); // NOI18N
        jLabel6.setToolTipText("");

        DashboardLabel.setBackground(new java.awt.Color(91, 103, 103));
        DashboardLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DashboardLabel.setPreferredSize(new java.awt.Dimension(220, 58));
        DashboardLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardLabelMouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Montserrat Light", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 238, 238));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Dashboard");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout DashboardLabelLayout = new javax.swing.GroupLayout(DashboardLabel);
        DashboardLabel.setLayout(DashboardLabelLayout);
        DashboardLabelLayout.setHorizontalGroup(
            DashboardLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DashboardLabelLayout.setVerticalGroup(
            DashboardLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        GradeLabel.setBackground(new java.awt.Color(91, 103, 103));
        GradeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GradeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GradeLabelMouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Montserrat Light", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(238, 238, 238));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("GRADESHEET");

        javax.swing.GroupLayout GradeLabelLayout = new javax.swing.GroupLayout(GradeLabel);
        GradeLabel.setLayout(GradeLabelLayout);
        GradeLabelLayout.setHorizontalGroup(
            GradeLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        GradeLabelLayout.setVerticalGroup(
            GradeLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        FacultyLabel.setBackground(new java.awt.Color(91, 103, 103));
        FacultyLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FacultyLabel.setPreferredSize(new java.awt.Dimension(220, 58));
        FacultyLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FacultyLabelMouseClicked(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Montserrat Light", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(238, 238, 238));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("FACULTY INFO.");

        javax.swing.GroupLayout FacultyLabelLayout = new javax.swing.GroupLayout(FacultyLabel);
        FacultyLabel.setLayout(FacultyLabelLayout);
        FacultyLabelLayout.setHorizontalGroup(
            FacultyLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        FacultyLabelLayout.setVerticalGroup(
            FacultyLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        CoursesLabel.setBackground(new java.awt.Color(91, 103, 103));
        CoursesLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CoursesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CoursesLabelMouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Montserrat Light", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(238, 238, 238));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("COURSES");

        javax.swing.GroupLayout CoursesLabelLayout = new javax.swing.GroupLayout(CoursesLabel);
        CoursesLabel.setLayout(CoursesLabelLayout);
        CoursesLabelLayout.setHorizontalGroup(
            CoursesLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CoursesLabelLayout.setVerticalGroup(
            CoursesLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        DepLabel.setBackground(new java.awt.Color(91, 103, 103));
        DepLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DepLabel.setPreferredSize(new java.awt.Dimension(220, 58));
        DepLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepLabelMouseClicked(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setFont(new java.awt.Font("Montserrat Light", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(238, 238, 238));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("DEP. INFO. (1)");

        javax.swing.GroupLayout DepLabelLayout = new javax.swing.GroupLayout(DepLabel);
        DepLabel.setLayout(DepLabelLayout);
        DepLabelLayout.setHorizontalGroup(
            DepLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DepLabelLayout.setVerticalGroup(
            DepLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        DepLabel1.setBackground(new java.awt.Color(91, 103, 103));
        DepLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DepLabel1.setPreferredSize(new java.awt.Dimension(220, 58));
        DepLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepLabel1MouseClicked(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setFont(new java.awt.Font("Montserrat Light", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(238, 238, 238));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("DEP. INFO. (2)");

        javax.swing.GroupLayout DepLabel1Layout = new javax.swing.GroupLayout(DepLabel1);
        DepLabel1.setLayout(DepLabel1Layout);
        DepLabel1Layout.setHorizontalGroup(
            DepLabel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DepLabel1Layout.setVerticalGroup(
            DepLabel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DepLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FacultyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GradeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CoursesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DashboardLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DepLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)))
                .addContainerGap())
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DashboardLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(CoursesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(GradeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(FacultyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(DepLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(DepLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout leftLayout = new javax.swing.GroupLayout(left);
        left.setLayout(leftLayout);
        leftLayout.setHorizontalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        leftLayout.setVerticalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Dashboard.setBackground(new java.awt.Color(255, 255, 255));
        Dashboard.setPreferredSize(new java.awt.Dimension(840, 660));

        jPanel3.setPreferredSize(new java.awt.Dimension(844, 164));

        jLabel2.setFont(new java.awt.Font("Montserrat Medium", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(40, 40, 40));
        jLabel2.setText("STUDENTS PORTAL");

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(40, 40, 40));
        jLabel1.setText("CONNECT WITH YOUR DEPARTMENT ");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ishan\\Desktop\\UDIS2\\LoginAndRegister\\Icons\\user.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(40, 40, 40));
        jLabel3.setText("WELCOME ");

        name.setFont(new java.awt.Font("Montserrat", 0, 28)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Montserrat Medium", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(40, 40, 40));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("PERSONAL DETAILS :");

        jLabel12.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("USER ID :");

        jLabel13.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("CONTACT NO:");

        jLabel16.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("EMAIL ID:");

        jLabel15.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("DATE OF BIRTH:");

        jLabel4.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("ADDRESS:");

        address.setBorder(null);
        address.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        address.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        add.setEditable(false);
        add.setBackground(new java.awt.Color(240, 240, 240));
        add.setColumns(20);
        add.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        add.setLineWrap(true);
        add.setRows(5);
        add.setAutoscrolls(false);
        add.setBorder(null);
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        address.setViewportView(add);

        user.setEditable(false);
        user.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        user.setBorder(null);
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        contact.setEditable(false);
        contact.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        contact.setBorder(null);
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });

        email.setEditable(false);
        email.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        email.setBorder(null);
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        daob.setEditable(false);
        daob.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        daob.setBorder(null);
        daob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daobActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(52, 73, 94));
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });

        labeledit.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        labeledit.setForeground(new java.awt.Color(255, 255, 255));
        labeledit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeledit.setText("EDIT YOUR INFO.");

        javax.swing.GroupLayout editLayout = new javax.swing.GroupLayout(edit);
        edit.setLayout(editLayout);
        editLayout.setHorizontalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labeledit, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
        );
        editLayout.setVerticalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labeledit, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        sad.setBackground(new java.awt.Color(52, 73, 94));
        sad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sadMouseClicked(evt);
            }
        });

        change.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        change.setForeground(new java.awt.Color(255, 255, 255));
        change.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        change.setText("CHANGE PASSWORD");

        javax.swing.GroupLayout sadLayout = new javax.swing.GroupLayout(sad);
        sad.setLayout(sadLayout);
        sadLayout.setHorizontalGroup(
            sadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(change, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
        );
        sadLayout.setVerticalGroup(
            sadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(change, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout DashboardLayout = new javax.swing.GroupLayout(Dashboard);
        Dashboard.setLayout(DashboardLayout);
        DashboardLayout.setHorizontalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DashboardLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DashboardLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(7, 7, 7)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14)
                    .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(DashboardLayout.createSequentialGroup()
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(contact))
                        .addGroup(DashboardLayout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(user))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DashboardLayout.createSequentialGroup()
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(email))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DashboardLayout.createSequentialGroup()
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(daob))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DashboardLayout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(DashboardLayout.createSequentialGroup()
                                    .addComponent(sad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DashboardLayout.setVerticalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daob, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Dep2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setPreferredSize(new java.awt.Dimension(844, 164));

        jLabel62.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ishan\\Desktop\\UDIS2\\LoginAndRegister\\Icons\\info.png")); // NOI18N

        jLabel63.setFont(new java.awt.Font("Montserrat Medium", 0, 48)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(40, 40, 40));
        jLabel63.setText("DEPARTMENT INFO.");

        jLabel64.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(40, 40, 40));
        jLabel64.setText("THINGS GOING ON IN YOUR DEP.");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel62)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel64)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Invent1Layout = new javax.swing.GroupLayout(Invent1);
        Invent1.setLayout(Invent1Layout);
        Invent1Layout.setHorizontalGroup(
            Invent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 814, Short.MAX_VALUE)
        );
        Invent1Layout.setVerticalGroup(
            Invent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        facpub1.setBackground(new java.awt.Color(255, 255, 255));
        facpub1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        facpub1.setForeground(new java.awt.Color(153, 153, 153));

        AccTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Amount", "Type", "Date", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        AccTable.setGridColor(new java.awt.Color(102, 102, 102));
        facpub1.setViewportView(AccTable);

        jScrollPane5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        InventTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Object ", "Location", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(InventTable);

        jLabel18.setFont(new java.awt.Font("Montserrat Light", 1, 14)); // NOI18N
        jLabel18.setText("Accounts :");

        jLabel19.setFont(new java.awt.Font("Montserrat Light", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Inventories :");

        javax.swing.GroupLayout Dep2Layout = new javax.swing.GroupLayout(Dep2);
        Dep2.setLayout(Dep2Layout);
        Dep2Layout.setHorizontalGroup(
            Dep2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Dep2Layout.createSequentialGroup()
                .addGroup(Dep2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Dep2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Dep2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Dep2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(facpub1, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                            .addComponent(jScrollPane5))))
                .addGap(26, 26, 26))
            .addGroup(Dep2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Dep2Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(Invent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(31, Short.MAX_VALUE)))
        );
        Dep2Layout.setVerticalGroup(
            Dep2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dep2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Dep2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Dep2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(facpub1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(Dep2Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)))
                .addGroup(Dep2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Dep2Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Dep2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(132, 132, 132))))
            .addGroup(Dep2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Dep2Layout.createSequentialGroup()
                    .addGap(546, 546, 546)
                    .addComponent(Invent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(114, Short.MAX_VALUE)))
        );

        Dep.setBackground(new java.awt.Color(255, 255, 255));
        Dep.setPreferredSize(new java.awt.Dimension(840, 660));

        jPanel7.setPreferredSize(new java.awt.Dimension(844, 164));

        jLabel61.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ishan\\Desktop\\UDIS2\\LoginAndRegister\\Icons\\info.png")); // NOI18N

        jLabel59.setFont(new java.awt.Font("Montserrat Medium", 0, 48)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(40, 40, 40));
        jLabel59.setText("DEPARTMENT INFO.");

        jLabel60.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(40, 40, 40));
        jLabel60.setText("THINGS GOING ON IN YOUR DEP.");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel61)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel60)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel51.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("View Ongoing Research projects :");

        rproselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rproselectActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel50.setText("Title :");

        title.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N

        jLabel52.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel52.setText("UNDER PROF :");

        prof.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N

        jLabel53.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel53.setText("DESCRIPTION :");

        jScrollPane2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        describe.setColumns(20);
        describe.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        describe.setRows(5);
        jScrollPane2.setViewportView(describe);

        javax.swing.GroupLayout rproLayout = new javax.swing.GroupLayout(rpro);
        rpro.setLayout(rproLayout);
        rproLayout.setHorizontalGroup(
            rproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rproLayout.createSequentialGroup()
                .addGroup(rproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(rproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(prof, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE))
                .addContainerGap())
        );
        rproLayout.setVerticalGroup(
            rproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rproLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prof, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rproLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Facpub.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        FacTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Professor", "Publication Name", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(FacTable);

        javax.swing.GroupLayout FacpubLayout = new javax.swing.GroupLayout(Facpub);
        Facpub.setLayout(FacpubLayout);
        FacpubLayout.setHorizontalGroup(
            FacpubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
            .addGroup(FacpubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FacpubLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        FacpubLayout.setVerticalGroup(
            FacpubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
            .addGroup(FacpubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FacpubLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Click Here For Faculty Publications");
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout DepLayout = new javax.swing.GroupLayout(Dep);
        Dep.setLayout(DepLayout);
        DepLayout.setHorizontalGroup(
            DepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DepLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(DepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DepLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(DepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rproselect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)))
                    .addComponent(rpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DepLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Facpub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DepLayout.setVerticalGroup(
            DepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(DepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DepLayout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rproselect, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DepLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGroup(DepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DepLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(Facpub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        Faculty.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setPreferredSize(new java.awt.Dimension(844, 164));

        jLabel46.setFont(new java.awt.Font("Montserrat Medium", 0, 48)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(40, 40, 40));
        jLabel46.setText("FACULTY INFO.");

        jLabel48.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ishan\\Desktop\\UDIS2\\LoginAndRegister\\Icons\\fac.png")); // NOI18N

        jLabel47.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(40, 40, 40));
        jLabel47.setText("GET TO KNOW THE FACULTY");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel48)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel48)
                .addContainerGap())
        );

        jLabel34.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        jLabel34.setText("SELECT THE PROFESSOR FROM DROP DOWN MENU :");

        showit1.setBackground(new java.awt.Color(240, 240, 240));
        showit1.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        showit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showit1ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        jLabel36.setText("OR ENTER THE NAME IN THE SEARCH BAR :");

        searchbar1.setBackground(new java.awt.Color(240, 240, 240));
        searchbar1.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        searchbar1.setForeground(new java.awt.Color(40, 40, 40));
        searchbar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchbar1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel37.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ishan\\Downloads\\search-icon-large.png")); // NOI18N
        jLabel37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        jLabel45.setText("PROF. NAME :");

        jLabel44.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel44.setText("CONTACT NO. :");

        jLabel35.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("EMAIL ID. :");

        jLabel49.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel49.setText("COURSES TAUGHT :");

        address1.setBorder(null);
        address1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        address1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        taught2.setEditable(false);
        taught2.setColumns(20);
        taught2.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        taught2.setLineWrap(true);
        taught2.setRows(5);
        taught2.setAutoscrolls(false);
        taught2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        taught2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        taught2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        address1.setViewportView(taught2);

        emailid.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        emailid.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        cont.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        cont.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pname.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        pname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout FacultyLayout = new javax.swing.GroupLayout(Faculty);
        Faculty.setLayout(FacultyLayout);
        FacultyLayout.setHorizontalGroup(
            FacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FacultyLayout.createSequentialGroup()
                .addGroup(FacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FacultyLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(FacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showit1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FacultyLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FacultyLayout.createSequentialGroup()
                                .addComponent(searchbar1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel37))
                            .addGroup(FacultyLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FacultyLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel44)
                                .addGap(18, 18, 18)
                                .addComponent(cont, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FacultyLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(emailid, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FacultyLayout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addGap(18, 18, 18)
                                .addComponent(address1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(FacultyLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FacultyLayout.setVerticalGroup(
            FacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FacultyLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(showit1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(FacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchbar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addGap(26, 26, 26)
                .addGroup(FacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FacultyLayout.createSequentialGroup()
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(FacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailid, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(FacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cont, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        Grades.setBackground(new java.awt.Color(255, 255, 255));
        Grades.setPreferredSize(new java.awt.Dimension(840, 660));

        jPanel4.setPreferredSize(new java.awt.Dimension(844, 164));

        jLabel58.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ishan\\Desktop\\UDIS2\\LoginAndRegister\\Icons\\grades.png")); // NOI18N

        jLabel56.setFont(new java.awt.Font("Montserrat Medium", 0, 48)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(40, 40, 40));
        jLabel56.setText("GRADESHEET");

        jLabel57.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(40, 40, 40));
        jLabel57.setText("TRACK PERFORMANCE ");

        jButton1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 121, 107));
        jButton1.setText("Print Table");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel58)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Tablegd.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        Tablegd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Name", "Extras (20)", "Midterms (30)", "Endterms (50)", "Final Percentage "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tablegd);

        javax.swing.GroupLayout GradesLayout = new javax.swing.GroupLayout(Grades);
        Grades.setLayout(GradesLayout);
        GradesLayout.setHorizontalGroup(
            GradesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GradesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        GradesLayout.setVerticalGroup(
            GradesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GradesLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Courses.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setPreferredSize(new java.awt.Dimension(844, 164));

        jLabel25.setFont(new java.awt.Font("Montserrat Medium", 0, 48)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(40, 40, 40));
        jLabel25.setText("COURSES INFO.");

        jLabel26.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(40, 40, 40));
        jLabel26.setText("GET TO KNOW THE COURSES");

        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ishan\\Desktop\\UDIS2\\LoginAndRegister\\Icons\\courses.png")); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(131, 131, 131))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel27)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel24.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        jLabel24.setText("SELECT THE COURSE FROM DROP DOWN MENU :");

        showit.setBackground(new java.awt.Color(240, 240, 240));
        showit.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        showit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showitActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        jLabel28.setText("OR ENTER THE NAME IN THE SEARCH BAR :");

        searchbar.setBackground(new java.awt.Color(240, 240, 240));
        searchbar.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        searchbar.setForeground(new java.awt.Color(40, 40, 40));
        searchbar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchbar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel31.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        jLabel31.setText("COURSE NAME :");

        jLabel30.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("TAUGHT BY:");

        cname.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        cname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        taught.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        taught.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        description.setBorder(null);
        description.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        description.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        text2.setEditable(false);
        text2.setColumns(20);
        text2.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        text2.setLineWrap(true);
        text2.setRows(5);
        text2.setAutoscrolls(false);
        text2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        text2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        text2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        description.setViewportView(text2);

        searcchbutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ishan\\Downloads\\search-icon-large.png")); // NOI18N
        searcchbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searcchbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searcchbuttonMouseClicked(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(204, 204, 204));
        jLabel22.setFont(new java.awt.Font("Montserrat Light", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText(" CLICK HERE TO REGISTER FOR THE COURSE !!");
        jLabel22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CoursesLayout = new javax.swing.GroupLayout(Courses);
        Courses.setLayout(CoursesLayout);
        CoursesLayout.setHorizontalGroup(
            CoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(CoursesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(CoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(showit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CoursesLayout.createSequentialGroup()
                            .addComponent(searchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(searcchbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CoursesLayout.createSequentialGroup()
                        .addGroup(CoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(26, 26, 26)
                        .addGroup(CoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(taught, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cname, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CoursesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CoursesLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        CoursesLayout.setVerticalGroup(
            CoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoursesLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searcchbutton))
                .addGap(18, 18, 18)
                .addGroup(CoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taught, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        top.setBackground(new java.awt.Color(255, 255, 255));

        exit.setFont(new java.awt.Font("Nexa Bold", 1, 36)); // NOI18N
        exit.setForeground(new java.awt.Color(40, 40, 40));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setToolTipText("");
        exit.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        minimise.setFont(new java.awt.Font("Nexa Bold", 1, 36)); // NOI18N
        minimise.setForeground(new java.awt.Color(40, 40, 40));
        minimise.setText("-");
        minimise.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimiseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimise)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit)
                .addGap(27, 27, 27))
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit)
                    .addComponent(minimise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Courses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Faculty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Grades, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
                    .addComponent(Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
                    .addComponent(Dep2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Dep, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Courses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Faculty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Grades, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                    .addComponent(Dep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                    .addComponent(Dep2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void FacultyLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacultyLabelMouseClicked
        Faculty.setVisible(true);
        Grades.setVisible(false);
        Courses.setVisible(false);
        Dashboard.setVisible(false);
        Dep.setVisible(false);
        Dep2.setVisible(false);
    }//GEN-LAST:event_FacultyLabelMouseClicked
   
    private void DashboardLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardLabelMouseClicked
        Dashboard.setVisible(true);
        Grades.setVisible(false);
        Courses.setVisible(false);
        Faculty.setVisible(false);
        Dep.setVisible(false);
        Dep2.setVisible(false);
    }//GEN-LAST:event_DashboardLabelMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void minimiseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimiseMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimiseMouseClicked

    private void showitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showitActionPerformed
        String search = (String)showit.getSelectedItem();
        Dsplay ( search );
    }//GEN-LAST:event_showitActionPerformed

    private void searcchbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searcchbuttonMouseClicked
        String search = searchbar.getText();
        Dsplay ( search );
    }//GEN-LAST:event_searcchbuttonMouseClicked

    private void showit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showit1ActionPerformed
        String search = (String)showit1.getSelectedItem();
        Dsplay2 ( search );
    }//GEN-LAST:event_showit1ActionPerformed

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
        String search = searchbar1.getText();

        Dsplay2 ( search );
    }//GEN-LAST:event_jLabel37MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Dashboard.setVisible(true);
        Grades.setVisible(false);
        Courses.setVisible(false);
        Faculty.setVisible(false);
        Dep.setVisible(false);
        Dep2.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void rproselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rproselectActionPerformed
        rpro.setVisible(true);
        Facpub.setVisible(false);
        FacTable.setVisible(false);
        String search = (String)rproselect.getSelectedItem();
        Dsplay3 ( search );
    }//GEN-LAST:event_rproselectActionPerformed

    private void CoursesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CoursesLabelMouseClicked
        Courses.setVisible(true);
        Grades.setVisible(false);
        Dashboard.setVisible(false);
        Faculty.setVisible(false);
        Dep.setVisible(false);
        Dep2.setVisible(false);
    }//GEN-LAST:event_CoursesLabelMouseClicked

    private void GradeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GradeLabelMouseClicked
        Grades.setVisible(true);
        Dashboard.setVisible(false);
        Courses.setVisible(false);
        Faculty.setVisible(false);
        Dep.setVisible(false);
        Dep2.setVisible(false);
    }//GEN-LAST:event_GradeLabelMouseClicked

    private void DepLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepLabelMouseClicked
        Dep.setVisible(true);
        Grades.setVisible(false);
        Courses.setVisible(false);
        Faculty.setVisible(false);
        Dashboard.setVisible(false);
        Dep2.setVisible(false);
    }//GEN-LAST:event_DepLabelMouseClicked

    private void DepLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepLabel1MouseClicked
        Dep2.setVisible(true);
        Grades.setVisible(false);
        Courses.setVisible(false);
        Faculty.setVisible(false);
        Dashboard.setVisible(false);
        Dep.setVisible(false);
        AccTable.setVisible(true);
        InventTable.setVisible(true);
    }//GEN-LAST:event_DepLabel1MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        Facpub.setVisible(true);
        FacTable.setVisible(true);
        rpro.setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void daobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daobActionPerformed

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        String toadd = cname.getText();
        updatecourses( toadd );
    }//GEN-LAST:event_jLabel22MouseClicked

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        if ( (labeledit.getText()).equals("EDIT YOUR INFO.") ){
            change.setText("CANCEL");
            labeledit.setText("UPDATE");
            add.setEditable(true);
            contact.setEditable(true);
            email.setEditable(true);
            contact2 = contact.getText();
            add2 = add.getText();
            emailid2 = email.getText();
        } else {
            change.setText("CHANGE PASSWORD");
            labeledit.setText("EDIT YOUR INFO.");
            
            Connection conn = null;
            
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root" ,"123");
                
                String sql = "UPDATE student SET Contact=?,adddb=?,eiddb=? WHERE uiddb=?";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1,contact.getText());
                pst.setString(2,add.getText());
                pst.setString(3,email.getText());
                pst.setString(4,usearchid);
                pst.execute();
                error ef = new error("UPDATED","Profile Updated Successfully!");
                ef.setVisible(true);
                ef.pack();
                ef.setLocationRelativeTo(null);             
                
            } catch (Exception e){
                System.out.println(e);
            }
            
            add.setEditable(false);
            contact.setEditable(false);
            email.setEditable(false);
        
        }
    }//GEN-LAST:event_editMouseClicked

    private void sadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sadMouseClicked
        if ( (change.getText()).equals("CANCEL")){
            change.setText("CHANGE PASSWORD");
            labeledit.setText("EDIT YOUR INFO.");
            add.setEditable(false);
            contact.setEditable(false);
            email.setEditable(false);
            add.setText(add2);
            contact.setText(contact2);
            email.setText(emailid2);
        } else {
            ChangePass cp = new ChangePass ( usearchid , "S" );
            cp.setVisible(true);
            cp.pack();
            cp.setLocationRelativeTo(null);
            
        }
    }//GEN-LAST:event_sadMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        try {
            printTable(Tablegd,"GRADESHEET");
        } catch (PrinterException ex) {
            Logger.getLogger(HomeStuCourses.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1MouseClicked
   
    private void printTable(JTable table, String header) throws PrinterException{
	table.print(JTable.PrintMode.FIT_WIDTH, new MessageFormat(header), null);
    }
    
    private void fillgrades ( String uid ){
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        try {
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root" ,"123");
            ps = con.prepareStatement("select * from grades where userid  = ?");
            ps.setString(1,uid);
            rs = ps.executeQuery();
            
            try {
                if ( rs.next() ){
                    DefaultTableModel model = (DefaultTableModel)Tablegd.getModel();
                    String[] Courses = (rs.getString("Subjects")).split(",");
                    String[] Extra = (rs.getString("Extras")).split(",");
                    String[] Mids = (rs.getString("Midterms")).split(",");
                    String[] End = (rs.getString("Endterms")).split(",");
                    Object[] row = new Object[5];
                    
                    for (int i =0 ; i< Courses.length ; i++ ){
                        row[0] = Courses[i];
                        row[1] = Extra[i];
                        row[2] = Mids[i];
                        row[3] = End[i];
                        row[4] = Integer.parseInt(Extra[i]) + Integer.parseInt(End[i]) + Integer.parseInt(Mids[i]);
                        model.addRow(row);
                    }
                }
                Grades.setVisible(false);
            } catch ( Exception e ){
                System.out.println(e);
            }
            
        } catch ( Exception e ){
            System.out.println(e);
        }
    }
    private void FillCourseDropDown(){
        
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root" ,"123");
            ps = con.prepareStatement("select * from courses");
            rs = ps.executeQuery();
            
            while ( rs.next() ){
                String nname = rs.getString("CourseName");
                showit.addItem(nname);
            }
            Courses.setVisible(false);
            
        } catch ( Exception e ){
            System.out.println(e);
        }
    }
    private void Dsplay ( String search ){

        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;

        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root" ,"123");
            ps = con.prepareStatement("select * from courses where CourseName  = ?");
            ps.setString(1,search);
            rs = ps.executeQuery();
                try {
                if (rs.next()){
                    cname.setText(rs.getString("CourseName"));
                    String Name[] = new String[2];
                    Name = rs.getString("Profteach").split("-");
                    taught.setText(Name[1]);
                    text2.setText(rs.getString("Description"));
                    
                }
            } catch (Exception e){
                System.out.println(e);
            }           
            
        } catch (Exception e){
            System.out.println(e);
        }
    }
    private void Fill2(){
        
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root" ,"123");
            ps = con.prepareStatement("select * from faculty");
            rs = ps.executeQuery();
            
            while ( rs.next() ){
                String nname = rs.getString("fname");
                String n2name = rs.getString("lname");
                showit1.addItem(nname + " " + n2name);
            }
            Faculty.setVisible(false);
            
        } catch ( Exception e ){
            System.out.println(e);
        }
    }
    private void Dsplay2 ( String search ){

        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        String Name[] = new String[2];
        Name = search.split(" ");
        

        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root" ,"123");
            ps = con.prepareStatement("select * from faculty where fname  = ? ");
            ps.setString(1,Name[0]);
            rs = ps.executeQuery();
                try {
                while (rs.next()){
                    if ( Name.length == 1 || Name[1].equals(rs.getString("lname")) ){
                    pname.setText(rs.getString("fname") + " " + rs.getString("lname"));
                    cont.setText(rs.getString("contact"));
                    emailid.setText(rs.getString("eiddb"));
                    taught2.setText(rs.getString("course"));
                    }
                }
            } catch (Exception e){
                System.out.println(e);
            }           
            
        } catch (Exception e){
            System.out.println(e);
        }
    }
    private void Fill3(){
        
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root" ,"123");
            ps = con.prepareStatement("select * from research");
            rs = ps.executeQuery();
            
            while ( rs.next() ){
                String nname = rs.getString("Title");
                rproselect.addItem(nname);
            }
            Dep.setVisible(false);
            
        } catch ( Exception e ){
            System.out.println(e);
        }
    }
    private void Dsplay3 ( String search ){

        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        

        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root" ,"123");
            ps = con.prepareStatement("select * from research where Title  = ? ");
            ps.setString(1,search);
            rs = ps.executeQuery();
                try {
                while (rs.next()){                    
                    title.setText(rs.getString("Title"));
                    prof.setText(rs.getString("Prof"));
                    describe.setText(rs.getString("Desc"));
                }
            } catch (Exception e){
                System.out.println(e);
            }           
            
        } catch (Exception e){
            System.out.println(e);
        }
    }
    private void Fillacc (){
        Dep.setVisible(false);
        Dep2.setVisible(false);
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root" ,"123");
            ps = con.prepareStatement("select * from test.accounts");
            rs = ps.executeQuery();
            
            try {
                while ( rs.next() ){
                    DefaultTableModel model = (DefaultTableModel)AccTable.getModel();
                    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                    String[] row = new String[4];
                        row[0] = rs.getString("amt");
                        row[1] = rs.getString("type");
                        row[2] = df.format(rs.getDate("date"));
                        row[3] = rs.getString("desc");
                        model.addRow(row);                        
                }
                AccTable.setVisible(false);
            } catch ( Exception e ){
                System.out.println(e);
            }
            
        } catch ( Exception e ){
            System.out.println(e);
        }
    }
    private void Fillfac (){
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {         
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root" ,"123");
            ps = con.prepareStatement("select * from facpub");
            rs = ps.executeQuery();
            
            try {
                while ( rs.next() ){
                    DefaultTableModel model2 = (DefaultTableModel)FacTable.getModel();
                    String[] row = new String[3];
                        row[0] = rs.getString("Prof");
                        row[1] = rs.getString("Name");
                        row[2] = rs.getString("Desc");
                        model2.addRow(row);
                    }
                Facpub.setVisible(false);
            } catch ( Exception e ){
                System.out.println(e);
            }
            
        } catch ( Exception e ){
            System.out.println(e);
        }
    }
    private void Fillinvent (){
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root" ,"123");
            ps = con.prepareStatement("select * from invent");
            rs = ps.executeQuery();
            
            try {
                while ( rs.next() ){
                    DefaultTableModel model3 = (DefaultTableModel)InventTable.getModel();
                    String[] row = new String[3];
                        row[0] = rs.getString("Object");
                        row[1] = rs.getString("Location");
                        row[2] = rs.getString("Desc");
                        model3.addRow(row);                     
                }
                InventTable.setVisible(false);
            } catch ( Exception e ){
                System.out.println(e);
            }
            
        } catch ( Exception e ){
            System.out.println(e);
        }
    }
    private void updatecourses ( String toadd ){
        
        int flag = 0;
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root" ,"123");
            ps = con.prepareStatement("select * from grades where userid = ?");
            ps.setString(1,usearchid );
            rs = ps.executeQuery();
            
            try {
                if (rs.next()){
                    String courses[] = (rs.getString("Subjects")).split(",");
                    for ( int i=0 ; i<courses.length ; i++ ){
                        if ( courses[i].equals(toadd) ){
                            flag = 1;
                            error ef = new error("ERROR","Already Registered in the Course!");
                            ef.setVisible(true);
                            ef.pack();
                            ef.setLocationRelativeTo(null);
                        }
                    }
                    
                    if (flag == 0){
                        String Subs = rs.getString("Subjects");
                        Subs = Subs + "," + toadd;
                        String Mids = rs.getString("Midterms");
                        Mids = Mids + ",0"; 
                        String Ends = rs.getString("Endterms");
                        Ends = Ends + ",0"; 
                        String Extras = rs.getString("Extras");
                        Extras = Extras + ",0"; 
                    
                        String sql = "UPDATE test.grades SET Subjects = ? , Midterms = ?, Endterms = ? , Extras = ? WHERE  userid= ? ";
                        PreparedStatement ps2 = con.prepareStatement(sql);
                        ps2.setString(1,Subs);
                        ps2.setString(2,Mids);
                        ps2.setString(3,Ends);
                        ps2.setString(4,Extras);
                        ps2.setString(5,usearchid);
                        ps2.execute();
                        error ef = new error("SUCCESSFUL","Successfully Registered in the Course!");
                        ef.setVisible(true);
                        ef.pack();
                        ef.setLocationRelativeTo(null);
                        
                        DefaultTableModel model = (DefaultTableModel)Tablegd.getModel();
                        Object[] row = new Object[5];
                    
                        for (int i =0 ; i< 5 ; i++ ){
                            row[0] = toadd;
                            row[1] = 0;
                            row[2] = 0;
                            row[3] = 0;
                            row[4] = 0;
                        }
                        model.addRow(row);
                    }
                        
                } else {
                    PreparedStatement pst = con.prepareStatement("INSERT INTO `test`.`grades` (`userid`, `Subjects`, `Midterms`, `Endterms`, `Extras`) VALUES (?,?,?,?,?);");
                    pst.setString(1,usearchid);
                    pst.setString(2,toadd);
                    pst.setString(3, "0");
                    pst.setString(4, "0");
                    pst.setString(5, "0");
                    pst.execute();
                    error ef = new error("SUCCESSFUL","Successfully Registered in the Course!");
                    ef.setVisible(true);
                    ef.pack();
                    ef.setLocationRelativeTo(null);
                    DefaultTableModel model = (DefaultTableModel)Tablegd.getModel();
                        Object[] row = new Object[5];
                    
                        for (int i =0 ; i< 5 ; i++ ){
                            row[0] = toadd;
                            row[1] = 0;
                            row[2] = 0;
                            row[3] = 0;
                            row[4] = 0;
                        }
                        model.addRow(row);
                }
            } catch (SQLException e){
                System.out.println(e);
            }           
            
        } catch (SQLException e){
            System.out.println(e);
        }
    }
    
    protected String[] info(){
        String[] ret = new String[5];
        
        ret[0] = contact.getText();
        ret[1] = email.getText();
        ret[2] = daob.getText();
        ret[3] = add.getText();
        ret[4] = name.getText();
        
        return ret;
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
            java.util.logging.Logger.getLogger(HomeStu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeStu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeStu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeStu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new HomeStuCourses( "011" ).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AccTable;
    private javax.swing.JPanel Courses;
    private javax.swing.JPanel CoursesLabel;
    private javax.swing.JPanel Dashboard;
    private javax.swing.JPanel DashboardLabel;
    private javax.swing.JPanel Dep;
    private javax.swing.JPanel Dep2;
    private javax.swing.JPanel DepLabel;
    private javax.swing.JPanel DepLabel1;
    private javax.swing.JTable FacTable;
    private javax.swing.JPanel Facpub;
    private javax.swing.JPanel Faculty;
    private javax.swing.JPanel FacultyLabel;
    private javax.swing.JPanel GradeLabel;
    private javax.swing.JPanel Grades;
    private javax.swing.JPanel Invent1;
    private javax.swing.JTable InventTable;
    private javax.swing.JTable Tablegd;
    private javax.swing.JTextArea add;
    private javax.swing.JScrollPane address;
    private javax.swing.JScrollPane address1;
    private javax.swing.JLabel change;
    private javax.swing.JLabel cname;
    private javax.swing.JLabel cont;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField daob;
    private javax.swing.JTextArea describe;
    private javax.swing.JScrollPane description;
    private javax.swing.JPanel edit;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailid;
    private javax.swing.JLabel exit;
    private javax.swing.JScrollPane facpub1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel labeledit;
    private javax.swing.JPanel left;
    private javax.swing.JLabel minimise;
    private javax.swing.JLabel name;
    private javax.swing.JLabel pname;
    private javax.swing.JLabel prof;
    private javax.swing.JPanel rpro;
    private javax.swing.JComboBox<String> rproselect;
    private javax.swing.JPanel sad;
    private javax.swing.JLabel searcchbutton;
    private javax.swing.JTextField searchbar;
    private javax.swing.JTextField searchbar1;
    private javax.swing.JComboBox<String> showit;
    private javax.swing.JComboBox<String> showit1;
    private javax.swing.JLabel taught;
    private javax.swing.JTextArea taught2;
    private javax.swing.JTextArea text2;
    private javax.swing.JLabel title;
    private javax.swing.JPanel top;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

    private String format(DateFormat df) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class HomeStu {

        public HomeStu() {
        }
    }
}

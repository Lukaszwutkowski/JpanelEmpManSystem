
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.coobird.thumbnailator.Thumbnails;
import net.proteanit.sql.DbUtils;
import javax.persistence.*;











/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cybarg
 */
public class EmployeeInfo extends javax.swing.JFrame {

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("my-persistence-unit");
    EntityManager em = factory.createEntityManager();
    
     Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    public EmployeeInfo() {
        initComponents();
        
        conn= MysqlConnect.ConnectDB();
        jRadioButton1.setSelected(false);
        jRadioButton1.setVisible(false);
        update_table();
       btn_save.setEnabled(false);
        
      
}
    
    public void Clearfields(){
    txt_employeeid.setText("");
    txt_name.setText("");
    txt_age.setText("");
    txt_bloodgroup.setText("");
    txt_contactno.setText("");
    jComboBox_qualificaton.setSelectedIndex(-1);
    jDateChooser1.setDate(null);
    jTextArea_Address.setText("");
    imagelabel.setIcon(null);
    txt_imagepath.setText("");
    
    jRadioButton_Male.setSelected(false);
    jRadioButton_Female.setSelected(false);
    jRadioButton1.setSelected(true);
    
  };
    
    
    private void update_table(){
    
        try {
         String sql = "select * from employeeinfo"; 
         pst=conn.prepareStatement(sql);
         rs=pst.executeQuery();
         Table_data.setModel(DbUtils.resultSetToTableModel(rs));
            
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        } finally{
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {
            }
        
        
        }
    
    
    
    };

   
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_employeeid = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_age = new javax.swing.JTextField();
        txt_bloodgroup = new javax.swing.JTextField();
        txt_contactno = new javax.swing.JTextField();
        jRadioButton_Male = new javax.swing.JRadioButton();
        jRadioButton_Female = new javax.swing.JRadioButton();
        jComboBox_qualificaton = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Address = new javax.swing.JTextArea();
        btn_imageupload = new javax.swing.JButton();
        txt_imagepath = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        imagelabel = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btn_new = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btn_print = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_data = new JTable();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("EmployeeID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Gender");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Age");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("BloodGroup");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("ContactNo");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Qualification");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("DOJ");

        txt_employeeid.setEditable(false);
        txt_employeeid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_employeeid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));

        txt_name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));

        txt_age.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_age.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));

        txt_bloodgroup.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_bloodgroup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));

        txt_contactno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_contactno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));

        buttonGroup1.add(jRadioButton_Male);
        jRadioButton_Male.setText("Male");
        jRadioButton_Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_MaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton_Female);
        jRadioButton_Female.setText("Female");
        jRadioButton_Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_FemaleActionPerformed(evt);
            }
        });

        jComboBox_qualificaton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox_qualificaton.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MBA", "MBBS", "B.TECH", "M.TECH", "B.Com", "BCA", "MCA", "PHD", " " }));
        jComboBox_qualificaton.setSelectedIndex(-1);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Address");

        jTextArea_Address.setColumns(20);
        jTextArea_Address.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Address);

       // btn_imageupload.setIcon(new ImageIcon(getClass().getResource("/images/image upload.png"))); // NOI18N
        btn_imageupload.setText("Upload Image");
        btn_imageupload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imageuploadActionPerformed(evt);
            }
        });

        jLabel10.setText("Image Path");

        jDesktopPane1.setBackground(new java.awt.Color(153, 153, 153));

        imagelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagelabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagelabel, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagelabel, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1.setLayer(imagelabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("r3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(32, 32, 32)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_employeeid, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                .addComponent(txt_name)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                    .addGap(28, 28, 28))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(80, 80, 80)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_contactno, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                .addComponent(jComboBox_qualificaton, 0, 167, Short.MAX_VALUE)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(80, 80, 80))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(61, 61, 61)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(32, 32, 32)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_bloodgroup, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton_Male, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton_Female, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(txt_imagepath, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(btn_imageupload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_employeeid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jRadioButton_Male)
                                        .addComponent(jRadioButton_Female)
                                        .addComponent(jRadioButton1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txt_bloodgroup, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_contactno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jComboBox_qualificaton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btn_imageupload, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_imagepath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_new.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
      //  btn_new.setIcon(new ImageIcon(getClass().getResource("/images/new-icon.png"))); // NOI18N
        btn_new.setText("New");
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        btn_save.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
       // btn_save.setIcon(new ImageIcon(getClass().getResource("/images/Save-icon.png"))); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_update.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
       // btn_update.setIcon(new ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
       // ImageIcon icon = new ImageIcon(getClass().getResource("/images/delete.png"));
       // btn_delete.setIcon(icon);
       // btn_delete.setIcon(new ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
      //  btn_clear.setIcon(new ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("SEARCH");

        btn_print.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
     //   btn_print.setIcon(new ImageIcon(getClass().getResource("/images/Printer-icon.png"))); // NOI18N
        btn_print.setText("Print");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_new)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_clear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addComponent(btn_save, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_update, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_new, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        jPanel4.add(jPanel5);

        Table_data.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        Table_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table_data.setGridColor(new java.awt.Color(0, 204, 255));
        Table_data.setSelectionBackground(new java.awt.Color(102, 102, 102));
        Table_data.setSelectionForeground(new java.awt.Color(102, 255, 255));
        Table_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_dataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Table_data);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_imageuploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imageuploadActionPerformed
      
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename=f.getAbsolutePath();
        txt_imagepath.setText(filename);
        
        try {
            
            File image =new File(filename);
            
            BufferedImage thumbanail = Thumbnails.of(image).size(220, 230).asBufferedImage();
            
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            
            ImageIO.write(thumbanail, "jpeg", os);
            
            InputStream is = new ByteArrayInputStream(os.toByteArray());
            
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            
            byte[] buf = new byte[1024];  // 1 MB
            
            for(int readNum;(readNum = is.read(buf))!=-1;){
            
            bos.write(buf,0,readNum);
            
            
            }
            
            viewimage=new ImageIcon(thumbanail);
            imagelabel.setIcon(viewimage);
            
            
            employeeimage=bos.toByteArray();
            
           
             
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
        
        
    }//GEN-LAST:event_btn_imageuploadActionPerformed

    private void jRadioButton_MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_MaleActionPerformed
     gender="Male" ; 
    }//GEN-LAST:event_jRadioButton_MaleActionPerformed

    private void jRadioButton_FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_FemaleActionPerformed
       gender="Female";
    }//GEN-LAST:event_jRadioButton_FemaleActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
       String name_validate = txt_name.getText();
       
        String age_validae =txt_age.getText();
         String bg_validate =txt_bloodgroup.getText();
         String cn_validate =txt_contactno.getText();
         
         java.util.Date dte = jDateChooser1.getDate();
         
         String address_validate =jTextArea_Address.getText();
         
         if(name_validate.equals("")){
         
             JOptionPane.showMessageDialog(null, "PLEASE TYPE NAME");
             
         }else if(gender==null){
         
          JOptionPane.showMessageDialog(null, "PLEASE SELECT GENDER - MALE or FEMALE");
         }
         
         else if(age_validae.equals("")){
         
         JOptionPane.showMessageDialog(null, "PLEASE TYPE AGE");
         
         
         }
         else if(bg_validate.equals("")){
          JOptionPane.showMessageDialog(null, "PLEASE TYPE BLOOD GROUP");
         
         }
         else if(cn_validate.equals("")){
         
         JOptionPane.showMessageDialog(null, "PLEASE TYPE CONTACT NO:");
         
         
         }
         else if(jComboBox_qualificaton.getSelectedItem()==null){
         JOptionPane.showMessageDialog(null, "PLEASE SELECT QUALIFICATION"); 
         
         }
         else if(dte==null){
          JOptionPane.showMessageDialog(null, "PLEASE SELECT DATE"); 
         
         }
         else if(address_validate.equals("")){
          JOptionPane.showMessageDialog(null, "PLEASE TYPE ADDRESS"); 
         
         
         }
         else if(employeeimage==null){
         JOptionPane.showMessageDialog(null, "PLEASE CHOOSE IMAGE"); 
         
         }else{
         
        
        
        try {
            String sql = "insert into employeeinfo (Name,Gender,Age,BloodGroup,ContactNo,Qualification,DOJ,Address,EmpImage)values(?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            
            pst.setString(1, txt_name.getText());
            pst.setString(2, gender);
            pst.setString(3, txt_age.getText());
            pst.setString(4, txt_bloodgroup.getText());
            pst.setString(5, txt_contactno.getText());
               
               String combovalue = jComboBox_qualificaton.getSelectedItem().toString();
               pst.setString(6, combovalue);
               
          java.util.Date date = jDateChooser1.getDate();
SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
String strDateOutput = sdf.format(date);


      pst.setString(7, strDateOutput);
      
      pst.setString(8, jTextArea_Address.getText());
      
      pst.setBytes(9,employeeimage);
      
      pst.execute();
      
      JOptionPane.showMessageDialog(null, "Data Saved Successful");
      
              
            
            
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
      
            
            
        }finally{
            try {
             rs.close();
             pst.close();
                
                
            } catch (Exception e) {
                
                
            }
        
        
        
        }
    
       
         }//end else here   
         update_table();
         Clearfields();
         btn_save.setEnabled(false);
        btn_new.setEnabled(true);
        btn_update.setEnabled(true);
        btn_delete.setEnabled(true);
        btn_clear.setEnabled(true);
         
         
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
       
        Clearfields();
         btn_save.setEnabled(true);
        btn_new.setEnabled(false);
        btn_update.setEnabled(false);
        btn_delete.setEnabled(false);
        btn_clear.setEnabled(false);
    }//GEN-LAST:event_btn_newActionPerformed

    private void Table_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_dataMouseClicked
       int row = Table_data.getSelectedRow();
       String Table_click=(Table_data.getModel().getValueAt(row, 0).toString());
       
        try {
         String sql = "select * from employeeinfo where EmployeeID='"+Table_click+"'";   
         pst=conn.prepareStatement(sql);
         rs=pst.executeQuery();
         
         if(rs.next()){
         String strempid = rs.getString("EmployeeID");
         txt_employeeid.setText(strempid);
         
         String strname = rs.getString("Name");
         txt_name.setText(strname);
         
         String strgender = rs.getString("Gender");
         if("Male".equals(strgender)){
         
         jRadioButton_Male.setSelected(true);
         }
         
         if("Female".equals(strgender)){
         jRadioButton_Female.setSelected(true);
         
         }
         
         String strage = rs.getString("Age");
         txt_age.setText(strage);
         
         String strbg = rs.getString("BloodGroup");
         txt_bloodgroup.setText(strbg);
         
         String strcn = rs.getString("ContactNo");
         txt_contactno.setText(strcn);
         
         
         String strqua =rs.getString("Qualification");
         jComboBox_qualificaton.setSelectedItem(strqua);
         
         
String dateval = rs.getString("DOJ");
java.util.Date date=new SimpleDateFormat("yyyy-MM-dd").parse(dateval);
jDateChooser1.setDate(date);

String straddress = rs.getString("Address");
jTextArea_Address.setText(straddress);


byte[] imagedata = rs.getBytes("EmpImage");
formate=new ImageIcon(imagedata);
imagelabel.setIcon(formate);
employeeimage=imagedata;



         
         
         
         
         }// end if rs.next() method here
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {
            }
        
        
        
        }
        
        btn_save.setEnabled(false);
        btn_new.setEnabled(true);
        btn_update.setEnabled(true);
        btn_delete.setEnabled(true);
        btn_clear.setEnabled(true);
        
    }//GEN-LAST:event_Table_dataMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
      
        
        
        try {
          String sql = "update employeeinfo set Name=?,Gender=?,Age=?,BloodGroup=?,ContactNo=?,Qualification=?,DOJ=?,Address=?,EmpImage=? where EmployeeID=?";  
         pst=conn.prepareStatement(sql);
         
         pst.setString(1, txt_name.getText());
         
         if(jRadioButton_Male.isSelected()){
         pst.setString(2, "Male");
          }else{
         pst.setString(2, "Female");
          }
         
         
          
            pst.setString(3, txt_age.getText());
            pst.setString(4, txt_bloodgroup.getText());
            pst.setString(5, txt_contactno.getText());
               
               String combovalue = jComboBox_qualificaton.getSelectedItem().toString();
               pst.setString(6, combovalue);
               
          java.util.Date date = jDateChooser1.getDate();
SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
String strDateOutput = sdf.format(date);


      pst.setString(7, strDateOutput);
      
      pst.setString(8, jTextArea_Address.getText());
      
      pst.setBytes(9,employeeimage);
      
      pst.setString(10, txt_employeeid.getText());
      
      pst.execute();
      
      JOptionPane.showMessageDialog(null, "Update Successful");
      
         
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {
            }
        
        
        }
        update_table();
        
        
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
     
        if(txt_employeeid.getText().equals("")){
        JOptionPane.showMessageDialog(null, "PLEASE SELECT DATA TO DELETE");
        
        
        }else{
        int p = JOptionPane.showConfirmDialog(null, "DO YOU REALLY WANT TO DELETE", "Delete", JOptionPane.YES_NO_OPTION);
        
        
        if(p==0){
        
            try {
         String sql = "delete from employeeinfo where EmployeeID=?"; 
         pst=conn.prepareStatement(sql);
         pst.setString(1, txt_employeeid.getText());
         pst.execute();
         JOptionPane.showMessageDialog(null, "Deleted Successful");
                
                
                
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, e);
            }finally{
                try {
                    rs.close();
                    pst.close();
                } catch (Exception e) {
                }
            
            
            }
        
        
        }//end if p=0
        
        
        
        }//end else
       Clearfields(); 
       update_table(); 
        
        
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        Clearfields();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
       MessageFormat header = new MessageFormat("Employee List Report Print");
    
      MessageFormat footer = new MessageFormat("Page {0,number,integer}");
    
    try{
    
        Table_data.print(JTable.PrintMode.FIT_WIDTH,header,footer);
        
    }catch(java.awt.print.PrinterException e){
    System.err.format("Cannot Print %s%n", e.getMessage());
    } 
    }//GEN-LAST:event_btn_printActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTable Table_data;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_imageupload;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel imagelabel;
    private javax.swing.JComboBox jComboBox_qualificaton;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton_Female;
    private javax.swing.JRadioButton jRadioButton_Male;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea_Address;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_bloodgroup;
    private javax.swing.JTextField txt_contactno;
    private javax.swing.JTextField txt_employeeid;
    private javax.swing.JTextField txt_imagepath;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
String filename = null;
private ImageIcon viewimage=null;
private ImageIcon formate=null;
private String gender;
byte[] employeeimage=null;
}

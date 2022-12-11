
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author mukim
 */
public class UserManagement extends javax.swing.JFrame {
    DB_MAN DBM = new DB_MAN();
    String strSQL = "SELECT user_id FROM user_info ORDER BY user_id;";
    /**
     * Creates new form UserManagement
     */
    public UserManagement() {
        initComponents();
        super.getContentPane().setBackground(Color.WHITE);
        try {
            DBM.dbOpen();
            getCombobox(strSQL);
            reFreshTable();
            DBM.dbClose();
        } catch (Exception e) {
            System.out.println("SQLException(constructor) : "+e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtPoint = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        lblProfile = new javax.swing.JLabel();
        txtGivePoint = new javax.swing.JTextField();
        btnGive = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.activeCaptionBorder);
        jLabel1.setText("User Management");

        jLabel2.setText("아이디 :");

        jLabel3.setText("이름 :");

        jLabel4.setText("가입일자 :");

        jLabel5.setText("잔여포인트 :");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
        });

        txtname.setEditable(false);

        txtDate.setEditable(false);
        txtDate.setFont(new java.awt.Font("맑은 고딕", 0, 10)); // NOI18N

        txtPoint.setEditable(false);

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "아이디", "이름", "가입일자", "잔여포인트"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userTable);

        lblProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/myimageapp/profileImage/default_profile.jpg"))); // NOI18N

        btnGive.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        btnGive.setText("충전");
        btnGive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiveActionPerformed(evt);
            }
        });

        btnSearch.setText("검색하기");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel6.setText("포인트 충전 :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<ALL>" }));

        jLabel7.setText("아이디 :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(txtPoint))
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, 107, Short.MAX_VALUE)
                            .addComponent(txtGivePoint))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGive, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(txtPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGivePoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(btnGive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void userTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMouseClicked
        int selectedRow = userTable.getSelectedRow();
        searchingUser(selectedRow);
    }//GEN-LAST:event_userTableMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String searchingId = txtId.getText();
        int searchingRow = -1;
        
        for(int i = 0; i<userTable.getRowCount(); i++){
            String user_id = userTable.getModel().getValueAt(i, 0).toString();
            if(searchingId.equals(user_id)){
                searchingRow = i;
            }
        }
        
        if(searchingRow == -1){
            JOptionPane.showMessageDialog(null, "존재하지 않는 아이디입니다.");
            return;
        }
        searchingUser(searchingRow);
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
            btnSearchActionPerformed(null);
        }
    }//GEN-LAST:event_txtIdKeyPressed

    private void btnGiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiveActionPerformed
        String givedUser = jComboBox1.getSelectedItem().toString();
        String updateQuery;
        int givingPoint;
        try{ //파싱 에러 캐치
            givingPoint = Integer.parseInt(txtGivePoint.getText().trim());
        }catch(Exception e){
            System.out.println("Parsing error : " + e.getMessage());
            JOptionPane.showMessageDialog(null, "옳바르지 못한 값입니다.");
            return;
        }
        
        //콤보박스처리
        String strQuery = "SELECT user_id, point FROM user_info";
        if(!givedUser.equals("<ALL>")){
            strQuery += " WHERE user_id = '"+givedUser+"';";
        }else{
            strQuery += ";";
        }
        
        //select로 포인트 가져오기
        try {
            DBM.dbOpen();
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strQuery);
            //유저아이디와 갖고있던 포인트들을 맵에 집어넣기
            HashMap<String, Integer> userMap = new HashMap<String, Integer>();
            while (DBM.DB_rs.next()) {
                String user_id = DBM.DB_rs.getString("user_id");
                int point = Integer.parseInt(DBM.DB_rs.getString("point"));
                userMap.put(user_id, point);
            }
            
            //세트에 맵의 키를 저장
            Set<String> userSet = userMap.keySet();
            for(String id : userSet){
                String finalPoint = Integer.toString(userMap.get(id)+givingPoint);
                updateQuery = "UPDATE user_info SET point = "+finalPoint+" WHERE user_id = '"+id+"';";
                DBM.DB_stmt.executeUpdate(updateQuery);
            }
            reFreshTable();
            DBM.DB_rs.close();
            DBM.dbClose();
        } catch (Exception e) {
            System.out.println("SQLException(givingPoint) : " + e.getMessage());
        }
    }//GEN-LAST:event_btnGiveActionPerformed
    
    public final void getCombobox(String strQuery) {
        try {
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strQuery);
            while (DBM.DB_rs.next()) {
                jComboBox1.addItem(DBM.DB_rs.getString("user_id"));
            }
            DBM.DB_rs.close();
            
        } catch (Exception e) {
            System.out.println("SQLException(getCombobox) : " + e.getMessage());
        } 
    }
    
    public final void getDBData(String strQuery) {
        DefaultTableModel model = (DefaultTableModel)userTable.getModel();
        int rowcount = model.getRowCount();
        for(int i = 0; i < rowcount; i++){
            model.removeRow(0);
        }

        try {
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strQuery);
            while (DBM.DB_rs.next()) {
                ArrayList<String> rowData = new ArrayList<String>();
                rowData.add(DBM.DB_rs.getString("user_id"));
                rowData.add(DBM.DB_rs.getString("user_name"));
                rowData.add(DBM.DB_rs.getString("join_date"));
                rowData.add(DBM.DB_rs.getString("point"));
                model.addRow(rowData.toArray());
            }
            DBM.DB_rs.close();
        } catch (Exception e) {
            System.out.println("SQLException(getDBData) : " + e.getMessage());
        }
    }
    
    public final void reFreshTable(){
        String strQuery = "SELECT * FROM user_info ORDER BY user_id;";
        getDBData(strQuery);
    }
    
    private void searchingUser(int selectedRow){
        if(selectedRow != -1){
            String user_id = userTable.getModel().getValueAt(selectedRow, 0).toString();
            String user_name = userTable.getModel().getValueAt(selectedRow, 1).toString();
            String join_date = userTable.getModel().getValueAt(selectedRow, 2).toString();
            String point = userTable.getModel().getValueAt(selectedRow, 3).toString();
            
            //프로필사진
            try {
                DBM.dbOpen();
                String strQuery = "SELECT user_profile FROM user_info WHERE user_id = '"+user_id+"';";
                DBM.DB_rs = DBM.DB_stmt.executeQuery(strQuery);
                String user_profile = "";
                while(DBM.DB_rs.next()) {
                    user_profile = DBM.DB_rs.getString("user_profile");
                }
                
                if(user_profile != null || !user_profile.isBlank()){
                    ImageIcon imgicon = new ImageIcon(user_profile);
                    Image image = imgicon.getImage();
                    lblProfile.setIcon(new ImageIcon(image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH)));
                }
                DBM.DB_rs.close();
                DBM.dbClose();
            } catch (Exception e) {
                System.out.println("SQLException(User_Profile) : "+e.getMessage());
            }
            
            txtId.setText(user_id);
            txtname.setText(user_name);
            txtDate.setText(join_date);
            txtPoint.setText(point);
        }
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
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGive;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProfile;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtGivePoint;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPoint;
    private javax.swing.JTextField txtname;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}

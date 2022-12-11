
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
public class GamesManagement extends javax.swing.JFrame {
    DB_MAN DBM = new DB_MAN();
    String strSQL = "SELECT G_no FROM games ORDER BY G_no;";
    /**
     * Creates new form UserManagement
     */
    public GamesManagement() {
        initComponents();
        super.getContentPane().setBackground(Color.WHITE);
        btnChange.setEnabled(false);
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
        txtG_no = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtHome = new javax.swing.JTextField();
        txtAway = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        gameTable = new javax.swing.JTable();
        txtSetWin = new javax.swing.JTextField();
        btnChange = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtWin = new javax.swing.JTextField();
        txtDraw = new javax.swing.JTextField();
        txtLose = new javax.swing.JTextField();
        txtResult = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtSetLose = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtSetDraw = new javax.swing.JTextField();
        comboResult = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.activeCaptionBorder);
        jLabel1.setText("Games Management");

        jLabel2.setText("G_no :");

        jLabel3.setText("경기날짜 :");

        jLabel4.setText("홈팀 :");

        jLabel5.setText("원정팀 :");

        txtG_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtG_noActionPerformed(evt);
            }
        });
        txtG_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtG_noKeyPressed(evt);
            }
        });

        txtDate.setEditable(false);
        txtDate.setFont(new java.awt.Font("맑은 고딕", 0, 10)); // NOI18N

        txtHome.setEditable(false);

        txtAway.setEditable(false);

        gameTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "G_no", "홈팀", "원정팀", "경기결과", "경기일자", "승", "무", "패"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        gameTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gameTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(gameTable);

        btnChange.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        btnChange.setText("변경");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        btnSearch.setText("검색하기");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel6.setLabelFor(txtSetWin);
        jLabel6.setText("승 :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<NONE>" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBox1PropertyChange(evt);
            }
        });

        jLabel7.setText("G_no :");

        jLabel8.setText("승");

        jLabel9.setText("무");

        jLabel10.setText("패");

        txtWin.setEditable(false);
        txtWin.setFont(new java.awt.Font("맑은 고딕", 0, 8)); // NOI18N
        txtWin.setText("0.00");

        txtDraw.setEditable(false);
        txtDraw.setFont(new java.awt.Font("맑은 고딕", 0, 8)); // NOI18N
        txtDraw.setText("0.00");

        txtLose.setEditable(false);
        txtLose.setFont(new java.awt.Font("맑은 고딕", 0, 8)); // NOI18N
        txtLose.setText("0.00");

        txtResult.setEditable(false);

        jLabel11.setText("경기결과 :");

        jLabel12.setText("경기결과 :");

        jLabel13.setLabelFor(txtSetLose);
        jLabel13.setText("패 :");

        jLabel14.setLabelFor(txtSetDraw);
        jLabel14.setText("무 :");

        comboResult.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "진행예정", "승", "무", "패" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtG_no, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(txtWin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtDraw, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(txtLose, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHome, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(txtAway))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSetWin, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSetDraw, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSetLose, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtG_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtWin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDraw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAway, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSetWin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSetDraw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSetLose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)))))
                    .addComponent(btnChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtG_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtG_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtG_noActionPerformed

    private void gameTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gameTableMouseClicked
        int selectedRow = gameTable.getSelectedRow();
        searchingUser(selectedRow);
    }//GEN-LAST:event_gameTableMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String searchingNo = txtG_no.getText();
        int searchingRow = -1;
        
        for(int i = 0; i<gameTable.getRowCount(); i++){
            String G_no = gameTable.getModel().getValueAt(i, 0).toString();
            if(searchingNo.equals(G_no)){
                searchingRow = i;
            }
        }
        
        if(searchingRow == -1){
            JOptionPane.showMessageDialog(null, "존재하지 않는 아이디입니다.");
            return;
        }
        searchingUser(searchingRow);
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtG_noKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtG_noKeyPressed
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
            btnSearchActionPerformed(null);
        }
    }//GEN-LAST:event_txtG_noKeyPressed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        String changingNo = jComboBox1.getSelectedItem().toString();
        String changingResult = comboResult.getSelectedItem().toString();
        Double changingWin;
        Double changingDraw;
        Double changingLose;
        
        try{ //파싱 에러 캐치
            changingWin = Double.parseDouble(txtSetWin.getText().trim());
            changingDraw = Double.parseDouble(txtSetDraw.getText().trim());
            changingLose = Double.parseDouble(txtSetLose.getText().trim());
        }catch(Exception e){
            System.out.println("Parsing error : " + e.getMessage());
            JOptionPane.showMessageDialog(null, "옳바르지 못한 값입니다.");
            return;
        }
        
        //업데이트
        try {
            DBM.dbOpen();
            String updateQuery = "UPDATE games "
                               + "SET result = '"+changingResult+"', win_odds = '"+changingWin+"', draw_odds = '"+changingDraw+"', lose_odds = '"+changingLose+"' "
                               + "WHERE G_no = "+changingNo+";";
            DBM.DB_stmt.executeUpdate(updateQuery);
            reFreshTable();
            DBM.DB_rs.close();
            DBM.dbClose();
        } catch (Exception e) {
            System.out.println("SQLException(change) : " + e.getMessage());
            JOptionPane.showMessageDialog(null, "예기치 못한 오류가 발생했습니다.");
        }
    }//GEN-LAST:event_btnChangeActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        String selectedNo = jComboBox1.getSelectedItem().toString();
        if(selectedNo.equals("<NONE>")){
            btnChange.setEnabled(false);
            comboResult.setSelectedIndex(0);
            txtSetWin.setText("");
            txtSetDraw.setText("");
            txtSetLose.setText("");  
            return;
        }
        try{
            String strQuery = "SELECT * FROM games WHERE G_no = "+selectedNo+";";
            DBM.dbOpen();
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strQuery);
            
            while(DBM.DB_rs.next()){
                String result = DBM.DB_rs.getString("result");
                String win = DBM.DB_rs.getString("win_odds");
                String draw = DBM.DB_rs.getString("draw_odds");
                String lose = DBM.DB_rs.getString("lose_odds");
                
                switch (result) {
                    case "승":
                        comboResult.setSelectedIndex(1);
                        break;
                    case "무":
                        comboResult.setSelectedIndex(2);
                        break;
                    case "패":
                        comboResult.setSelectedIndex(3);
                        break;
                    default:
                        comboResult.setSelectedIndex(0);
                }
                
                txtSetWin.setText(win);
                txtSetDraw.setText(draw);
                txtSetLose.setText(lose);  
                btnChange.setEnabled(true);
            }
            DBM.DB_rs.close();
            DBM.dbClose();
        }catch(Exception e){
            System.out.println("jComboBox1 : "+e);
            JOptionPane.showMessageDialog(null, "예기치 못한 오류가 발생했습니다.");
        }
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBox1PropertyChange
        
    }//GEN-LAST:event_jComboBox1PropertyChange
    
    public final void getCombobox(String strQuery) {
        try {
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strQuery);
            while (DBM.DB_rs.next()) {
                jComboBox1.addItem(DBM.DB_rs.getString("G_no"));
            }
            DBM.DB_rs.close();
            
        } catch (Exception e) {
            System.out.println("SQLException(getCombobox) : " + e.getMessage());
        } 
    }
    
    public final void getDBData(String strQuery) {
        DefaultTableModel model = (DefaultTableModel)gameTable.getModel();
        int rowcount = model.getRowCount();
        for(int i = 0; i < rowcount; i++){
            model.removeRow(0);
        }
        try {
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strQuery);
            while (DBM.DB_rs.next()) {
                ArrayList<String> rowData = new ArrayList<String>();
                rowData.add(DBM.DB_rs.getString("G_no"));
                rowData.add(DBM.DB_rs.getString("home_team"));
                rowData.add(DBM.DB_rs.getString("away_team"));
                rowData.add(DBM.DB_rs.getString("result"));
                rowData.add(DBM.DB_rs.getString("game_date"));
                rowData.add(DBM.DB_rs.getString("win_odds"));
                rowData.add(DBM.DB_rs.getString("draw_odds"));
                rowData.add(DBM.DB_rs.getString("lose_odds"));
                model.addRow(rowData.toArray());
            }
            DBM.DB_rs.close();
        } catch (Exception e) {
            System.out.println("SQLException(getDBData) : " + e.getMessage());
        }
    }
    
    public final void reFreshTable(){
        String strQuery = "SELECT * FROM games ORDER BY G_no;";
        getDBData(strQuery);
    }
    
    private void searchingUser(int selectedRow){
        if(selectedRow != -1){
            String G_no = gameTable.getModel().getValueAt(selectedRow, 0).toString();
            String home_team = gameTable.getModel().getValueAt(selectedRow, 1).toString();
            String away_team = gameTable.getModel().getValueAt(selectedRow, 2).toString();
            String result = gameTable.getModel().getValueAt(selectedRow, 3).toString();
            String game_date = gameTable.getModel().getValueAt(selectedRow, 4).toString();
            String win_odds = gameTable.getModel().getValueAt(selectedRow, 5).toString();
            String draw_odds = gameTable.getModel().getValueAt(selectedRow, 6).toString();
            String lose_odds = gameTable.getModel().getValueAt(selectedRow, 7).toString();
            
            txtG_no.setText(G_no);
            txtDate.setText(game_date);
            txtHome.setText(home_team);
            txtAway.setText(away_team);
            txtResult.setText(result);
            txtWin.setText(win_odds);
            txtDraw.setText(draw_odds);
            txtLose.setText(lose_odds);
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
                new GamesManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> comboResult;
    private javax.swing.JTable gameTable;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAway;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDraw;
    private javax.swing.JTextField txtG_no;
    private javax.swing.JTextField txtHome;
    private javax.swing.JTextField txtLose;
    private javax.swing.JTextField txtResult;
    private javax.swing.JTextField txtSetDraw;
    private javax.swing.JTextField txtSetLose;
    private javax.swing.JTextField txtSetWin;
    private javax.swing.JTextField txtWin;
    // End of variables declaration//GEN-END:variables
}
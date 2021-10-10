package spdvi;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class TestGUIComponentsForm extends javax.swing.JFrame {
String result = "";
BufferedWriter bw;
BufferedReader br;
File fitxer;
FileReader fr;
ArrayList<User> list = new ArrayList<User>();
ArrayList<String> listTxt = new ArrayList<String>();
String []users = new String[list.size()];

    public TestGUIComponentsForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupGender = new javax.swing.ButtonGroup();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        btnMale = new javax.swing.JRadioButton();
        btnFemale = new javax.swing.JRadioButton();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblBirth = new javax.swing.JLabel();
        lblAlive = new javax.swing.JLabel();
        btnAlive = new javax.swing.JRadioButton();
        btnDead = new javax.swing.JRadioButton();
        btnEnter = new javax.swing.JButton();
        txtArea = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        txtDate = new javax.swing.JTextField();
        Load = new javax.swing.JButton();
        Save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GUI Components Form");

        lblName.setText("Name:");
        lblName.setName(""); // NOI18N

        lblLastName.setText("Last name:");

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        btnGroupGender.add(btnMale);
        btnMale.setText("Male");
        btnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaleActionPerformed(evt);
            }
        });

        btnGroupGender.add(btnFemale);
        btnFemale.setText("Female");
        btnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFemaleActionPerformed(evt);
            }
        });

        lblId.setText("ID:");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        lblBirth.setText("Birth date:");

        lblAlive.setText("Alive?");

        btnAlive.setSelected(true);
        btnAlive.setText("Yes");
        btnAlive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAliveActionPerformed(evt);
            }
        });

        btnDead.setText("No");
        btnDead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeadActionPerformed(evt);
            }
        });

        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        txtArea.setViewportView(txtOutput);

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        Load.setText("Load");
        Load.setActionCommand("oad");
        Load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadActionPerformed(evt);
            }
        });

        Save.setText("Save");
        Save.setActionCommand("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtArea)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnFemale, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnMale))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDate)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblBirth)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Load)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Save)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(61, 166, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addGap(141, 141, 141)
                        .addComponent(lblLastName)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAlive)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlive)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDead)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEnter)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(lblLastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMale)
                    .addComponent(lblBirth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFemale)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlive)
                    .addComponent(btnAlive)
                    .addComponent(btnDead)
                    .addComponent(btnEnter)
                    .addComponent(Load)
                    .addComponent(Save))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtArea, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void btnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMaleActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnAliveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAliveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAliveActionPerformed

    private void btnDeadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeadActionPerformed

    private void guardar() {
        try {
        File archiu = new File("src/User.csv");
        if(!archiu.exists())
            archiu.createNewFile();
        bw = new BufferedWriter(new FileWriter(archiu));
        
        
        for(int i = 0; i < list.size(); i++)
            bw.write(list.get(i).toString() + "\n");
        
        bw.close();
        
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
    
    private void cargar(){
        try {
            result = "";
            txtOutput.setText("");
            fr = new FileReader("src/User.csv");
            br = new BufferedReader(fr); 
            String line = br.readLine();
            
            while (line != null) {
                listTxt.add(line);
                line = br.readLine();
            }
            
            for(int i = 0; i < listTxt.size(); i++) {
                result += listTxt.get(i) + "\n";
                txtOutput.setText(result);
            }
            
        } catch (Exception e) {
                e.printStackTrace();
        }
    }
    
    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        int id = Integer.parseInt(txtId.getText());
        String name = txtName.getText();
        String surname = txtLastName.getText();
        
        String gender = "Male";
        if(btnFemale.isSelected())
            gender = "Female";
        
        String alive = "Alive";
        if(btnDead.isSelected())
            alive = "Dead";
        
        LocalDate birthDate = LocalDate.parse(txtDate.getText());
        
                
        
        User user = new User(id, name, surname, birthDate, gender, alive);
        result += user.toString() + "\n";
        txtOutput.setText(result);
        list.add(user);
        
        //list.toArray(users);
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFemaleActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadActionPerformed
        cargar();
    }//GEN-LAST:event_LoadActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        guardar();
    }//GEN-LAST:event_SaveActionPerformed

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
            java.util.logging.Logger.getLogger(TestGUIComponentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestGUIComponentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestGUIComponentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestGUIComponentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestGUIComponentsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Load;
    private javax.swing.JButton Save;
    private javax.swing.JRadioButton btnAlive;
    private javax.swing.JRadioButton btnDead;
    private javax.swing.JButton btnEnter;
    private javax.swing.JRadioButton btnFemale;
    private javax.swing.ButtonGroup btnGroupGender;
    private javax.swing.JRadioButton btnMale;
    private javax.swing.JLabel lblAlive;
    private javax.swing.JLabel lblBirth;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblName;
    private javax.swing.JScrollPane txtArea;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
}

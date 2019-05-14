/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ankarauni.folderspace;

import java.awt.GridLayout;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ButtonModel;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Gorkem
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        initTableFirstTime();
        
        jPanel1.setLayout(new GridLayout(3,4));
        
        filesAndFoldersRadio.setSelected(true);
        toggleFilterCheckBoxes(false);
        radioButtonGroup.add(filesAndFoldersRadio);
        radioButtonGroup.add(onlyFilesRadio);
        radioButtonGroup.add(onlyFoldersRadio);
        radioButtonGroup.add(extensionFilterRadio);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        folderSelector = new javax.swing.JFileChooser();
        radioButtonGroup = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        fileTable = new javax.swing.JTable();
        selectFolderButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        staticFolderSizeLabel = new javax.swing.JLabel();
        staticAvailableSpaceLabel = new javax.swing.JLabel();
        staticFileCountLabel = new javax.swing.JLabel();
        folderSizeLabel = new javax.swing.JLabel();
        availableSpaceLabel = new javax.swing.JLabel();
        fileCountLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        docFilterCheck = new javax.swing.JCheckBox();
        pdfFilterCheck = new javax.swing.JCheckBox();
        txtFilterCheck = new javax.swing.JCheckBox();
        sevenzFilterCheck = new javax.swing.JCheckBox();
        rarFilterCheck = new javax.swing.JCheckBox();
        zipFilterCheck = new javax.swing.JCheckBox();
        gifFilterCheck = new javax.swing.JCheckBox();
        jpgFilterCheck = new javax.swing.JCheckBox();
        pngFilterCheck = new javax.swing.JCheckBox();
        exeFilterCheck = new javax.swing.JCheckBox();
        batFilterCheck = new javax.swing.JCheckBox();
        shFilterCheck = new javax.swing.JCheckBox();
        filesAndFoldersRadio = new javax.swing.JRadioButton();
        onlyFilesRadio = new javax.swing.JRadioButton();
        onlyFoldersRadio = new javax.swing.JRadioButton();
        extensionFilterRadio = new javax.swing.JRadioButton();

        folderSelector.setAcceptAllFileFilterUsed(false);
        folderSelector.setApproveButtonToolTipText("");
        folderSelector.setCurrentDirectory(new java.io.File("D:\\Program Library\\incubating-netbeans-11.0-bin\\netbeans\\bin"));
        folderSelector.setDialogTitle("Please select a folder...");
        folderSelector.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FolderSpace");
        setResizable(false);

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        fileTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        fileTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(fileTable);

        selectFolderButton.setText("Select Folder...");
        selectFolderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFolderButtonActionPerformed(evt);
            }
        });

        staticFolderSizeLabel.setText("Folder Size:");

        staticAvailableSpaceLabel.setText("Available Space on Disk:");

        staticFileCountLabel.setText("File Count:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(staticAvailableSpaceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(staticFolderSizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(staticFileCountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(folderSizeLabel)
                    .addComponent(availableSpaceLabel)
                    .addComponent(fileCountLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staticFolderSizeLabel)
                    .addComponent(folderSizeLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staticAvailableSpaceLabel)
                    .addComponent(availableSpaceLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staticFileCountLabel)
                    .addComponent(fileCountLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Extension Filter"));

        docFilterCheck.setText("DOC");

        pdfFilterCheck.setText("PDF");

        txtFilterCheck.setText("TXT");

        sevenzFilterCheck.setText("7z");

        rarFilterCheck.setText("RAR");

        zipFilterCheck.setText("ZIP");

        gifFilterCheck.setText("GIF");

        jpgFilterCheck.setText("JPG");

        pngFilterCheck.setText("PNG");

        exeFilterCheck.setText("EXE");

        batFilterCheck.setText("BAT");

        shFilterCheck.setText("SH");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(docFilterCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sevenzFilterCheck))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pdfFilterCheck)
                            .addComponent(txtFilterCheck))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zipFilterCheck)
                            .addComponent(rarFilterCheck))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jpgFilterCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
                        .addComponent(batFilterCheck))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(gifFilterCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exeFilterCheck))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pngFilterCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(shFilterCheck)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(docFilterCheck)
                    .addComponent(sevenzFilterCheck)
                    .addComponent(gifFilterCheck)
                    .addComponent(exeFilterCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pdfFilterCheck)
                    .addComponent(rarFilterCheck)
                    .addComponent(jpgFilterCheck)
                    .addComponent(batFilterCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFilterCheck)
                    .addComponent(zipFilterCheck)
                    .addComponent(pngFilterCheck)
                    .addComponent(shFilterCheck))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        filesAndFoldersRadio.setText("Files & Folders");
        filesAndFoldersRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filesAndFoldersRadioActionPerformed(evt);
            }
        });

        onlyFilesRadio.setText("Only Files");
        onlyFilesRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onlyFilesRadioActionPerformed(evt);
            }
        });

        onlyFoldersRadio.setText("Only Folders");
        onlyFoldersRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onlyFoldersRadioActionPerformed(evt);
            }
        });

        extensionFilterRadio.setText("Only Selected Extensions:");
        extensionFilterRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extensionFilterRadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectFolderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(filesAndFoldersRadio)
                                    .addComponent(onlyFilesRadio)
                                    .addComponent(onlyFoldersRadio)
                                    .addComponent(extensionFilterRadio))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectFolderButton)
                        .addGap(18, 18, 18)
                        .addComponent(filesAndFoldersRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(onlyFilesRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(onlyFoldersRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(extensionFilterRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectFolderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFolderButtonActionPerformed
        int returnVal = folderSelector.showOpenDialog(this);
        File[] childFiles;
        CustomTableModel model;
        ScanMethod scanMethod = this.getScanMethod();
        ArrayList<String> filters = this.getFilters();
        
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File selectedFile = folderSelector.getSelectedFile();
            // Safeguard for unintended selection behaviour
            if (selectedFile.isDirectory()) {
                childFiles = selectedFile.listFiles();
                
                if (scanMethod == ScanMethod.FILTERED) {
                    // TODO: update
                    model = CustomTableModel.createModelFromFiles(childFiles, scanMethod, filters);
                } else {
                    model = CustomTableModel.createModelFromFiles(childFiles, scanMethod, null);
                }
                
                this.registerTableModel(model);
                String folderSize = FileHelper.fileSize(selectedFile.toPath());
                String usableSpaceSize = FileHelper.getUsableSpaceOnDisk(selectedFile);
                folderSizeLabel.setText(folderSize);
                availableSpaceLabel.setText(usableSpaceSize);
                fileCountLabel.setText(childFiles.length + " items");
            }
            
            
        }
    }//GEN-LAST:event_selectFolderButtonActionPerformed

    private void extensionFilterRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extensionFilterRadioActionPerformed
        toggleFilterCheckBoxes(true);
    }//GEN-LAST:event_extensionFilterRadioActionPerformed

    private void onlyFoldersRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onlyFoldersRadioActionPerformed
        toggleFilterCheckBoxes(false);
    }//GEN-LAST:event_onlyFoldersRadioActionPerformed

    private void onlyFilesRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onlyFilesRadioActionPerformed
        toggleFilterCheckBoxes(false);
    }//GEN-LAST:event_onlyFilesRadioActionPerformed

    private void filesAndFoldersRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filesAndFoldersRadioActionPerformed
        toggleFilterCheckBoxes(false);
    }//GEN-LAST:event_filesAndFoldersRadioActionPerformed
    
    private ArrayList<String> getFilters() {
        ArrayList<String> filters = new ArrayList<>();
        
        if (batFilterCheck.isSelected()) {
            filters.add("bat");
        }
        
        if (docFilterCheck.isSelected()) {
            filters.add("doc");
        }
        
        if (exeFilterCheck.isSelected()) {
            filters.add("exe");
        }
        
        if (gifFilterCheck.isSelected()) {
            filters.add("gif");
        }
        
        if (jpgFilterCheck.isSelected()) {
            filters.add("jpg");
        }
        
        if (pdfFilterCheck.isSelected()) {
            filters.add("pdf");
        }
        
        if (pngFilterCheck.isSelected()) {
            filters.add("png");
        }
        
        if (rarFilterCheck.isSelected()) {
            filters.add("rar");
        }
        
        if (sevenzFilterCheck.isSelected()) {
            filters.add("7z");
        }
        
        if (shFilterCheck.isSelected()) {
            filters.add("sh");
        }
        
        if (txtFilterCheck.isSelected()) {
            filters.add("txt");
        }
        
        if (zipFilterCheck.isSelected()) {
            filters.add("zip");
        }
        
        return filters;
    }
    
    private ScanMethod getScanMethod() {
        ButtonModel selectedRadio = radioButtonGroup.getSelection();
        ScanMethod scanMethod;
        
        if (selectedRadio.equals(extensionFilterRadio.getModel())){
            // extension filter radio is selected
            scanMethod = ScanMethod.FILTERED;
        } else if (selectedRadio.equals(filesAndFoldersRadio.getModel())) {
            // files & folders radio is selected
            scanMethod = ScanMethod.FILES_AND_FOLDERS;
        } else if (selectedRadio.equals(onlyFilesRadio.getModel())) {
            // only files radio is selected
            scanMethod = ScanMethod.ONLY_FILES;
        } else if (selectedRadio.equals(onlyFoldersRadio.getModel())) {
            // only folders radio is selected
            scanMethod = ScanMethod.ONLY_FOLDERS;
        } else {
            // unintended radio selection
            throw new RuntimeException("Invalid Selection");
        }
        
        return scanMethod;
    }
    
    private void toggleFilterCheckBoxes(boolean value) {
        batFilterCheck.setEnabled(value);
        docFilterCheck.setEnabled(value);
        exeFilterCheck.setEnabled(value);
        gifFilterCheck.setEnabled(value);
        jpgFilterCheck.setEnabled(value);
        pdfFilterCheck.setEnabled(value);
        pngFilterCheck.setEnabled(value);
        rarFilterCheck.setEnabled(value);
        sevenzFilterCheck.setEnabled(value);
        shFilterCheck.setEnabled(value);
        txtFilterCheck.setEnabled(value);
        zipFilterCheck.setEnabled(value);
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainForm form = new MainForm();
                form.setVisible(true);
            }
        });
    }
    
    public void initTableFirstTime() {
        fileTable.setRowHeight(25);
        fileTable.setShowGrid(false);
    }
    
    public void initTableAfterChange() {
        int iconColumnIndex = 0;
        int extColumnIndex = 2;
        int iconColumnWidth = 25;
        int extColumnWidth = 50;
        TableColumn column = fileTable.getColumnModel()
                .getColumn(iconColumnIndex);
        column.setPreferredWidth(iconColumnWidth);
        column.setMaxWidth(iconColumnWidth);
        column.setMinWidth(iconColumnWidth);
        column.setResizable(false);
        
        column = fileTable.getColumnModel()
                .getColumn(extColumnIndex);
        column.setPreferredWidth(extColumnWidth);
    }
    
    // Implicitly considering table model object as immutable.
    // Because once the folder is selected by the user, there is no need to
    // modify the model. Therefore, register the model once when the folder
    // is selected.
    public void registerTableModel(DefaultTableModel model) {
        fileTable.setModel(model);
        // initTableAfterChange() needs to be called after registering models.
        // TODO: Move method call to a custom table event in the future.
        initTableAfterChange();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availableSpaceLabel;
    private javax.swing.JCheckBox batFilterCheck;
    private javax.swing.JCheckBox docFilterCheck;
    private javax.swing.JCheckBox exeFilterCheck;
    private javax.swing.JRadioButton extensionFilterRadio;
    private javax.swing.JLabel fileCountLabel;
    private javax.swing.JTable fileTable;
    private javax.swing.JRadioButton filesAndFoldersRadio;
    private javax.swing.JFileChooser folderSelector;
    private javax.swing.JLabel folderSizeLabel;
    private javax.swing.JCheckBox gifFilterCheck;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox jpgFilterCheck;
    private javax.swing.JRadioButton onlyFilesRadio;
    private javax.swing.JRadioButton onlyFoldersRadio;
    private javax.swing.JCheckBox pdfFilterCheck;
    private javax.swing.JCheckBox pngFilterCheck;
    private javax.swing.ButtonGroup radioButtonGroup;
    private javax.swing.JCheckBox rarFilterCheck;
    private javax.swing.JButton selectFolderButton;
    private javax.swing.JCheckBox sevenzFilterCheck;
    private javax.swing.JCheckBox shFilterCheck;
    private javax.swing.JLabel staticAvailableSpaceLabel;
    private javax.swing.JLabel staticFileCountLabel;
    private javax.swing.JLabel staticFolderSizeLabel;
    private javax.swing.JCheckBox txtFilterCheck;
    private javax.swing.JCheckBox zipFilterCheck;
    // End of variables declaration//GEN-END:variables
}
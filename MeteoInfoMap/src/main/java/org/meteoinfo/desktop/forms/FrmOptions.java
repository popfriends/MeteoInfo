/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.meteoinfo.desktop.forms;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.l2fprod.common.swing.JFontChooser;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.meteoinfo.desktop.config.Options;

/**
 *
 * @author yaqiang
 */
public class FrmOptions extends javax.swing.JDialog {

    private final FrmMain _parent;
    private Font _legendFont;
    private Font _textFont;

    /**
     * Creates new form FrmOptions
     *
     * @param parent
     * @param modal
     */
    public FrmOptions(JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        _parent = (FrmMain) parent;
        Options options = _parent.getOptions();
        _legendFont = options.getLegendFont();
        _textFont = options.getTextFont();
        this.jLabel_LegendFont.setText(_legendFont.getFontName() + " " + _legendFont.getSize());
        this.jLabel_TextFont.setText(_textFont.getFontName() + " " + _textFont.getSize());

        //Look and feel
        this.jComboBox_LookAndFeel.removeAllItems();
        UIManager.LookAndFeelInfo[] lnfs = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo lnf : lnfs) {
            this.jComboBox_LookAndFeel.addItem(lnf.getName());
        }
        this.jComboBox_LookAndFeel.addItem("FlatLightLaf");
        this.jComboBox_LookAndFeel.addItem("FlatDarkLaf");
        this.jComboBox_LookAndFeel.addItem("FlatDarculaLaf");
        this.jComboBox_LookAndFeel.addItem("FlatIntelliJLaf");
        this.jComboBox_LookAndFeel.setSelectedItem(this._parent.getOptions().getLookFeel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane_Option = new javax.swing.JTabbedPane();
        jPanel_General = new javax.swing.JPanel();
        jLabel_LookAndFeel = new javax.swing.JLabel();
        jComboBox_LookAndFeel = new javax.swing.JComboBox();
        jPanel_Font = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_LegendFont = new javax.swing.JLabel();
        jButton_LegendFont = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel_TextFont = new javax.swing.JLabel();
        jButton_TextFont = new javax.swing.JButton();
        jButton_OK = new javax.swing.JButton();
        jButton_Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Options");

        jLabel_LookAndFeel.setText("LookAndFeel:");

        jComboBox_LookAndFeel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel_GeneralLayout = new javax.swing.GroupLayout(jPanel_General);
        jPanel_General.setLayout(jPanel_GeneralLayout);
        jPanel_GeneralLayout.setHorizontalGroup(
            jPanel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_GeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_LookAndFeel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_LookAndFeel, 0, 221, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_GeneralLayout.setVerticalGroup(
            jPanel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_GeneralLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_LookAndFeel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_LookAndFeel))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jTabbedPane_Option.addTab("General", jPanel_General);

        jLabel1.setText("Legend Font:");

        jLabel_LegendFont.setText("jLabel2");
        jLabel_LegendFont.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton_LegendFont.setText("...");
        jButton_LegendFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LegendFontActionPerformed(evt);
            }
        });

        jLabel2.setText("Text Font:");

        jLabel_TextFont.setText("jLabel2");
        jLabel_TextFont.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton_TextFont.setText("...");
        jButton_TextFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TextFontActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_FontLayout = new javax.swing.GroupLayout(jPanel_Font);
        jPanel_Font.setLayout(jPanel_FontLayout);
        jPanel_FontLayout.setHorizontalGroup(
            jPanel_FontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FontLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_FontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_FontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_LegendFont, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_TextFont, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_FontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_LegendFont, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_TextFont, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        jPanel_FontLayout.setVerticalGroup(
            jPanel_FontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FontLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel_FontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel_LegendFont)
                    .addComponent(jButton_LegendFont))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_FontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel_TextFont)
                    .addComponent(jButton_TextFont))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane_Option.addTab("Font", jPanel_Font);

        jButton_OK.setText("OK");
        jButton_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OKActionPerformed(evt);
            }
        });

        jButton_Cancel.setText("Cancel");
        jButton_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jButton_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Cancel)
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane_Option, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane_Option)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_OK)
                    .addComponent(jButton_Cancel))
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_LegendFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LegendFontActionPerformed
        // TODO add your handling code here:
        Font lFont = JFontChooser.showDialog(this, null, _legendFont);
        _legendFont = lFont;
        this.jLabel_LegendFont.setText(_legendFont.getFontName() + " " + _legendFont.getSize());
    }//GEN-LAST:event_jButton_LegendFontActionPerformed

    private void jButton_TextFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TextFontActionPerformed
        // TODO add your handling code here:
        Font tFont = JFontChooser.showDialog(this, null, _textFont);
        _textFont = tFont;
        this.jLabel_TextFont.setText(_textFont.getFontName() + " " + _textFont.getSize());
    }//GEN-LAST:event_jButton_TextFontActionPerformed

    private void jButton_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OKActionPerformed
        // TODO add your handling code here:
        //Font
        if (_legendFont != null) {
            _parent.setLegendFont(_legendFont);
        }
        if (_textFont != null) {
            _parent.getOptions().setTextFont(_textFont);
        }

        //Look and feel
        String laf = this.jComboBox_LookAndFeel.getSelectedItem().toString();
        String lafName = UIManager.getLookAndFeel().getClass().getName();
        switch (laf) {
            case "CDE/Motif":
                lafName = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
                break;
            case "Metal":
                lafName = "javax.swing.plaf.metal.MetalLookAndFeel";
                break;
            case "Windows":
                lafName = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
                break;
            case "Windows Classic":
                lafName = "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel";
                break;
            case "Nimbus":  
                lafName = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
                break;
            case "Mac":
                lafName = "com.sun.java.swing.plaf.mac.MacLookAndFeel";
                break;
            case "GTK":
                lafName = "com.sun.java.swing.plaf.gtk.GTKLookAndFeel";
                break;
            case "FlatLightLaf":
            case "FlatDarkLaf":
            case "FlatDarculaLaf":
            case "FlatIntelliJLaf":
                lafName = laf;
                break;
            default:
                lafName = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
                break;
        }

        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            if (lafName.equals("FlatLightLaf")) {
                    UIManager.setLookAndFeel(new FlatLightLaf());
                } else if (lafName.equals("FlatIntelliJLaf")) {
                    UIManager.setLookAndFeel(new FlatIntelliJLaf());
                } else if (lafName.equals("FlatDarculaLaf")) {
                    UIManager.setLookAndFeel(new FlatDarculaLaf());
                } else if (lafName.equals("FlatDarkLaf")) {
                    UIManager.setLookAndFeel(new FlatDarkLaf());
                } else {
                    UIManager.setLookAndFeel(lafName);
                }
            SwingUtilities.updateComponentTreeUI(this);
            SwingUtilities.updateComponentTreeUI(this._parent);
            SwingUtilities.updateComponentTreeUI(this._parent.getMeteoDataset());
             this._parent.getOptions().setLookFeel(laf);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrmOptions.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(FrmOptions.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FrmOptions.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FrmOptions.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.dispose();
    }//GEN-LAST:event_jButton_OKActionPerformed

    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_CancelActionPerformed

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
            java.util.logging.Logger.getLogger(FrmOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrmOptions dialog = new FrmOptions(new FrmMain(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JButton jButton_LegendFont;
    private javax.swing.JButton jButton_OK;
    private javax.swing.JButton jButton_TextFont;
    private javax.swing.JComboBox jComboBox_LookAndFeel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_LegendFont;
    private javax.swing.JLabel jLabel_LookAndFeel;
    private javax.swing.JLabel jLabel_TextFont;
    private javax.swing.JPanel jPanel_Font;
    private javax.swing.JPanel jPanel_General;
    private javax.swing.JTabbedPane jTabbedPane_Option;
    // End of variables declaration//GEN-END:variables
}

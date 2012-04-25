/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author bolson
 */
public class PlayerGUI extends javax.swing.JFrame {

    /**
     * Creates new form PlayerGUI
     */
    public PlayerGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSkipBack = new javax.swing.JButton();
        jButtonPlay = new javax.swing.JButton();
        jButtonPause = new javax.swing.JButton();
        jButtonStop = new javax.swing.JButton();
        jButtonSkipForward = new javax.swing.JButton();
        jLabelTimePlayed = new javax.swing.JLabel();
        jLabelMediaName = new javax.swing.JLabel();
        jSliderMediaLocation = new javax.swing.JSlider();
        jSliderVolume = new javax.swing.JSlider();
        jLabelVolume = new javax.swing.JLabel();
        jLabelTimeRemaining = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonAddToLibrary = new javax.swing.JButton();
        jButtonRemoveFromLibrary = new javax.swing.JButton();
        jButtonAddToPlaylist = new javax.swing.JButton();
        jButtonOpenPlaylist = new javax.swing.JButton();
        jButtonRemovePlaylist = new javax.swing.JButton();
        jButtonNewPlaylist = new javax.swing.JButton();
        jButtonSavePlaylist = new javax.swing.JButton();
        jLabelMediaLibrary = new javax.swing.JLabel();
        playerMenuBar = new javax.swing.JMenuBar();
        playerFileMenu = new javax.swing.JMenu();
        menuItemAddToLibrary = new javax.swing.JMenuItem();
        menuItemNewPlaylist = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonSkipBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/skip-back.png"))); // NOI18N
        jButtonSkipBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSkipBackActionPerformed(evt);
            }
        });

        jButtonPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/play.png"))); // NOI18N

        jButtonPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/pause.png"))); // NOI18N

        jButtonStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/stop.png"))); // NOI18N

        jButtonSkipForward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/skip-forward.png"))); // NOI18N

        jLabelTimePlayed.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTimePlayed.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTimePlayed.setText("00:00");

        jLabelMediaName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelMediaName.setText("file name");
        jLabelMediaName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jSliderVolume.setOrientation(javax.swing.JSlider.VERTICAL);

        jLabelVolume.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVolume.setText("volume");

        jLabelTimeRemaining.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTimeRemaining.setText("00:00");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jButtonAddToLibrary.setText("Add Song");
        jButtonAddToLibrary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAddToLibraryActionPerformed(evt);
            }
        });

        jButtonRemoveFromLibrary.setText("Remove Song");

        jButtonAddToPlaylist.setText("Add to Playlist");

        jButtonOpenPlaylist.setText("Open Playlist");

        jButtonRemovePlaylist.setText("Remove From Playlist");

        jButtonNewPlaylist.setText("New Playlist");

        jButtonSavePlaylist.setText("Save Playlist");

        jLabelMediaLibrary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelMediaLibrary.setText("Song Library");

        playerFileMenu.setText("File");

        menuItemAddToLibrary.setText("Add Song To Library");
        menuItemAddToLibrary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAddToLibraryActionPerformed(evt);
            }
        });
        playerFileMenu.add(menuItemAddToLibrary);

        menuItemNewPlaylist.setText("New Playlist");
        playerFileMenu.add(menuItemNewPlaylist);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        playerFileMenu.add(Exit);

        playerMenuBar.add(playerFileMenu);

        setJMenuBar(playerMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelTimeRemaining, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(jLabelMediaName, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabelTimePlayed, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSliderMediaLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jSliderVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabelVolume)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonSkipBack)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonPlay)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonPause)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonStop)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonSkipForward)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButtonNewPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonSavePlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(7, 7, 7)
                                        .addComponent(jButtonOpenPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(9, 9, 9)
                                        .addComponent(jButtonRemovePlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jScrollPane1))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAddToLibrary)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemoveFromLibrary)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAddToPlaylist)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelMediaLibrary, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTimeRemaining)
                                    .addComponent(jLabelMediaName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTimePlayed, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSliderMediaLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelVolume)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSliderVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSkipBack)
                            .addComponent(jButtonPlay)
                            .addComponent(jButtonPause)
                            .addComponent(jButtonStop)
                            .addComponent(jButtonSkipForward)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonNewPlaylist)
                            .addComponent(jButtonOpenPlaylist)
                            .addComponent(jButtonRemovePlaylist)
                            .addComponent(jButtonSavePlaylist))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRemoveFromLibrary)
                    .addComponent(jButtonAddToPlaylist)
                    .addComponent(jButtonAddToLibrary)
                    .addComponent(jLabelMediaLibrary))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void menuItemAddToLibraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAddToLibraryActionPerformed
    JFileChooser fc = new JFileChooser();
    fc.setFileFilter( new MediaFileFilter() );
    int ret = fc.showOpenDialog(this);
    if( ret == JFileChooser.APPROVE_OPTION ) {
        File selectedFile = fc.getSelectedFile();
    }
  }//GEN-LAST:event_menuItemAddToLibraryActionPerformed

  private void jButtonSkipBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSkipBackActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jButtonSkipBackActionPerformed

  private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
    setVisible(false);
    dispose();
  }//GEN-LAST:event_ExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PlayerGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Exit;
    private javax.swing.JButton jButtonAddToLibrary;
    private javax.swing.JButton jButtonAddToPlaylist;
    private javax.swing.JButton jButtonNewPlaylist;
    private javax.swing.JButton jButtonOpenPlaylist;
    private javax.swing.JButton jButtonPause;
    private javax.swing.JButton jButtonPlay;
    private javax.swing.JButton jButtonRemoveFromLibrary;
    private javax.swing.JButton jButtonRemovePlaylist;
    private javax.swing.JButton jButtonSavePlaylist;
    private javax.swing.JButton jButtonSkipBack;
    private javax.swing.JButton jButtonSkipForward;
    private javax.swing.JButton jButtonStop;
    private javax.swing.JLabel jLabelMediaLibrary;
    private javax.swing.JLabel jLabelMediaName;
    private javax.swing.JLabel jLabelTimePlayed;
    private javax.swing.JLabel jLabelTimeRemaining;
    private javax.swing.JLabel jLabelVolume;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSlider jSliderMediaLocation;
    private javax.swing.JSlider jSliderVolume;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JMenuItem menuItemAddToLibrary;
    private javax.swing.JMenuItem menuItemNewPlaylist;
    private javax.swing.JMenu playerFileMenu;
    private javax.swing.JMenuBar playerMenuBar;
    // End of variables declaration//GEN-END:variables
}
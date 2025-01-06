/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;

/**
 *
 * @author Dilshan Shanaka
 */
public class loading extends javax.swing.JFrame {

//    private static loading loading;
    private static loading loading;
    
    /**
     * Creates new form loading
     */
    public loading() {
        initComponents();
        loading = this;
        start();
    }

    private void start() {
        
        Color red = new Color(204,0,51);
        Color Green = new Color(0,153,51);
        Color yellow = new Color(153,153,0);
        
        Thread t = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                jProgressBar1.setValue(i);
                
                switch (i) {
                    case 10 -> {
                        String MG = "Please Waiting.";
                        jLabel1.setText(MG);
                        jLabel1.setForeground(yellow);
                    }
                    case 11 -> {
                        String MG = "Please Waiting..";
                        jLabel1.setText(MG);
                        
                    }
                    case 12 -> {
                        String MG = "Please Waiting...";
                        jLabel1.setText(MG);
                        
                    }
                    case 13 -> {
                        String MG = "Please Waiting..";
                        jLabel1.setText(MG);
                        
                    }
                    case 14 -> {
                        String MG = "Please Waiting.";
                        jLabel1.setText(MG);
                        
                    }
                    case 15 -> {
                        String MG = "Please Waiting..";
                        jLabel1.setText(MG);
                        
                    }
                    case 16 -> {
                        String MG = "Please Waiting...";
                        jLabel1.setText(MG);
                        
                    }
                    case 20 -> {
                        String MG = "Searching Location..";
                        jLabel1.setText(MG);
                        jLabel1.setForeground(Green);
                    }
                    case 30 -> {
                        String MG = "analyzing The Cloud.";
                        jLabel1.setText(MG);
                        
                    }
                    case 40 -> {
                        String MG = "Looking Outside Your window..";
                        jLabel1.setText(MG);
                        
                    }
                    case 50 -> {
                        String MG = "Gathering Informations...";
                        jLabel1.setText(MG);
                        
                    }
                    case 60 -> {
                        String MG = "Almost Done..";
                        jLabel1.setText(MG);
                        jLabel1.setForeground(red);
                    }
                    case 63 -> {
                        String MG = "Please Waiting.";
                        jLabel1.setText(MG);
                        
                    }
                    case 66 -> {
                        String MG = "Please Waiting..";
                        jLabel1.setText(MG);
                        
                    }
                    case 69 -> {
                        String MG = "Please Waiting...";
                        jLabel1.setText(MG);
                        
                    }
                    case 72 -> {
                        String MG = "Please Waiting..";
                        jLabel1.setText(MG);
                        
                    }
                    case 75 -> {
                        String MG = "Please Waiting.";
                        jLabel1.setText(MG);
                        
                    }
                    case 78 -> {
                        String MG = "Please Waiting..";
                        jLabel1.setText(MG);
                        
                    }
                    case 81 -> {
                        String MG = "Please Waiting...";
                        jLabel1.setText(MG);
                        
                    }
                    case 84 -> {
                        String MG = "Please Waiting..";
                        jLabel1.setText(MG);
                        
                    }
                    case 87 -> {
                        String MG = "Please Waiting.";
                        jLabel1.setText(MG);
                        
                    }
                    case 90 -> {
                        String MG = "One Second";
                        jLabel1.setText(MG);
                        jLabel1.setForeground(Color.BLACK);
                    }
                    case 95 -> {
                        String MG = "Done........";
                        jLabel1.setText(MG);
                        
                    }
                    default -> {
                    }
                }
                
                
                try {
                    Thread.sleep(200);
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
            }
            
            loading.dispose();
            new Result_Page().setVisible(true);
        });
        t.start();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loading......");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jProgressBar1.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Loading..................");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> {
//            loading = new loading();
//            loading.setVisible(true);
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}

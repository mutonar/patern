/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test_to_work_git.Thread;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

/**
 *
 * @author nazarov
 */
public class TestButtomBar extends javax.swing.JFrame {

    /**
     * Creates new form TestButtomBar
     */
    public TestButtomBar() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jProgressBar1 = ProgresBarMy.getInstance();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("run_Wprker_this_bar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("null_this_Bar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("run_new_frame_bar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SwingWorker work = runMybar();
        work.execute();
        

    }//GEN-LAST:event_jButton1ActionPerformed
        
    public SwingWorker runMybar(){// запуск в отдельном потоке
       /* Runnable example = new Runnable() {
        public void run() {
            for (int i = 0; i > -10; i--) {
            System.out.println("main" + i);
            ProgresBarMy.getInstance().setVal(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TestButtomBar.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        }
        };
        SwingUtilities.invokeLater(example);
        */
        
        // Отдельный поток Воркера с потоком еще одним
        return new SwingWorker<Boolean, Integer>() {
            @Override
            protected Boolean doInBackground() throws Exception {
                // Start Progress
                setProgress(0);
                Thread.sleep(500);
                // Example Loop
                int progress;
                for (int iCount = 1; iCount <= 20; iCount++) {
                    // Is an even number?
                    if (iCount % 2 == 0) {
                        publish(iCount);
                    }
                    // Set Progress
                    progress = (iCount * 100) / 20;
                    setProgress(progress);
                    //jProgressBar1.setValue(jProgressBar1.getValue()+progress);
                    //ProgresBarMy.getInstance().setVal(progress);
                    Thread.sleep(250);
                }
                ThreadTest start = new ThreadTest();
               try
                {
                start.start();
                }
                    catch (InterruptedException e) {
                System.out.println("Interrupt");
                }
                // Finished
                return true;
            }
            @Override
            protected void process(List<Integer> chunks) {
                // Get Info
                for (int number : chunks) {
                    System.out.println("Found even number: " + number);
                }
            }
            @Override
            protected void done() {
                boolean bStatus = false;
                try {
                    bStatus = get();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                System.out.println("Finished with status " + bStatus);
            }
        };
    }
    
    //  Еще один но с другим потоком отдельным для FrameBar
    public SwingWorker runBarFrame(){// запуск в отдельном потоке
        // Отдельный поток Воркера с потоком еще одним
        return new SwingWorker<Boolean, Integer>() {
            @Override
            protected Boolean doInBackground() throws Exception {
                // Start Progress
                setProgress(0);
                Thread.sleep(500);
                // Example Loop
                int progress;
                for (int iCount = 1; iCount <= 20; iCount++) {
                    // Is an even number?
                    if (iCount % 2 == 0) {
                        publish(iCount);
                    }
                    // Set Progress
                    progress = (iCount * 100) / 20;
                    setProgress(progress);
                }
                AnotherRunFrame RunBarF = new AnotherRunFrame();
                Thread childTread = new Thread(RunBarF);
                childTread.start();
                childTread.join();
                // Finished
                return true;
            }
            @Override
            protected void process(List<Integer> chunks) {
                // Get Info
                for (int number : chunks) {
                    System.out.println("Found even number: " + number);
                }
            }
            @Override
            protected void done() {
                boolean bStatus = false;
                try {
                    bStatus = get();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                System.out.println("Finished with status " + bStatus);
            }
        };
    }
            
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        //ProgresBarMy.getInstance().setMax(100);
        //ProgresBarMy.getInstance().setMin(0);
        //ProgresBarMy.getInstance().setVal(5);
        jProgressBar1.setValue(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // запуск процесса 
        SwingWorker work = runBarFrame();
        work.execute();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProgresBar.getInstance().setVisible(true);
                ProgresBar.getInstance().setDefaultCloseOperation(ProgresBar.DISPOSE_ON_CLOSE); // закрытие окна
            }
        });
        
    }//GEN-LAST:event_jButton3ActionPerformed

    public void adddataJProgressBar(int d){
        jProgressBar1.setValue(jProgressBar1.getValue()+d);
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
            java.util.logging.Logger.getLogger(TestButtomBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestButtomBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestButtomBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestButtomBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestButtomBar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}



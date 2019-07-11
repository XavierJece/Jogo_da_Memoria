/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooii.utfpr.memory_game.View;

import com.sun.org.glassfish.external.statistics.Statistic;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import pooii.utfpr.memory_game.Model.DAO.GenericDAO;
import pooii.utfpr.memory_game.Model.DAO.GenericDAOImpl;
import pooii.utfpr.memory_game.Model.RN.GenericRN;
import pooii.utfpr.memory_game.Model.VO.Player;
import pooii.utfpr.memory_game.Model.VO.Statistics;

/**
 *
 * @author Jece Xavier
 */
public class TelaRanking extends javax.swing.JFrame {
    private int mousePx, mousePy;
    private TelaDefineModo td;
    
    public TelaRanking() {
        initComponents();
        
        readJtable();
    }
    
      public TelaRanking(TelaDefineModo td) {
        initComponents();
        this.td = td;
        readJtable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPrimeiro = new javax.swing.JLabel();
        lblSegundo = new javax.swing.JLabel();
        lblTerceiro = new javax.swing.JLabel();
        tblRanking = new javax.swing.JScrollPane();
        blRanking2 = new javax.swing.JTable();
        lblClose = new javax.swing.JLabel();
        lblBarra = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPrimeiro.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        getContentPane().add(lblPrimeiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 150, 40));

        lblSegundo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        getContentPane().add(lblSegundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 150, 50));

        lblTerceiro.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        getContentPane().add(lblTerceiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 140, 40));

        blRanking2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Posição", "Nome", "Pontuação", "Maior Sequência", "Qtd Jogadas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRanking.setViewportView(blRanking2);

        getContentPane().add(tblRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 410, 220));

        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        getContentPane().add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 0, 10, 20));

        lblBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblBarraMouseDragged(evt);
            }
        });
        lblBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBarraMousePressed(evt);
            }
        });
        getContentPane().add(lblBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 20));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/telaRanking.jpg"))); // NOI18N
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 480));

        setSize(new java.awt.Dimension(458, 475));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        this.dispose();
        td.setVisible(true);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarraMouseDragged
        int cordenadaX = evt.getXOnScreen();
        int cordenadaY = evt.getYOnScreen();

        this.setLocation(cordenadaX-mousePx, cordenadaY-mousePy);
    }//GEN-LAST:event_lblBarraMouseDragged

    private void lblBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarraMousePressed
        mousePx = evt.getX();
        mousePy = evt.getY();
    }//GEN-LAST:event_lblBarraMousePressed

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
            java.util.logging.Logger.getLogger(TelaRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRanking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable blRanking2;
    private javax.swing.JLabel lblBarra;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblPrimeiro;
    private javax.swing.JLabel lblSegundo;
    private javax.swing.JLabel lblTerceiro;
    private javax.swing.JScrollPane tblRanking;
    // End of variables declaration//GEN-END:variables
    
    
    /*My funcitions*/
    private void readJtable(){
        DefaultTableModel modelo = (DefaultTableModel)(blRanking2.getModel());
        GenericRN<Statistics>  staDAO = new GenericRN<>();
        ArrayList<Statistics> stats = (ArrayList<Statistics>) staDAO.listAll(Statistics.class, "DESC", 10, "pontuacao");
        
        int i = 0;
        for(Statistics s : stats){
            i++;
            modelo.addRow(new Object[] {
                i + "º",
                s.getPlayer().getNickName(),
                s.getPontuacao(),
                s.getBiggerSequence(),
                s.getQuantidadeJogadas()
            });
            
        }
        
        if(stats.size() > 2){
            lblPrimeiro.setText(stats.get(0).getPlayer().getNickName());
            lblSegundo.setText(stats.get(1).getPlayer().getNickName());
            lblTerceiro.setText(stats.get(2).getPlayer().getNickName());
        }else if(stats.size() > 1){
            lblPrimeiro.setText(stats.get(0).getPlayer().getNickName());
            lblSegundo.setText(stats.get(1).getPlayer().getNickName());
        }else if(stats.size() == 1){
            lblPrimeiro.setText(stats.get(0).getPlayer().getNickName());
        }
        
        
    }
}
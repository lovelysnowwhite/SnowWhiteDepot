
package tickets;

import tickets.property.User;
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author PC
 */
public class HomeUi1 extends javax.swing.JFrame {

    /**
     * Creates new form homepage
     */
    public HomeUi1() {
         
        initComponents();
    }
    public HomeUi1(User user) {
         this.user=user;
         
        initComponents();
    }
   

    
    @SuppressWarnings("unchecked")   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        movie = new javax.swing.JButton();
        homepage1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        p6 = new javax.swing.JLabel();
        p7 = new javax.swing.JLabel();
        p8 = new javax.swing.JLabel();
        uac = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 153));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 153, 153));

        movie.setBackground(new java.awt.Color(255, 255, 255));
        movie.setFont(new java.awt.Font("幼圆", 3, 24)); // NOI18N
        movie.setForeground(new java.awt.Color(255, 0, 0));
        movie.setText("电影");
        movie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieActionPerformed(evt);
            }
        });

        homepage1.setBackground(new java.awt.Color(255, 0, 51));
        homepage1.setFont(new java.awt.Font("幼圆", 3, 24)); // NOI18N
        homepage1.setText("首页");
        homepage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homepage1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("幼圆", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("白雪公主电影");

        jLabel2.setFont(new java.awt.Font("楷体", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 153));
        jLabel2.setText("正在热映");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/p.jpg"))); // NOI18N

        p3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/p3.PNG"))); // NOI18N

        p4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/p4.PNG"))); // NOI18N

        p5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/p5.PNG"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("楷体", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 153));
        jLabel6.setText("即将上映");

        p6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/p6.PNG"))); // NOI18N

        p7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/p7.PNG"))); // NOI18N

        p8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/p8.PNG"))); // NOI18N

        uac.setFont(new java.awt.Font("Yu Gothic", 3, 18)); // NOI18N
        uac.setText("My account");
        uac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uacMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p3)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(p4)
                                .addGap(50, 50, 50)
                                .addComponent(p5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel4)
                                        .addGap(304, 304, 304))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(homepage1)
                                        .addGap(98, 98, 98)))
                                .addGap(39, 39, 39)
                                .addComponent(movie))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(187, 187, 187)
                                .addComponent(uac, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(p6)
                                .addGap(53, 53, 53)
                                .addComponent(p7)
                                .addGap(50, 50, 50)
                                .addComponent(p8)))))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(uac, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4)
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(homepage1)
                            .addComponent(movie)))
                    .addComponent(jLabel5))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(p5)
                        .addGap(4, 4, 4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p4)
                            .addComponent(p3))))
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p8)
                            .addComponent(p7))))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homepage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homepage1ActionPerformed
       HomeUi1 h=new HomeUi1();
       h.setVisible(true);
       dispose();
    }//GEN-LAST:event_homepage1ActionPerformed

    private void movieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieActionPerformed
       HomeUi2 m=new HomeUi2(user);
       m.setVisible(true);
       dispose();
    }//GEN-LAST:event_movieActionPerformed

    private void uacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uacMouseClicked
        UserUi u=new UserUi(user);
        u.setVisible(true);
        
    }//GEN-LAST:event_uacMouseClicked

   
    public static void main(String args[]) {
       
       
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                HomeUi1 hpg=new HomeUi1();
                hpg.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton homepage1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton movie;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JLabel p6;
    private javax.swing.JLabel p7;
    private javax.swing.JLabel p8;
    private javax.swing.JLabel uac;
    // End of variables declaration//GEN-END:variables
    private User user;
}

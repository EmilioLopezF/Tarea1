


public class menu extends javax.swing.JFrame {
    int lata, plata;
    
    public menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonCoca = new javax.swing.JButton();
        botonCocaZ = new javax.swing.JButton();
        botonFanta = new javax.swing.JButton();
        botonSprite = new javax.swing.JButton();
        botonRed = new javax.swing.JButton();
        txtmonedas = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        lblRespuesta = new java.awt.Label();
        botonCobrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonCoca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/Coca-Cola_Lata.png"))); // NOI18N
        botonCoca.setText("Coca-Cola     $450");
        botonCoca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCoca.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonCoca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCocaActionPerformed(evt);
            }
        });

        botonCocaZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/coca-cola-zero-.png"))); // NOI18N
        botonCocaZ.setText("Coca-Cola Zero $400");
        botonCocaZ.setToolTipText("");
        botonCocaZ.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCocaZ.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonCocaZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCocaZActionPerformed(evt);
            }
        });

        botonFanta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mayoreototal-caja-refresco-fanta-de-355-ml-con-12-piezas-coca-cola-refrescos-coca-cola-sku_grande.png"))); // NOI18N
        botonFanta.setText("Fanta          $450");
        botonFanta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonFanta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonFanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFantaActionPerformed(evt);
            }
        });

        botonSprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/sprite-lata-3501-43017bdbb880b6fb0515122073567038-640-0.png"))); // NOI18N
        botonSprite.setText("Sprite             $450");
        botonSprite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonSprite.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonSprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSpriteActionPerformed(evt);
            }
        });

        botonRed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/9102870478878.jpg"))); // NOI18N
        botonRed.setText("Red Bull    $500");
        botonRed.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonRed.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRedActionPerformed(evt);
            }
        });

        label1.setText("Ingrese dinero:");

        botonCobrar.setText("PAGAR");
        botonCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCobrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(botonCobrar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonCoca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(botonCocaZ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonFanta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(botonSprite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(botonRed, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtmonedas, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtmonedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCoca)
                    .addComponent(botonCocaZ))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSprite)
                    .addComponent(botonFanta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonRed)
                .addGap(18, 18, 18)
                .addComponent(botonCobrar)
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRedActionPerformed
        lata = 5;

    }//GEN-LAST:event_botonRedActionPerformed

    private void botonCocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCocaActionPerformed
        lata = 1;

    }//GEN-LAST:event_botonCocaActionPerformed

    private void botonCocaZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCocaZActionPerformed
        lata = 2;
    }//GEN-LAST:event_botonCocaZActionPerformed

    private void botonFantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFantaActionPerformed
        lata = 3;
    }//GEN-LAST:event_botonFantaActionPerformed

    private void botonSpriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSpriteActionPerformed
        lata = 4;
    }//GEN-LAST:event_botonSpriteActionPerformed

    private void botonCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCobrarActionPerformed
        plata = Integer.parseInt(txtmonedas.getText());
        float total, precioCFS=450, precioCZ=400, precioR=500, vuelto;        
        if(lata==1 || lata == 3 || lata == 4){
            if(plata<precioCFS){
                lblRespuesta.setText(String.valueOf("Dinero insuficiente!!"));
            }
            vuelto = plata - precioCFS;
            if(vuelto>0){
                lblRespuesta.setText(String.valueOf("Retire su bebida y vuelto: $"+vuelto));
            }else{
                lblRespuesta.setText(String.valueOf("Retire su bebida"));
            }
            plata =0;
            vuelto=0;
        }
        if(lata == 2){
            if(plata<precioCZ){
                lblRespuesta.setText(String.valueOf("Dinero insuficiente!!"));
            }
            vuelto = plata - precioCZ;
            if(vuelto>0){
                lblRespuesta.setText(String.valueOf("Retire su bebida y vuelto: $"+vuelto));
            }else{
                lblRespuesta.setText(String.valueOf("Retire su bebida"));
            }
            plata =0;
            vuelto=0;
        }
        if(lata == 5){
            if(plata<precioR){
                lblRespuesta.setText(String.valueOf("Dinero insuficiente!!"));
            }
            vuelto = plata - precioR;
            if(vuelto>0){
                lblRespuesta.setText(String.valueOf("Retire su bebida y vuelto: $"+vuelto));
            }else{
                lblRespuesta.setText(String.valueOf("Retire su bebida"));
            }
            plata =0;
            vuelto=0;
        }
    }//GEN-LAST:event_botonCobrarActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCobrar;
    private javax.swing.JButton botonCoca;
    private javax.swing.JButton botonCocaZ;
    private javax.swing.JButton botonFanta;
    private javax.swing.JButton botonRed;
    private javax.swing.JButton botonSprite;
    private java.awt.Label label1;
    private java.awt.Label lblRespuesta;
    private javax.swing.JTextField txtmonedas;
    // End of variables declaration//GEN-END:variables
}

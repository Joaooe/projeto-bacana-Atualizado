package View;

public class TelaAplicacao extends javax.swing.JFrame {
    
    public TelaAplicacao() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        menuUsuarios = new javax.swing.JDesktopPane();
        menuBarPrincipal = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuNovo = new javax.swing.JMenu();
        menuNovoItem = new javax.swing.JMenuItem();
        menuCadastro = new javax.swing.JMenu();
        menuItemCadastroUsuarios = new javax.swing.JMenuItem();
        menuItemCadastroCliente = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu3.setText("File");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar1.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela inicial - Aplicação");
        setResizable(false);

        menuUsuarios.setBackground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout menuUsuariosLayout = new javax.swing.GroupLayout(menuUsuarios);
        menuUsuarios.setLayout(menuUsuariosLayout);
        menuUsuariosLayout.setHorizontalGroup(
            menuUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );
        menuUsuariosLayout.setVerticalGroup(
            menuUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
        );

        menuBarPrincipal.setBackground(new java.awt.Color(0, 51, 255));

        menuArquivo.setText("Arquivo");

        menuNovo.setText("Novo");

        menuNovoItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuNovoItem.setText("Novo Item");
        menuNovoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNovoItemActionPerformed(evt);
            }
        });
        menuNovo.add(menuNovoItem);

        menuArquivo.add(menuNovo);

        menuBarPrincipal.add(menuArquivo);

        menuCadastro.setText("Cadastro");
        menuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroActionPerformed(evt);
            }
        });

        menuItemCadastroUsuarios.setText("Cadastro");
        menuItemCadastroUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastroUsuariosActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemCadastroUsuarios);

        menuItemCadastroCliente.setText("Cadastro de Cliente");
        menuCadastro.add(menuItemCadastroCliente);

        menuBarPrincipal.add(menuCadastro);

        menuSobre.setText("Sobre");

        jMenuItem2.setText("Ajuda");
        menuSobre.add(jMenuItem2);

        jMenuItem1.setText("Sair");
        menuSobre.add(jMenuItem1);

        menuBarPrincipal.add(menuSobre);

        setJMenuBar(menuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuUsuarios)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuUsuarios)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuNovoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNovoItemActionPerformed
        

    }//GEN-LAST:event_menuNovoItemActionPerformed

    private void menuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCadastroActionPerformed

    private void menuItemCadastroUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastroUsuariosActionPerformed
        TelaOpeCadastroUsuarios novaTela = new TelaOpeCadastroUsuarios();
        novaTela.setVisible(true);
    }//GEN-LAST:event_menuItemCadastroUsuariosActionPerformed

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
                if ("Windowns".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAplicacao().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuBar menuBarPrincipal;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuItemCadastroCliente;
    private javax.swing.JMenuItem menuItemCadastroUsuarios;
    private javax.swing.JMenu menuNovo;
    private javax.swing.JMenuItem menuNovoItem;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JDesktopPane menuUsuarios;
    // End of variables declaration//GEN-END:variables
}

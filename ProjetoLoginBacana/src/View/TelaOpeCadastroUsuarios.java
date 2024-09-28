/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.CadastroUsuariosController;
import Model.CadastroUsuarioModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;


public class TelaOpeCadastroUsuarios extends javax.swing.JFrame {

   
    public TelaOpeCadastroUsuarios() {
        initComponents();
        atualizarDadosTabela();
        inicializarTabela();

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBase = new javax.swing.JPanel();
        pnlTop = new javax.swing.JPanel();
        pnlIconUser = new javax.swing.JPanel();
        lblIconUser = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        pnlTitulo = new javax.swing.JPanel();
        pnlLeft = new javax.swing.JPanel();
        pnlRight = new javax.swing.JPanel();
        pnlCentral = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListaUsuarios = new javax.swing.JTable();
        lblTextoPesquisa = new javax.swing.JLabel();
        txtTextoPesquisa = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        pnlFooter = new javax.swing.JPanel();
        pnlButtons = new javax.swing.JPanel();
        btnAtualizar = new javax.swing.JButton();
        btnNovoUsuario = new javax.swing.JButton();
        btnExcluirUsuario = new javax.swing.JButton();
        btnAtualizarUsuario = new javax.swing.JButton();
        btnAtualizaUserBD = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Cadastro e demais funções de usuários");
        setResizable(false);

        pnlBase.setPreferredSize(new java.awt.Dimension(950, 480));
        pnlBase.setLayout(new java.awt.BorderLayout());

        pnlTop.setBackground(new java.awt.Color(0, 0, 102));

        lblIconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-person-96.png"))); // NOI18N

        lblTitulo.setBackground(new java.awt.Color(255, 0, 51));
        lblTitulo.setFont(new java.awt.Font("SansSerif", 3, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 51));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Cadastro de Usuários");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlIconUserLayout = new javax.swing.GroupLayout(pnlIconUser);
        pnlIconUser.setLayout(pnlIconUserLayout);
        pnlIconUserLayout.setHorizontalGroup(
            pnlIconUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIconUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIconUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlIconUserLayout.setVerticalGroup(
            pnlIconUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIconUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlIconUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIconUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pnlTitulo.setBackground(new java.awt.Color(0, 0, 102));
        pnlTitulo.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 827, Short.MAX_VALUE)
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(pnlIconUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlIconUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlBase.add(pnlTop, java.awt.BorderLayout.PAGE_START);

        pnlLeft.setPreferredSize(new java.awt.Dimension(15, 263));

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlBase.add(pnlLeft, java.awt.BorderLayout.LINE_START);

        pnlRight.setPreferredSize(new java.awt.Dimension(15, 263));

        javax.swing.GroupLayout pnlRightLayout = new javax.swing.GroupLayout(pnlRight);
        pnlRight.setLayout(pnlRightLayout);
        pnlRightLayout.setHorizontalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        pnlRightLayout.setVerticalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlBase.add(pnlRight, java.awt.BorderLayout.LINE_END);

        pnlCentral.setBackground(new java.awt.Color(0, 51, 204));
        pnlCentral.setBorder(javax.swing.BorderFactory.createTitledBorder("Relação de usuários"));
        pnlCentral.setPreferredSize(new java.awt.Dimension(970, 366));

        tbListaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome Usuário", "Email", "Login", "Perfil"
            }
        ));
        jScrollPane1.setViewportView(tbListaUsuarios);

        lblTextoPesquisa.setText("Insira o nome do usuário:");

        btnPesquisa.setText("Pesquisar");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        pnlFooter.setPreferredSize(new java.awt.Dimension(725, 50));

        pnlButtons.setLayout(new java.awt.GridLayout(1, 6, 5, 5));

        btnAtualizar.setText("ATUALIZAR TABELA");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        pnlButtons.add(btnAtualizar);

        btnNovoUsuario.setText("NOVO USUÁRIO");
        btnNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoUsuarioActionPerformed(evt);
            }
        });
        pnlButtons.add(btnNovoUsuario);

        btnExcluirUsuario.setText("EXCLUIR USUÁRIO");
        btnExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirUsuarioActionPerformed(evt);
            }
        });
        pnlButtons.add(btnExcluirUsuario);

        btnAtualizarUsuario.setText("ATUALIZAR USUÁRIO");
        btnAtualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarUsuarioActionPerformed(evt);
            }
        });
        pnlButtons.add(btnAtualizarUsuario);

        btnAtualizaUserBD.setText("ATUALIZA USER BD");
        btnAtualizaUserBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizaUserBDActionPerformed(evt);
            }
        });
        pnlButtons.add(btnAtualizaUserBD);

        btnSair.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        pnlButtons.add(btnSair);

        javax.swing.GroupLayout pnlFooterLayout = new javax.swing.GroupLayout(pnlFooter);
        pnlFooter.setLayout(pnlFooterLayout);
        pnlFooterLayout.setHorizontalGroup(
            pnlFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFooterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        pnlFooterLayout.setVerticalGroup(
            pnlFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFooterLayout.createSequentialGroup()
                .addComponent(pnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlCentralLayout = new javax.swing.GroupLayout(pnlCentral);
        pnlCentral.setLayout(pnlCentralLayout);
        pnlCentralLayout.setHorizontalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addComponent(txtTextoPesquisa)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTextoPesquisa)
                            .addComponent(pnlFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlCentralLayout.setVerticalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTextoPesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisa)
                    .addComponent(txtTextoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlBase.add(pnlCentral, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, 1803, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed

        String nome = txtTextoPesquisa.getText();

        DefaultTableModel tableModel = (DefaultTableModel) tbListaUsuarios.getModel();

        tableModel.setNumRows(0);
        CadastroUsuariosController filtroController = new CadastroUsuariosController();
        ArrayList<CadastroUsuarioModel> listaUsuarios = filtroController.filtrarUsuarios(nome);
        Iterator<CadastroUsuarioModel> iterator = listaUsuarios.iterator();

        while (iterator.hasNext()) {

            CadastroUsuarioModel usuarios = iterator.next();
            tableModel.addRow(new Object[]{
                usuarios.getId(),
                usuarios.getUsername(),
                usuarios.getEmail(),
                usuarios.getLogin(),
                usuarios.getPerfil()

            });

        }
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed

        atualizarDadosTabela();
        inicializarTabela();


    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoUsuarioActionPerformed
        TelaCadastroNovoUsuario novaTela = new TelaCadastroNovoUsuario();
        novaTela.setVisible(true);


    }//GEN-LAST:event_btnNovoUsuarioActionPerformed

    private void btnExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirUsuarioActionPerformed

        //Recuperou as informções da tabela
        Integer linhaSelecionada = tbListaUsuarios.getSelectedRow();
        String id_user = tbListaUsuarios.getValueAt(linhaSelecionada, 0).toString();
        String nomeUser = tbListaUsuarios.getValueAt(linhaSelecionada, 1).toString();
        String mensagem = "Deseja realmente excluir o usuário " + nomeUser + "?";
        int resposta = JOptionPane.showConfirmDialog(null, mensagem);

        //Sim = 0
        //Não = 1
        //Cancel = 2
        if (resposta == 0) {
            CadastroUsuariosController oper = new CadastroUsuariosController();
            oper.deletarUsuariosController(id_user);
            String mensagem1 = "Exclusão concluída com sucessa.";
            JOptionPane.showMessageDialog(null, mensagem1);
            atualizarDadosTabela();

        } else if (resposta == 1) {

            String mensagem2 = "Exclusão negada";
            JOptionPane.showMessageDialog(null, mensagem2);
            atualizarDadosTabela();

        }

        //Transferencia da informação do id para camada controller

    }//GEN-LAST:event_btnExcluirUsuarioActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnAtualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarUsuarioActionPerformed

        //Recuperar os dados da linha selecionada na tabela
        Integer linhaSelecionada = tbListaUsuarios.getSelectedRow();
        String id_user = tbListaUsuarios.getValueAt(linhaSelecionada, 0).toString();
        String nomeUser = tbListaUsuarios.getValueAt(linhaSelecionada, 1).toString();
        String email = tbListaUsuarios.getValueAt(linhaSelecionada, 2).toString();
        String login = tbListaUsuarios.getValueAt(linhaSelecionada, 3).toString();
        String perfil = tbListaUsuarios.getValueAt(linhaSelecionada, 4).toString();

        //Abre a janela de atualização do usuário
        TelaAtualizacaoUsuario tela = new TelaAtualizacaoUsuario();
        tela.setVisible(true);

        tela.atualizaCamposTela(id_user, nomeUser, email, login, perfil);
    }//GEN-LAST:event_btnAtualizarUsuarioActionPerformed

    
    
    
    
    
    private void btnAtualizaUserBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizaUserBDActionPerformed

        Integer linhaSelecionada = tbListaUsuarios.getSelectedRow();
        String id_user = tbListaUsuarios.getValueAt(linhaSelecionada, 0).toString();

        CadastroUsuariosController filtroController = new CadastroUsuariosController();
        ArrayList<CadastroUsuarioModel> listaUsuarios = filtroController.filtrarAtualizarUsuariosBD(id_user);

        // Passando os dados para a TelaRecuperaUsuario
        TelaRecuperaUsuario tela = new TelaRecuperaUsuario();
        for (CadastroUsuarioModel usuario : listaUsuarios) {
            tela.exibirUsuario(usuario);
        }

        tela.setVisible(true);


    }//GEN-LAST:event_btnAtualizaUserBDActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaOpeCadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOpeCadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOpeCadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOpeCadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaOpeCadastroUsuarios().setVisible(true);
            }
        });
    }

    public void inicializarTabela() {
        tbListaUsuarios.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            ListSelectionModel botaoAtivado = (ListSelectionModel) e.getSource();

            // Verifica se há apenas uma linha selecionada
            if (!botaoAtivado.isSelectionEmpty() && tbListaUsuarios.getSelectedRows().length == 1) {
                btnExcluirUsuario.setEnabled(true);
                btnAtualizarUsuario.setEnabled(true);
            } else {
                btnExcluirUsuario.setEnabled(false);
                btnAtualizarUsuario.setEnabled(false);
            }
        });
    }

    public void atualizarDadosTabela() {
        // FUNÇÃO QUE RECEBE UMA ARRAYLIST CHEIA DE DADOS
        //DECOMPORT A ARRAYLIST
        //PEGAR OS DADOS DECOMPOSTOS
        //MONTAR A TABELA COM O DADOS
        DefaultTableModel tableModel = (DefaultTableModel) tbListaUsuarios.getModel();

        tableModel.setNumRows(0);
        CadastroUsuariosController listaController = new CadastroUsuariosController();
        ArrayList<CadastroUsuarioModel> listaUsuarios = listaController.listarUsuarios();
        Iterator<CadastroUsuarioModel> iterator = listaUsuarios.iterator();

        while (iterator.hasNext()) {

            CadastroUsuarioModel usuarios = iterator.next();
            tableModel.addRow(new Object[]{
                usuarios.getId(),
                usuarios.getUsername(),
                usuarios.getEmail(),
                usuarios.getLogin(),
                usuarios.getPerfil()

            });

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizaUserBD;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnAtualizarUsuario;
    private javax.swing.JButton btnExcluirUsuario;
    private javax.swing.JButton btnNovoUsuario;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIconUser;
    private javax.swing.JLabel lblTextoPesquisa;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlFooter;
    private javax.swing.JPanel pnlIconUser;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JTable tbListaUsuarios;
    private javax.swing.JTextField txtTextoPesquisa;
    // End of variables declaration//GEN-END:variables
}

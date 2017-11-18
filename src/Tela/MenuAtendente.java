/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author augusto
 */
public class MenuAtendente extends javax.swing.JFrame {

    /**
     * Creates new form MenuAtendente
     */
    public MenuAtendente() {
        
        initComponents();
        setSize(1280, 720);
        this.setLocationRelativeTo(null);
        
        usuarioLogado.setText(TelaDeLogin.usuario);
        
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        usuarioLogado = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        deslogar = new javax.swing.JMenuItem();
        sairDoSistema = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        listarConsultas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        cadastroDePaciente = new javax.swing.JMenuItem();
        listarPacientes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Atendente");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/OdontoLogo.png"))); // NOI18N

        usuarioLogado.setText("Usuario");

        jMenu.setText("Opções");

        deslogar.setText("Deslogar");
        deslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deslogarActionPerformed(evt);
            }
        });
        jMenu.add(deslogar);

        sairDoSistema.setText("Sair");
        sairDoSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairDoSistemaActionPerformed(evt);
            }
        });
        jMenu.add(sairDoSistema);

        jMenuBar1.add(jMenu);

        jMenu2.setText("Consulta");

        listarConsultas.setText("Listar");
        listarConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarConsultasActionPerformed(evt);
            }
        });
        jMenu2.add(listarConsultas);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Paciente");

        cadastroDePaciente.setText("Cadastro");
        cadastroDePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroDePacienteActionPerformed(evt);
            }
        });
        jMenu4.add(cadastroDePaciente);

        listarPacientes.setText("Listar");
        listarPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarPacientesActionPerformed(evt);
            }
        });
        jMenu4.add(listarPacientes);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel1)
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(usuarioLogado)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usuarioLogado)
                .addGap(139, 139, 139)
                .addComponent(jLabel1)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listarConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarConsultasActionPerformed
        try{
        new ListarConsultas();
        }catch(Exception e){
            JOptionPane.showConfirmDialog(rootPane, "Erro"+e);
        }
    }//GEN-LAST:event_listarConsultasActionPerformed

    private void sairDoSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairDoSistemaActionPerformed
       System.exit(0);
    }//GEN-LAST:event_sairDoSistemaActionPerformed

    private void deslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deslogarActionPerformed
         this.dispose();
        try{
        new TelaDeLogin();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Erro "+e);
        }
    }//GEN-LAST:event_deslogarActionPerformed

    private void cadastroDePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroDePacienteActionPerformed
        new CadastroPaciente();
    }//GEN-LAST:event_cadastroDePacienteActionPerformed

    private void listarPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarPacientesActionPerformed
         try{
        new ListarPacientes();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Erro "+e);
        }
    }//GEN-LAST:event_listarPacientesActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastroDePaciente;
    private javax.swing.JMenuItem deslogar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem listarConsultas;
    private javax.swing.JMenuItem listarPacientes;
    private javax.swing.JMenuItem sairDoSistema;
    private javax.swing.JLabel usuarioLogado;
    // End of variables declaration//GEN-END:variables
}

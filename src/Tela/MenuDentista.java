/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela;

import Util.GeradorDePdf;
import java.awt.GridBagLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author augusto
 */
public class MenuDentista extends javax.swing.JFrame {

    /**
     * Creates new form MenuDentista
     */
    public MenuDentista() {
        initComponents();
        setSize(1280, 720);
        this.setLocationRelativeTo(null);
        
        usuariologado.setText(TelaDeLogin.usuario);
        
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

        jLabel2 = new javax.swing.JLabel();
        jMenu1 = new javax.swing.JMenu();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        usuariologado = new javax.swing.JLabel();
        listarPacientesConsultas = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        deslogar = new javax.swing.JMenuItem();
        sair = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        criarConsulta = new javax.swing.JMenuItem();
        listarConsulta = new javax.swing.JMenuItem();
        consultaPorIdDoPaciente = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        listarConsultas = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        criarServicos = new javax.swing.JMenuItem();
        listarServicos = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        imprimirPorCodConsulta = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jLabel2.setText("jLabel2");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setText("Finalizar Consulta");

        jButton2.setText("Cadastrar Serviços");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Listar Consultas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Listar Serviços");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("voltar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Criar Consulta");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        usuariologado.setText("Usuario");

        listarPacientesConsultas.setText("Lista Pacientes/Consultas");
        listarPacientesConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarPacientesConsultasActionPerformed(evt);
            }
        });

        jMenu2.setText("Opções");

        deslogar.setText("Deslogar");
        deslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deslogarActionPerformed(evt);
            }
        });
        jMenu2.add(deslogar);

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jMenu2.add(sair);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consulta(s)");

        criarConsulta.setText("Criar");
        criarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarConsultaActionPerformed(evt);
            }
        });
        jMenu3.add(criarConsulta);

        listarConsulta.setText("Listar");
        listarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarConsultaActionPerformed(evt);
            }
        });
        jMenu3.add(listarConsulta);

        consultaPorIdDoPaciente.setText("Por ID do Paciente");
        consultaPorIdDoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaPorIdDoPacienteActionPerformed(evt);
            }
        });
        jMenu3.add(consultaPorIdDoPaciente);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Paciente(s)");

        listarConsultas.setText("Listar Consultas");
        listarConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarConsultasActionPerformed(evt);
            }
        });
        jMenu4.add(listarConsultas);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Serviço");

        criarServicos.setText("Criar");
        criarServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarServicosActionPerformed(evt);
            }
        });
        jMenu5.add(criarServicos);

        listarServicos.setText("Listar");
        listarServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarServicosActionPerformed(evt);
            }
        });
        jMenu5.add(listarServicos);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Imprimir");

        imprimirPorCodConsulta.setText("Por Código de Consulta");
        imprimirPorCodConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirPorCodConsultaActionPerformed(evt);
            }
        });
        jMenu6.add(imprimirPorCodConsulta);

        jMenuItem1.setText("jMenuItem1");
        jMenu6.add(jMenuItem1);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(185, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listarPacientesConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(usuariologado)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(usuariologado)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(listarPacientesConsultas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new CadastrarServico();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
        new ListarServico();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       this.dispose();
       try{
        new TelaDeLogin();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try{
        new CadastroDeConsulta();
        }catch(Exception e ){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
        new ListarConsultas();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void listarPacientesConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarPacientesConsultasActionPerformed
        try{
            new ListarPacientes();
        }catch(Exception e){
            
        }
        
    }//GEN-LAST:event_listarPacientesConsultasActionPerformed

    private void deslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deslogarActionPerformed
        this.dispose();
        try {
             new TelaDeLogin();
        } catch (Exception e) {
        }
       
    }//GEN-LAST:event_deslogarActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    private void criarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarConsultaActionPerformed
            new CadastroDeConsulta();
    }//GEN-LAST:event_criarConsultaActionPerformed

    private void listarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarConsultaActionPerformed
        try {
            new ListarConsultas();
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_listarConsultaActionPerformed

    private void listarConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarConsultasActionPerformed
        try {
            new ListarPacientes();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_listarConsultasActionPerformed

    private void criarServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarServicosActionPerformed
        new CadastrarServico();
    }//GEN-LAST:event_criarServicosActionPerformed

    private void listarServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarServicosActionPerformed
        try {
            new ListarServico();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_listarServicosActionPerformed

    private void consultaPorIdDoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaPorIdDoPacienteActionPerformed
        try {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o Id do Paciente"));
            new ListarConsultasPorPaciente(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Id Invalido"+e);
        }
        
        
    }//GEN-LAST:event_consultaPorIdDoPacienteActionPerformed

    private void imprimirPorCodConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirPorCodConsultaActionPerformed
        try {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da consulta"));
            new GeradorDePdf().gerar(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Id da Consulta inválida");
        }
    }//GEN-LAST:event_imprimirPorCodConsultaActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem consultaPorIdDoPaciente;
    private javax.swing.JMenuItem criarConsulta;
    private javax.swing.JMenuItem criarServicos;
    private javax.swing.JMenuItem deslogar;
    private javax.swing.JMenuItem imprimirPorCodConsulta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem listarConsulta;
    private javax.swing.JMenuItem listarConsultas;
    private javax.swing.JButton listarPacientesConsultas;
    private javax.swing.JMenuItem listarServicos;
    private javax.swing.JMenuItem sair;
    private javax.swing.JLabel usuariologado;
    // End of variables declaration//GEN-END:variables
}

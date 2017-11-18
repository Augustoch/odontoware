/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela;

import Classes.Consulta;
import Classes.Paciente;
import Dao.ConsultaDao;
import Dao.PacienteDao;
import Util.GeradorDePdf;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author augusto
 */
public class ListarConsultasPorPaciente extends javax.swing.JFrame {

    /**
     * Creates new form ListarConsultasPorPacientes
     */
    public ListarConsultasPorPaciente(int cod) {

        initComponents();
        carregar(cod);
        setSize(1280, 720);
        this.setLocationRelativeTo(null);

        setVisible(true);
    }

    private void carregar(Integer cod) {

        List<String[]> listaConsultaStrings = new ArrayList<String[]>();
        List<Consulta> consultas = new ConsultaDao().retornarLista(new PacienteDao().paciente(cod));
        System.out.println("----------------------------------------------" + consultas.size());
        try {
            nomeDoPaciente.setText(consultas.get(0).getPaciente().getNome());
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        consultas.forEach((consulta) -> {

            listaConsultaStrings.add(new String[]{
                consulta.getId() + "",
                consulta.getDataDaConsulta().getDayOfMonth() + "/" + consulta.getDataDaConsulta().getMonthValue() + "/" + consulta.getDataDaConsulta().getYear(),
                consulta.getDentista().getLogin(),
                consulta.getValor() + ""
            });
        });

        String[] colunas = {"Código", "Data da Consulta", "Dentista", "Valor"};
        DefaultTableModel dtm = new DefaultTableModel(listaConsultaStrings.toArray(new String[listaConsultaStrings.size()][]), colunas) {
            @Override
            public boolean isCellEditable(int row, int col)
                {
        
            return false;
                }
      }; 
        
        
        //DefaultTableModel model = new DefaultTableModel(listaConsultaStrings.toArray(new String[listaConsultaStrings.size()][]), colunas);
        tabelaDeConsultas.setModel(dtm);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaDeConsultas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        nomeDoPaciente = new javax.swing.JLabel();
        imprimir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultas Por Pacientes");

        tabelaDeConsultas.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaDeConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaDeConsultasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaDeConsultas);

        jLabel1.setText("Paciente");

        nomeDoPaciente.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        nomeDoPaciente.setText("Nome do Paciente");

        imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/print.png"))); // NOI18N
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(nomeDoPaciente)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton1)))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nomeDoPaciente)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 58, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaDeConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaDeConsultasMouseClicked
        if (evt.getClickCount() == 2) {
            int cod = Integer.parseInt((String) tabelaDeConsultas.getValueAt(tabelaDeConsultas.getSelectedRow(), 0));
            new EditarConsulta(cod);
        }
    }//GEN-LAST:event_tabelaDeConsultasMouseClicked

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
        Object i = tabelaDeConsultas.getValueAt(tabelaDeConsultas.getSelectedRow(), 0);
        int a = Integer.parseInt(i.toString());
        try {
            new GeradorDePdf().gerar(a);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Selecione uma Consulta\n" + e);
        }
    }//GEN-LAST:event_imprimirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton imprimir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nomeDoPaciente;
    private javax.swing.JTable tabelaDeConsultas;
    // End of variables declaration//GEN-END:variables
}

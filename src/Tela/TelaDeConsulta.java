/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela;

import Classes.Paciente;
import Classes.Usuario;
import java.util.List;
import javax.swing.DefaultListModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Cleyton
 */
public class TelaDeConsulta extends javax.swing.JFrame {
    
    DefaultListModel model ;
    /**
     * Creates new form NovoJFrame
     */
    public TelaDeConsulta() {
        initComponents();
        lista.setVisible(false);
        setVisible(true);
        model = new DefaultListModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpConsulta = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lista = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtOe = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFone = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        pesquisa = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaAnamnese01 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        chkAnamnese01 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaAnamnese02 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        chkAnamnese02 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        chkAnamnese03 = new javax.swing.JCheckBox();
        txtMedicacao = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtAlergia = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCirurgia = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtHabito = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaObservacoes = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        btnSalvar1 = new javax.swing.JButton();
        btnImprimir1 = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txaExperiencia = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txaHigiene = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txaTecidos = new javax.swing.JTextArea();
        chkInquerito01 = new javax.swing.JCheckBox();
        jLabel22 = new javax.swing.JLabel();
        btnCancelar2 = new javax.swing.JButton();
        btnSalvar2 = new javax.swing.JButton();
        btnImprimir2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblOdontograma = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txaDescricao = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnSalvar3 = new javax.swing.JButton();
        btnImprimir3 = new javax.swing.JButton();
        btnCancelar3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta");
        setName("frmConsulta"); // NOI18N
        setResizable(false);

        jtpConsulta.setName(""); // NOI18N
        jtpConsulta.setPreferredSize(new java.awt.Dimension(857, 489));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.add(lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 46, 340, 136));

        jLabel1.setText("Nome:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeKeyReleased(evt);
            }
        });
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 732, -1));

        jLabel2.setText("Endereço:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        jPanel1.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 732, -1));

        jLabel3.setText("RG:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        jPanel1.add(txtRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 295, -1));

        jLabel4.setText("Orgão emissor:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));
        jPanel1.add(txtOe, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 209, -1));

        jLabel5.setText("CPF:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jPanel1.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 358, -1));

        jLabel6.setText("Fone:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));
        jPanel1.add(txtFone, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 209, -1));

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, -1, -1));

        btnImprimir.setText("Imprimir");
        jPanel1.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, -1, -1));

        btnCancelar.setText("Cancelar");
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, -1, -1));

        pesquisa.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pesquisa.setText("Buscar....");
        pesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesquisaMouseClicked(evt);
            }
        });
        pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisaKeyReleased(evt);
            }
        });
        jPanel1.add(pesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 12, 500, 28));

        jtpConsulta.addTab("Ficha clínica", jPanel1);

        jPanel2.setToolTipText("");
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 489));

        jLabel7.setText("Queixa principal e evolução da doença atual");

        txaAnamnese01.setColumns(20);
        txaAnamnese01.setRows(5);
        jScrollPane1.setViewportView(txaAnamnese01);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Questionário de saúde");

        jLabel9.setText("Sofre de alguma doença?");

        chkAnamnese01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAnamnese01ActionPerformed(evt);
            }
        });

        jLabel10.setText("Quais?");

        txaAnamnese02.setColumns(20);
        txaAnamnese02.setRows(5);
        jScrollPane2.setViewportView(txaAnamnese02);

        jLabel11.setText("Está em tratamento médico atualmente?");

        jLabel12.setText("Gravidez");

        chkAnamnese03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAnamnese03ActionPerformed(evt);
            }
        });

        jLabel14.setText("Uso de medicação:");

        jLabel15.setText("Alergias:");

        txtAlergia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlergiaActionPerformed(evt);
            }
        });

        jLabel16.setText("Cirurgias:");

        jLabel17.setText("Hábitos");

        txtHabito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHabitoActionPerformed(evt);
            }
        });

        txaObservacoes.setColumns(20);
        txaObservacoes.setRows(5);
        jScrollPane3.setViewportView(txaObservacoes);

        jLabel13.setText("Observações:");

        btnSalvar1.setText("Salvar");
        btnSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar1ActionPerformed(evt);
            }
        });

        btnImprimir1.setText("Imprimir");

        btnCancelar1.setText("Cancelar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(chkAnamnese01)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chkAnamnese02)
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chkAnamnese03))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(338, 338, 338)
                                        .addComponent(jLabel8)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtMedicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCirurgia)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtHabito)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(328, 328, 328)
                                        .addComponent(jLabel16))
                                    .addComponent(txtAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(365, 365, 365)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar1)
                .addGap(18, 18, 18)
                .addComponent(btnImprimir1)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(chkAnamnese01)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chkAnamnese02)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(chkAnamnese03))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMedicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCirurgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHabito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar1)
                    .addComponent(btnImprimir1)
                    .addComponent(btnCancelar1))
                .addContainerGap())
        );

        jtpConsulta.addTab("Anamnese", jPanel2);

        jLabel18.setText("Data do último atendimento:");

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });

        jLabel19.setText("Experiência negativa no tratamento anterior:");

        txaExperiencia.setColumns(20);
        txaExperiencia.setRows(5);
        jScrollPane4.setViewportView(txaExperiencia);

        jLabel20.setText("Higiene bucal (utiliza):");

        txaHigiene.setColumns(20);
        txaHigiene.setRows(5);
        jScrollPane5.setViewportView(txaHigiene);

        jLabel21.setText("Tecidos moles:");

        txaTecidos.setColumns(20);
        txaTecidos.setRows(5);
        jScrollPane6.setViewportView(txaTecidos);

        chkInquerito01.setName("chkInquerito01"); // NOI18N
        chkInquerito01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkInquerito01ActionPerformed(evt);
            }
        });

        jLabel22.setText("Ingere alimentos/bebidas entre as refeições?");

        btnCancelar2.setText("Cancelar");

        btnSalvar2.setText("Salvar");
        btnSalvar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar2ActionPerformed(evt);
            }
        });

        btnImprimir2.setText("Imprimir");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jFormattedTextField1))
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(chkInquerito01)))
                        .addGap(0, 582, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvar2)
                        .addGap(18, 18, 18)
                        .addComponent(btnImprimir2)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar2)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkInquerito01)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar2)
                    .addComponent(btnImprimir2)
                    .addComponent(btnCancelar2))
                .addContainerGap())
        );

        jtpConsulta.addTab("Inquérito odontológico", jPanel3);

        jLabel23.setText("Exame dental: descrição dente a dente");

        txaDescricao.setColumns(20);
        txaDescricao.setRows(5);
        jScrollPane7.setViewportView(txaDescricao);

        jLabel24.setText("Planos de tratamento");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane8.setViewportView(jTextArea1);

        btnSalvar3.setText("Salvar");
        btnSalvar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar3ActionPerformed(evt);
            }
        });

        btnImprimir3.setText("Imprimir");

        btnCancelar3.setText("Cancelar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblOdontograma)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(0, 301, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane7)
                                .addContainerGap())))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane8)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar3)
                .addGap(18, 18, 18)
                .addComponent(btnImprimir3)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar3)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7))
                    .addComponent(lblOdontograma))
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar3)
                    .addComponent(btnImprimir3)
                    .addComponent(btnCancelar3))
                .addContainerGap())
        );

        jtpConsulta.addTab("Odontograma", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtpConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkAnamnese01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAnamnese01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAnamnese01ActionPerformed

    private void chkAnamnese03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAnamnese03ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAnamnese03ActionPerformed

    private void txtHabitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHabitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHabitoActionPerformed

    private void txtAlergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlergiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlergiaActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void chkInquerito01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkInquerito01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkInquerito01ActionPerformed

    private void btnSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvar1ActionPerformed

    private void btnSalvar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvar2ActionPerformed

    private void btnSalvar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvar3ActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyReleased
        
    }//GEN-LAST:event_txtNomeKeyReleased

    private void pesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaKeyReleased
       SessionFactory sf = Util.NewHibernateUtil.getSessionFactory();
            Session s = sf.openSession();
            
          Criteria crit = s.createCriteria(Paciente.class);
          crit.add(Restrictions.eq("nome",pesquisa.getText() ));
          List<Paciente> results = crit.list(); 
          
          lista.setModel(model);
          for (Paciente result : results) {
            model.addElement(result.getNome());
        }
          lista.setVisible(true);
          
          
          s.close();
    }//GEN-LAST:event_pesquisaKeyReleased

    private void pesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesquisaMouseClicked
        pesquisa.setText("");
    }//GEN-LAST:event_pesquisaMouseClicked

   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnCancelar2;
    private javax.swing.JButton btnCancelar3;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnImprimir1;
    private javax.swing.JButton btnImprimir2;
    private javax.swing.JButton btnImprimir3;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.JButton btnSalvar2;
    private javax.swing.JButton btnSalvar3;
    private javax.swing.JCheckBox chkAnamnese01;
    private javax.swing.JCheckBox chkAnamnese02;
    private javax.swing.JCheckBox chkAnamnese03;
    private javax.swing.JCheckBox chkInquerito01;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTabbedPane jtpConsulta;
    private javax.swing.JLabel lblOdontograma;
    private javax.swing.JList<String> lista;
    private javax.swing.JTextField pesquisa;
    private javax.swing.JTextArea txaAnamnese01;
    private javax.swing.JTextArea txaAnamnese02;
    private javax.swing.JTextArea txaDescricao;
    private javax.swing.JTextArea txaExperiencia;
    private javax.swing.JTextArea txaHigiene;
    private javax.swing.JTextArea txaObservacoes;
    private javax.swing.JTextArea txaTecidos;
    private javax.swing.JTextField txtAlergia;
    private javax.swing.JTextField txtCirurgia;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFone;
    private javax.swing.JTextField txtHabito;
    private javax.swing.JTextField txtMedicacao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtOe;
    private javax.swing.JTextField txtRg;
    // End of variables declaration//GEN-END:variables
}
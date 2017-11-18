/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela;

import Classes.Paciente;
import Classes.Servico;
import Classes.Usuario;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author augusto
 */
public class ListarServico extends javax.swing.JFrame {

    /**
     * Creates new form ListarServico
     */
    public ListarServico() {
        initComponents();
        setSize(1280, 720);
        this.setLocationRelativeTo(null);
        
        usuariologado.setText(TelaDeLogin.usuario);
        setVisible(true);
        carregar();
    }
    
    private void carregar(){
         SessionFactory sf = Util.NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();

        Criteria crit = s.createCriteria(Servico.class);
        List<Servico> results = crit.list();
         Servico servico = Servico.retornarObjeto();
                 
        List<String[]> lista = new ArrayList<String[]>();

        for (int i = 0; i < results.size(); i++) {
            servico = results.get(i);
            lista.add(new String[]{"" + servico.getId() + "", servico.getNome(),""+ servico.getPreco()+"",servico.getDescricao()});
        }
        String[] colunas = {"Id", "Nome", "Preço R$","Descrição"};
        DefaultTableModel model = new DefaultTableModel(lista.toArray(new String[lista.size()][]), colunas);
        Title.setModel(model);
        

        s.close();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuariologado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Title = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar Serviços");

        usuariologado.setText("Usuario");

        Title.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cod", "Nome", "Valor", "Descrição"
            }
        ));
        jScrollPane1.setViewportView(Title);

        jButton1.setText("Excluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Sair");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(usuariologado)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usuariologado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Object i = Title.getValueAt(Title.getSelectedRow(), 0);
             Object i2 = Title.getValueAt(Title.getSelectedRow(), 2);
            int a = Integer.parseInt(i.toString());
            double preco = Double.parseDouble(i2.toString());
            
            new EditarServico(a, Title.getValueAt(Title.getSelectedRow(), 1).toString(), preco, Title.getValueAt(Title.getSelectedRow(), 3).toString());
            carregar();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um usuário");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        new MenuDentista();
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String usuarioSelecionado = Title.getValueAt(Title.getSelectedRow(), 1).toString();
        Servico servico = Servico.retornarObjeto(); 
                Object i = Title.getValueAt(Title.getSelectedRow(), 0);
        int a = Integer.parseInt(i.toString());
        servico.setId(a);
        int botao = JOptionPane.YES_NO_OPTION;
        JOptionPane.showConfirmDialog(null, "Deseja Realmente apagar " + usuarioSelecionado, "Cuidado", botao);
        if (usuarioSelecionado.equals("admin")) {
            JOptionPane.showMessageDialog(rootPane, "ô seu animal, quer excluir o administrador");
            this.dispose();
        } else {
            if (botao == JOptionPane.YES_OPTION) {
                System.out.println("DEu simm");
                SessionFactory sf = Util.NewHibernateUtil.getSessionFactory();
                Session s = sf.openSession();
                Transaction tx = s.beginTransaction();
                s.delete(servico);
                tx.commit();
                s.close();

            }
        }
        try {
            carregar();
        } catch (Exception e) {
            //vai dar erro não pvt
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Title;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel usuariologado;
    // End of variables declaration//GEN-END:variables
}

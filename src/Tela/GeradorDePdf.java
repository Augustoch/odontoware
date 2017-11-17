/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela;

import Classes.Consulta;
import Classes.Servico;
import Dao.ConsultaDao;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.html.table.Table;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import java.awt.Desktop;
import java.io.File;
import java.util.List;

/**
 *
 * @author augusto
 */
public class GeradorDePdf extends javax.swing.JFrame {

    Document doc = null;
    OutputStream os = null;

    /**
     * Creates new form Pdfd
     */
    public GeradorDePdf() {
        initComponents();
        setVisible(false);
    }

    public void gerar(int cod) throws Exception {
        Consulta consulta = new ConsultaDao().consulta(cod);

        Document document = new Document(PageSize.A4);

        final JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        //jfc.showOpenDialog(null);
        //descomente essa buceta
        //String cam = jfc.getCurrentDirectory().getCanonicalPath()+"/";
        String cam = "/home/augusto/Área de Trabalho/";

        String path = cam + "/" + JOptionPane.showInputDialog("Digite nome desejado") + ".pdf";
        File file = new File(path);
        PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(file));

        document.open();

        PdfContentByte cb = pdfWriter.getDirectContentUnder();

        Image i = Image.getInstance("src/res/Odontoware.png");
        i.scaleAbsolute(PageSize.A4);
        i.setAbsolutePosition(0, 0);
        cb.addImage(i);

        Font f = new Font(Font.FontFamily.HELVETICA, 15f);
        ColumnText ct = new ColumnText(cb);
        ct.setSimpleColumn(90f, 148f, 400f, 700f);
        Paragraph nome = new Paragraph(new Phrase(20, consulta.getPaciente().getNome(), f));
        ct.addElement(nome);

        ColumnText ct2 = new ColumnText(cb);
        ct2.setSimpleColumn(90f, 148f, 400f, 675f);
        Paragraph cpf = new Paragraph(new Phrase(20, consulta.getPaciente().getCpf(), f));
        ct2.addElement(cpf);

        ColumnText ct1 = new ColumnText(cb);
        ct1.setSimpleColumn(90f, 148f, 400f, 652f);
        Paragraph fone = new Paragraph(new Phrase(20, consulta.getPaciente().getFone(), f));
        ct1.addElement(fone);

        ColumnText ct4 = new ColumnText(cb);
        ct4.setSimpleColumn(90f, 148f, 400f, 630f);
        Paragraph dentista = new Paragraph(new Phrase(20, consulta.getDentista().getLogin(), f));
        ct4.addElement(dentista);

        ColumnText ct3 = new ColumnText(cb);
        ct3.setSimpleColumn(90f, 148f, 400f, 610f);
        Paragraph endereco = new Paragraph(new Phrase(20, consulta.getPaciente().getEndereco(), f));
        ct3.addElement(endereco);

        ColumnText ct5 = new ColumnText(cb);
        ct5.setSimpleColumn(430f, 148f, 600f, 678f);
        Paragraph rg = new Paragraph(new Phrase(20, consulta.getPaciente().getRg(), f));
        ct5.addElement(rg);

        ColumnText ct6 = new ColumnText(cb);
        ct6.setSimpleColumn(430f, 148f, 600f, 655f);
        Paragraph codP = new Paragraph(new Phrase(20, Integer.toString(consulta.getPaciente().getId()), f));
        ct6.addElement(codP);

        //condigo consulta
        ColumnText ct7 = new ColumnText(cb);
        ct7.setSimpleColumn(500f, 198f, 700f, 800f);
        Paragraph codC = new Paragraph(new Phrase(20, Integer.toString(consulta.getId()), f));
        ct7.addElement(codC);
        
        ColumnText ct8 = new ColumnText(cb);
        ct8.setSimpleColumn(20f, 148f, 300f, 800f);
        Paragraph data = new Paragraph(new Phrase(20, consulta.getDataDaConsulta().getDayOfMonth() + " / " + consulta.getDataDaConsulta().getMonthValue() + " / " + consulta.getDataDaConsulta().getYear(), f));
        ct8.addElement(data);
        
        ColumnText ct10 = new ColumnText(cb);
        ct10.setSimpleColumn(420f, 178f, 700f, 0f);
        Paragraph valor = new Paragraph(new Phrase(20,Double.toString(consulta.getValor())+" R$", f));
        ct10.addElement(valor);
        ct10.go();
        
        List<Servico> servicos = consulta.getServicos();
        float espacamento = 310f;
        
        
        
        for (Servico servico : servicos) {
            
        ColumnText ct9 = new ColumnText(cb);
        ct9.setSimpleColumn(30f, 325f, 300f, espacamento);
        Paragraph servicoP = new Paragraph(new Phrase(20, servico.getId()+" - "+servico.getNome()+" - "+servico.getPreco()+" R$ "  , f));
        ct9.addElement(servicoP);
        espacamento += 15;
        ct9.go();
        }
        ct.go();
        ct2.go();
        ct1.go();
        ct3.go();
        ct4.go();
        ct5.go();
        ct6.go();
        ct7.go();
        ct8.go();
        

        document.close();
        
        Desktop desktop = Desktop.getDesktop();
        File file2 = new File(path);

        desktop.open(file2);

        System.exit(WIDTH);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jButton1)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Document doc = new Document(PageSize.A4);

            final JFileChooser jfc = new JFileChooser();

            jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

            jfc.showOpenDialog(null);

            String cam = jfc.getCurrentDirectory().getPath();

            os = new FileOutputStream("/home/augusto/saida.pdf");
            PdfWriter.getInstance(doc, os);
            doc.open();
            Paragraph p = new Paragraph("It is Sal pvt\n Deu certo porra");
            Table t = new Table();

            doc.add(p);

            doc.close();

        } catch (Exception e) {

        } finally {
            if (doc != null) {
                //fechamento do documento

                doc.close();
            }

            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    System.out.println("Deu merda na linha 92");
                }

            }
        }

        System.out.println("Gerou animal");
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}

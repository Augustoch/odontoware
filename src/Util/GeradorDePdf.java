/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Classes.Consulta;
import Classes.Servico;
import Dao.ConsultaDao;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author augusto
 */
public class GeradorDePdf {
   
    public void gerar(int cod) throws Exception {
        Consulta consulta = new ConsultaDao().consulta(cod);

        Document document = new Document(PageSize.A4);

        final JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        jfc.showOpenDialog(null);
        
        String cam = jfc.getCurrentDirectory().getCanonicalPath()+"/";
        JOptionPane.showMessageDialog(jfc, cam);
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
        Paragraph valor = new Paragraph(new Phrase(20, Double.toString(consulta.getValor()) + " R$", f));
        ct10.addElement(valor);
        ct10.go();

        List<Servico> servicos = consulta.getServicos();
        float espacamento = 520f;

        for (Servico servico : servicos) {

            ColumnText ct9 = new ColumnText(cb);
            ct9.setSimpleColumn(30f, espacamento, 300f, 100f);
            Paragraph servicoP = new Paragraph(new Phrase(20, servico.getId() + " - " + servico.getNome() + " - " + servico.getPreco() + " R$ ", f));
            ct9.addElement(servicoP);
            espacamento -= 15;
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

       

    } 
}

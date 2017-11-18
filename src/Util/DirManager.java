/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.io.File;
import java.io.FileFilter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author augusto
 */
public class DirManager {

    public String selecionar() {

        File diretorio = new File("C:/");

        File[] listFiles = diretorio.listFiles(new FileFilter() {
            public boolean accept(File pathname) {
                return pathname.getName().startsWith("founderOdonto"); // apenas arquivos que começam com a letra "a"
            }
        });

        for (File f : listFiles) {
            System.out.println(f.getName());
        }

        final JFileChooser jfc = new JFileChooser();

        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);

        jfc.showOpenDialog(null);
        String cam = jfc.getCurrentDirectory().getPath();
        JOptionPane.showMessageDialog(null, cam);
        return "jdbc:hsqldb:file:" + cam;
    }

    /*
    public String arquivoConf() {

        final JFileChooser jfc = new JFileChooser();

        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        jfc.showOpenDialog(null);

        cam = jfc.getCurrentDirectory().getPath();
        JOptionPane.showMessageDialog(null, "caminho: " + cam);
        try {
            FileReader fileReader = new FileReader(cam + "/conf.txt");
            BufferedReader buffR = new BufferedReader(fileReader);
            JOptionPane.showMessageDialog(null, "lendo do arch: " + buffR.readLine());

            return buffR.readLine();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "01" + e);

            File file = new File(cam + "/conf.txt");
            JOptionPane.showMessageDialog(null, file.getPath());

            try {
                file.createNewFile();
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(cam);
                arquivoConf();

            } catch (IOException exception1) {
                JOptionPane.showMessageDialog(null, "02" + exception1);
                return "";
            }
            return "";
        }

    }

    public String localDoBanco() {

        

        if (new File(cam + "/conf.txt").exists()) {
            try {
                FileReader fileReader = new FileReader(cam + "conf.txt");
                BufferedReader buffR = new BufferedReader(fileReader);
                
                return "dbc:hsqldb:file:" + buffR.readLine();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);

            }
        }
        

        return "jdbc:hsqldb:file:" + arquivoConf();

    }
     */
}

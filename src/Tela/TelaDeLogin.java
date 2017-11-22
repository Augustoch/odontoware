/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela;

import Classes.Usuario;
import Dao.UsuarioDao;
import Util.DateClass;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.ERROR;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author augusto
 */
public class TelaDeLogin extends javax.swing.JFrame {

    String[] serial = new String[]{"AAAA-AAAA-AAAA-AAAA", "20/12/2017"};

    public static String usuario;
    public static int cod;

    /**
     * Creates new form TelaDeLogin
     */
    public TelaDeLogin() throws Exception {

        initComponents();
        verificar();

        setSize(1280, 720);
        this.setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

    }

    private void verificar() {
        if (new UsuarioDao().existe()) {
            serialInput.setSize(414, 93);
            serialInput.setLocationRelativeTo(null);
            serialInput.setVisible(true);

            enter.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (serialText.getText().equals(serial[0])) {
                        if (new DateClass().isValid(new DateClass(serial[1]).getData())) {
                            JOptionPane.showMessageDialog(rootPane, "Serial valido até " + serial[1]);

                            serialInput.dispose();
                            usuarioInicialLogin.setLocationRelativeTo(null);
                            usuarioInicialLogin.setSize(380, 280);
                            usuarioInicialLogin.setVisible(true);
                            
                            botaoCriar.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    String[] lg = loginSenha();

                                    try {
                                        Usuario u = new Usuario().devolveUsuario();
                                        if (lg[1].isEmpty()) {
                                            throw new Exception();
                                        }
                                        u.setLogin(lg[0]);
                                        u.setSenha(lg[1]);
                                        u.setTipo("Administrador");
                                        new UsuarioDao().salvar(u);
                                        setVisible(true);
                                        usuarioInicialLogin.dispose();
                                        
                                    } catch (Exception eta) {
                                        JOptionPane.showMessageDialog(rootPane, eta, "Erro", ERROR);
                                    }

                                }
                            });

                        }

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Serial Invalido");
                        System.exit(0);
                    }
                }
            });

        } else {
            if (new DateClass().isValid(new DateClass(serial[1]).getData())) {
                this.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Licensa has expired");
                System.exit(0);
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuarioInicialLogin = new javax.swing.JFrame();
        botaoCriar = new javax.swing.JButton();
        senha2 = new javax.swing.JPasswordField();
        senha1 = new javax.swing.JPasswordField();
        loginAdmin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        serialInput = new javax.swing.JFrame();
        serialText = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        enter = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        botaoCriar.setText("Criar");
        botaoCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarActionPerformed(evt);
            }
        });

        loginAdmin.setEditable(false);
        loginAdmin.setText("admin");

        jLabel4.setText("Confirmar senha");

        jLabel5.setText("Senha");

        jLabel6.setText("Login");

        jLabel7.setText("Cadastro de Administrador");

        javax.swing.GroupLayout usuarioInicialLoginLayout = new javax.swing.GroupLayout(usuarioInicialLogin.getContentPane());
        usuarioInicialLogin.getContentPane().setLayout(usuarioInicialLoginLayout);
        usuarioInicialLoginLayout.setHorizontalGroup(
            usuarioInicialLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuarioInicialLoginLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(usuarioInicialLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoCriar)
                    .addGroup(usuarioInicialLoginLayout.createSequentialGroup()
                        .addGroup(usuarioInicialLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(usuarioInicialLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(senha1)
                            .addComponent(senha2)
                            .addComponent(loginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, usuarioInicialLoginLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel7)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        usuarioInicialLoginLayout.setVerticalGroup(
            usuarioInicialLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuarioInicialLoginLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel7)
                .addGap(39, 39, 39)
                .addGroup(usuarioInicialLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(usuarioInicialLoginLayout.createSequentialGroup()
                        .addGroup(usuarioInicialLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(loginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5))
                    .addComponent(senha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(usuarioInicialLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(senha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaoCriar)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        try {
            serialText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("????-????-????-????")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel8.setText("Serial");

        enter.setText("Entrar");

        javax.swing.GroupLayout serialInputLayout = new javax.swing.GroupLayout(serialInput.getContentPane());
        serialInput.getContentPane().setLayout(serialInputLayout);
        serialInputLayout.setHorizontalGroup(
            serialInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serialInputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serialText, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enter)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        serialInputLayout.setVerticalGroup(
            serialInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serialInputLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(serialInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(serialText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enter))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/OdontoLogo.png"))); // NOI18N

        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });

        jLabel1.setText("Login");

        jLabel2.setText("Senha");

        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(21, 21, 21)
                        .addComponent(jButton1)
                        .addGap(30, 30, 30)
                        .addComponent(jButton2)
                        .addGap(31, 31, 31))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void persistirU() throws Exception {

        if (new UsuarioDao().existe()) {

        }

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        captaUsuarioSenha();

    }//GEN-LAST:event_jButton1ActionPerformed

    public String[] loginSenha() {

        if (loginAdmin.getText().isEmpty() || senha1.getText().isEmpty() || senha2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo Vazio");

        }
        if (!senha1.getText().equals(senha2.getText())) {
            JOptionPane.showMessageDialog(null, "As senhas não conferem");
            senha1.setText("");
            senha2.setText("");

        }
        String[] lg = new String[]{loginAdmin.getText(), senha1.getText()};
        return lg;

    }

    private void captaUsuarioSenha() {
        Usuario usuario = Usuario.devolveUsuario();
        usuario.setLogin(jTextField1.getText());
        List Usuarios;
        try {
            usuario.setSenha(jPasswordField1.getText());
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(TelaDeLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        validar(usuario.getLogin(), usuario.getSenha());
    }

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            captaUsuarioSenha();
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void botaoCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarActionPerformed

    }//GEN-LAST:event_botaoCriarActionPerformed
    private boolean validar(String login, String senha) {
        //abre sessão
        SessionFactory sf = Util.NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();

        //cria consulta
        Criteria criteria = s.createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("login", login));

        List<Usuario> lista = criteria.list();
        System.out.println("Aqui carai" + lista.size());

        //se lista tiver vazia significa que não o usuario não foi achhado na banco
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Usuario não existe");
            return false;
        }
        Usuario a = lista.get(0);
        if (a.getSenha().equals(senha)) {
            usuario = a.getLogin();
            cod = a.getId();
            AbriMenu(a);

        } else {
            JOptionPane.showMessageDialog(rootPane, "Senha Incorreta");
        }
        return true;

    }

    private void AbriMenu(Usuario u) {
        if (u.getTipo().equals("Dentista")) {
            new MenuDentista();
            this.dispose();
        } else if (u.getTipo().equals("Atendente")) {
            new MenuAtendente();
            this.dispose();
        } else {
            new MenuAdmin();
            this.dispose();
        }
    }

    public static void main(String[] args) throws Exception {
        new TelaDeLogin();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCriar;
    private javax.swing.JButton enter;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField loginAdmin;
    private javax.swing.JPasswordField senha1;
    private javax.swing.JPasswordField senha2;
    private javax.swing.JFrame serialInput;
    private javax.swing.JFormattedTextField serialText;
    private javax.swing.JFrame usuarioInicialLogin;
    // End of variables declaration//GEN-END:variables
}

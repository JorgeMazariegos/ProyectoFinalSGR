package vista;

import java.awt.Color;
import controlador.ClienteControlador;
import controlador.EmpleadoControlador;
import controlador.ProductoControlador;
import controlador.mainControlador;
import modelo.Producto;
import java.awt.CardLayout;
import java.awt.print.PrinterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.SpinnerNumberModel;


public class Programa extends javax.swing.JFrame {
    ClienteControlador clienteControlador = new ClienteControlador();
    EmpleadoControlador empleadoControlador = new EmpleadoControlador();
    ProductoControlador productoControlador = new ProductoControlador();
    mainControlador mainControlador = new mainControlador();
    boolean showPassword = false;
    boolean showPasswordReg = false;
    List<Producto> listaProductos = productoControlador.consultarProductos();
    
    
    public Programa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        Login = new javax.swing.JPanel();
        icono = new javax.swing.JLabel();
        panelLogin = new javax.swing.JPanel();
        txtCorreo = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        lblRegistrar = new javax.swing.JLabel();
        lblMensajeCorreo = new javax.swing.JLabel();
        passClave = new javax.swing.JPasswordField();
        lblTexto = new javax.swing.JLabel();
        lblDecoracion = new javax.swing.JLabel();
        lblShowHide = new javax.swing.JLabel();
        lblLoginTitle = new javax.swing.JLabel();
        lblMensajeContra = new javax.swing.JLabel();
        Registrar = new javax.swing.JPanel();
        pnlRegistrar = new javax.swing.JPanel();
        lblRegTitulo = new javax.swing.JLabel();
        txtRegNombre = new javax.swing.JTextField();
        txtRegTelefono = new javax.swing.JTextField();
        txtRegCorreo = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtRegDireccion = new javax.swing.JTextField();
        lblRegBack = new javax.swing.JLabel();
        passRegClaveConf = new javax.swing.JPasswordField();
        passRegClave = new javax.swing.JPasswordField();
        lblRegMensaje = new javax.swing.JLabel();
        lblIcono = new javax.swing.JLabel();
        aplicacionCliente = new javax.swing.JPanel();
        aplicacionCajero = new javax.swing.JPanel();
        menuBarCajero = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblRegistrarOrden = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        menuCajero = new javax.swing.JPanel();
        regOrden = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdReg = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbxRegProductos = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listProductos = new javax.swing.JList<>();
        spnCantReg = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblDispReg = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblPrecioReg = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblTotReg = new javax.swing.JLabel();
        lblAddReg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        mainPanel.setLayout(new java.awt.CardLayout());

        Login.setBackground(new java.awt.Color(30, 40, 49));
        Login.setMinimumSize(new java.awt.Dimension(800, 600));
        Login.setLayout(null);

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Vivanda_logo_durazno.jpg"))); // NOI18N
        Login.add(icono);
        icono.setBounds(90, 90, 260, 360);

        panelLogin.setBackground(new java.awt.Color(57, 62, 70));
        panelLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        txtCorreo.setBackground(new java.awt.Color(34, 40, 49));
        txtCorreo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(153, 153, 153));
        txtCorreo.setText("Correo");
        txtCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(51, 153, 255));
        btnLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Iniciar Sesión");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblRegistrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblRegistrar.setForeground(new java.awt.Color(102, 153, 255));
        lblRegistrar.setText("Registrar una cuenta");
        lblRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarMouseClicked(evt);
            }
        });

        lblMensajeCorreo.setForeground(new java.awt.Color(255, 51, 51));

        passClave.setBackground(new java.awt.Color(34, 40, 49));
        passClave.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        passClave.setForeground(new java.awt.Color(153, 153, 153));
        passClave.setText("Contraseña");
        passClave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        passClave.setEchoChar('\u0000');
        passClave.setFocusAccelerator((char)0);
        passClave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passClaveFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passClaveFocusLost(evt);
            }
        });

        lblTexto.setBackground(new java.awt.Color(255, 255, 255));
        lblTexto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTexto.setForeground(new java.awt.Color(255, 255, 255));
        lblTexto.setText("¿No tienes una cuenta?");

        lblDecoracion.setForeground(new java.awt.Color(102, 102, 102));
        lblDecoracion.setText("--------------------------- O ----------------------------");

        lblShowHide.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblShowHide.setForeground(new java.awt.Color(102, 153, 255));
        lblShowHide.setText("Mostrar");
        lblShowHide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblShowHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShowHideMouseClicked(evt);
            }
        });

        lblLoginTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblLoginTitle.setForeground(new java.awt.Color(204, 204, 204));
        lblLoginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginTitle.setText("Iniciar Sesión");
        lblLoginTitle.setToolTipText("");

        lblMensajeContra.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTexto)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblRegistrar)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMensajeContra, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMensajeCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passClave, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblShowHide, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                        .addComponent(lblDecoracion, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                        .addComponent(lblLoginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblLoginTitle)
                .addGap(43, 43, 43)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensajeCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblShowHide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passClave, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensajeContra, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDecoracion)
                .addGap(18, 18, 18)
                .addComponent(lblTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRegistrar)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        Login.add(panelLogin);
        panelLogin.setBounds(400, 60, 370, 470);

        mainPanel.add(Login, "login");

        Registrar.setBackground(new java.awt.Color(30, 40, 49));
        Registrar.setMinimumSize(new java.awt.Dimension(800, 600));
        Registrar.setLayout(null);

        pnlRegistrar.setBackground(new java.awt.Color(57, 62, 70));
        pnlRegistrar.setPreferredSize(new java.awt.Dimension(800, 600));

        lblRegTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblRegTitulo.setForeground(new java.awt.Color(204, 204, 204));
        lblRegTitulo.setText("Registrar una Cuenta");

        txtRegNombre.setBackground(new java.awt.Color(34, 40, 49));
        txtRegNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRegNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtRegNombre.setText("Nombre");
        txtRegNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtRegNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRegNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRegNombreFocusLost(evt);
            }
        });

        txtRegTelefono.setBackground(new java.awt.Color(34, 40, 49));
        txtRegTelefono.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRegTelefono.setForeground(new java.awt.Color(153, 153, 153));
        txtRegTelefono.setText("Telefono");
        txtRegTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtRegTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRegTelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRegTelefonoFocusLost(evt);
            }
        });

        txtRegCorreo.setBackground(new java.awt.Color(34, 40, 49));
        txtRegCorreo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRegCorreo.setForeground(new java.awt.Color(153, 153, 153));
        txtRegCorreo.setText("nombre@ejemplo.com");
        txtRegCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtRegCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRegCorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRegCorreoFocusLost(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(51, 153, 255));
        btnRegistrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrarse");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("-----------------------------------------------------------");

        txtRegDireccion.setBackground(new java.awt.Color(34, 40, 49));
        txtRegDireccion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRegDireccion.setForeground(new java.awt.Color(153, 153, 153));
        txtRegDireccion.setText("Dirección");
        txtRegDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtRegDireccion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtRegDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRegDireccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRegDireccionFocusLost(evt);
            }
        });

        lblRegBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        lblRegBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegBackMouseClicked(evt);
            }
        });

        passRegClaveConf.setBackground(new java.awt.Color(34, 40, 49));
        passRegClaveConf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        passRegClaveConf.setForeground(new java.awt.Color(153, 153, 153));
        passRegClaveConf.setText("Confirmar Contraseña");
        passRegClaveConf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        passRegClaveConf.setEchoChar('\u0000');
        passRegClaveConf.setFocusAccelerator((char)0);
        passRegClaveConf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passRegClaveConfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passRegClaveConfFocusLost(evt);
            }
        });
        passRegClaveConf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passRegClaveConfActionPerformed(evt);
            }
        });

        passRegClave.setBackground(new java.awt.Color(34, 40, 49));
        passRegClave.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        passRegClave.setForeground(new java.awt.Color(153, 153, 153));
        passRegClave.setText("Contraseña");
        passRegClave.setToolTipText("HOLAAAA");
        passRegClave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        passRegClave.setEchoChar('\u0000');
        passRegClave.setFocusAccelerator((char)0);
        passRegClave.setPreferredSize(new java.awt.Dimension(64, 16));
        passRegClave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passRegClaveFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passRegClaveFocusLost(evt);
            }
        });
        passRegClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passRegClaveActionPerformed(evt);
            }
        });

        lblRegMensaje.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblRegMensaje.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout pnlRegistrarLayout = new javax.swing.GroupLayout(pnlRegistrar);
        pnlRegistrar.setLayout(pnlRegistrarLayout);
        pnlRegistrarLayout.setHorizontalGroup(
            pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarLayout.createSequentialGroup()
                .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistrarLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblRegBack, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(lblRegTitulo))
                    .addGroup(pnlRegistrarLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRegCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRegDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRegTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRegNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passRegClave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passRegClaveConf)
                            .addComponent(lblRegMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        pnlRegistrarLayout.setVerticalGroup(
            pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRegBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRegTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(txtRegNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtRegTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtRegDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRegCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passRegClave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passRegClaveConf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRegMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        Registrar.add(pnlRegistrar);
        pnlRegistrar.setBounds(310, 40, 470, 520);

        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Vivanda_logo_durazno.jpg"))); // NOI18N
        lblIcono.setToolTipText("");
        Registrar.add(lblIcono);
        lblIcono.setBounds(30, 90, 260, 410);

        mainPanel.add(Registrar, "registrar");

        javax.swing.GroupLayout aplicacionClienteLayout = new javax.swing.GroupLayout(aplicacionCliente);
        aplicacionCliente.setLayout(aplicacionClienteLayout);
        aplicacionClienteLayout.setHorizontalGroup(
            aplicacionClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        aplicacionClienteLayout.setVerticalGroup(
            aplicacionClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );

        mainPanel.add(aplicacionCliente, "appCliente");

        aplicacionCajero.setBackground(new java.awt.Color(204, 102, 0));
        aplicacionCajero.setForeground(new java.awt.Color(102, 102, 255));
        aplicacionCajero.setPreferredSize(new java.awt.Dimension(800, 600));
        aplicacionCajero.setLayout(new java.awt.BorderLayout());

        menuBarCajero.setBackground(new java.awt.Color(57, 62, 70));
        menuBarCajero.setMaximumSize(new java.awt.Dimension(800, 100));
        menuBarCajero.setPreferredSize(new java.awt.Dimension(800, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3dotswhite.png"))); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblRegistrarOrden.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblRegistrarOrden.setForeground(new java.awt.Color(204, 204, 204));
        lblRegistrarOrden.setText("Registrar Orden");
        lblRegistrarOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarOrdenMouseClicked(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Completar Orden");

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Consultar Pedidos");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food-icon.png"))); // NOI18N
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Pedido #");

        javax.swing.GroupLayout menuBarCajeroLayout = new javax.swing.GroupLayout(menuBarCajero);
        menuBarCajero.setLayout(menuBarCajeroLayout);
        menuBarCajeroLayout.setHorizontalGroup(
            menuBarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarCajeroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 323, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRegistrarOrden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        menuBarCajeroLayout.setVerticalGroup(
            menuBarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBarCajeroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuBarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRegistrarOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aplicacionCajero.add(menuBarCajero, java.awt.BorderLayout.NORTH);

        menuCajero.setBackground(new java.awt.Color(30, 40, 49));
        menuCajero.setPreferredSize(new java.awt.Dimension(800, 560));
        menuCajero.setLayout(new java.awt.CardLayout());

        regOrden.setBackground(new java.awt.Color(30, 40, 49));
        regOrden.setPreferredSize(new java.awt.Dimension(800, 540));

        jPanel1.setBackground(new java.awt.Color(57, 62, 70));
        jPanel1.setPreferredSize(new java.awt.Dimension(420, 550));

        tblProdReg.setBackground(new java.awt.Color(204, 204, 204));
        tblProdReg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblProdReg.setForeground(new java.awt.Color(0, 0, 0));
        tblProdReg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio U", "Descuento", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblProdReg.setPreferredSize(new java.awt.Dimension(420, 80));
        jScrollPane2.setViewportView(tblProdReg);
        if (tblProdReg.getColumnModel().getColumnCount() > 0) {
            tblProdReg.getColumnModel().getColumn(0).setPreferredWidth(250);
        }

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Pedido #");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Nombre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Producto");

        listProductos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listProductos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listProductosValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listProductos);

        spnCantReg.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spnCantReg.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantRegStateChanged(evt);
            }
        });
        spnCantReg.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spnCantRegPropertyChange(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cantidad");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Disponible");

        lblDispReg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDispReg.setForeground(new java.awt.Color(255, 255, 255));
        lblDispReg.setText("-");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Precio");

        lblPrecioReg.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecioReg.setText("Q 0.0");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total");

        lblTotReg.setForeground(new java.awt.Color(255, 255, 255));
        lblTotReg.setText("Q 0.0");

        lblAddReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        lblAddReg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddRegMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout regOrdenLayout = new javax.swing.GroupLayout(regOrden);
        regOrden.setLayout(regOrdenLayout);
        regOrdenLayout.setHorizontalGroup(
            regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(regOrdenLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxRegProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(regOrdenLayout.createSequentialGroup()
                        .addGroup(regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(regOrdenLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDispReg, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(regOrdenLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(4, 4, 4)
                                .addComponent(spnCantReg, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(regOrdenLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTotReg, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(regOrdenLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPrecioReg, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addComponent(lblAddReg)))
                .addContainerGap())
        );
        regOrdenLayout.setVerticalGroup(
            regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                    .addGroup(regOrdenLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbxRegProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(regOrdenLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblAddReg))
                            .addGroup(regOrdenLayout.createSequentialGroup()
                                .addGroup(regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(regOrdenLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblDispReg)
                                            .addComponent(jLabel11)
                                            .addComponent(lblPrecioReg)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regOrdenLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13)
                                        .addComponent(lblTotReg))
                                    .addGroup(regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(spnCantReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
        );

        menuCajero.add(regOrden, "regOrden");

        aplicacionCajero.add(menuCajero, java.awt.BorderLayout.CENTER);

        mainPanel.add(aplicacionCajero, "appCajero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginCliente(String correo, String clave){
        CardLayout card = (CardLayout)mainPanel.getLayout();
        try{
            switch(clienteControlador.loginCliente(correo, clave)){
                case 1: 
                    lblMensajeCorreo.setText("Correo incorrecto");
                    break;
                case 2:
                    lblMensajeContra.setText("Contraseña incorrecta");
                    break;
                case 3:
                    card.show(mainPanel, "appCliente");
                    break;
            }   
        }catch(NoSuchAlgorithmException e){
            System.out.println(e.getMessage());
        }
    }
    
    private void loginCajero(String correo, String clave){
        CardLayout card = (CardLayout)mainPanel.getLayout();
        try{
            switch(empleadoControlador.loginEmpleado(correo, clave)){
                case 1: 
                    lblMensajeCorreo.setText("Correo incorrecto");
                    break;
                case 2:
                    lblMensajeContra.setText("Contraseña incorrecta");
                    break;
                case 3:
                    card.show(mainPanel, "appCajero");
                    for(Producto productos : listaProductos){
                        cbxRegProductos.addItem(productos.getNombre());
                    }
                    break;
            }   
        }catch(NoSuchAlgorithmException e){
            System.out.println(e.getMessage());
        }
    }
    
    private Producto productoActual(){
        
        for(Producto producto : listaProductos){
            if(producto.getNombre().equals(listProductos.getSelectedValue())){
                return producto;
            }           
        }
        for(Producto producto : listaProductos){ 
                return producto;       
        }
        return null;
    }
    
    private double calcularTotal(){
        Producto producto = productoActual();
        double total = 0;
        
        total = producto.getPrecio() * (int)spnCantReg.getValue();
  
        return total;
    }
    
    private void txtCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusGained
        if("Correo".equals(txtCorreo.getText())){
            txtCorreo.setText("");
            txtCorreo.setForeground(Color.WHITE);
        }
        lblMensajeCorreo.setText("");
    }//GEN-LAST:event_txtCorreoFocusGained

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        if("".equals(txtCorreo.getText())){
            txtCorreo.setText("Correo");
            txtCorreo.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtCorreoFocusLost

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String correo = txtCorreo.getText();
        char[] password = passClave.getPassword();
        String clave = String.valueOf(password);

        switch(mainControlador.comprobarCorreo(correo)){
            case 1:
                loginCliente(correo, clave);
                break;
            case 2:
                break;
            case 3:
                loginCajero(correo, clave);
                break;
            case 4:
                break;
            case 5:
                lblMensajeCorreo.setText("Correo incorrecto");
                break;
        }
        
        DefaultListModel<String> model;
        model = new DefaultListModel<>();
        for(Producto productos : listaProductos){
            model.addElement(productos.getNombre());
        }
        listProductos.setModel(model);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void lblRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarMouseClicked
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "registrar");
    }//GEN-LAST:event_lblRegistrarMouseClicked

    private void passClaveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passClaveFocusGained
        if("Contraseña".equals(String.valueOf(passClave.getPassword()))){
            passClave.setText("");
            passClave.setForeground(Color.WHITE);
        }
        showContra();
        lblMensajeContra.setText("");
    }//GEN-LAST:event_passClaveFocusGained

    private void passClaveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passClaveFocusLost
        if("".equals(String.valueOf(passClave.getPassword()))){
            passClave.setText("Contraseña");
            passClave.setForeground(Color.GRAY);
        }
        if("Contraseña".equals(String.valueOf(passClave.getPassword()))){
            passClave.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_passClaveFocusLost

    private void lblShowHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowHideMouseClicked
        if(showPassword){
            lblShowHide.setText("Mostrar");
        }else{
            lblShowHide.setText("Ocultar");
        }
        showPassword = !showPassword;
        if("Contraseña".equals(String.valueOf(passClave.getPassword()))){
            passClave.setEchoChar('\u0000');
        }else{
            showContra();
        }
    }//GEN-LAST:event_lblShowHideMouseClicked

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nombre = txtRegNombre.getText();
        String correo = txtRegCorreo.getText();
        String telefono = txtRegTelefono.getText();
        String direccion = txtRegDireccion.getText();
        String password = String.valueOf(passRegClave.getPassword());
        String confPassword = String.valueOf(passRegClaveConf.getPassword());
        
        lblRegMensaje.setForeground(Color.RED);
        
        if("Nombre".equals(nombre)){
            lblRegMensaje.setText("Por favor, ingrese nombre");
            return;
        }
        
        if("Telefono".equals(telefono)){
            lblRegMensaje.setText("Por favor, ingrese telefono");
            return;
        }
        
        if("Dirección".equals(telefono)){
            lblRegMensaje.setText("Por favor, ingrese direccion");
            return;
        }
        
        if("nombre@ejemplo.com".equals(telefono)){
            lblRegMensaje.setText("Por favor, ingrese correo");
            return;
        }
        
        if(!mainControlador.comprobarCliente(correo)){
            lblRegMensaje.setText("Por favor, ingrese correo válido ej. @gmail.com");
            return;
        }
        
        if("Contraseña".equals(password)){
            lblRegMensaje.setText("Por favor, ingrese contraseña");
            return;
        }
        
        if(!password.equals(confPassword)){
            lblRegMensaje.setText("Las contraseñas no coinciden");
            return;
        }
        if(clienteControlador.comprobarCorreo(correo)){
            lblRegMensaje.setText("El correo ya existe");
            return;
        }
        
        try {
            clienteControlador.registrarCliente(correo, password, nombre, telefono, direccion);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        lblRegMensaje.setForeground(Color.BLUE);
        lblRegMensaje.setText("Cuenta registrada");
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void lblRegBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegBackMouseClicked
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "login");
    }//GEN-LAST:event_lblRegBackMouseClicked

    private void passRegClaveConfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passRegClaveConfFocusGained
        if("Confirmar Contraseña".equals(String.valueOf(passRegClaveConf.getPassword()))){
            passRegClaveConf.setText("");
            passRegClaveConf.setForeground(Color.WHITE);
        }
        lblRegMensaje.setText("");
        passRegClaveConf.setEchoChar('\u2022');
    }//GEN-LAST:event_passRegClaveConfFocusGained

    private void passRegClaveConfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passRegClaveConfFocusLost
        if("".equals(String.valueOf(passRegClaveConf.getPassword()))){
            passRegClaveConf.setText("Confirmar Contraseña");
            passRegClaveConf.setForeground(Color.GRAY);
            passRegClaveConf.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_passRegClaveConfFocusLost

    private void passRegClaveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passRegClaveFocusGained
        if("Contraseña".equals(String.valueOf(passRegClave.getPassword()))){
            passRegClave.setText("");
            passRegClave.setForeground(Color.WHITE);
        }
        lblRegMensaje.setText("");
        passRegClave.setEchoChar('\u2022');
    }//GEN-LAST:event_passRegClaveFocusGained

    private void passRegClaveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passRegClaveFocusLost
        if("".equals(String.valueOf(passRegClave.getPassword()))){
            passRegClave.setText("Contraseña");
            passRegClave.setForeground(Color.GRAY);
            passRegClave.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_passRegClaveFocusLost

    private void passRegClaveConfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passRegClaveConfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passRegClaveConfActionPerformed

    private void txtRegNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRegNombreFocusGained
        if("Nombre".equals(txtRegNombre.getText())){
            txtRegNombre.setText("");
            txtRegNombre.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_txtRegNombreFocusGained

    private void txtRegNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRegNombreFocusLost
        if("".equals(txtRegNombre.getText())){
            txtRegNombre.setText("Nombre");
            txtRegNombre.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtRegNombreFocusLost

    private void txtRegTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRegTelefonoFocusGained
        if("Telefono".equals(txtRegTelefono.getText())){
            txtRegTelefono.setText("");
            txtRegTelefono.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_txtRegTelefonoFocusGained

    private void txtRegTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRegTelefonoFocusLost
        if("".equals(txtRegTelefono.getText())){
            txtRegTelefono.setText("Telefono");
            txtRegTelefono.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtRegTelefonoFocusLost

    private void txtRegDireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRegDireccionFocusGained
        if("Dirección".equals(txtRegDireccion.getText())){
            txtRegDireccion.setText("");
            txtRegDireccion.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_txtRegDireccionFocusGained

    private void txtRegDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRegDireccionFocusLost
        if("".equals(txtRegDireccion.getText())){
            txtRegDireccion.setText("Dirección");
            txtRegDireccion.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtRegDireccionFocusLost

    private void txtRegCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRegCorreoFocusGained
        if("nombre@ejemplo.com".equals(txtRegCorreo.getText())){
            txtRegCorreo.setText("");
            txtRegCorreo.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_txtRegCorreoFocusGained

    private void txtRegCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRegCorreoFocusLost
        if("".equals(txtRegCorreo.getText())){
            txtRegCorreo.setText("nombre@ejemplo.com");
            txtRegCorreo.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtRegCorreoFocusLost

    private void passRegClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passRegClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passRegClaveActionPerformed

    private void lblRegistrarOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarOrdenMouseClicked
        CardLayout card = (CardLayout)aplicacionCajero.getLayout();
        card.show(aplicacionCajero, "registrarCajero");
    }//GEN-LAST:event_lblRegistrarOrdenMouseClicked

    private void listProductosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listProductosValueChanged
        Producto producto = productoActual();
        lblDispReg.setText(String.valueOf(producto.getStock()));
    
        SpinnerNumberModel model = new SpinnerNumberModel(1, 1, Integer.parseInt(lblDispReg.getText()), 1);     
        spnCantReg.setModel(model);
   
        lblPrecioReg.setText("Q " + String.valueOf(producto.getPrecio()));
    }//GEN-LAST:event_listProductosValueChanged

    private void lblAddRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddRegMouseClicked
        Producto producto = productoActual();
       
        if(existeRegistro()){
            for(int f = 0; f<tblProdReg.getRowCount(); f++){
                if(tblProdReg.getValueAt(f, 0) == listProductos.getSelectedValue()){
                    if((int)tblProdReg.getValueAt(f, 1) + (int)spnCantReg.getValue() > producto.getStock()){
                        return;
                    }
                    tblProdReg.setValueAt((int)tblProdReg.getValueAt(f, 1) + (int)spnCantReg.getValue(), f, 1);
                    tblProdReg.setValueAt((double)tblProdReg.getValueAt(f, 4) + calcularTotal(), f, 4);
                }          
            }
        }else{
            
            for(int f = 0; f<tblProdReg.getRowCount(); f++){
                if(tblProdReg.getValueAt(f, 0)==null){
                    tblProdReg.setValueAt(producto.getNombre(), f, 0);
                    tblProdReg.setValueAt(spnCantReg.getValue(), f, 1);
                    tblProdReg.setValueAt(producto.getPrecio(), f, 2);
                    tblProdReg.setValueAt(10, f, 3);
                    tblProdReg.setValueAt(calcularTotal(), f, 4);      
                return;                     
                }
       
            }
        }  
    }//GEN-LAST:event_lblAddRegMouseClicked

    private void spnCantRegStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantRegStateChanged
        lblTotReg.setText("Q " + calcularTotal());
    }//GEN-LAST:event_spnCantRegStateChanged

    private void spnCantRegPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spnCantRegPropertyChange
        lblTotReg.setText("Q " + calcularTotal());
    }//GEN-LAST:event_spnCantRegPropertyChange

    private void showContra(){
        if(showPassword){
            passClave.setEchoChar('\u0000');
        }else{
            passClave.setEchoChar('j');
        }
    }
    
    private boolean existeRegistro(){
        for(int f = 0; f<tblProdReg.getRowCount(); f++){
            if(listProductos.getSelectedValue() == tblProdReg.getValueAt(f, 0)){
                return true;
            } 
        }
        return false;
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login;
    private javax.swing.JPanel Registrar;
    private javax.swing.JPanel aplicacionCajero;
    private javax.swing.JPanel aplicacionCliente;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbxRegProductos;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAddReg;
    private javax.swing.JLabel lblDecoracion;
    private javax.swing.JLabel lblDispReg;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblLoginTitle;
    private javax.swing.JLabel lblMensajeContra;
    private javax.swing.JLabel lblMensajeCorreo;
    private javax.swing.JLabel lblPrecioReg;
    private javax.swing.JLabel lblRegBack;
    private javax.swing.JLabel lblRegMensaje;
    private javax.swing.JLabel lblRegTitulo;
    private javax.swing.JLabel lblRegistrar;
    private javax.swing.JLabel lblRegistrarOrden;
    private javax.swing.JLabel lblShowHide;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JLabel lblTotReg;
    private javax.swing.JList<String> listProductos;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuBarCajero;
    private javax.swing.JPanel menuCajero;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPasswordField passClave;
    private javax.swing.JPasswordField passRegClave;
    private javax.swing.JPasswordField passRegClaveConf;
    private javax.swing.JPanel pnlRegistrar;
    private javax.swing.JPanel regOrden;
    private javax.swing.JSpinner spnCantReg;
    private javax.swing.JTable tblProdReg;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtRegCorreo;
    private javax.swing.JTextField txtRegDireccion;
    private javax.swing.JTextField txtRegNombre;
    private javax.swing.JTextField txtRegTelefono;
    // End of variables declaration//GEN-END:variables
}

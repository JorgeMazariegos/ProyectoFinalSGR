package vista;

import java.awt.Color;
import controlador.ClienteControlador;
import controlador.EmpleadoControlador;
import controlador.mainControlador;
import java.awt.CardLayout;
import java.security.NoSuchAlgorithmException;

public class Programa extends javax.swing.JFrame {
    ClienteControlador clienteControlador = new ClienteControlador();
    EmpleadoControlador empleadoControlador = new EmpleadoControlador();
    mainControlador mainControlador = new mainControlador();
    boolean loginPassword = false;
    
    
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
        lblSesion = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        lblRegistrar = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        passClave = new javax.swing.JPasswordField();
        lblShowHide = new javax.swing.JLabel();
        Registrar = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        aplicacionCliente = new javax.swing.JPanel();
        aplicacionCajero = new javax.swing.JPanel();
        menuCajero = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        registrarCajero = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblRegProducto = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblRegDisponible = new javax.swing.JLabel();
        lblDisponible = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblTotalPrecio = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistrarPedido = new javax.swing.JTable();
        lblRegProducto1 = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        lblMostrarPrecio1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        mainPanel.setLayout(new java.awt.CardLayout());

        Login.setBackground(new java.awt.Color(51, 51, 51));
        Login.setMinimumSize(new java.awt.Dimension(800, 600));
        Login.setLayout(null);
        Login.add(icono);
        icono.setBounds(110, 150, 120, 70);

        panelLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        lblSesion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblSesion.setText("INICIAR SESIÓN");

        txtCorreo.setText("Correo");
        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });

        btnLogin.setText("Iniciar Sesión");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblRegistrar.setForeground(new java.awt.Color(102, 153, 255));
        lblRegistrar.setText("Registrar una cuenta");
        lblRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarMouseClicked(evt);
            }
        });

        lblMensaje.setText("Mensaje:");

        passClave.setText("Contraseña");
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

        lblShowHide.setText("M/O");
        lblShowHide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblShowHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShowHideMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(lblRegistrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(lblShowHide)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSesion)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(passClave, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))
                .addGap(41, 41, 41))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblSesion)
                .addGap(56, 56, 56)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passClave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblShowHide))
                .addGap(59, 59, 59)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblRegistrar)
                .addGap(31, 31, 31)
                .addComponent(lblMensaje)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        Login.add(panelLogin);
        panelLogin.setBounds(390, 70, 310, 430);

        mainPanel.add(Login, "login");

        Registrar.setBackground(new java.awt.Color(51, 51, 51));
        Registrar.setMinimumSize(new java.awt.Dimension(800, 600));
        Registrar.setLayout(null);

        jLabel2.setText("Nombre");

        jTextField1.setText("jTextField1");

        jLabel3.setText("Telefono");

        jTextField2.setText("jTextField2");

        jLabel4.setText("Correo");

        jLabel5.setText("Direccion");

        jTextField3.setText("jTextField3");

        jTextField4.setText("jTextField4");

        jLabel6.setText("Contraseña");

        jLabel7.setText("Confirmar Contraseña");

        jTextField5.setText("jTextField5");

        jTextField6.setText("jTextField6");

        jButton1.setText("Registrar Cuenta");

        jLabel8.setText("REGISTRAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(61, 61, 61)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(103, 103, 103)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jButton1)))
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(216, 216, 216))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(52, 52, 52))
        );

        Registrar.add(jPanel1);
        jPanel1.setBounds(150, 50, 510, 520);

        mainPanel.add(Registrar, "registrar");

        javax.swing.GroupLayout aplicacionClienteLayout = new javax.swing.GroupLayout(aplicacionCliente);
        aplicacionCliente.setLayout(aplicacionClienteLayout);
        aplicacionClienteLayout.setHorizontalGroup(
            aplicacionClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        aplicacionClienteLayout.setVerticalGroup(
            aplicacionClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        mainPanel.add(aplicacionCliente, "appCliente");

        aplicacionCajero.setBackground(new java.awt.Color(204, 102, 0));
        aplicacionCajero.setForeground(new java.awt.Color(102, 102, 255));
        aplicacionCajero.setLayout(new java.awt.CardLayout());

        menuCajero.setBackground(new java.awt.Color(204, 204, 204));
        menuCajero.setLayout(null);

        jButton2.setText("COMPLETAR UNA ORDEN");

        jButton3.setText("REGISTRAR UNA ORDEN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );

        menuCajero.add(jPanel2);
        jPanel2.setBounds(120, 120, 500, 290);

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("REGRESAR");
        menuCajero.add(jLabel9);
        jLabel9.setBounds(20, 30, 60, 16);

        aplicacionCajero.add(menuCajero, "card2");

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Arial Black", 1, 32)); // NOI18N
        lblTitulo.setText("Registrar Pedido");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registrar.png"))); // NOI18N

        lblRegProducto.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblRegProducto.setText("Producto");

        lblRegDisponible.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblRegDisponible.setText("Disponible");

        lblDisponible.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDisponible.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDisponible.setText("-");

        lblPrecio.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblPrecio.setText("Precio");

        lblTotalPrecio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTotalPrecio.setText("Q 0.0");

        lblTotal.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblTotal.setText("Total");

        tblRegistrarPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Precio Unitario", "Cantidad", "Total"
            }
        ));
        jScrollPane1.setViewportView(tblRegistrarPedido);

        lblRegProducto1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblRegProducto1.setText("Cantidad");

        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spnCantidad.setOpaque(true);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N

        lblMostrarPrecio1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblMostrarPrecio1.setText("Q 0.0");

        javax.swing.GroupLayout registrarCajeroLayout = new javax.swing.GroupLayout(registrarCajero);
        registrarCajero.setLayout(registrarCajeroLayout);
        registrarCajeroLayout.setHorizontalGroup(
            registrarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrarCajeroLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(registrarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registrarCajeroLayout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLogo))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(registrarCajeroLayout.createSequentialGroup()
                        .addGroup(registrarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registrarCajeroLayout.createSequentialGroup()
                                .addComponent(lblRegProducto)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblRegDisponible)
                                .addGap(18, 18, 18)
                                .addComponent(lblDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(registrarCajeroLayout.createSequentialGroup()
                                .addComponent(lblRegProducto1)
                                .addGap(18, 18, 18)
                                .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(registrarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(registrarCajeroLayout.createSequentialGroup()
                                .addComponent(lblTotal)
                                .addGap(27, 27, 27)
                                .addComponent(lblTotalPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(registrarCajeroLayout.createSequentialGroup()
                                .addComponent(lblPrecio)
                                .addGap(18, 18, 18)
                                .addComponent(lblMostrarPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        registrarCajeroLayout.setVerticalGroup(
            registrarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrarCajeroLayout.createSequentialGroup()
                .addGroup(registrarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registrarCajeroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogo)
                        .addGap(17, 17, 17)
                        .addGroup(registrarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(registrarCajeroLayout.createSequentialGroup()
                                .addGroup(registrarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(registrarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblRegProducto)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblRegDisponible)
                                        .addComponent(lblDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblPrecio))
                                .addGap(18, 18, 18)
                                .addGroup(registrarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTotal)
                                    .addComponent(lblRegProducto1)
                                    .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registrarCajeroLayout.createSequentialGroup()
                                .addComponent(lblMostrarPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))))
                    .addGroup(registrarCajeroLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblTitulo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrarCajeroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(registrarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTotalPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        aplicacionCajero.add(registrarCajero, "card3");

        mainPanel.add(aplicacionCajero, "appCajero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusGained
        if("Correo".equals(txtCorreo.getText())){
            txtCorreo.setText("");
            txtCorreo.setForeground(Color.BLACK);
        }       
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
                
        }

           
    }//GEN-LAST:event_btnLoginActionPerformed

    private void loginCliente(String correo, String clave){
        CardLayout card = (CardLayout)mainPanel.getLayout();
        try{
            switch(clienteControlador.loginCliente(correo, clave)){
                case 1: 
                    lblMensaje.setText("Correo incorrecto");
                    break;
                case 2:
                    lblMensaje.setText("Contraseña incorrecta");
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
                    lblMensaje.setText("Correo incorrecto");
                    break;
                case 2:
                    lblMensaje.setText("Contraseña incorrecta");
                    break;
                case 3:
                    card.show(mainPanel, "appCajero");
                    break;
            }   
        }catch(NoSuchAlgorithmException e){
            System.out.println(e.getMessage());
        }
    }
    
    private void lblRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarMouseClicked
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "registrar");
    }//GEN-LAST:event_lblRegistrarMouseClicked

    private void passClaveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passClaveFocusGained
        if("Contraseña".equals(String.valueOf(passClave.getPassword()))){
            passClave.setText("");
            loginPassword = false;
            passClave.setForeground(Color.BLACK);
        }
        passwordSetVisible();
    }//GEN-LAST:event_passClaveFocusGained

    private void passClaveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passClaveFocusLost
        if("".equals(String.valueOf(passClave.getPassword()))){
            passClave.setText("Contraseña");
            loginPassword = true;
            passClave.setForeground(Color.GRAY);      
        }
        passwordSetVisible();
    }//GEN-LAST:event_passClaveFocusLost

    private void lblShowHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowHideMouseClicked
        loginPassword = !loginPassword;
        passwordSetVisible();
    }//GEN-LAST:event_lblShowHideMouseClicked

    private void passwordSetVisible(){
        if(loginPassword){
            passClave.setEchoChar('\u0000');
        }else{
            passClave.setEchoChar('\u2022');
        }
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
    private javax.swing.JLabel icono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblDisponible;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblMostrarPrecio1;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblRegDisponible;
    private javax.swing.JLabel lblRegProducto;
    private javax.swing.JLabel lblRegProducto1;
    private javax.swing.JLabel lblRegistrar;
    private javax.swing.JLabel lblSesion;
    private javax.swing.JLabel lblShowHide;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalPrecio;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuCajero;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPasswordField passClave;
    private javax.swing.JPanel registrarCajero;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tblRegistrarPedido;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}

package vista;

import java.awt.Color;
import controlador.ClienteControlador;
import controlador.EmpleadoControlador;
import controlador.ProductoControlador;
import controlador.mainControlador;
import modelo.Producto;
import java.awt.CardLayout;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.swing.SpinnerNumberModel;


public class Programa extends javax.swing.JFrame {
    ClienteControlador clienteControlador = new ClienteControlador();
    EmpleadoControlador empleadoControlador = new EmpleadoControlador();
    ProductoControlador productoControlador = new ProductoControlador();
    mainControlador mainControlador = new mainControlador();
    boolean loginPassword = false;
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
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Olvido = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        aplicacionCliente = new javax.swing.JPanel();
        aplicacionCajero = new javax.swing.JPanel();
        menuCajero = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        btnRegistrarOrden = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        registrarCajero = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblRegProducto = new javax.swing.JLabel();
        cbxListaProductos = new javax.swing.JComboBox<>();
        lblRegDisponible = new javax.swing.JLabel();
        lblDisponible = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblTotalPrecio = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistrarPedido = new javax.swing.JTable();
        lblRegProducto1 = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSpinner();
        lblAddPedido = new javax.swing.JLabel();
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

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 22, 131, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("REGISTRAR CUENTA ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 83, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Correo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 123, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Telefono");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 157, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Contraseña");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 191, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Confirmar Contraseña");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 237, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 83, 210, -1));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 123, 210, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 163, 210, -1));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 197, 210, -1));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 237, 210, -1));

        Guardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        Guardar.setText("Guardar");
        jPanel1.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 120, -1));

        Borrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Borrar.png"))); // NOI18N
        Borrar.setText("Borrar");
        jPanel1.add(Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        Salir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        Salir.setText("Salir");
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Registrar");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));

        Olvido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Olvido.setText("Has olvidado la contraseña");
        jPanel1.add(Olvido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prueba.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-circular-50.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, -10, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-restaurant-50.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-circular-50.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-circular-50.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-circular-50.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 470, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fondo.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 520));

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

        btnRegistrarOrden.setText("REGISTRAR UNA ORDEN");
        btnRegistrarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarOrdenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(btnRegistrarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btnRegistrarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        lblTitulo.setText("Cobrar Pedido");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registrar.png"))); // NOI18N

        lblRegProducto.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblRegProducto.setText("Producto");

        cbxListaProductos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxListaProductosItemStateChanged(evt);
            }
        });

        lblRegDisponible.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblRegDisponible.setText("Disponible");

        lblDisponible.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDisponible.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDisponible.setText("-");

        lblPrecio.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblPrecio.setText("Precio");

        lblTotalPrecio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTotalPrecio.setText("Q 0.0");

        lblTotal.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblTotal.setText("Total");

        tblRegistrarPedido.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
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
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });
        spnCantidad.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spnCantidadPropertyChange(evt);
            }
        });

        lblAddPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        lblAddPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddPedidoMouseClicked(evt);
            }
        });

        lblMostrarPrecio1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMostrarPrecio1.setText("Q 0.0");

        javax.swing.GroupLayout registrarCajeroLayout = new javax.swing.GroupLayout(registrarCajero);
        registrarCajero.setLayout(registrarCajeroLayout);
        registrarCajeroLayout.setHorizontalGroup(
            registrarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrarCajeroLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(registrarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(registrarCajeroLayout.createSequentialGroup()
                        .addGroup(registrarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(registrarCajeroLayout.createSequentialGroup()
                                .addComponent(lblRegProducto1)
                                .addGap(18, 18, 18)
                                .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(registrarCajeroLayout.createSequentialGroup()
                                .addComponent(lblRegProducto)
                                .addGap(18, 18, 18)
                                .addComponent(cbxListaProductos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblTitulo))
                        .addGap(39, 39, 39)
                        .addGroup(registrarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogo)
                            .addGroup(registrarCajeroLayout.createSequentialGroup()
                                .addComponent(lblRegDisponible)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(lblAddPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        registrarCajeroLayout.setVerticalGroup(
            registrarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrarCajeroLayout.createSequentialGroup()
                .addGroup(registrarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registrarCajeroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogo))
                    .addGroup(registrarCajeroLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblTitulo)))
                .addGroup(registrarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registrarCajeroLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblRegProducto)
                        .addGap(18, 18, 18)
                        .addGroup(registrarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRegProducto1)
                            .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(registrarCajeroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(registrarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registrarCajeroLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(registrarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(registrarCajeroLayout.createSequentialGroup()
                                        .addGroup(registrarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblRegDisponible)
                                            .addComponent(lblPrecio))
                                        .addGap(39, 39, 39))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registrarCajeroLayout.createSequentialGroup()
                                        .addComponent(lblMostrarPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTotalPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTotal))
                            .addComponent(lblAddPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(registrarCajeroLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(cbxListaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        aplicacionCajero.add(registrarCajero, "registrarCajero");

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
           // if(loginPassword){
           //     loginPassword = false;
           // }        
            passClave.setForeground(Color.BLACK);
        }
        passwordSetVisible();
    }//GEN-LAST:event_passClaveFocusGained

    private void passClaveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passClaveFocusLost
        if("".equals(String.valueOf(passClave.getPassword()))){
            passClave.setText("Contraseña");
           // if(!loginPassword){
           //     loginPassword = true;
           // }         
            passClave.setForeground(Color.GRAY);      
        }
        passwordSetVisible();
    }//GEN-LAST:event_passClaveFocusLost

    private void lblShowHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowHideMouseClicked
        if(loginPassword){
            lblShowHide.setForeground(Color.blue);
        }else{
            lblShowHide.setForeground(Color.red);
        }
            
        loginPassword = !loginPassword;
        passwordSetVisible();
    }//GEN-LAST:event_lblShowHideMouseClicked

    private void btnRegistrarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarOrdenActionPerformed
        CardLayout card = (CardLayout)aplicacionCajero.getLayout();
        card.show(aplicacionCajero, "registrarCajero");
                
        for(Producto productos : listaProductos){
            cbxListaProductos.addItem(productos.getNombre());
        }      
    }//GEN-LAST:event_btnRegistrarOrdenActionPerformed

    private Producto productoActual(){
        
        for(Producto producto : listaProductos){
            if(producto.getNombre() == cbxListaProductos.getSelectedItem()){
                return producto;
            }           
        }
        for(Producto producto : listaProductos){ 
                return producto;       
        }
        return null;
    }
    
    private void cbxListaProductosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxListaProductosItemStateChanged
        Producto producto = productoActual();
        if(producto.getNombre() == cbxListaProductos.getSelectedItem()){
            lblDisponible.setText(String.valueOf(producto.getStock()));
        }
    
        SpinnerNumberModel model = new SpinnerNumberModel(1, 1, Integer.parseInt(lblDisponible.getText()), 1);     
        spnCantidad.setModel(model);
       
        if(producto.getNombre() == cbxListaProductos.getSelectedItem()){
            lblMostrarPrecio1.setText("Q " + String.valueOf(producto.getPrecio()));
        }
    }//GEN-LAST:event_cbxListaProductosItemStateChanged

    private void spnCantidadPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spnCantidadPropertyChange
        lblTotalPrecio.setText("Q " + calcularTotal());
    }//GEN-LAST:event_spnCantidadPropertyChange

    private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantidadStateChanged
        lblTotalPrecio.setText("Q " + calcularTotal());
    }//GEN-LAST:event_spnCantidadStateChanged

    private double calcularTotal(){
        Producto producto = productoActual();
        double total = 0;
        
        if(producto.getNombre() == cbxListaProductos.getSelectedItem()){
            total = producto.getPrecio() * (int)spnCantidad.getValue();
        } 
        return total;
    }
    
    private void lblAddPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddPedidoMouseClicked
        Producto producto = productoActual();
       
        if(existeRegistro()){
            for(int f = 0; f<tblRegistrarPedido.getRowCount(); f++){
                if(tblRegistrarPedido.getValueAt(f, 0) == cbxListaProductos.getSelectedItem()){
                    if((int)tblRegistrarPedido.getValueAt(f, 2) + (int)spnCantidad.getValue() > producto.getStock()){
                        return;
                    }
                    tblRegistrarPedido.setValueAt((int)tblRegistrarPedido.getValueAt(f, 2) + (int)spnCantidad.getValue(), f, 2);
                    tblRegistrarPedido.setValueAt((double)tblRegistrarPedido.getValueAt(f, 3) + calcularTotal(), f, 3);
                }          
            }
        }else{    
            if(producto.getNombre() == cbxListaProductos.getSelectedItem()){
                for(int f = 0; f<tblRegistrarPedido.getRowCount(); f++){                 
                        if(tblRegistrarPedido.getValueAt(f, 0)==null){
                            tblRegistrarPedido.setValueAt(producto.getNombre(), f, 0);
                            tblRegistrarPedido.setValueAt(String.valueOf(producto.getPrecio()), f, 1);
                            tblRegistrarPedido.setValueAt(spnCantidad.getValue(), f, 2);
                            tblRegistrarPedido.setValueAt(calcularTotal(), f, 3);      
                            return;
                        }          
                    }
                }
        }       
    }//GEN-LAST:event_lblAddPedidoMouseClicked

    private boolean existeRegistro(){
        for(int f = 0; f<tblRegistrarPedido.getRowCount(); f++){
            if(cbxListaProductos.getSelectedItem() == tblRegistrarPedido.getValueAt(f, 0)){
                return true;
            } 
        }
        return false;
    }
    
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
    private javax.swing.JButton Borrar;
    private javax.swing.JButton Guardar;
    private javax.swing.JPanel Login;
    private javax.swing.JButton Olvido;
    private javax.swing.JPanel Registrar;
    private javax.swing.JButton Salir;
    private javax.swing.JPanel aplicacionCajero;
    private javax.swing.JPanel aplicacionCliente;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistrarOrden;
    private javax.swing.JComboBox<String> cbxListaProductos;
    private javax.swing.JLabel icono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblAddPedido;
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

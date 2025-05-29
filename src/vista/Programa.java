package vista;

import java.awt.Color;
import controlador.ClienteControlador;
import controlador.EmpleadoControlador;
import controlador.ProductoControlador;
import controlador.mainControlador;
import modelo.Producto;
import java.awt.CardLayout;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import controlador.PedidoControlador;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import modelo.Pedido;


public class Programa extends javax.swing.JFrame {
    ClienteControlador clienteControlador = new ClienteControlador();
    EmpleadoControlador empleadoControlador = new EmpleadoControlador();
    ProductoControlador productoControlador = new ProductoControlador();
    PedidoControlador pedidoControlador = new PedidoControlador();
    mainControlador mainControlador = new mainControlador();
    boolean showPassword = false;
    
    List<Producto> listaProductos = productoControlador.consultarProductos();
    List<Pedido> listaPedidos = pedidoControlador.consultarPedidos();
    
    
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
        lblLogOut = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblRegistrarOrden = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblCompletarOrden = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblConsultarPedido = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        menuCajero = new javax.swing.JPanel();
        regOrden = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdReg = new javax.swing.JTable();
        lblNumPedido = new javax.swing.JLabel();
        btnEliminarTabla = new javax.swing.JButton();
        btnEliminarItem = new javax.swing.JButton();
        btnDescuentoTabla = new javax.swing.JButton();
        cbxDescuento = new javax.swing.JComboBox<>();
        spnMenosCantidad = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        lblDescuentoTotal = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblSubTotalMostrar = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblImpuestos = new javax.swing.JLabel();
        btnPagarPedido = new javax.swing.JButton();
        lblTotalRecibo = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNIT = new javax.swing.JTextField();
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
        compOrden = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblProdCompletar = new javax.swing.JTable();
        btnEliminarTablaNoCompletado = new javax.swing.JButton();
        btnDescuentoTablaNoComp = new javax.swing.JButton();
        cbxDescuentoNoComp = new javax.swing.JComboBox<>();
        spnMenosCantidadNoComp = new javax.swing.JSpinner();
        jLabel37 = new javax.swing.JLabel();
        lblDescuentoTotalNoCompletados = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        lblSubTotalNoComp = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        lblImpuestosNoComp = new javax.swing.JLabel();
        btnPagarPedidoNoComp = new javax.swing.JButton();
        lblTotalReciboNoComp = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtNITNoComp = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        listaProductosPendientes = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        consultarPedidos = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblConsultaPedidos = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblDescuentoTotalConsulta = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblSubTotalConsulta = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblImpuestosConsulta = new javax.swing.JLabel();
        lblTotalReciboConsulta = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblNitConsulta = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNombreConsulta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPedidos = new javax.swing.JList<>();
        cbxFiltrarPedidos = new javax.swing.JComboBox<>();
        aplicacionMesero = new javax.swing.JPanel();
        menuBarMesero = new javax.swing.JPanel();
        lblLogOut1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        panelAppMesero = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel44 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        mainPanel.setLayout(new java.awt.CardLayout());

        Login.setBackground(new java.awt.Color(11, 14, 29));
        Login.setMinimumSize(new java.awt.Dimension(800, 600));
        Login.setLayout(null);

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Vivanda_logo_durazno.jpg"))); // NOI18N
        Login.add(icono);
        icono.setBounds(90, 90, 260, 360);

        panelLogin.setBackground(new java.awt.Color(44, 57, 94));
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
            .addGap(0, 932, Short.MAX_VALUE)
        );
        aplicacionClienteLayout.setVerticalGroup(
            aplicacionClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 609, Short.MAX_VALUE)
        );

        mainPanel.add(aplicacionCliente, "appCliente");

        aplicacionCajero.setBackground(new java.awt.Color(204, 102, 0));
        aplicacionCajero.setForeground(new java.awt.Color(102, 102, 255));
        aplicacionCajero.setPreferredSize(new java.awt.Dimension(800, 600));
        aplicacionCajero.setLayout(new java.awt.BorderLayout());

        menuBarCajero.setBackground(new java.awt.Color(57, 62, 70));
        menuBarCajero.setMaximumSize(new java.awt.Dimension(800, 42));
        menuBarCajero.setPreferredSize(new java.awt.Dimension(800, 42));

        lblLogOut.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblLogOut.setForeground(new java.awt.Color(255, 255, 255));
        lblLogOut.setText("Cerrar Sesión");
        lblLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogOutMouseClicked(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblRegistrarOrden.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblRegistrarOrden.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrarOrden.setText("Registrar Orden");
        lblRegistrarOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistrarOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarOrdenMouseClicked(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblCompletarOrden.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCompletarOrden.setForeground(new java.awt.Color(255, 255, 255));
        lblCompletarOrden.setText("Completar Orden");
        lblCompletarOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCompletarOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCompletarOrdenMouseClicked(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblConsultarPedido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblConsultarPedido.setForeground(new java.awt.Color(255, 255, 255));
        lblConsultarPedido.setText("Consultar Pedidos");
        lblConsultarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConsultarPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConsultarPedidoMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food-icon.png"))); // NOI18N
        jLabel5.setToolTipText("");

        javax.swing.GroupLayout menuBarCajeroLayout = new javax.swing.GroupLayout(menuBarCajero);
        menuBarCajero.setLayout(menuBarCajeroLayout);
        menuBarCajeroLayout.setHorizontalGroup(
            menuBarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarCajeroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 474, Short.MAX_VALUE)
                .addComponent(lblConsultarPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCompletarOrden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRegistrarOrden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogOut)
                .addContainerGap())
        );
        menuBarCajeroLayout.setVerticalGroup(
            menuBarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBarCajeroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuBarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRegistrarOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCompletarOrden, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblConsultarPedido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Float.class, java.lang.Double.class
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

        lblNumPedido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNumPedido.setForeground(new java.awt.Color(255, 255, 255));
        lblNumPedido.setText("Pedido #");

        btnEliminarTabla.setText("- Item");
        btnEliminarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTablaActionPerformed(evt);
            }
        });

        btnEliminarItem.setText("Eliminar Item");
        btnEliminarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarItemActionPerformed(evt);
            }
        });

        btnDescuentoTabla.setText("Aplicar Descuento");
        btnDescuentoTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescuentoTablaActionPerformed(evt);
            }
        });

        cbxDescuento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "0.05", "0.03", "0.1", "0.08" }));

        spnMenosCantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Descuento:");

        lblDescuentoTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblDescuentoTotal.setText("Q 0.00");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("SubTotal:");

        lblSubTotalMostrar.setForeground(new java.awt.Color(255, 255, 255));
        lblSubTotalMostrar.setText("Q 0.00");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Impuestos:");

        lblImpuestos.setForeground(new java.awt.Color(255, 255, 255));
        lblImpuestos.setText("Q 0.00");

        btnPagarPedido.setText("Generar Factura");
        btnPagarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarPedidoActionPerformed(evt);
            }
        });

        lblTotalRecibo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTotalRecibo.setForeground(new java.awt.Color(102, 102, 255));
        lblTotalRecibo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalRecibo.setText("Q 0.00");

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Total :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NIT");

        txtNIT.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNIT.setForeground(new java.awt.Color(204, 204, 204));
        txtNIT.setText("Ingresar nit");
        txtNIT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNITFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNITFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNumPedido)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNIT, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPagarPedido))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(lblDescuentoTotal)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnDescuentoTabla)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(27, 27, 27)
                                        .addComponent(lblImpuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminarTabla)
                                    .addComponent(jLabel14))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnMenosCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lblSubTotalMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel21)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lblTotalRecibo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNumPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarItem)
                    .addComponent(cbxDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDescuentoTabla)
                    .addComponent(spnMenosCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarTabla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblDescuentoTotal)
                    .addComponent(jLabel18)
                    .addComponent(lblImpuestos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lblSubTotalMostrar)
                    .addComponent(lblTotalRecibo)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPagarPedido)
                    .addComponent(jLabel6)
                    .addComponent(txtNIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Producto");

        cbxRegProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cbxRegProductos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxRegProductosItemStateChanged(evt);
            }
        });

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAddReg)))
                .addContainerGap())
        );
        regOrdenLayout.setVerticalGroup(
            regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
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
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        menuCajero.add(regOrden, "regOrden");

        compOrden.setBackground(new java.awt.Color(30, 40, 49));

        jPanel6.setBackground(new java.awt.Color(57, 62, 70));
        jPanel6.setPreferredSize(new java.awt.Dimension(420, 550));

        tblProdCompletar.setBackground(new java.awt.Color(204, 204, 204));
        tblProdCompletar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblProdCompletar.setForeground(new java.awt.Color(0, 0, 0));
        tblProdCompletar.setModel(new javax.swing.table.DefaultTableModel(
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
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Float.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblProdCompletar.setPreferredSize(new java.awt.Dimension(420, 80));
        jScrollPane8.setViewportView(tblProdCompletar);
        if (tblProdCompletar.getColumnModel().getColumnCount() > 0) {
            tblProdCompletar.getColumnModel().getColumn(0).setPreferredWidth(250);
        }

        btnEliminarTablaNoCompletado.setText("- Item");
        btnEliminarTablaNoCompletado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTablaNoCompletadoActionPerformed(evt);
            }
        });

        btnDescuentoTablaNoComp.setText("Aplicar Descuento");
        btnDescuentoTablaNoComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescuentoTablaNoCompActionPerformed(evt);
            }
        });

        cbxDescuentoNoComp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "0.05", "0.03", "0.1", "0.08" }));

        spnMenosCantidadNoComp.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel37.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Descuento:");

        lblDescuentoTotalNoCompletados.setForeground(new java.awt.Color(255, 255, 255));
        lblDescuentoTotalNoCompletados.setText("Q 0.00");

        jLabel38.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("SubTotal:");

        lblSubTotalNoComp.setForeground(new java.awt.Color(255, 255, 255));
        lblSubTotalNoComp.setText("Q 0.00");

        jLabel39.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Impuestos:");

        lblImpuestosNoComp.setForeground(new java.awt.Color(255, 255, 255));
        lblImpuestosNoComp.setText("Q 0.00");

        btnPagarPedidoNoComp.setText("Generar Factura");
        btnPagarPedidoNoComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarPedidoNoCompActionPerformed(evt);
            }
        });

        lblTotalReciboNoComp.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTotalReciboNoComp.setForeground(new java.awt.Color(102, 102, 255));
        lblTotalReciboNoComp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalReciboNoComp.setText("Q 0.00");

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Total :");

        jLabel41.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("NIT");

        txtNITNoComp.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNITNoComp.setForeground(new java.awt.Color(204, 204, 204));
        txtNITNoComp.setText("Ingresar nit");
        txtNITNoComp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNITNoCompFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNITNoCompFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addGap(18, 18, 18)
                                .addComponent(lblDescuentoTotalNoCompletados)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(btnDescuentoTablaNoComp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxDescuentoNoComp, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel39)
                                        .addGap(27, 27, 27)
                                        .addComponent(lblImpuestosNoComp, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminarTablaNoCompletado)
                                    .addComponent(jLabel38))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnMenosCantidadNoComp, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lblSubTotalNoComp, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel40)))))
                        .addGap(5, 5, 5)
                        .addComponent(lblTotalReciboNoComp, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNITNoComp, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPagarPedidoNoComp)))
                .addContainerGap())
            .addComponent(jScrollPane8)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxDescuentoNoComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDescuentoTablaNoComp)
                    .addComponent(spnMenosCantidadNoComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarTablaNoCompletado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(lblDescuentoTotalNoCompletados)
                    .addComponent(jLabel39)
                    .addComponent(lblImpuestosNoComp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(lblSubTotalNoComp)
                    .addComponent(lblTotalReciboNoComp)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPagarPedidoNoComp)
                    .addComponent(jLabel41)
                    .addComponent(txtNITNoComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        listaProductosPendientes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaProductosPendientes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaProductosPendientesValueChanged(evt);
            }
        });
        jScrollPane9.setViewportView(listaProductosPendientes);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pedidos no completados");

        javax.swing.GroupLayout compOrdenLayout = new javax.swing.GroupLayout(compOrden);
        compOrden.setLayout(compOrdenLayout);
        compOrdenLayout.setHorizontalGroup(
            compOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(compOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(compOrdenLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 204, Short.MAX_VALUE))
                    .addGroup(compOrdenLayout.createSequentialGroup()
                        .addComponent(jScrollPane9)
                        .addContainerGap())))
        );
        compOrdenLayout.setVerticalGroup(
            compOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(compOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(compOrdenLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE))
                .addContainerGap())
        );

        menuCajero.add(compOrden, "compOrden");

        consultarPedidos.setBackground(new java.awt.Color(30, 40, 49));
        consultarPedidos.setPreferredSize(new java.awt.Dimension(828, 600));

        jPanel2.setBackground(new java.awt.Color(57, 62, 70));
        jPanel2.setPreferredSize(new java.awt.Dimension(420, 550));

        tblConsultaPedidos.setBackground(new java.awt.Color(204, 204, 204));
        tblConsultaPedidos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblConsultaPedidos.setForeground(new java.awt.Color(0, 0, 0));
        tblConsultaPedidos.setModel(new javax.swing.table.DefaultTableModel(
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
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Float.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblConsultaPedidos.setPreferredSize(new java.awt.Dimension(420, 80));
        jScrollPane4.setViewportView(tblConsultaPedidos);
        if (tblConsultaPedidos.getColumnModel().getColumnCount() > 0) {
            tblConsultaPedidos.getColumnModel().getColumn(0).setPreferredWidth(250);
        }

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Pedido #");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Descuento:");

        lblDescuentoTotalConsulta.setForeground(new java.awt.Color(255, 255, 255));
        lblDescuentoTotalConsulta.setText("Q 0.00");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("SubTotal:");

        lblSubTotalConsulta.setForeground(new java.awt.Color(255, 255, 255));
        lblSubTotalConsulta.setText("Q 0.00");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Impuestos:");

        lblImpuestosConsulta.setForeground(new java.awt.Color(255, 255, 255));
        lblImpuestosConsulta.setText("Q 0.00");

        lblTotalReciboConsulta.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTotalReciboConsulta.setForeground(new java.awt.Color(102, 102, 255));
        lblTotalReciboConsulta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalReciboConsulta.setText("Q 0.00");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Total :");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NIT:");

        lblNitConsulta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNitConsulta.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        lblNombreConsulta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombreConsulta.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblDescuentoTotalConsulta)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblImpuestosConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblSubTotalConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNitConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalReciboConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lblDescuentoTotalConsulta)
                    .addComponent(jLabel20)
                    .addComponent(lblImpuestosConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lblSubTotalConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNitConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(lblTotalReciboConsulta))
                        .addGap(42, 42, 42))))
        );

        listPedidos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listPedidos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listPedidosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listPedidos);

        cbxFiltrarPedidos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Completados", "No Completados", " " }));
        cbxFiltrarPedidos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxFiltrarPedidosItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout consultarPedidosLayout = new javax.swing.GroupLayout(consultarPedidos);
        consultarPedidos.setLayout(consultarPedidosLayout);
        consultarPedidosLayout.setHorizontalGroup(
            consultarPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultarPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(consultarPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(consultarPedidosLayout.createSequentialGroup()
                        .addComponent(cbxFiltrarPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 264, Short.MAX_VALUE)))
                .addContainerGap())
        );
        consultarPedidosLayout.setVerticalGroup(
            consultarPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultarPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(consultarPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(consultarPedidosLayout.createSequentialGroup()
                        .addComponent(cbxFiltrarPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
                .addContainerGap())
        );

        menuCajero.add(consultarPedidos, "consPedidos");

        aplicacionCajero.add(menuCajero, java.awt.BorderLayout.CENTER);

        mainPanel.add(aplicacionCajero, "appCajero");

        aplicacionMesero.setLayout(new java.awt.BorderLayout());

        menuBarMesero.setBackground(new java.awt.Color(57, 62, 70));
        menuBarMesero.setMaximumSize(new java.awt.Dimension(800, 42));
        menuBarMesero.setPreferredSize(new java.awt.Dimension(800, 42));

        lblLogOut1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblLogOut1.setForeground(new java.awt.Color(255, 255, 255));
        lblLogOut1.setText("Cerrar Sesión");
        lblLogOut1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogOut1MouseClicked(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food-icon.png"))); // NOI18N
        jLabel42.setToolTipText("");

        jLabel43.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Registrar Pedido");

        javax.swing.GroupLayout menuBarMeseroLayout = new javax.swing.GroupLayout(menuBarMesero);
        menuBarMesero.setLayout(menuBarMeseroLayout);
        menuBarMeseroLayout.setHorizontalGroup(
            menuBarMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarMeseroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 403, Short.MAX_VALUE)
                .addComponent(jLabel43)
                .addGap(207, 207, 207)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogOut1)
                .addContainerGap())
        );
        menuBarMeseroLayout.setVerticalGroup(
            menuBarMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBarMeseroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuBarMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43)
                    .addGroup(menuBarMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblLogOut1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aplicacionMesero.add(menuBarMesero, java.awt.BorderLayout.NORTH);

        panelAppMesero.setBackground(new java.awt.Color(30, 40, 49));

        jScrollPane10.setViewportView(jList1);

        jLabel4.setText("Tipo de producto:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Producto", "Precio U", "Cantidad", "Descuento", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane11.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(250);
        }

        jLabel44.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Resumen del pedido");

        jButton1.setText("Eliminar Producto");

        jButton2.setText("- Item");

        jButton3.setText("Descuento");

        jLabel45.setText("SubTotal:");

        jLabel46.setText("Descuento:");

        jLabel47.setText("Impuestos:");

        jLabel48.setText("Total:");

        jLabel49.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel49.setText("Q 0.00");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel48)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel49)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel46)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48)
                            .addComponent(jLabel49))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout panelAppMeseroLayout = new javax.swing.GroupLayout(panelAppMesero);
        panelAppMesero.setLayout(panelAppMeseroLayout);
        panelAppMeseroLayout.setHorizontalGroup(
            panelAppMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAppMeseroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAppMeseroLayout.setVerticalGroup(
            panelAppMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAppMeseroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAppMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        aplicacionMesero.add(panelAppMesero, java.awt.BorderLayout.CENTER);

        mainPanel.add(aplicacionMesero, "appMesero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
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
    
    private void loginForzadoCajero(){
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "appCajero");
 
        List<String> filtrarProductos = new ArrayList<>();
        for(Producto producto : listaProductos){
            if(!filtrarProductos.contains(producto.getTipo())){
                filtrarProductos.add(producto.getTipo());
                cbxRegProductos.addItem(producto.getTipo());
            }
        }
        actualizarListaProductos();
        lblNumPedido.setText("Pedido #" + String.valueOf(numPedido()));
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
                    break;
            }   
        DefaultListModel<String> model;
        model = new DefaultListModel<>();
        for(Producto productos : listaProductos){
            model.addElement(productos.getNombre());
        }
        listProductos.setModel(model);
        
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
    
    private double calcularTotalDescuento(int f){
        Producto producto = productoActual();
        int cantidad = (int)tblProdReg.getValueAt(f, 1);
        double total;
        double descuento;
        
        descuento = producto.getPrecio() * cantidad * (Float)tblProdReg.getValueAt(f, 3);
  
        total = producto.getPrecio() * cantidad - descuento;
        
        return total;
    }
    
    private double calcularTotal(){
        Producto producto = productoActual();
        double total;
        
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

    private void loginForzadoMesero(){
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "appMesero");
    }
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String correo = txtCorreo.getText();
        char[] password = passClave.getPassword();
        String clave = String.valueOf(password);
        
        loginForzadoCajero();
        //loginForzadoMesero();

       /* switch(mainControlador.comprobarCorreo(correo)){
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
        }     */
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
        CardLayout card = (CardLayout)menuCajero.getLayout();
        card.show(menuCajero, "regOrden");
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
                    tblProdReg.setValueAt(calcularTotalDescuento(f), f, 4);
                    actualizarDatos();
                }          
            }
        }else{
            
            for(int f = 0; f<tblProdReg.getRowCount(); f++){
                if(tblProdReg.getValueAt(f, 0)==null){
                    tblProdReg.setValueAt(producto.getNombre(), f, 0);
                    tblProdReg.setValueAt(spnCantReg.getValue(), f, 1);
                    tblProdReg.setValueAt(producto.getPrecio(), f, 2);
                    tblProdReg.setValueAt(Float.valueOf((String)cbxDescuento.getSelectedItem()), f, 3);
                    tblProdReg.setValueAt(calcularTotalDescuento(f), f, 4);
                    actualizarDatos();
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

    private void lblLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMouseClicked
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "login");
    }//GEN-LAST:event_lblLogOutMouseClicked

    private void btnDescuentoTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescuentoTablaActionPerformed
        int fila = tblProdReg.getSelectedRow();
        float descuento = Float.parseFloat((String)cbxDescuento.getSelectedItem());
        tblProdReg.setValueAt(descuento, fila, 3);
        tblProdReg.setValueAt(calcularTotalDescuento(fila), fila, 4);
        actualizarDatos();
    }//GEN-LAST:event_btnDescuentoTablaActionPerformed

    private void txtNITFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNITFocusGained
        if("Ingresar nit".equals(txtNIT.getText())){
            txtNIT.setText("");
            txtNIT.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNITFocusGained

    private void txtNITFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNITFocusLost
        if("".equals(txtNIT.getText())){
            txtNIT.setText("Ingresar nit");
            txtNIT.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtNITFocusLost

    private void cbxRegProductosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxRegProductosItemStateChanged
        actualizarListaProductos();
    }//GEN-LAST:event_cbxRegProductosItemStateChanged

    private void btnPagarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarPedidoActionPerformed
        String nit = txtNIT.getText();
        String nombreCliente = clienteControlador.consularNombre(nit);
        int numPedido = numPedido();
        double total = getNumero(lblTotalRecibo.getText());
        int seRegistro = 0;
        
        for(int f = 0; f <tblProdReg.getRowCount(); f++){
            if(tblProdReg.getValueAt(f, 0)!= null){
                String producto = (String)tblProdReg.getValueAt(f, 0);
                int cantidad = (int)tblProdReg.getValueAt(f, 1);
                double precioU = (double )tblProdReg.getValueAt(f, 2);
                float descuento = (float)tblProdReg.getValueAt(f, 3);
                seRegistro = pedidoControlador.registarPedido(numPedido, nombreCliente, nit, total, producto, cantidad, descuento, true, precioU);
            }
            
        }
        
        if(seRegistro == 1){
            for(int f = 0; f < tblProdReg.getRowCount(); f++){
                for(int c = 0; c < tblProdReg.getColumnCount(); c++){
                tblProdReg.setValueAt(null, f, c);
                }
            }
            actualizarDatos();
        }
    }//GEN-LAST:event_btnPagarPedidoActionPerformed

    private double getNumero(String numero) {
        String soloNumero = numero.replaceAll("[^\\d.]", ""); // removes non-numeric except dot
        return Double.parseDouble(soloNumero);
    }
    
    private void btnEliminarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTablaActionPerformed
        int fila = tblProdReg.getSelectedRow();
        int cantidad = (int)spnMenosCantidad.getValue();
        if((int)tblProdReg.getValueAt(fila, 1) > 1){
            tblProdReg.setValueAt((int)tblProdReg.getValueAt(fila, 1) - cantidad, fila, 1);
            tblProdReg.setValueAt(calcularTotalDescuento(fila), fila, 4);
        }
        actualizarDatos();
    }//GEN-LAST:event_btnEliminarTablaActionPerformed

    private void btnEliminarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarItemActionPerformed
        int fila = tblProdReg.getSelectedRow();
        
        for(int c = 0; c < tblProdReg.getColumnCount(); c++){
            tblProdReg.setValueAt(null, fila, c);
        }
        actualizarDatos();
    }//GEN-LAST:event_btnEliminarItemActionPerformed

    private void lblCompletarOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCompletarOrdenMouseClicked
        CardLayout card = (CardLayout)menuCajero.getLayout();
        card.show(menuCajero, "compOrden");
        actualizarListaPedidosPendientes();
        
    }//GEN-LAST:event_lblCompletarOrdenMouseClicked

    private void lblConsultarPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConsultarPedidoMouseClicked
        CardLayout card = (CardLayout)menuCajero.getLayout();
        card.show(menuCajero, "consPedidos");
        actualizarListaPedidos();
    }//GEN-LAST:event_lblConsultarPedidoMouseClicked

    private void actualizarListaPedidosPendientes(){
        DefaultListModel<String> model;
        model = new DefaultListModel<>();
        for(Pedido pedido : listaPedidos){      
            String pedidoRegistro = "Pedido #" + String.valueOf(pedido.getNumPedido());
            if(!model.contains(pedidoRegistro)){
                if(!pedido.isEstado()){
                    model.addElement("Pedido #" + String.valueOf(pedido.getNumPedido()));
                }             
            }         
        }
        listaProductosPendientes.setModel(model);
    }
    
    private void actualizarListaPedidos(){
        DefaultListModel<String> model;
        model = new DefaultListModel<>();
        for(Pedido pedido : listaPedidos){
            if(cbxFiltrarPedidos.getSelectedItem().equals("Completados")){
                String pedidoRegistro = "Pedido #" + String.valueOf(pedido.getNumPedido());
                if(!model.contains(pedidoRegistro)){
                    if(pedido.isEstado()){
                        model.addElement("Pedido #" + String.valueOf(pedido.getNumPedido()));
                    }             
                }
            }else if(cbxFiltrarPedidos.getSelectedItem().equals("No Completados")){
                String pedidoRegistro = "Pedido #" + String.valueOf(pedido.getNumPedido());
                if(!model.contains(pedidoRegistro)){
                    if(!pedido.isEstado()){
                        model.addElement("Pedido #" + String.valueOf(pedido.getNumPedido()));
                    }             
                }
            }else if(cbxFiltrarPedidos.getSelectedItem().equals("Todos")){
                String pedidoRegistro = "Pedido #" + String.valueOf(pedido.getNumPedido());
                if(!model.contains(pedidoRegistro)){  
                    model.addElement("Pedido #" + String.valueOf(pedido.getNumPedido()));        
                }
            }          
        }
        listPedidos.setModel(model);
    }
    
    private void listPedidosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listPedidosValueChanged
        DefaultTableModel model = (DefaultTableModel) tblConsultaPedidos.getModel();
        model.setRowCount(0);
        for(Pedido pedido : listaPedidos){
            String pedidoRegistro = "Pedido #" + String.valueOf(pedido.getNumPedido());
            if(pedidoRegistro.equals(listPedidos.getSelectedValue())){
                Object[] fila = new Object[5];
                fila[0] = pedido.getProductos();
                fila[1] = pedido.getCantidad();
                fila[2] = pedido.getPrecioUnitario();
                fila[3] = pedido.getDescuento();
     
                double descuentoTotal = pedido.getCantidad() * pedido.getPrecioUnitario() * pedido.getDescuento();
                double total = pedido.getCantidad() * pedido.getPrecioUnitario() - descuentoTotal;
                
                fila[4] = total;
                model.addRow(fila);
                actualizarDatosConsulta();
                
                lblNombreConsulta.setText(pedido.getNombreCliente());
                lblNitConsulta.setText(pedido.getNitCliente());
            }
        }
        
    }//GEN-LAST:event_listPedidosValueChanged

    private void cbxFiltrarPedidosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxFiltrarPedidosItemStateChanged
        actualizarListaPedidos();
    }//GEN-LAST:event_cbxFiltrarPedidosItemStateChanged

    private void btnEliminarTablaNoCompletadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTablaNoCompletadoActionPerformed
        int fila = tblProdCompletar.getSelectedRow();
        int cantidad = (int)spnMenosCantidadNoComp.getValue();
        if((int)tblProdCompletar.getValueAt(fila, 1) > 1){
            tblProdCompletar.setValueAt((int)tblProdCompletar.getValueAt(fila, 1) - cantidad, fila, 1);
            tblProdReg.setValueAt(calcularTotalDescuento(fila), fila, 4);
        }
        actualizarDatosPedidoPendiente();
    }//GEN-LAST:event_btnEliminarTablaNoCompletadoActionPerformed

    private void btnDescuentoTablaNoCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescuentoTablaNoCompActionPerformed
        int fila = tblProdCompletar.getSelectedRow();
        float descuento = Float.parseFloat((String)cbxDescuentoNoComp.getSelectedItem());
        tblProdCompletar.setValueAt(descuento, fila, 3);
        tblProdCompletar.setValueAt(calcularTotalDescuentoNoComp(fila), fila, 4);
        actualizarDatosPedidoPendiente();
    }//GEN-LAST:event_btnDescuentoTablaNoCompActionPerformed

    private double calcularTotalDescuentoNoComp(int f){
        int cantidad = (int)tblProdCompletar.getValueAt(f, 1);
        double precioU = (double)tblProdCompletar.getValueAt(f, 2);
        double total;
        double descuento;
        
        descuento = precioU * cantidad * (float)tblProdCompletar.getValueAt(f, 3);
  
        total = precioU * cantidad - descuento;
        
        return total;
    }
    
    private void btnPagarPedidoNoCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarPedidoNoCompActionPerformed
        String nit = txtNITNoComp.getText();
        String nombreCliente = clienteControlador.consularNombre(nit);
        int numPedido = 0;
        int seRegistro = 0;
        double total = getNumero(lblTotalReciboNoComp.getText());
        for(Pedido pedido : listaPedidos){
            String pedidoRegistro = "Pedido #" + String.valueOf(pedido.getNumPedido());
            if(pedidoRegistro.equals(listaProductosPendientes.getSelectedValue())){
                numPedido = pedido.getNumPedido();
            }
            
        }     
    
        for(int f = 0; f <tblProdCompletar.getRowCount(); f++){
            if(tblProdCompletar.getValueAt(f, 0)!= null){
                String producto = (String)tblProdCompletar.getValueAt(f, 0);
                int cantidad = (int)tblProdCompletar.getValueAt(f, 1);
                float descuento = (float)tblProdCompletar.getValueAt(f, 3);
                seRegistro = pedidoControlador.actualizarPedido(numPedido, nombreCliente, nit, total, producto, cantidad, descuento, true);
            }
            
        }
        
        if(seRegistro == 1){
            for(int f = 0; f < tblProdCompletar.getRowCount(); f++){
                for(int c = 0; c < tblProdCompletar.getColumnCount(); c++){
                    tblProdCompletar.setValueAt(null, f, c);
                }
            }
            actualizarDatosPedidoPendiente();
        }
    }//GEN-LAST:event_btnPagarPedidoNoCompActionPerformed

    private void txtNITNoCompFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNITNoCompFocusGained
        if("Ingresar nit".equals(txtNITNoComp.getText())){
            txtNITNoComp.setText("");
            txtNITNoComp.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNITNoCompFocusGained

    private void txtNITNoCompFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNITNoCompFocusLost
        if("".equals(txtNITNoComp.getText())){
            txtNITNoComp.setText("Ingresar nit");
            txtNITNoComp.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNITNoCompFocusLost

    private void listaProductosPendientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaProductosPendientesValueChanged
        DefaultTableModel model = (DefaultTableModel) tblProdCompletar.getModel();
        model.setRowCount(0);
        for(Pedido pedido : listaPedidos){
            String pedidoRegistro = "Pedido #" + String.valueOf(pedido.getNumPedido());
            if(pedidoRegistro.equals(listaProductosPendientes.getSelectedValue())){
                Object[] fila = new Object[5];
                fila[0] = pedido.getProductos();
                fila[1] = pedido.getCantidad();
                fila[2] = pedido.getPrecioUnitario();
                fila[3] = pedido.getDescuento();
     
                double descuentoTotal = pedido.getCantidad() * pedido.getPrecioUnitario() * pedido.getDescuento();
                double total = pedido.getCantidad() * pedido.getPrecioUnitario() - descuentoTotal;
                
                fila[4] = total;
                model.addRow(fila);
                actualizarDatosPedidoPendiente();
            }
        }
    }//GEN-LAST:event_listaProductosPendientesValueChanged

    private void lblLogOut1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOut1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblLogOut1MouseClicked
 
    private void actualizarDatosPedidoPendiente(){
        double subTotal = 0;
        double descuento;
        double descuentoTotal = 0;
        double impuesto = 0;
        double total = 0;
        for(int i = 0; i<tblProdCompletar.getRowCount(); i++){
            if(tblProdCompletar.getValueAt(i, 4) != null){
                subTotal = subTotal + (double)tblProdCompletar.getValueAt(i, 4);
            }
            
            if(tblProdCompletar.getValueAt(i, 3) != null){
                if((float)tblProdCompletar.getValueAt(i, 3) != 0){
                    descuento = (double)tblProdCompletar.getValueAt(i, 2) * (int)tblProdCompletar.getValueAt(i, 1) * (Float)tblProdCompletar.getValueAt(i, 3);
                    descuentoTotal = descuentoTotal + descuento;
                }   
            }
            
            impuesto = subTotal * 0.16;
            total = subTotal + impuesto - descuentoTotal;
        }
        
        lblSubTotalNoComp.setText("Q " + String.format("%.2f", subTotal));
        lblDescuentoTotalNoCompletados.setText("Q " + String.format("%.2f", descuentoTotal));
        lblImpuestosNoComp.setText("Q " + String.format("%.2f", impuesto));
        lblTotalReciboNoComp.setText("Q " + String.format("%.2f", total));        
    }
    
    private void actualizarDatosConsulta(){    
        double subTotal = 0;
        double descuento;
        double descuentoTotal = 0;
        double impuesto = 0;
        double total = 0;
        for(int i = 0; i<tblConsultaPedidos.getRowCount(); i++){
            if(tblConsultaPedidos.getValueAt(i, 4) != null){
                subTotal = subTotal + (double)tblConsultaPedidos.getValueAt(i, 4);
            }
            
            if(tblConsultaPedidos.getValueAt(i, 3) != null){
                if((float)tblConsultaPedidos.getValueAt(i, 3) != 0){
                    descuento = (double)tblConsultaPedidos.getValueAt(i, 2) * (int)tblConsultaPedidos.getValueAt(i, 1) * (Float)tblConsultaPedidos.getValueAt(i, 3);
                    descuentoTotal = descuentoTotal + descuento;
                }   
            }
            
            impuesto = subTotal * 0.16;
            total = subTotal + impuesto - descuentoTotal;
        }
        
        lblSubTotalConsulta.setText("Q " + String.format("%.2f", subTotal));
        lblDescuentoTotalConsulta.setText("Q " + String.format("%.2f", descuentoTotal));
        lblImpuestosConsulta.setText("Q " + String.format("%.2f", impuesto));
        lblTotalReciboConsulta.setText("Q " + String.format("%.2f", total));
    }
    
    private void actualizarDatos(){
        double subTotal = 0;
        double descuento;
        double descuentoTotal = 0;
        double impuesto = 0;
        double total = 0;
        for(int i = 0; i<tblProdReg.getRowCount(); i++){
            if(tblProdReg.getValueAt(i, 4) != null){
                subTotal = subTotal + (double)tblProdReg.getValueAt(i, 4);
            }
            
            if(tblProdReg.getValueAt(i, 3) != null){
                if((float)tblProdReg.getValueAt(i, 3) != 0){
                    descuento = (double)tblProdReg.getValueAt(i, 2) * (int)tblProdReg.getValueAt(i, 1) * (Float)tblProdReg.getValueAt(i, 3);
                    descuentoTotal = descuentoTotal + descuento;
                }   
            }
            
            impuesto = subTotal * 0.16;
            total = subTotal + impuesto - descuentoTotal;
        }
        
        lblSubTotalMostrar.setText("Q " + String.format("%.2f", subTotal));
        lblDescuentoTotal.setText("Q " + String.format("%.2f", descuentoTotal));
        lblImpuestos.setText("Q " + String.format("%.2f", impuesto));
        lblTotalRecibo.setText("Q " + String.format("%.2f", total));
    }
    
    private void actualizarListaProductos(){
        DefaultListModel<String> model;
        model = new DefaultListModel<>();
        for(Producto productos : listaProductos){    
            if(cbxRegProductos.getSelectedItem().equals(productos.getTipo())){      
                model.addElement(productos.getNombre());
            }else if(cbxRegProductos.getSelectedItem().equals("-")){
                model.addElement(productos.getNombre());
            } 
        }
        listProductos.setModel(model);
    }
    
    private void showContra(){
        if(showPassword){
            passClave.setEchoChar('\u0000');
        }else{
            passClave.setEchoChar('\u2022');
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
    
    private int numPedido(){
        int numPedido;
        int ultimoIndex = listaPedidos.size() - 1;
        Pedido ultimoPedido = listaPedidos.get(ultimoIndex);
        
        numPedido = ultimoPedido.getNumPedido() + 1;
        
        return numPedido;
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
    private javax.swing.JPanel aplicacionMesero;
    private javax.swing.JButton btnDescuentoTabla;
    private javax.swing.JButton btnDescuentoTabla1;
    private javax.swing.JButton btnDescuentoTabla2;
    private javax.swing.JButton btnDescuentoTabla3;
    private javax.swing.JButton btnDescuentoTablaNoComp;
    private javax.swing.JButton btnEliminarItem;
    private javax.swing.JButton btnEliminarItem1;
    private javax.swing.JButton btnEliminarItem2;
    private javax.swing.JButton btnEliminarItem3;
    private javax.swing.JButton btnEliminarTabla;
    private javax.swing.JButton btnEliminarTabla1;
    private javax.swing.JButton btnEliminarTabla2;
    private javax.swing.JButton btnEliminarTabla3;
    private javax.swing.JButton btnEliminarTablaNoCompletado;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnPagarPedido;
    private javax.swing.JButton btnPagarPedido1;
    private javax.swing.JButton btnPagarPedido2;
    private javax.swing.JButton btnPagarPedido3;
    private javax.swing.JButton btnPagarPedidoNoComp;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbxDescuento;
    private javax.swing.JComboBox<String> cbxDescuento1;
    private javax.swing.JComboBox<String> cbxDescuento2;
    private javax.swing.JComboBox<String> cbxDescuento3;
    private javax.swing.JComboBox<String> cbxDescuentoNoComp;
    private javax.swing.JComboBox<String> cbxFiltrarPedidos;
    private javax.swing.JComboBox<String> cbxRegProductos;
    private javax.swing.JPanel compOrden;
    private javax.swing.JPanel consultarPedidos;
    private javax.swing.JLabel icono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAddReg;
    private javax.swing.JLabel lblCompletarOrden;
    private javax.swing.JLabel lblConsultarPedido;
    private javax.swing.JLabel lblDecoracion;
    private javax.swing.JLabel lblDescuentoTotal;
    private javax.swing.JLabel lblDescuentoTotal1;
    private javax.swing.JLabel lblDescuentoTotal2;
    private javax.swing.JLabel lblDescuentoTotal3;
    private javax.swing.JLabel lblDescuentoTotalConsulta;
    private javax.swing.JLabel lblDescuentoTotalNoCompletados;
    private javax.swing.JLabel lblDispReg;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblImpuestos;
    private javax.swing.JLabel lblImpuestos1;
    private javax.swing.JLabel lblImpuestos2;
    private javax.swing.JLabel lblImpuestos3;
    private javax.swing.JLabel lblImpuestosConsulta;
    private javax.swing.JLabel lblImpuestosNoComp;
    private javax.swing.JLabel lblLogOut;
    private javax.swing.JLabel lblLogOut1;
    private javax.swing.JLabel lblLoginTitle;
    private javax.swing.JLabel lblMensajeContra;
    private javax.swing.JLabel lblMensajeCorreo;
    private javax.swing.JLabel lblNitConsulta;
    private javax.swing.JLabel lblNombreConsulta;
    private javax.swing.JLabel lblNumPedido;
    private javax.swing.JLabel lblNumPedido1;
    private javax.swing.JLabel lblNumPedido2;
    private javax.swing.JLabel lblNumPedido3;
    private javax.swing.JLabel lblPrecioReg;
    private javax.swing.JLabel lblRegBack;
    private javax.swing.JLabel lblRegMensaje;
    private javax.swing.JLabel lblRegTitulo;
    private javax.swing.JLabel lblRegistrar;
    private javax.swing.JLabel lblRegistrarOrden;
    private javax.swing.JLabel lblShowHide;
    private javax.swing.JLabel lblSubTotalConsulta;
    private javax.swing.JLabel lblSubTotalMostrar;
    private javax.swing.JLabel lblSubTotalMostrar1;
    private javax.swing.JLabel lblSubTotalMostrar2;
    private javax.swing.JLabel lblSubTotalMostrar3;
    private javax.swing.JLabel lblSubTotalNoComp;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JLabel lblTotReg;
    private javax.swing.JLabel lblTotalRecibo;
    private javax.swing.JLabel lblTotalRecibo1;
    private javax.swing.JLabel lblTotalRecibo2;
    private javax.swing.JLabel lblTotalRecibo3;
    private javax.swing.JLabel lblTotalReciboConsulta;
    private javax.swing.JLabel lblTotalReciboNoComp;
    private javax.swing.JList<String> listPedidos;
    private javax.swing.JList<String> listProductos;
    private javax.swing.JList<String> listaProductosPendientes;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuBarCajero;
    private javax.swing.JPanel menuBarMesero;
    private javax.swing.JPanel menuCajero;
    private javax.swing.JPanel panelAppMesero;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPasswordField passClave;
    private javax.swing.JPasswordField passRegClave;
    private javax.swing.JPasswordField passRegClaveConf;
    private javax.swing.JPanel pnlRegistrar;
    private javax.swing.JPanel regOrden;
    private javax.swing.JSpinner spnCantReg;
    private javax.swing.JSpinner spnMenosCantidad;
    private javax.swing.JSpinner spnMenosCantidad1;
    private javax.swing.JSpinner spnMenosCantidad2;
    private javax.swing.JSpinner spnMenosCantidad3;
    private javax.swing.JSpinner spnMenosCantidadNoComp;
    private javax.swing.JTable tblConsultaPedidos;
    private javax.swing.JTable tblProdCompletar;
    private javax.swing.JTable tblProdReg;
    private javax.swing.JTable tblProdReg1;
    private javax.swing.JTable tblProdReg2;
    private javax.swing.JTable tblProdReg3;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNIT;
    private javax.swing.JTextField txtNIT1;
    private javax.swing.JTextField txtNIT2;
    private javax.swing.JTextField txtNIT3;
    private javax.swing.JTextField txtNITNoComp;
    private javax.swing.JTextField txtRegCorreo;
    private javax.swing.JTextField txtRegDireccion;
    private javax.swing.JTextField txtRegNombre;
    private javax.swing.JTextField txtRegTelefono;
    // End of variables declaration//GEN-END:variables
}

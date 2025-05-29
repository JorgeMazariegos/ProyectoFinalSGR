package modelo;

public class Pedido {
    int id;
    int numPedido;
    String nombreCliente;
    String nitCliente;
    double totalGastado;
    String productos;
    int cantidad;
    float descuento;
    boolean estado;
    double precioUnitario;

    public Pedido(int numPedido ,String nombreCliente, String nitCliente, double totalGastado, String productos, int cantidad, float descuento, boolean estado, double precioUnitario) {
        this.numPedido = numPedido;
        this.nombreCliente = nombreCliente;
        this.nitCliente = nitCliente;
        this.totalGastado = totalGastado;
        this.productos = productos;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.estado = estado;
        this.precioUnitario = precioUnitario;
    }

    public Pedido(int numPedido, String nombreCliente, String nitCliente, double totalGastado, String productos, int cantidad, float descuento, boolean estado) {
        this.numPedido = numPedido;
        this.nombreCliente = nombreCliente;
        this.nitCliente = nitCliente;
        this.totalGastado = totalGastado;
        this.productos = productos;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.estado = estado;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNitCliente() {
        return nitCliente;
    }

    public void setNitCliente(String nitCliente) {
        this.nitCliente = nitCliente;
    }

    public double getTotalGastado() {
        return totalGastado;
    }

    public void setTotalGastado(double totalGastado) {
        this.totalGastado = totalGastado;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    @Override
    public String toString() {
        return "Pedido{" +
           "numPedido=" + numPedido +
           ", nombreCliente='" + nombreCliente + '\'' +
           ", nit='" + nitCliente + '\'' +
           ", total=" + totalGastado +
           ", producto='" + productos + '\'' +
           ", cantidad=" + cantidad +
           ", descuento=" + descuento +
           ", precioUnitario=" + precioUnitario +
           ", estado=" + estado +
           '}';
    }
}

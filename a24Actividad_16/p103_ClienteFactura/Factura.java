package a24Actividad_16.p103_ClienteFactura;

public class Factura {
    private int Id;
    private double Monto;
    private Cliente Cliente;

    public Factura() {}

    public Factura(int id, double monto, a24Actividad_16.p103_ClienteFactura.Cliente cliente) {
        Monto = monto;
        Id = id;
        Cliente = cliente;
    }
    
    public double getMonto() {
        return Monto;
    }

    public void setMonto(double monto) {
        Monto = monto;
    }
    
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
    
    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente cliente) {
        Cliente = cliente;
    }
    
    @Override
    public String toString() {
        return "Factura [Monto=" + Monto + ", Id=" + Id + ", Cliente=" + Cliente + "]";
    }
}

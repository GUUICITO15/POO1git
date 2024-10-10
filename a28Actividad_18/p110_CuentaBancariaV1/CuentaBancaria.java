package a28Actividad_18.p110_CuentaBancariaV1;

public class CuentaBancaria {
    private double Saldo;

    public CuentaBancaria(double saldo) {
        Saldo = saldo;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void deposita(double cantidad) {
        Saldo += cantidad;
    }

    public boolean retira(double cantidad) {
        if (Saldo >= cantidad){
            Saldo -= cantidad;
            return true;
        } else
            return false;
    }
}

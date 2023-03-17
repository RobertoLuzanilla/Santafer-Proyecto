public class Clientes {
    private int numCuenta,saldo;
    private String nombre;
    public Clientes(int nCuenta, String nombre, int saldo) {
        this.nombre=nombre;
        this.numCuenta=nCuenta;
        this.saldo=saldo;

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Numero de cuenta: " + numCuenta +
                ", Saldo de la cuenta: " + saldo +
                ", Nombre del cliente: " + nombre + '\'' +
                '}';
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

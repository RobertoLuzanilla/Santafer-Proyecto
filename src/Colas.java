public class Colas {

    private int NumCliente, Saldo;
    private int Movimiento;
    private String Nombre;
    public Colas(){}
    public Colas(int numCliente, int saldo, String nombre, int movimiento) {
        this.NumCliente = numCliente;
        this.Saldo = saldo;
        this.Nombre = nombre;
        this.Movimiento=movimiento;
    }
    public int getMovimiento() {

        return Movimiento;
    }
    public String getSMovimiento(){
        switch (Movimiento){
            case 1: return "Deposito";
            case 2: return "Retiro";
            case 3: return "Cambio de cheque";
        }
        return "";
    }

    public void setMovimiento(int movimiento) {
        Movimiento = movimiento;
    }

    public int getNumCliente() {
        return NumCliente;
    }

    public void setNumCliente(int numCliente) {
        NumCliente = numCliente;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int saldo) {
        Saldo = saldo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}

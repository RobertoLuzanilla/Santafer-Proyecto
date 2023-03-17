import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opcion=0,NumC,Saldo, accion =0;
        String Nombre;
        Oper_Clientes OClientes=new Oper_Clientes();
        Oper_Colas OColas=new Oper_Colas();
        Oper_Pilas OPilas=new Oper_Pilas();

        boolean caj1 = false;
        boolean caj2 = false;

        Colas caja1=new Colas();
        Colas caja2=new Colas();
        do {
            System.out.println("1)\tApertura de Cuenta\n" +
                    "2)\tDepósito\n" +
                    "3)\tRetiro\n" +
                    "4)\tCambio de Cheque\n" +
                    "5)\tSaldo de una cuenta\n" +
                    "6)\tDatos de una Cuenta\n" +
                    "7)\tDatos de todas las cuentas.\n" +
                    "8)\tÚltimo cliente atendido\n" +
                    "9)\tClientes en la cola\n" +
                    "10)\tClientes que están en caja\n" +
                    "11)\tPasar cliente a una caja\n" +
                    "12)\tAtender a un cliente en una caja\n" +
                    "13)\tSalir");
                    opcion=sc.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("Apertura de cuenta");

                            System.out.println("Ingrese el numero de cuenta");
                            NumC = sc.nextInt();
                            sc.nextLine();
                            int pos= OClientes.pos(NumC);
                            if (pos==-1) {
                                System.out.println("Ingrese el nombre del cliente");
                                Nombre = sc.nextLine();

                                System.out.println("Ingrese el saldo de la cuenta");
                                Saldo = sc.nextInt();

                                OClientes.altaClientes(NumC, Nombre, Saldo);
                               OPilas.apilar(new Clientes(NumC,Nombre,Saldo));
                            }else {
                                System.out.println("Ya existe esa cuenta");
                            }
                            break;
                        case 2:
                            System.out.println("Deposito");
                            System.out.println("Introduzca el numero de cuenta");
                            NumC=sc.nextInt();
                            pos = OClientes.pos(NumC);
                            if (pos!=-1){
                                System.out.println("Introduzca su nombre");
                                Nombre=sc.next();
                                System.out.println("Introduzca el importe del deposito");
                                Saldo=sc.nextInt();
                                accion = 1;
                                OColas.altaCola(NumC,Nombre,Saldo, accion);
                            }
                            break;
                        case 3:
                            System.out.println("Retiro");
                            System.out.println("Introduzca el numero de cuenta");
                            NumC=sc.nextInt();
                            pos=OClientes.pos(NumC);
                            if (pos!=-1) {
                                Nombre=OClientes.arr[pos].getNombre();
                                System.out.println("Ingrese el importe del retiro");
                                Saldo = sc.nextInt();
                                accion = 2;
                                OColas.altaCola(NumC,Nombre,Saldo,accion);
                            }else {
                                System.out.println("No existe ese numero de cliente");
                            }
                            break;
                        case 4:
                            System.out.println("Cambio de cheque");
                            System.out.println("Introduzca el numero del cuenta ");
                            NumC=sc.nextInt();
                            pos=OClientes.pos(NumC);
                            if (pos!=-1){

                                System.out.println("Introduzca su nombre");
                                Nombre=sc.next();
                                System.out.println("Introduzca el importe a retirar ");
                                Saldo=sc.nextInt();
                                accion=3;
                                OColas.altaCola(NumC,Nombre,Saldo, accion);
                            }else {
                                System.out.println("No existe ese numero de cliente");
                            }
                            break;
                        case 5:
                            System.out.println("Saldo de una cuenta");
                            System.out.println("Introduzca el numero de cuenta");
                            NumC=sc.nextInt();
                            pos=OClientes.pos(NumC);
                            if (pos!=-1){
                                System.out.println("El saldo es " + OClientes.arr[pos].getSaldo());
                            }else {
                                System.out.println("El numero del cliente");
                            }
                            break;
                        case 6:
                            System.out.println("Datos de una cuenta");
                            System.out.println("Introduzca el numero de cuenta");
                            NumC=sc.nextInt();
                            pos=OClientes.pos(NumC);
                            if (pos!=-1){
                                OClientes.mostrar(pos);
                            }else {
                                System.out.println("El cliente no existe");
                            }
                            break;
                        case 7:
                            System.out.println("Datos de todas las cuenta");
                            OClientes.MostrarTodos();
                            break;
                        case 8:
                            System.out.println("Ultimo cliente atendido");
                            OPilas.mostrarUltimo();
                            break;
                        case 9:
                            System.out.println("Cliente de una cola");
                            OColas.clientEncola();
                            break;
                        case 10:
                            System.out.println("Clientes que estan en caja");
                            if (caj1)   //Unicamente muestra los clientes que estan en la caja y su tipo de movimiento
                                System.out.println(caja1.getNombre()+"-"+caja1.getSMovimiento());
                            else
                                System.out.println("Vacia");
                            if (caj2)
                                System.out.println(caja2.getNombre()+"-"+caja2.getSMovimiento());
                            else
                                System.out.println("Vacia");
                            break;
                        case 11:
                            if (OColas.ContadorColas!=0){
                            System.out.println("Pasar cliente a una caja ");
                            if (!caj1){
                                //Llamo al primer cliente de la cola solicitando sus datos e igualandolos con la caja 1. Asi pasando el cliente a la caja
                                caja1=new Colas(OColas.arr[OColas.inicio].getNumCliente(),OColas.arr[OColas.inicio].getSaldo(),OColas.arr[OColas.inicio].getNombre(),OColas.arr[OColas.inicio].getMovimiento());
                                //Despues de pasar el cliente, se le cambia el estado de la caja y se elimina de la cola con el metodo "eliminarCliente"
                                caj1=true;
                                OColas.eliminarCliente();
                                System.out.println("El cliente ha sido pasado a la caja 1");
                            }else if (!caj2) {
                                //Se hace exactamente lo mismo
                                caja2=new Colas(OColas.arr[OColas.inicio].getNumCliente(),OColas.arr[OColas.inicio].getSaldo(),OColas.arr[OColas.inicio].getNombre(),OColas.arr[OColas.inicio].getMovimiento());
                                caj2=true;
                                OColas.eliminarCliente();
                                System.out.println("El cliente ha sido pasado a la caja 2");

                            }else System.out.println("Estan ocupadas");
                            }
                            break;
                        case 12:
                            System.out.println("Atender un cliente en la caja");

                            System.out.println("Introduzca la caja que desea desocupar");
                            opcion=sc.nextInt();
                            switch (opcion){
                                case 1:
                                    if (caj1) {
                                        switch (caja1.getMovimiento()){
                                            case 1:

                                                // Depositando el dinero en la cola
                                                OColas.Deposito(caja1.getNumCliente(), caja1.getSaldo());
                                                // Actualizando el saldo del cliente en el arreglo de clientes

                                                int posCliente = OClientes.pos(caja1.getNumCliente());
                                                if (posCliente != -1) {
                                                    OClientes.arr[posCliente].setSaldo(OClientes.arr[posCliente].getSaldo() + OColas.arr[posCliente].getSaldo());
                                                } else {
                                                    System.out.println("El cliente no existe en la cola.");
                                                }
                                                // Mostrando el saldo actualizado en la caja
                                                System.out.println("saldo " + caja1.getSaldo());


                                                break;
                                            case 2:
                                                //Retirando el dinero en la cola
                                                OColas.retiro(caja1.getNumCliente(), caja1.getSaldo());
                                                //Actualizando el saldo del cliente en el arreglo de clientes

                                                posCliente=OClientes.pos(caja1.getNumCliente());
                                                if (posCliente != -1) {
                                                    OClientes.arr[posCliente].setSaldo(OClientes.arr[posCliente].getSaldo() - OColas.arr[posCliente].getSaldo());
                                                }
                                                break;
                                            case 3:
                                                //Retirando el dinero en la cola
                                                OColas.CambioCheque(caja1.getNumCliente(),caja1.getSaldo());
                                                //Actualizando el cliente en el arreglo
                                                posCliente=OClientes.pos(caja1.getNumCliente());
                                                if (posCliente != -1) {
                                                    if (OClientes.arr[posCliente].getSaldo()<caja1.getSaldo()){
                                                        System.out.println("Saldo insuficiente");
                                                        System.out.println("Se le ha aplicado una multa de 500");
                                                        OClientes.arr[posCliente].setSaldo(OClientes.arr[posCliente].getSaldo()-500);
                                                    }else {
                                                        OClientes.arr[posCliente].setSaldo(OClientes.arr[posCliente].getSaldo() - OColas.arr[posCliente].getSaldo());
                                                    }
                                                }
                                                break;
                                        }
                                        OPilas.apilar(new Clientes(caja1.getNumCliente(), caja1.getNombre(), caja1.getSaldo()));
                                        // Si la caja 1 está ocupada, se saca al cliente
                                        System.out.println("El cliente " + caja1.getNombre() + " ha sido atendido en la caja 1.");
                                        caj1 = false;
                                        caja1 = null;
                                    }else {
                                        System.out.println("La caja esta vacia");
                                    }
                                    break;
                                case 2:
                                   if (caj2) {
                                       switch (caja2.getMovimiento()){
                                           case 1:
                                               OColas.Deposito(caja2.getNumCliente(), caja2.getSaldo());
                                               int posCliente = OClientes.pos(caja2.getNumCliente());
                                               if (posCliente != -1) {
                                                   OClientes.arr[posCliente].setSaldo(OClientes.arr[posCliente].getSaldo() + OColas.arr[posCliente].getSaldo());
                                               } else {
                                                   System.out.println("El cliente no existe en la cola.");
                                               }
                                               // Mostrando el saldo actualizado en la caja
                                               System.out.println("saldo " + caja2.getSaldo());
                                               break;
                                           case 2:
                                               OColas.retiro(caja2.getNumCliente(), caja2.getSaldo());
                                               //Actualizando el saldo del cliente en el arreglo de clientes

                                               posCliente=OClientes.pos(caja2.getNumCliente());
                                               if (posCliente != -1) {
                                                   OClientes.arr[posCliente].setSaldo(OClientes.arr[posCliente].getSaldo() - OColas.arr[posCliente].getSaldo());
                                               }
                                               break;
                                           case 3:
                                               OColas.CambioCheque(caja2.getNumCliente(),caja2.getSaldo());
                                               //Actualizando el cliente en el arreglo
                                               posCliente=OClientes.pos(caja2.getNumCliente());
                                               if (posCliente != -1) {
                                                   if (OClientes.arr[posCliente].getSaldo()<caja2       .getSaldo()){
                                                       System.out.println("Saldo insuficiente");
                                                       System.out.println("Se le ha aplicado una multa de 500");
                                                       OClientes.arr[posCliente].setSaldo(OClientes.arr[posCliente].getSaldo()-500);
                                                   }else {
                                                       OClientes.arr[posCliente].setSaldo(OClientes.arr[posCliente].getSaldo() - OColas.arr[posCliente].getSaldo());
                                                   }
                                               }
                                               break;
                                       }
                                        System.out.println("El cliente " + caja2.getNombre() + " ha sido atendido en la caja 2.");
                                       OPilas.apilar(new Clientes(caja2.getNumCliente(), caja2.getNombre(), caja2.getSaldo()));
                                        caj2 = false;
                                        caja2 = null;
                                    } else {

                                        System.out.println("La caja esta vacia");
                                    }
                                   break;
                            }

                            break;
                        case 13:
                            System.out.println("Salir");
                            System.out.println("Gracias por usa el programa");
                            break;
                    }

        }while (opcion!=13);

    }
}
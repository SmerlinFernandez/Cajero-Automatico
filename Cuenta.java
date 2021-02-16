package automaticoCajero;
import java.util.Date;
import java.util.Scanner;
public class Cuenta extends ClienteDelBanco{
    Date fecha = new Date();
    int NumeroCuenta=0;
    int TipoCuenta= 0;
    double Saldo=0;
    int retiro=0;
    Scanner v = new Scanner(System.in);
    Date d = new Date();
    int Efectivo = 30000;
    int monto = 0;
    int numerocuenta;
    Scanner p = new Scanner(System.in);
void getFecha() {
System.out.println(fecha.toString());
}
void InicioTransaccion() {
System.out.println("Ingrese el número de cuenta a depositar");
numerocuenta=p.nextInt();
System.out.println("Ingrese el monto a depositar");
monto=p.nextInt();
}
double CalcularSaldo() {
Saldo -=monto;
System.out.println("Su saldo actual es de " + Saldo );
System.out.println("------------------------------------"+ "\n");
return Saldo;
}
double saldo() {
Saldo-=monto;
return Saldo;
}
void ImprimirRecibo() {
System.out.println("------------------------------------");
System.out.println(" Banco La Solución ");
System.out.println(" Sucursal Churchill ");
System.out.println("------------------------------------");
System.out.println("Cliente: Juana Mercedes ");
System.out.println("Cuenta a depositar: " + numerocuenta);
System.out.println("Monto a depositar: " + monto );
System.out.println("Fecha de transaccion: "+ fecha.toString());
}
double Retirocuenta() {
System.out.println("Ingrese el monto a retirar");
retiro=v.nextInt();
Saldo -=retiro;
return retiro;
}
void Recibo() {
System.out.println("------------------------------------");
System.out.println(" Banco La Solución ");
System.out.println(" Sucursal Churchill ");
System.out.println("------------------------------------");
System.out.println("Cliente: Juana Mercedes ");
System.out.println("Monto a retirar: " + retiro );
System.out.println("Su nuevo balance es " + Saldo);
System.out.println("Fecha de transaccion: "+ d.toString());
}
double getSaldo() {
return Saldo;
}
void setefectivo() {
Efectivo -= retiro;
System.out.println("Efectivo restante del cajero: " + Efectivo);
System.out.println("------------------------------------" + "\n");
}
}
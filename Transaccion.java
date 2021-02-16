package automaticoCajero;
import java.util.Date;
import java.util.Scanner;
public class Transaccion extends Cuenta {
Date fecha = new Date();
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
System.out.println("Su saldo actual es de " + Saldo + "\n");
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
}
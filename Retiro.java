package automaticoCajero;
import java.util.Scanner;
import java.util.Date;
public class Retiro extends Cuenta {
int retiro=0;
Scanner v = new Scanner(System.in);
Date d = new Date();
double Retirocuenta() {
System.out.println("Ingrese el monto a retirar");
retiro=v.nextInt();
Saldo-=retiro;
return retiro;
}
double getRetiro()
{
super.Saldo-=retiro;
return super.Saldo;
}
void Recibo() {
System.out.println("------------------------------------");
System.out.println(" Banco La Solución ");
System.out.println(" Sucursal Churchill ");
System.out.println("------------------------------------");
System.out.println("Cliente: Juana Mercedes ");
System.out.println("Monto a retirar: " + retiro );
System.out.println("Su nuevo balance es " + Saldo);
System.out.println("Fecha de transaccion: "+ d.toString()+ "\n");
}
}
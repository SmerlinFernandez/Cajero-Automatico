package automaticoCajero;
public class ReciboDeposito extends Transaccion{
void ImprimirRecibo() {
System.out.println("------------------------------------");
System.out.println(" Banco La Solución ");
System.out.println(" Sucursal Churchill ");
System.out.println("------------------------------------");
System.out.println("Cliente: Juana Mercedes ");
System.out.println("Cuenta a depositar: " + numerocuenta);
System.out.println("Monto a depositar: " + monto);
}
}
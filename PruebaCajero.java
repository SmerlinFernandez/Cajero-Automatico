package automaticoCajero;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Prueba {
public static void main (String[] args) {
//Declaramos variables a utilizar
Scanner l = new Scanner(System.in);
int q= 0;
boolean Salir= false;
//Instanciamos clases (CREAR OBJETOS)
Escanertarjeta d = new Escanertarjeta();
Transaccion t = new Transaccion();
Cuenta c = new Cuenta();
Retiro r = new Retiro();
CuentaCorriente cc = new CuentaCorriente();
TarjetaATM tatm = new TarjetaATM();
ATM atm = new ATM();
ClienteDelBanco cdb = new ClienteDelBanco();
ReciboDeposito rd = new ReciboDeposito();
CajeroAutomatico ca = new CajeroAutomatico();
//Nueva cuenta del banco
c.numerocuenta=1223;
c.Saldo=20000;
c.TipoCuenta=0;
cdb.setNombre("Rafael Rojas");
cdb.setNumero("829-708-6013");
cdb.setCorreo("jrrb18@gmail.com");
//Mostramos el nombre del banco
atm.Mostrar();
//Lee la tarjeta y lee el pin
d.LeerTarjeta();
d.ValidarPin();
System.out.println( "Bienvenid@ " + cdb.getNombre() + "\n");
//Menú de opciones
while(!Salir) {
System.out.println("Presione 1 para consultar balance");
System.out.println("Presione 2 para depositar");
System.out.println("Presione 3 para retiro");
System.out.println("Presione 4 para cambiar PIN");
System.out.println("Presione 5 para Salir");
try {
q=l.nextInt();
switch(q) {
case 1:
System.out.println("Su balance es " + c.getSaldo()+ "\n");
break;
case 2:
c.InicioTransaccion();
cc.Calcularinteres();
if(c.monto>c.Saldo) {
System.out.println("Balance Insuficiente");
}else {
c.ImprimirRecibo();
c.CalcularSaldo();
}
break;
case 3:
c.Retirocuenta();
if(c.retiro>c.Saldo) {
System.out.println("Balance Insuficiente");
}else {
c.Recibo();
c.setefectivo();
}
break;
case 4:
d.SetPIN();
d.ValidarPin();
break;
case 5:
Salir =true;
System.out.println("Gracias por preferir Banco La Solución");
}
}catch(InputMismatchException e) {
System.out.println("Solo ingrese numeros");
l.next();
}
}
}
}
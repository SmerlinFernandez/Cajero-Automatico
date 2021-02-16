package automaticoCajero;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Escanertarjeta extends TarjetaATM {
Scanner s =new Scanner(System.in);
String Aceptar = "";
int PIN = super.PIN;
void LeerTarjeta() {
System.out.println("Presione ENTER para verificar la tarjeta");
do{
 Aceptar = s.nextLine();
 System.out.println(Aceptar);
}
while(!Aceptar.equals(""));
System.out.println("Tarjeta Valida"+ "\n");
}
int ValidarPin() {
System.out.println("Ingrese su pin");
try {
PIN = s.nextInt();
do {
if (PIN != super.PIN) {
System.out.println("PIN INCORRECTO");
PIN = s.nextInt();
}
}while(PIN!= super.PIN);
}catch (InputMismatchException e) {
System.out.println("Solo números");
s.next();
}
return PIN;
}
void SetPIN() {
System.out.println("Ingrese el nuevo PIN");
super.PIN=s.nextInt();
}
}
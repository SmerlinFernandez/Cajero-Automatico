package automaticoCajero;
import java.util.Scanner;
public class TarjetaATM {
int PIN = 1224;
Scanner nn = new Scanner(System.in);
int GetPIN() {
return PIN;
}
void SetPIN() {
System.out.println("Ingrese el nuevo PIN");
PIN=nn.nextInt();
}
}
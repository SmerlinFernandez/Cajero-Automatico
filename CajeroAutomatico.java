package automaticoCajero;

public class CajeroAutomatico extends Cuenta{
private double Efectivo= 30000;
double getEfectivo() 
{
    return Efectivo;
}
void setefectivo() 
{
    Efectivo -= retiro;
    System.out.println("Efectivo restante del cajero: " + Efectivo);


}


}
package automaticoCajero;
public class CuentaCorriente extends Cuenta {
double TasaInteres= 0.01;
void Calcularinteres() {
if(TipoCuenta==0) {
TasaInteres*=Saldo;
}
}
}
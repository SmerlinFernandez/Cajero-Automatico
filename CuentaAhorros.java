package automaticoCajero;
public class CuentaAhorros extends Cuenta {
double TasaInteres= 0.2;
void Calcularinteres() {
if(TipoCuenta==1) {
TasaInteres*=Saldo;
}
}
}

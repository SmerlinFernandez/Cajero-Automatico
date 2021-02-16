package automaticoCajero;

public class ClienteDelBanco {
    private String NombreDelCliente="";
    private String Direccion ="";
    private String CorreoElectronico="";
    private String NumeroTelefonico ="";
    String getNombre();
    return NombreDelCliente;
}   
void setNombre(String NombreDelCliente) 
{
    this.NombreDelCliente=NombreDelCliente;
}
void setDireccion(String Direccion) 
{
    this.Direccion=Direccion;
}
void setCorreo(String CorreoElectronico) 
{
    this.CorreoElectronico= CorreoElectronico;
}
void setNumero(String NumeroTelefonico) 
{
    this.NumeroTelefonico = NumeroTelefonico;
}
String getDireccion() 
{
    return Direccion;
}
String getCorreo() 
{
    return CorreoElectronico;
}
String getNumero() 
{
    return NumeroTelefonico;
}
}
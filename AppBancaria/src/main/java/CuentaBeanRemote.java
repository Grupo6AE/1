public interface CuentaBeanRemote {
    String obtenerBalance(String cuenta);
    String depositarDinero(String cuenta, double cantidad);
    String retirarDinero(String cuenta, double cantidad);
}

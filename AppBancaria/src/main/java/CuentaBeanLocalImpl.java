public class CuentaBeanLocalImpl implements CuentaBeanLocal {
    @Override
    public String obtenerBalance(String cuenta) {
        // Implementa la lógica para obtener el balance de la cuenta
        // Retorna el resultado como una cadena
        return "El balance para la cuenta : " + cuenta + " es : 0.0";
    }

    @Override
    public String depositarDinero(String cuenta, double cantidad) {
        // Implementa la lógica para depositar dinero en la cuenta
        // Retorna un mensaje de confirmación
        return "Se depositó : " + cantidad + " en la cuenta : " + cuenta;
    }

    @Override
    public String retirarDinero(String cuenta, double cantidad) {
        // Implementa la lógica para retirar dinero de la cuenta
        // Retorna un mensaje de confirmación
        return "Se retiró : " + cantidad + " de la cuenta : " + cuenta;
    }
}

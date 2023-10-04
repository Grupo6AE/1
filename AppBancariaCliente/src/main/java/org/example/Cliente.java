package org.example;

import java.util.Arrays;

public class Cliente {

    private static CuentaBeanRemote cuentaBeanRemote;

    public static void main(String[] args) {
        // Realiza la conexión con el EJB CuentaBeanRemote
        // y ejecuta las operaciones

        var asList = Arrays.asList(cuentaBeanRemote.obtenerBalance("21333"), cuentaBeanRemote.depositarDinero("21333", 10000), cuentaBeanRemote.retirarDinero("21333", 8500));
        for (Object s : asList) System.out.println(s);
        System.out.println(cuentaBeanRemote.obtenerBalance("21333"));
    }

    public static void setCuentaBeanRemote(CuentaBeanRemote cuentaBeanRemote) {
        Cliente.cuentaBeanRemote = cuentaBeanRemote;
    }
}

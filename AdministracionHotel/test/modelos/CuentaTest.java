/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;


import controladoras.AdmCliente;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CARLOS
 */
public class CuentaTest {
    
       AdmCliente admCuenta = new AdmCliente();
       
    @Test
    
    public void siNoIngresoCorreoElectronicoMeDebeDarError(){
        assertFalse(admCuenta.verificarCorreo(null));
        System.out.println("Debe ingresar correo electronico");
    }  
    
    
}

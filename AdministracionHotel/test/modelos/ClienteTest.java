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
public class ClienteTest {
    
    AdmCliente cliente=new AdmCliente();
    
    @Test
    
    public void clienteSinCuenta(){
        assertEquals(0, cliente.getCuentas().size());
    }
    
    @Test
    
    public void clienteConUnaCuenta(){
        cliente.registrarCuenta("cvera@hotmail.com","car123","car123","Sheraton");
        assertEquals(1, cliente.getCuentas().size());
    }
    
    @Test 
    
    public void clienteConVariasCuentas(){
        cliente.registrarCuenta("lsanchez@hotmail.com","lui123","lui123","Inkamar");
        cliente.registrarCuenta("jrodriguez@hotmail.com","jua123","jua23","Marriot");
        cliente.registrarCuenta("cvera@hotmail.com","car123","car123","Andes");
        assertEquals(3, cliente.getCuentas().size());
    }
    
    @Test
    
    public void registrarCuentas(){
        assertEquals(0, cliente.getCuentas().size());
        cliente.registrarCuenta("cvera@hotmail.com","car123","car123","Sheraton");
        assertEquals(1, cliente.getCuentas().size());
        cliente.registrarCuenta("lsanchez@hotmail.com","lui123","lui123","Inkamar");
        cliente.registrarCuenta("jrodriguez@hotmail.com","jua123","jua23","Marriot");
        cliente.registrarCuenta("pmendoza@hotmail.com","pau123","pau123","Andes");
        assertEquals(4, cliente.getCuentas().size());
        try{
            cliente.registrarCuenta("jrodriguez@hotmail.com","jua123","jua23","Marriot");
            fail();
           }catch(Exception ex){
               assertEquals("CORREO ELECTRONICO YA REGISTRADO", ex.getMessage());
           }
    }
}

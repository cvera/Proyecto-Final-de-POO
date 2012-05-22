/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.Cuenta;

/**
 *
 * @author CARLOS
 */
public class AdmCliente {
    
    private ArrayList<Cuenta> cuentas;

    public AdmCliente() {
        cuentas=new ArrayList<Cuenta>();
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }
    
    public void registrarCuenta(String correo,String password,String repetirPassword,String nombreHotel){
        buscarCuenta(correo);
        
        for(Cuenta cuenta:cuentas){
            if(cuenta.getCorreo().equals(correo))
                throw new RuntimeException();
        }
        Cuenta cuenta=new Cuenta(correo, password, repetirPassword, nombreHotel);
        cuentas.add(cuenta);
    }
    
    private void buscarCuenta(String correo)throws RuntimeException{
        for(Cuenta cuenta:cuentas){
            if(cuenta.getCorreo().equals(correo))
                throw new RuntimeException("CORREO ELECTRONICO YA REGISTRADO");         
        }
    }
    
    
    
    public boolean verificarCorreo(String correo){
        if(correo!=null){
            return true;
        }
          return false;
    }
    
     public int getClientes(){
        return 0;
    }
}

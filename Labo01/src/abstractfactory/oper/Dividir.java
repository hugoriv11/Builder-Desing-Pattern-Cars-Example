/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.oper;

/**
 *
 * @author Toshiba
 */
public class Dividir implements Operaciones{

    @Override
    public double Operacion(double a, double b) {
        return a / b;//URGENTE hacer validacion cuando denominador es cero
    }
    
}

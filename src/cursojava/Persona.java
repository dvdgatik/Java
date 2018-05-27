/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;
import java.util.Date;

/**
 *
 * @author david
 */
public class Persona {
    protected int id;
    String Nombre;
    public String Apellidos;
    private Date fechaNac;
    private String numerolicencia;
    
    public String getNumeroLicencia() {
        return numerolicencia;
    }
    
    private void setNumeroLicencia(String numerolicencia) {
        this.numerolicencia = numerolicencia;
    }
}
// Una clase hijo podra hacer uso de los atributos de la clase padre Persona

/*Modificadores de acceso
son palabras clave que se usan para especificar la accesibilidad 
declarada de un miembro o un tipo.
Existen cuatro tipos de modificadores de acceso:
Private: cualquier atributo o metodo que tenga este modificador solo podra ser
accedido dentro de la misma clase
Public: Podra ser accedido desde cualquier clase
Protected: parecido a private la diferencia es que solo podra ser accedido por
clases hijas o por clases que se encuentren dentro del mismo paquete
Default: Solo podra ser accedido por clases que se encuentren dentro del mismo paquete

Este termino esta relacionado al encapsulamiento porque el encapsulamiento lo que
trata es ocultar de diferentes formas los accesos a los atributos de una clase

la forma de acceder a ellos es a traves de  sus metodos para dicho objeto
Set dar valor a una variable con un cierto grado de visibilidad
Get obtener valor con un cierto grado de visibilidad
*/
/*
 Actividad práctica obligatoria
Grupos separados: Comision 2110
 Crear un programa en java en el cual se pida al usuario ingresar su nombre, apellido, edad, hobbie, editor de código preferido, sistema operativo que utiliza, luego deberá mostrarse por consola los datos ingresados.
El programa deber ser subido a un repositorio de GitHub, pegar el link del ejercicio resuelto en el siguiente recuadro
 */
package unidad2;

/**
 *
 * @author Brigitte
 */
public class Unidad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Datos datos = new Datos();
          String entrada="";
          entrada=datos.ingresarDatos();
          datos.mostrarPorConsola(entrada);
          
    }
    
}

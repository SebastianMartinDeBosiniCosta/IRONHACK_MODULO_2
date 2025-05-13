public class Estudiante {

        /* - - - - - - - - - - ATRIBUTOS DE LA CLASE ESTUDIANTE - - - - - - - - - - */
    // Declaración de Atributos
    String nombre, apellido;
    int edad;


        /* - - - - - - - - - - MÉTODOS DE LA CLASE ESTUDIANTE - - - - - - - - - - */

    // Método Constructor
    public Estudiante(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Método para mostrar información del Estudiante
    public void mostrarDatos() {
        System.out.println("Te llamas " + this.nombre + " " + this.apellido + " y tienes " + this.edad + " años. Bienvenid@ a Ironhack!");
    }
}

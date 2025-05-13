// Importación de la Clase ArrayList
import java.util.ArrayList;

// Importación de la Clase List
import java.util.List;

// Importación de la Clase Scanner
import java.util.Scanner;

public class App {

        /* - - - - - - - - - - INICIO DE EJECUCIÓN DEL PROGRAMA - - - - - - - - - - */
    public static void main(String[] args) throws Exception {
        // Declaración de la variable de control del proceso de registro de los nuevos estudiantes (bucle Do..While) 
        char bandera = 's';
        // String bandera = "s";
        
        //Declaración de Libro de Registro de los estudiantes (ArrayList)
        List <Estudiante> registroEstudiantes =  new ArrayList<>();

        // Instanciación de la Clase Scanner -> Creación del objeto teclado
        Scanner teclado = new Scanner(System.in);

        // Creación del Registro de cada Estudiante y Captura de sus datos
        do {
            
        // Captura de los datos del Estudiante     
        System.out.print("Ingresa tu nombre: \t");
        String nombre = teclado.nextLine();
        System.out.println("");     // Salida utilizada sólo para generar salto de línea

        System.out.print("Ingresa tu apellido: \t");
        String apellido = teclado.nextLine();
        System.out.println("");     // Salida utilizada sólo para generar salto de línea

        System.out.print("Ingresa tu edad: \t");
        int edad = teclado.nextInt();
        teclado.nextLine();     // Limpieza del Buffer
        System.out.println("");     // Salida utilizada sólo para generar salto de línea


        // Creación de un nuevo Registro con los datos ingresados e incorporación al Libro de Registros
        registroEstudiantes.add(new Estudiante(nombre, apellido, edad)); 

        // Solicitud de Confirmación de Continuidad 
        System.out.print("¿Deseas continuar? Ingresa 's' (SI) o 'n' (NO): \t");
        bandera = teclado.next().charAt(0);
        teclado.nextLine();     // Limpieza del Buffer
        bandera = Character.toLowerCase(bandera);
        System.out.println(" - - - - - - - - - - - - - - - - - - \n");     // Salida utilizada sólo para generar salto de línea

        } while(bandera == 's');   // Verificación de la Condición de Continuidad del proceso

        System.out.println("-- Fin del Proceso de Registro --");

        // Selección del registro de un estudiante
        System.out.println("Existen " + registroEstudiantes.size() + " estudiantes registrados. ¿De cuál de ellos quieres ver la información?");
        System.out.println("Ingresa '1' para el primero... '2' para el segundo... etc");
        int indice = teclado.nextInt();
        teclado.nextLine();

        // Impresión por consola de los datos del estudiante seleccionado
        registroEstudiantes.get(indice-1).mostrarDatos();

        // Ciere del Objeto teclado
        teclado.close();
    };
}

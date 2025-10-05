import java.util.Scanner;

public class calculadora_de_edad {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar y leer el nombre del usuario
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        // Solicitar y leer el año de nacimiento
        System.out.print("Ahora, ingresa tu año de nacimiento: ");
        int añoNacimiento = scanner.nextInt();

        // Calcular la edad aproximada (usando 2025 como año actual)
        int añoActual = 2025;
        int edad = añoActual - añoNacimiento;

        // Mostrar el resultado
        System.out.println("Hola " + nombre + ", tu edad aproximada es: " + edad + " años.");

        // Cerrar el scanner
        scanner.close();
    }
}

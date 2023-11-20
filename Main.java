package juguete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manejadora manejadora = new Manejadora();

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Desea ingresar un Peluche (P) o una Figura de Acción (F)?");
        String opcion = scanner.nextLine().toUpperCase();

        if (opcion.equals("P")) {
            System.out.println("\nIngrese los datos para el Peluche:");
            System.out.print("Código: ");
            int codigoPeluche = scanner.nextInt();
            scanner.nextLine();  
            System.out.print("Nombre: ");
            String nombrePeluche = scanner.nextLine();
            System.out.print("Precio: ");
            double precioPeluche = scanner.nextDouble();
            scanner.nextLine();  
            System.out.print("Tipo de Peluche: ");
            String tipoPeluche = scanner.nextLine();
            System.out.print("Color: ");
            String colorPeluche = scanner.nextLine();

            Peluche peluche = new Peluche(codigoPeluche, nombrePeluche, precioPeluche, tipoPeluche, colorPeluche);
            manejadora.agregarPeluche(peluche);

            System.out.println("\nInformación del Peluche ingresado:");
            manejadora.mostrarInformacionPeluches();
        } else if (opcion.equals("F")) {
            System.out.println("\nIngrese los datos para la Figura de Acción:");
            System.out.print("Código: ");
            int codigoFiguraAccion = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Nombre: ");
            String nombreFiguraAccion = scanner.nextLine();
            System.out.print("Precio: ");
            double precioFiguraAccion = scanner.nextDouble();
            scanner.nextLine();  
            System.out.print("Personaje: ");
            String personajeFiguraAccion = scanner.nextLine();
            System.out.print("Material: ");
            String materialFiguraAccion = scanner.nextLine();

            FiguraAccion figuraAccion = new FiguraAccion(codigoFiguraAccion, nombreFiguraAccion, precioFiguraAccion, personajeFiguraAccion, materialFiguraAccion);
            manejadora.agregarFiguraAccion(figuraAccion);

            System.out.println("\nInformación de la Figura de Acción ingresada:");
            manejadora.mostrarInformacionFigurasAccion();
        } else {
            System.out.println("Opción no válida.");
        }
    }
}

package Proyecto02;
public class Alquiler_peliculas {
  
   public static void main(String[] args) {
        Scanner entradaEscaner = new Scanner(System.in);


        System.out.println("***Bienvenido***");


        int opcion;
        String usuario;
        String  pelicula;
        String  comentario;

            System.out.println("Ingrese su nombre:");
            usuario = entradaEscaner.nextLine();

            System.out.println("MENÚ" +
                        "\n1: Listado de peliculas. " +
                        "\n2: Alquilar peliculas." +
                        "\n3: Dejar un comentario." +
                        "\n4: Salir");

            System.out.println("Opción a elegir...");
            opcion = entradaEscaner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Lista de peliculas:\n"
                            + "Black Panther: Wakanda Forever\n"
                            + "Enola Holmes: 2\n"
                            + "La ciudad perdida.");
                    break;
                case 2:
                    System.out.println("Alquilar peliculas.");
                    System.out.println("Ingrese pelicula que desea alquilar:");
                    pelicula = entradaEscaner.nextLine();
                    break;
                case 3:
                    System.out.println("COMENTARIO:");
                    comentario = entradaEscaner.nextLine();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Se esperaba otro tipo de dato.");
                    break;
            }
    }
}

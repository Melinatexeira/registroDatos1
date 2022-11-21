package Proyecto02;
public class Registro_persona {
      public static void main(String[] args) {

        System.out.println("**** MENÚ ****");
        Scanner entradaEscaner = new Scanner(System.in);

        String fname, lname;


        System.out.println("Ingrese nombre:");
        fname = entradaEscaner.nextLine();
        System.out.println("Ingrese apellido:");
        lname = entradaEscaner.nextLine();

        System.out.println("Ingrese edad:");
        int age = entradaEscaner.nextInt();

        if (age >= 18) {
            System.out.println(fname + " " + lname + " " + ": Puede pasar a la fiesta. ¡Diviértase!");

        } else {
            System.out.println(fname + " " + lname + " " + " : ¡Usted es menor de edad, no tiene el acceso permitido!");
        }
    }
}
}

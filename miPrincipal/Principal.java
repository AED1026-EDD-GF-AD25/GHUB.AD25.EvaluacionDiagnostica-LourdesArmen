package miPrincipal;

public class Principal {
   

    public static void main(String[] args) {
        int opc =0;
        do{ 
          menu();
        } while (opc != 0);
      
    }

    public static void menu(){
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. Agregar");
        System.out.println("2. Buscar por Autor");
        System.out.println("3. Mostrar todos");
        System.out.println();
        System.out.println("0. Salir");
        System.out.print("Seleccion la opción:");
    }
}
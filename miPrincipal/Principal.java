package miPrincipal;
import java.util.Scanner;
public class Principal {
    static Scanner  entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int opc =0;
        String titulo,autor;
        int anio;
        InventarioLibros inventarioLibros = new InventarioLibros();
        Libro libro;
        do{ 
          menu();
          opc = entrada.nextInt();
          entrada.nextLine(); //limpia el scanner
          switch(opc){
            case 0:
                System.out.println("Hasta luego!");
                return;
            case 1:
                System.out.print("Proporciona Titulo:");
                titulo = entrada.nextLine();
                System.out.print("Proporciona Autor:");
                autor = entrada.nextLine();
                System.out.print("Proporciona Año de Publicación:");
                anio  = entrada.nextInt();
                //creando una instancia de Libro;
                libro = new Libro(titulo,autor,anio);
                //invocar al metodo agregar
                inventarioLibros.agregar(libro);
                break;
            case 2:
                System.out.print("Proporciona Autor:");
                autor = entrada.nextLine();
                Libro listaBuscada[];
                listaBuscada = inventarioLibros.buscar(autor);
                
                for (int i=0;i<listaBuscada.length;i++){
                    if (listaBuscada[i] != null)
                       System.out.println(listaBuscada[i]);
                }
                break;
                

            case 3:
               inventarioLibros.mostrar();
               break;
            default:
               System.out.println("Opción inválida, intente de nuevo");
          }
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
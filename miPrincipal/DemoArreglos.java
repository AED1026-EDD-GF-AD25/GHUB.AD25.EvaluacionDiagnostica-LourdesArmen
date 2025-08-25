package miPrincipal;
public class DemoArreglos{
    public static void main(String[] args) {
        //declarar un arreglo de enteros
        int arregloEntero[];
        arregloEntero = new int[3]; 

        short []arregloShort;
        arregloShort = new short[5];

        long arregloLargo[] = new long[3];

        //declaramos un arreglo de String
        String[] arregloCadenas = new String[5];

        //declaramos un arreglo de dobles
        double[] arregloDobles;
        arregloDobles = new double[2];

        //declaramos un arreglo de libros
        Libro [] arregloLibros;
        arregloLibros = new Libro[10];


        System.out.println("Muestro el arreglo de Enteros:");
        System.out.println(arregloEntero[0]);
        System.out.println(arregloEntero[1]);
        System.out.println(arregloEntero[2]);

        System.out.println("Mostar el arreglo de short:");
        for(int i=0;i<5;i++){
            System.out.println(arregloShort[i]);
        }

        System.out.println("Mostar el arreglo de largos");
        int i=0;
        do{
            System.out.println(arregloLargo[i]);
            i++;

        }while (i<3);

        System.out.println("Arreglo de Cadenas");
        for( i=0; i<arregloCadenas.length;i++){
            System.out.println(arregloCadenas[i]);
        }

        //crear lo libros para ingresarlo al libros
        Libro libro = new Libro();
        arregloLibros[0]= libro;
        arregloLibros[1]= new Libro("Cien Años de Soledad","Gabriel Garcia Marquez",1989);
        arregloLibros[2]= new Libro("La Rebelion de la Granja","George Orwell",1945);
        arregloLibros[3]= libro;
        arregloLibros[4]= libro;
        arregloLibros[5]= new Libro();
        arregloLibros[6]= new Libro();
        arregloLibros[7]= new Libro();
        arregloLibros[8]= new Libro();
        arregloLibros[9]= new Libro();

        System.out.println("Arreglo de Libros:");
        for(i=0;i<arregloLibros.length;i++){
            System.out.println(arregloLibros[i].toString());
            System.out.println("Autor: "+arregloLibros[i].getAutor()+" Titulo:"+arregloLibros[i].getTitulo());
        }




        
    }
}
package miPrincipal;
public class InventarioLibros{
    Libro[] libros; //arreglo de libros
    int contador; //contar los libros que voy agregando
    //constructores vacio
    public InventarioLibros(){
        libros = new Libro[2];
        contador = 0;
    }

    //Métodos personalizados
    //agregar un libro a la lista
    public void agregar(Libro libro){
        if (contador<libros.length){
            libros[contador++] = libro;

        }
        else{
            Libro librosTemp[] = new Libro[libros.length*2];
            for(int i=0; i<libros.length;i++){
                librosTemp[i]= libros[i];

            }
            libros = librosTemp;
            libros[contador++] = libro;
        }

        
    }
    //buscar un libro en la lista por autor
    //si lo encuentra regresa el libro buscado
    //si no regresa null
    public Libro[] buscar(String autor){
        Libro listaBuscada[] = new Libro[libros.length];
        int cont = 0;
        for(int i=0;i<contador;i++){
            if(libros[i].getAutor().equalsIgnoreCase(autor)){
                listaBuscada[cont]=libros[i];
                cont++;

            }
        }
        
        
        return listaBuscada;

    }
    //muestra la lista completa de libros
    public void mostrar(){
        for (int i=0;i<contador;i++){
            System.out.println(libros[i].toString());
        }

    }

}
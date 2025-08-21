package miPrincipal;
public class Libro{
    //definir atributos
    private String titulo;
    private String autor;
    private int anio;
    //constructores
    //Vacio
    public Libro(){
        this.titulo = "No definido";
        this.autor = "No definido";
        this.anio = 0;
    }
    //lleno
    public Libro(String titulo, String autor, int anio){
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;

    }
    //getter y setter
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getAnio(){
        return this.anio;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }

    //sobrescribir metodos
    @Override
    public String toString(){
        return "Libro: "+this.titulo+", "+this.autor+", "+this.anio;
    }



}
package alberto.cano.a06recicler.modelos;

import java.io.Serializable;
import java.time.LocalDate;

public class ToDo implements Serializable {
    private  String titulo;
    private String contenido;

    private  boolean complementado;
    private LocalDate fecha;

    public ToDo(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.complementado = false;
        this.fecha = LocalDate.now();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public boolean isComplementado() {
        return complementado;
    }

    public void setComplementado(boolean complementado) {
        this.complementado = complementado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "titulo='" + titulo + '\'' +
                ", contenido='" + contenido + '\'' +
                ", complementado=" + complementado +
                ", fecha=" + fecha +
                '}';
    }
}

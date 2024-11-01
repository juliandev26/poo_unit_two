package uni1a;

import java.time.LocalDate;

public class VideoBlog extends ContenidoAudiovisual {
  private String url;
  private String creador;
  private LocalDate fechaPublicacion;

  // Constructor
  public VideoBlog(String titulo, int duracion, String genero, String url, String creador, LocalDate fechaPublicacion) {
    super(titulo, duracion, genero);
    this.url = url;
    this.creador = creador;
    this.fechaPublicacion = fechaPublicacion;
  }

  // Métodos getter y setter
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getCreador() {
    return creador;
  }

  public void setCreador(String creador) {
    this.creador = creador;
  }

  public LocalDate getFechaPublicacion() {
    return fechaPublicacion;
  }

  public void setFechaPublicacion(LocalDate fechaPublicacion) {
    this.fechaPublicacion = fechaPublicacion;
  }

  @Override
  public String toString() {
    return "Creador: " + creador + ", \nPublicado el: " + fechaPublicacion + ", \nUrl: " + url;
  }

  @Override
  public void mostrarDetalles() {
    System.out.println("Detalles del VideoBlog:");
    System.out.println("ID: " + getId());
    System.out.println("Título: " + getTitulo());
    System.out.println("Duración en minutos: " + getDuracionEnMinutos());
    System.out.println("Género: " + getGenero());
    System.out.println(toString());
    System.out.println();
  }
}

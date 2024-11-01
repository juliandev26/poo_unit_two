package uni1a;

public class Tutorial extends ContenidoAudiovisual {
  private String autor;
  private String plataforma;

  // Constructor
  public Tutorial(String titulo, String genero, String autor, int duracion, String plataforma) {
    super(titulo, duracion, genero);
    this.autor = autor;
    this.plataforma = plataforma;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getPlataforma() {
    return plataforma;
  }

  public void setPlataforma(String plataforma) {
    this.plataforma = plataforma;
  }

  @Override
  public String toString() {
    return "Autor: " + autor + ", \nPlataforma: " + plataforma;
  }

  @Override
  public void mostrarDetalles() {
    System.out.println("Detalles del Tutorial:");
    System.out.println("ID: " + getId());
    System.out.println("Título: " + getTitulo());
    System.out.println("Duración en minutos: " + getDuracionEnMinutos());
    System.out.println("Género: " + getGenero());
    System.out.println(toString());
    System.out.println();
  }
}

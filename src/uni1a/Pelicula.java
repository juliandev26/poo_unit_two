/**
 * Class Pelicula
 */
package uni1a;

import java.util.List;

// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
  private String estudio;
  private List<Actor> actors;

  public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio, List<Actor> actors) {
    super(titulo, duracionEnMinutos, genero);
    this.estudio = estudio;
    this.actors = actors;
  }

  public String getEstudio() {
    return estudio;
  }

  public void setEstudio(String estudio) {
    this.estudio = estudio;
  }

  @Override
  public void mostrarDetalles() {
    System.out.println("Detalles de la película:");
    System.out.println("ID: " + getId());
    System.out.println("Título: " + getTitulo());
    System.out.println("Duración en minutos: " + getDuracionEnMinutos());
    System.out.println("Género: " + getGenero());
    System.out.println("Estudio: " + estudio);
    mostrarActores();
    System.out.println();
  }

  public void mostrarActores() {
    System.out.println("Actores: ");
    for (Actor actor : actors) {
      System.out.println(actor.getFullName());
    }
  }
}
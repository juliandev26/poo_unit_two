/**
 * Class SerieDeTV
 */
package uni1a;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
  private int temporadas;
  private Temporada temporada;

  public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas, Temporada temporada) {
    super(titulo, duracionEnMinutos, genero);
    this.temporadas = temporadas;
    this.temporada = temporada;
  }

  public int getTemporadas() {
    return temporadas;
  }

  public void setTemporadas(int temporadas) {
    this.temporadas = temporadas;
  }

  @Override
  public void mostrarDetalles() {
    System.out.println("Detalles de la serie:");
    System.out.println("ID: " + getId());
    System.out.println("Título: " + getTitulo());
    System.out.println("Duración en minutos: " + getDuracionEnMinutos());
    System.out.println("Género: " + getGenero());
    System.out.println("Temporadas: " + this.temporadas);
    mostrarTemporadaActual();
    System.out.println();
  }

  public void mostrarTemporadaActual() {
    System.out.println("Detalles de la temporada: ");
    System.out.println(temporada.getSeason());
  }
}
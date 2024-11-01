/**
 * Class Documental
 */
package uni1a;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
  private String tema;
  private Investigador investigador;

  public Documental(String titulo, int duracionEnMinutos, String genero, String tema, String nombreInvestigador,
      String especialidad) {
    super(titulo, duracionEnMinutos, genero);
    this.tema = tema;
    this.investigador = new Investigador(nombreInvestigador, especialidad);
  }

  public String getTema() {
    return tema;
  }

  public void setTema(String tema) {
    this.tema = tema;
  }

  public Investigador getInvestigador() {
    return investigador;
  }

  @Override
  public void mostrarDetalles() {
    System.out.println("Detalles del documental:");
    System.out.println("ID: " + getId());
    System.out.println("Título: " + getTitulo());
    System.out.println("Duración en minutos: " + getDuracionEnMinutos());
    System.out.println("Género: " + getGenero());
    System.out.println("Tema: " + this.tema);
    System.out.println(investigador.toString());
    System.out.println();
  }

}
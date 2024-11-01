package uni1a;

// Clase Investigador
public class Investigador {
  private String nombre;
  private String especialidad;

  public Investigador(String nombre, String especialidad) {
    this.nombre = nombre;
    this.especialidad = especialidad;
  }

  public String getNombre() {
    return nombre;
  }

  public String getEspecialidad() {
    return especialidad;
  }

  @Override
  public String toString() {
    return "Investigador: " + nombre + ", Especialidad: " + especialidad;
  }
}
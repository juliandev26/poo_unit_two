package uni1a;

public class Investigador {
  private String name;
  private String lastName;

  public Investigador(String name, String lastName) {
    super();
    this.name = name;
    this.lastName = lastName;
  }

  public String getName() {
    return name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFullName() {
    return "Investigador: " + getName() + getLastName();
  }
}

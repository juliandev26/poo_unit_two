package poo;

import java.util.ArrayList;
import java.util.List;

import uni1a.Actor;
import uni1a.ContenidoAudiovisual;
import uni1a.Documental;
import uni1a.Pelicula;
import uni1a.SerieDeTV;

public class PruebaAudioVisual {
  public static void main(String[] args) {
    System.out.println("Hello from Eclipse!");

    List<Actor> actors = new ArrayList<Actor>();
    actors.add(new Actor("Sam", "Worthington"));
    actors.add(new Actor("Zoe", "Saldaña"));

    // Crear instancias de las subclases
    ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[3];
    contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios", actors);
    contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
    contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy");

    // Mostrar los detalles de cada contenido audiovisual
    for (ContenidoAudiovisual contenido : contenidos) {
      contenido.mostrarDetalles();
    }
  }
}
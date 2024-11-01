package poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import uni1a.Actor;
import uni1a.ContenidoAudiovisual;
import uni1a.Documental;
import uni1a.Pelicula;
import uni1a.SerieDeTV;
import uni1a.Temporada;
import uni1a.Tutorial;
import uni1a.VideoBlog;

public class PruebaAudioVisual {
  public static void main(String[] args) {
    System.out.println("Hello from Eclipse!");

    // Listado de actores para la pelicula.
    List<Actor> actors = new ArrayList<Actor>();
    actors.add(new Actor("Sam", "Worthington"));
    actors.add(new Actor("Zoe", "Saldaña"));

    // Temporada para la serie de tv.
    Temporada temporada = new Temporada(5, 10);

    // Crear instancias de las subclases
    ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
    contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios", actors);
    contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8, temporada);
    contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy", "National Geographic", "Leader to the stars");
    contenidos[3] = new Tutorial("Curso Next Js para Producción", "Programación", "Devtalles", 10000, "Udemy");
    contenidos[4] = new VideoBlog("Las 7 MARAVILLAS DEL MUNDO", 20, "Turismo",
        "https://www.youtube.com/watch?v=fePHLgOJ2iY", "LuisitoComunica", LocalDate.of(2022, 8, 15));
    // Mostrar los detalles de cada contenido audiovisual
    for (ContenidoAudiovisual contenido : contenidos) {
      contenido.mostrarDetalles();
    }
  }
}
package uni1a;

public class Temporada {
  private int seasonNumber;
  private int episodes;

  public Temporada(int seasonNumber, int episodes) {
    super();
    this.seasonNumber = seasonNumber;
    this.episodes = episodes;
  }

  public int getEpisodes() {
    return episodes;
  }

  public int getSessionNumber() {
    return seasonNumber;
  }

  public void setEpisodes(int episodes) {
    this.episodes = episodes;
  }

  public void setSessionNumber(int sessionNumber) {
    this.seasonNumber = sessionNumber;
  }

  public String getSeason() {
    return "Temporada: " + getSeason() + ", Episodios: " + getEpisodes();
  }
}

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

  public int getSeasonNumber() {
    return seasonNumber;
  }

  public void setEpisodes(int episodes) {
    this.episodes = episodes;
  }

  public void setSeasonNumber(int SeasonNumber) {
    this.seasonNumber = SeasonNumber;
  }

  public String getSeason() {
    return "Temporada: " + getSeasonNumber() + ", Episodios: " + getEpisodes();
  }
}

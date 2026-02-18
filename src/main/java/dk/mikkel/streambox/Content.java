package dk.mikkel.streambox;

public class Content {

    private final int id;
    private static int nextId = 1;
    private final String title;
    private final Genre genre;
    private final int lengthMinutes;
    private final int ageRating;
    private int views;

    public Content(String title, Genre genre, int lengthMinutes, int ageRating) {
        this.id = nextId++;
        this.title = title;
        this.genre = genre;
        this.lengthMinutes = lengthMinutes;
        this.ageRating = ageRating;
        this.views = 0;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getLengthMinutes() {
        return lengthMinutes;
    }

    public int getAgeRating() {
        return ageRating;
    }

    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }

    public void incrementViews() {
        setViews(getViews() + 1);
        // bevidst tomt: så tests kan fejle
    }
}

package day31_Constructors.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String country, title, genre, releaseDate, director;
    public ArrayList<String> casts = new ArrayList<>();

    public Movie(String country, String title, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
    }
    public void addCast(String newCast){
        casts.add(newCast);
    }
    public void addCasts(String[] newCasts){
        casts.addAll(Arrays.asList(newCasts));
    }

    @Override
    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", total number of casts= " + casts.size() +
                '}';
    }
}

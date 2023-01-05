package day31_Constructors.Practice;



public class MovieObject {
    public static void main(String[] args) {
        Movie movie1 = new Movie("USA", "Journey to SDET: Cydeo Batch 25", "10/25/2021", "Kuzzat Altay");
        movie1.genre = "Adventure, Comedy, Thriller";
        movie1.addCast("Asiya");
        movie1.addCast("Muhtar");
        movie1.addCast("Adam");
        movie1.addCast("Akica");

        System.out.println(movie1);

    }
}

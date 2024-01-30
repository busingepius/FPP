/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 26/01/2024
 * Time : 06:47
 * Project Name : practice
 */
package practice;

import java.util.*;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10, Genre.THRILLER),
                new Movie("b", 20, Genre.ACTION),
                new Movie("c", 30, Genre.COMEDY)
        );

        // predicate
//        Stream<Movie> filteredList = movies.stream().filter(movie -> movie.getGenre() == Genre.COMEDY);
//        for (Movie movie : filteredList.toList()) {
//            System.out.println(movie);
//        }

//        // From collection
//        Collection<Integer> collection = new ArrayList<Integer>();
////        List<Integer> collection = new ArrayList<Integer>();
//        Stream<Integer> stream = collection.stream();

//        // arrays
//        String[] array = {"a","b","c"};
//        Stream<String> stream = Arrays.stream(array);

//        // arbitrary
//        Stream<Integer> stream = Stream.of(1,2,3);

//        // infinite
//        Stream<Integer> stream = Stream.generate(()-> (int) Math.random());

//        Stream<Movie> stream = movies.stream()
//                .map(movie->new Movie(movie.getTitle(),movie.getLikes(),Genre.COMEDY));
//        for(Movie movie: stream.toList()){
//            System.out.println(movie);
//        }

//        Stream<Movie> stream = movies.stream()
//                .filter(movie -> movie.getLikes() > 5);
//        for(Movie movie:stream.toList()){
//            System.out.println(movie);
//        }

//        Stream<Movie> stream = movies.stream()
//                .limit(2);
//        for (Movie movie : stream.toList()) {
//            System.out.println(movie);
//        }

//        Stream<Movie> stream = movies.stream()
//                .skip(2);
//        for (Movie movie : stream.toList()) {
//            System.out.println(movie);
//        }

        // stops when it is false
//        Stream<Movie> stream = movies.stream()
//                .takeWhile(movie -> movie.getLikes() > 9);
//        for (Movie movie : stream.toList()) {
//            System.out.println(movie);
//        }

        double a = 0.7;
        double b = 0.9;
        double x = a + 0.1;
        double y = b - 0.1;
//        System.out.println(x == y);
        int r = -4 >> 3 ;
        var s = "This is a man's. With a top.".split(" |\\. |\\.");
        System.out.println(Arrays.toString(s));
        System.out.println(Integer.toBinaryString(r));

        System.out.println(countDown(3));
        reverse("axe");


    }
    static int countDown(int n){
        if(n <= 0) {
            return 0;
        }
        return 1+ countDown(n - 1);
    }
    static void reverse(String s){
        if(s==null || s.isEmpty()){
            return;
        }
        reverse(s.substring(1));
        System.out.println(s.charAt(0));
    }


}

enum Genre {COMEDY, ACTION, THRILLER}

class Movie {
    private String title;
    private int likes;
    private Genre genre;

    public Movie(String title, int likes, Genre genre) {
        this.title = title;
        this.likes = likes;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    // toString
    @Override
    public String toString() {
        return "Movie{title: " + title + ", likes: " + likes + ", genre: " + genre + "}";
    }

    // equals
    @Override
    public boolean equals(Object object) {

        if (object == this) return true;
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Movie movie = (Movie) object;
        return likes == movie.getLikes()
                &&
                Objects.equals(title, movie.getTitle())
                &&
                Objects.equals(genre, movie.getGenre());
    }

    // hashCode
    @Override
    public int hashCode() {
        return Objects.hash(title, likes, genre);
    }
}
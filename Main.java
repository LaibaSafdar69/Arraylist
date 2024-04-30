
import java.util.ArrayList;
    public class Main {
        public static void main(String[] args) {
            ArrayList<Movie> movies = new ArrayList<>();
            System.out.println(movies.isEmpty());

            movies.add(new Movie("Harry Potter and Philosopher stone", 3, 2001, "Fiction"));
            movies.add(new Movie("Harry Potter and The Chamber of Secrets", 2, 2003, "Fiction"));
            movies.add(new Movie("Harry Potter and Prisoner of Azkaben", 1, 2006, "Fiction"));
            System.out.println(movies.size());
            System.out.println(movies.isEmpty());
            for(Movie temp:movies)
                System.out.println(temp);

            //movies.remove(new Movie("Harry Potter and The Chamber of Secrets", "Second", 2003, "Fiction"));
            System.out.println("Remove");
            movies.remove(1);
            System.out.println(movies.size());
            for(Movie temp:movies)
                System.out.println(temp);
            System.out.println("Updation");
            movies.set(0,new Movie("Enola Holmes",4,2022,"Thriller"));
            for(Movie temp:movies)
                System.out.println(temp);

            for(Movie temp:movies)
                temp.setRanking(temp.getRanking()+1);

            System.out.println("Ranking incremented");
            for(Movie temp:movies)
                System.out.println(temp);

            System.out.println("Index is:"+movies.indexOf(new Movie("Harry Potter and Prisoner of Azkaben", 1, 2006, "Fiction")));

        }

    }



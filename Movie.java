import java.util.Objects;

public class Movie {

        String title;
        float ranking;
        int Releasedate;
        String Genre;

        public Movie() {
        }

        public Movie(String title, float ranking, int releasedate, String genre) {
            this.title = title;
            this.ranking = ranking;
            Releasedate = releasedate;
            Genre = genre;
        }

        public String getTitle() {
            return title;
        }

        public float getRanking() {
            return ranking;
        }

        public int getReleasedate() {
            return Releasedate;
        }

        public String getGenre() {
            return Genre;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setRanking(float ranking) {
            this.ranking = ranking;
        }

        public void setReleasedate(int releasedate) {
            Releasedate = releasedate;
        }

        public void setGenre(String genre) {
            Genre = genre;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Movie movie = (Movie) o;
            return Objects.equals(title, movie.title);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(title);
        }

        @Override
        public String toString() {
            return "Movie:[" +
                    "Title='" + title + '\'' +
                    ", Ranking='" + ranking + '\'' +
                    ", Releasedate=" + Releasedate +
                    ", Genre='" + Genre + '\'' +
                    ']';
        }
    }



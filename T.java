import java.util.Objects;

public class T {
    String g;
    int n;

    public T(String g,int n) {
        this.g = g;
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getG() {
        return g;
    }

    public void setG(String g) {
        this.g = g;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        T t = (T) o;
        return n == t.n && Objects.equals(g, t.g);
    }

    @Override
    public int hashCode() {
        return Objects.hash(g, n);
    }
}

import java.util.Objects;

public class Cat {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return name.equals(cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
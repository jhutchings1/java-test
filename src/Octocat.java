import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Octocat implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;

    public Octocat(String name) {
        this.name = name;
    }

    public void dance() {
        System.out.println("My name is " + this.name + " and I'm doing a dance!");
    }
    
    public static Octocat deserializeOctocat(InputStream stream) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(stream)) {
            return (Octocat) in.readObject();
        }
    }
}

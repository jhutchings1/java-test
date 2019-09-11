import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Octocat {
	private String name;
	
	public Octocat(String name) {
		this.name = name;
	}
	
	public void dance() {
		System.out.println("My name is " + this.name + " and I'm doing a dance!");
	}
}

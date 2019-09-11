import java.net.ServerSocket;
import java.net.Socket;

public class OctocatManager {

    public static void main (String[] args) throws Exception {
        try (ServerSocket serverSocket = new ServerSocket(1234)){
            Socket socket = serverSocket.accept();
            Octocat mona = Octocat.deserializeOctocat(socket.getInputStream());
            
            mona.dance();
        }
    }
}

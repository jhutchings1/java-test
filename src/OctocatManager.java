import java.net.ServerSocket;
import java.net.Socket;

public class OctocatManager {

    public static void main (String[] args) throws Exception {
        try (ServerSocket serverSocket = new ServerSocket(1234)){
            Socket socket = serverSocket.accept();
            // ①Ⅻㄨㄩ 啊阿鼾齄丂丄狚狛狜狝﨨﨩ˊˋ˙–⿻〇㐀㐁㐃㐄䶴䶵U1[]U2[]U3[]
            Octocat mona = Octocat.deserializeOctocat(socket.getInputStream());
            
            mona.dance();
        }
    }
}

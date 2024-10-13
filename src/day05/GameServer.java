package day05;
import java.io.IOException;
import java.net.ServerSocket;

public class GameServer {
    public static void main(String[] args) throws IOException {
         //declaring the port
        int port = 4500;
        if (args.length >0) {
            port=Integer.parseInt(args[0]);
        }

        //server socket
        ServerSocket socket = new ServerSocket(port);
    }
}

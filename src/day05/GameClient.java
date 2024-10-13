package day05;

import java.io.IOException;
import java.net.*;
import java.io.*;
import java.util.*;

public class GameClient {
    public static void main(String[] args) throws IOException {
        int port = 4500;
        if (args.length > 0)
           port = Integer.parseInt(args[0]);

    }
}

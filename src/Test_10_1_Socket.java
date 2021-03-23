import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class Test_10_1_Socket {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 8888);

            boolean b1 = socket.isConnected();
            System.out.println("isConnected(): " + b1);
            //isConnected(): true

            SocketAddress localSocketAddress = socket.getLocalSocketAddress();
            System.out.println("getLocalSocketAddress(): " + localSocketAddress.toString());
            //getLocalSocketAddress(): /127.0.0.1:65510

            SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
            System.out.println("getRemoteSocketAddress(): " + remoteSocketAddress.toString());
            //getRemoteSocketAddress(): /127.0.0.1:8888

            InetAddress inetAddress = socket.getInetAddress();
            System.out.println("getInetAddress(): " + inetAddress.toString());
            //getInetAddress(): /127.0.0.1

            InetAddress localAddress = socket.getLocalAddress();
            System.out.println("getLocalAddress(): " + localAddress.toString());
            //getLocalAddress(): /127.0.0.1

            int localPort = socket.getLocalPort();
            System.out.println("getLocalPort(): " + localPort);
            //getLocalPort(): 65510

            int port = socket.getPort();
            System.out.println("getPort(): " + port);
            //getPort(): 8888

            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("我是客户端".getBytes());
            boolean b2 = socket.isOutputShutdown();
            System.out.println("isOutputShutdown(): " + b2);
            //isOutputShutdown(): false
            socket.shutdownOutput();

            InputStream inputStream = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int length = 0;
            while ((length = inputStream.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, length));
            }
            boolean b3 = socket.isInputShutdown();
            System.out.println("isInputShutdown(): " + b3);
            //isInputShutdown(): false
            socket.shutdownInput();

            boolean b4 = socket.isClosed();
            System.out.println("isClosed(): " + b4);
            //isClosed(): false

            inputStream.close();
            outputStream.close();
            socket.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

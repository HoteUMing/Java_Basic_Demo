import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test_10_2_ServerSocket {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);

            SocketAddress localSocketAddress = serverSocket.getLocalSocketAddress();
            System.out.println("getLocalSocketAddress(): " + localSocketAddress.toString());
            //getLocalSocketAddress(): 0.0.0.0/0.0.0.0:8888

            InetAddress inetAddress = serverSocket.getInetAddress();
            System.out.println("getInetAddress(): " + inetAddress);
            //getInetAddress(): 0.0.0.0/0.0.0.0

            int localPort = serverSocket.getLocalPort();
            System.out.println("getLocalPort(): " + localPort);
            //getLocalPort(): 8888

            boolean b1 = serverSocket.isClosed();
            System.out.println("isClosed(): " + b1);
            //isClosed(): false

            ExecutorService es = Executors.newFixedThreadPool(5);
            while (true) {
                Socket socket = serverSocket.accept();
                es.submit(new Thread() {
                    @Override
                    public void run() {
                        try {
                            InputStream inputStream = socket.getInputStream();
                            byte[] bytes = new byte[1024];
                            int length = 0;
                            while ((length = inputStream.read(bytes)) != -1) {
                                System.out.println(new String(bytes, 0, length));
                            }
                            socket.shutdownInput();

                            OutputStream outputStream = socket.getOutputStream();
                            outputStream.write("我是服务器".getBytes());
                            socket.shutdownOutput();

                            inputStream.close();
                            outputStream.close();
                            socket.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }

                    }
                });
            }
//            es.shutdownNow();
//            serverSocket.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

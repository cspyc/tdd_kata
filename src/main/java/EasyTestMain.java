import java.io.IOException;

public class EasyTestMain {
    public static void main(String[] args) throws IOException {
        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler http://www.jb51.net");
    }
}

import java.io.InputStream;

public class OneZeroStream extends InputStream {
    private byte[] b = {'1', ' ', '0', ' '};
    int y;
    int i = 0;
    static int u;
    public int read() {
        if(i >= b.length)
            i = 0;
        return b[i++];
    }

}
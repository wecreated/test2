import java.io.InputStream;

public class OneZeroStream extends InputStream {
    private byte[] b = {'1', ' ', '0', ' '};
    private byte[] x = {'2', '3', '4'};
    int i = 0;
    public int read() {
        if(i >= b.length)
            i = 0;
        return b[i++];
    }

}
package vn.dung;

import java.io.*;

public class DemoCleanup {

    public static void main(String[] args) throws IOException {
        String greeting = "Hello";
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new ByteArrayInputStream(greeting.getBytes());
            os = new ByteArrayOutputStream();

            while (true) {
                int val = is.read();
                if (val == -1) {
                    break;
                }

                os.write(val);
            }

            System.out.println(os.toString());

        } finally {
            if (is != null) {
                is.close();
            }

            if (os != null) {
                os.close();
            }
        }
    }
}

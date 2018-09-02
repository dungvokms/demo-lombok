package vn.dung;

import lombok.Cleanup;

import java.io.*;

public class DemoCleanupLombok {

    public static void main(String[] args) throws IOException {
        String greeting = "Hello";
        @Cleanup InputStream is = new ByteArrayInputStream(greeting.getBytes());
        @Cleanup OutputStream os = new ByteArrayOutputStream();

        while (true) {
            int val = is.read();
            if (val == -1) {
                break;
            }

            os.write(val);
        }

        System.out.println(os.toString());
    }
}

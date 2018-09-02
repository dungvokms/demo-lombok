package vn.dung;

import lombok.Cleanup;

public class CleanupWork {

    public static void main(String[] args) {

        {
            @Cleanup MustBeClosedService service = new MustBeClosedService();
            System.out.println("Hello service");
        }

        System.out.println("Ended");
    }

}

class MustBeClosedService implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("MustBeClosedService closed");
    }
}

import java.io.FileNotFoundException;
import java.io.IOException;

public class Week8Task2 {
    /**
     * NullPointerException.
     */
    void nullPointerEx() throws NullPointerException {
        throw new NullPointerException("Lỗi Null Pointer");
    }

    /**
     * return.
     */
    String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return e.getMessage();
        }
        return "Không có lỗi";
    }

    /**
     * ArrayIndexOutOfBoundsException.
     */
    void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException("Lỗi Array Index Out of Bounds");
    }

    /**
     * return.
     */
    String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return e.getMessage();
        }
        return "Không có lỗi";
    }

    /**
     * ArithmeticException.
     */
    void arithmeticEx() throws ArithmeticException {
        throw new ArithmeticException("Lỗi Arithmetic");
    }

    /**
     * return.
     */
    String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return e.getMessage();
        }
        return "Không có lỗi";
    }

    /**
     * throws FileNotFoundException.
     */
    void fileNotFoundEx() throws FileNotFoundException {
        throw new FileNotFoundException("Lỗi File Not Found");
    }

    /**
     * return.
     */
    String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return e.getMessage();
        }
        return "Không có lỗi";
    }

    /**
     * throws IOException.
     */
    void ioEx() throws IOException {
        throw new IOException("Lỗi IO");
    }

    /**
     * return.
     */
    String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return e.getMessage();
        }
        return "Không có lỗi";
    }
}

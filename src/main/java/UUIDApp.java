import java.util.UUID;

/**
 * @author syc
 * @date 2024/2/27
 */
public class UUIDApp {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println(UUID.randomUUID().toString());
        }
    }
}

import java.util.Arrays;

public class Utils {

    public static boolean isAllPositiveNumbers(String... str) {
        return Arrays.stream(str).anyMatch((o) -> (!StringUtils.isPositiveNumber(o)));
    }

}

public class StringUtils {

    public static boolean isPositiveNumber(String str) {
        return org.apache.commons.lang3.math.NumberUtils.isNumber(str) && Double.parseDouble(str) > 0;

    }
}

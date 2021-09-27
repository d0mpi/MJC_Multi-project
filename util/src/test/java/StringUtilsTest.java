import com.epam.mjc.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumber_whenNumberIsInteger_returnTrue() {
        assertTrue(StringUtils.isPositiveNumber("123"));
    }

}
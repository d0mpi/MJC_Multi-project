import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumber_INT_TRUE() {
        assertTrue(StringUtils.isPositiveNumber("123"));
    }

}
package lets.practice.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("A test")
public class ATest {

    @Test
    @DisplayName("should do something")
    void shouldDoSomething() {
        assertThat(true).isFalse();
    }
}

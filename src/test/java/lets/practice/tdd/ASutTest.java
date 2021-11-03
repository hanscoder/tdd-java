package lets.practice.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("A sut")
public class ASutTest {

    @Test
    @DisplayName("should do something right")
    void shouldDoSomething() {
        // Arrange
        var aSut = new ASut();

        // Act
        var result = aSut.doSomething();

        // Assert
        assertThat(result).isFalse();
    }
}

package lesson14.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void startUp() {
        System.out.println("Test has been started");
        calculator = new Calculator();
    }

    @AfterEach
    void shutDown() {
        System.out.println("Testing is over");
    }
    @BeforeAll
    static void mainStart() {
        System.out.println("MAIN START");
    }

    @AfterAll
    static void mainEnd() {
        System.out.println("THE END!!!");
    }

    @DisplayName("Сложение 3 и 5")
    @Test
    void testAdd1() {
        Assertions.assertEquals(8, calculator.add(3,5));
    }

    @DisplayName("Сложение -10 и 11")
    @Test
    void testAdd2() {
        Assertions.assertEquals(1, calculator.add(-10,11));
    }

    @DisplayName("Проверка исключения")
    @Test
    void testException() {
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.div(8, 0));
    }

    @DisplayName("Проверка таймаута и сложения")
    @Test
    void testTimeout() {
        Assertions.assertTimeout(Duration.ofSeconds(1), () -> {
            Assertions.assertEquals(1, calculator.add(-10,11));
//            Thread.sleep(2000);
        });
    }

    @DisplayName("Параметризованный тест таймаута и сложения")
    @ParameterizedTest
    void paramTest(int expected, int a, int b) {

    }
}
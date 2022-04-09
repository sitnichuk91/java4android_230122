package lesson3.homework;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.Duration;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.log4j.*;

class Lesson3Test {
    private Lesson3 lesson3;
    private Logger balanceLog;
    private Logger shiftLog;

    @BeforeEach
    void startUp(){
        lesson3 = new Lesson3();
        balanceLog = Logger.getLogger("balance");
        shiftLog = Logger.getLogger("shift");
    }
    @BeforeAll
    static void mainEnd() {
        System.out.println("Тесты начаты");
        PropertyConfigurator.configure("src/main/resources/logs/configs/logHW14.properties");
    }

    @AfterAll
    static void mainStart() {
        System.out.println("Тесты окончены");
    }

    @DisplayName("Параметризованный тест баланса массива")
    @ParameterizedTest
    @MethodSource("dataForBalance")
    void paramTestBalance(boolean expected, int[] array) {
        Assertions.assertEquals(expected, lesson3.checkBalance(array));
        balanceLog.info("Balance test is over!");
    }

    static Stream<Arguments> dataForBalance(){
        return Stream.of(
                Arguments.arguments(true, new int[]{1, 1, 1, 2, 1}),
                Arguments.arguments(true, new int[]{1, 2, 1, 2, 2}),
                Arguments.arguments(false, new int[]{2, 2, 1, 1, 1})
        );
    }

    @DisplayName("Параметризованный тест смещения массива")
    @ParameterizedTest
    @MethodSource("dataForShift")
    void paramTestShiftArray(String expected, int[] array, int shift) {
        Assertions.assertEquals(expected, Arrays.toString(lesson3.moveArray(array, shift)));
        shiftLog.info("Shift test is over!");
    }

    static Stream<Arguments> dataForShift(){
        return Stream.of(
                Arguments.arguments(Arrays.toString(new int[] {3, 1, 2}), new int[] {1, 2, 3}, 1000),
                Arguments.arguments(Arrays.toString(new int[] {1, 2, 3, 4}), new int[] {1, 2, 3, 4}, 2000),
                Arguments.arguments(Arrays.toString(new int[] {3, 5, 1, 2}), new int[] {1, 2, 3, 5}, 10),
                Arguments.arguments(Arrays.toString(new int[] {1, 2, 3, 6}), new int[] {1, 2, 3, 6}, 100)

        );
    }

}
package homework.exams_generation;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
@Getter
public enum Operator {
    PLUS("+"),MINUS("-"),MULTIPLY("*"), DIVIDE("/");

    private final String sign;

}

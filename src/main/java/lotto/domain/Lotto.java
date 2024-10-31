package lotto.domain;

import lotto.util.ValidateNumbers;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }
    private void validate(List<Integer> numbers) {
        new ValidateNumbers(numbers);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
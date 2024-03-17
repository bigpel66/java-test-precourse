import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

@DisplayName("학습 테스트 - 집합")
public class SetTest {

	private Set<Integer> numbers;

	@BeforeEach
	void setUp() {
		numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
	}

	@Test
	@DisplayName("집합의 사이즈를 확인")
	void checkSetSize() {
		assertThat(numbers.size()).isEqualTo(3);
	}

	@ParameterizedTest
	@DisplayName("집합 요소 존재 여부 확인")
	@ValueSource(ints = {1, 2, 3})
	void hasElementOnSet(int expectedElement) {
		assertThat(numbers.contains(expectedElement)).isTrue();
	}

}

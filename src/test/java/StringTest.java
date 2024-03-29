import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@DisplayName("학습 테스트 - 문자열")
public class StringTest {

	@Test
	@DisplayName("여러 문자의 split 여부 확인")
	void splitPlural() {
		String given = "1,2";
		assertThat(given.split(",")).containsExactly("1", "2");
	}

	@Test
	@DisplayName("한 문자의 split 여부 확인")
	void splitSingular() {
		String given = "1";
		assertThat(given.split(",")).containsExactly("1");
	}

	@Test
	@DisplayName("괄호로 감싸진 문자열을 추출")
	void extractString() {
		String given = "(1,2)";
		assertThat(given.substring(1, given.length() - 1)).isEqualTo("1,2");
	}

	@Test
	@DisplayName("문자열의 특정 문자를 확인")
	void getCharAtString() {
		String given = "abc";
		char[] expected = {'a', 'b', 'c'};
		for (int i = 0; i < given.length(); i++) {
			assertThat(given.charAt(i)).isEqualTo(expected[i]);
		}
	}

	@Test
	@DisplayName("문자열 범위 밖의 특정 문자 확인 시 예외 발생을 확인")
	void checkCharAtException() {
		String given = "abc";
		assertThatThrownBy(() -> given.charAt(given.length() + 1))
				.isInstanceOf(IndexOutOfBoundsException.class)
				.hasMessageContaining("index out of range: ");
	}

}

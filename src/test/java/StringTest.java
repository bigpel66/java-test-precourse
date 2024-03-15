import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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

}

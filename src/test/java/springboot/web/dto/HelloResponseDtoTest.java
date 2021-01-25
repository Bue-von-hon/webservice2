package springboot.web.dto;
import static org.assertj.core.api.Assertions.*;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.hamcrest.MatcherAssert;


public class HelloResponseDtoTest {
    @Test
    public void test_lombok() {
        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);


//        MatcherAssert.assertThat(dto.getName(), CoreMatchers.is(name));
//        MatcherAssert.assertThat(dto.getAmount(), CoreMatchers.is(amount));
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}

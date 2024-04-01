import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class TestingWebApplicationTests {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void getHelloWorldShouldReturnDefaultPhrase() throws Exception {
        var resultActions = this.mockMvc.perform(get("/")).andDo(print());
        var mvcResult = resultActions.andExpect(status().isOk()).andReturn();
        var content = mvcResult.getResponse().getContentAsString();
        assertThat(content).isEqualTo("Hello, World!");
    }
}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class AcceptanceTest {

    @Mock
    Console console;
    private SocialClient socialClient;

    @BeforeEach
    void setUp() {
        socialClient = new SocialClient(new CommandRepository());
    }

    @Test
    public void user_can_post_a_message() {
          socialClient.execute("Alice -> I love the weather today"); // post
          socialClient.execute("Alice"); // read/
        verify(console).print("I love the weather today");
    }
}
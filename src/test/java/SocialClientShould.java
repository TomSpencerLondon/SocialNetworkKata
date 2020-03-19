import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class SocialClientShould {

    @Mock CommandRepository commandRepo;
    @Mock Command command;

    private SocialClient socialClient;

    @BeforeEach
    void setUp() {
        socialClient = new SocialClient(commandRepo);
    }

    @Test
    void excecute_given_command() {
        String input = "Alice -> I love the weather today";
        given(commandRepo.getCommand(input)).willReturn(command);
        socialClient.execute(input);
        verify(command).execute();
    }
}
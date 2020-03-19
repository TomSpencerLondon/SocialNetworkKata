package com.codurance.social_network;

import com.codurance.social_network.commands.CommandFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class AcceptanceTest {

    @Mock
    private Console console;
    private SocialClient socialClient;
    private Parser parser;
    private CommandFactory commandFactory;
    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        parser = new Parser();
        userRepository = new UserRepository();
        commandFactory = new CommandFactory(userRepository);
        socialClient = new SocialClient(new CommandRepository(parser, commandFactory));
    }

    @Test
    public void user_can_post_a_message() {
        socialClient.execute("Alice -> I love the weather today"); // post
        socialClient.execute("Alice"); // read/
        verify(console).print("I love the weather today");
    }
}
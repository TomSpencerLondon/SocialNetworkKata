package com.codurance.social_network.commands;

import com.codurance.social_network.User;
import com.codurance.social_network.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class PostCommandShould {
    @Mock private UserRepository userRepository;
    @Mock private User user;

    @Test
    void create_user_and_save_post_if_user_does_not_exist() {
        String username = "Alice";
        String message = "I love the weather today";
        PostCommand postCommand = new PostCommand(username, message, userRepository);
        given(userRepository.getUserBy(username)).willReturn(user);

        postCommand.execute();

        verify(user).storeMessage(message);
    }
}
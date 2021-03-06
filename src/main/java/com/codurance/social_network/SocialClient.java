package com.codurance.social_network;

import com.codurance.social_network.commands.Command;

public class SocialClient {
    private CommandRepository commandRepo;

    public SocialClient(CommandRepository commandRepo) {
        this.commandRepo = commandRepo;
    }

    public void execute(String input) {
        Command command = commandRepo.getCommand(input);
        command.execute();
    }
}

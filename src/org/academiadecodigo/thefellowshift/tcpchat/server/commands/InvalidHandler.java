package org.academiadecodigo.thefellowshift.tcpchat.server.commands;

import org.academiadecodigo.thefellowshift.tcpchat.server.ClientConnection;
import org.academiadecodigo.thefellowshift.tcpchat.server.Messages;
import org.academiadecodigo.thefellowshift.tcpchat.server.Server;

public class InvalidHandler implements CommandHandler {

    @Override
    public void handle(Server server, ClientConnection sender, String message) {
        sender.send(Messages.ERROR + ": " + (message.startsWith(Messages.COMMAND_IDENTIFIER) ? Messages.INVALID_COMMAND : message));
    }
}

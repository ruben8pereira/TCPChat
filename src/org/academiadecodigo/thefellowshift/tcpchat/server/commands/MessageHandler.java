package org.academiadecodigo.thefellowshift.tcpchat.server.commands;

import org.academiadecodigo.thefellowshift.tcpchat.server.ClientConnection;
import org.academiadecodigo.thefellowshift.tcpchat.server.Server;

public class MessageHandler implements CommandHandler {

    @Override
    public void handle(Server server, ClientConnection sender, String message) {
        if (!isValid(message)) {
            return;
        }
        server.broadcast(sender.getName() + ": " + message);
    }

    private boolean isValid(String message) {
        return !message.trim().isEmpty();
    }
}

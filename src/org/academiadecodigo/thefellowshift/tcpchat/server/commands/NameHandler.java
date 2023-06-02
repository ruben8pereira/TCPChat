package org.academiadecodigo.thefellowshift.tcpchat.server.commands;

import org.academiadecodigo.thefellowshift.tcpchat.server.ClientConnection;
import org.academiadecodigo.thefellowshift.tcpchat.server.Messages;
import org.academiadecodigo.thefellowshift.tcpchat.server.Server;

public class NameHandler implements CommandHandler {

    @Override
    public void handle(Server server, ClientConnection sender, String message) {
        if (!isValid(message)) {
            Command.INVALID.getHandler().handle(server, sender, Messages.NAME_USAGE);
            return;
        }
        String newName = message.split(" ")[1];
        if (server.getClientByName(newName) != null) {
            Command.INVALID.getHandler().handle(server, sender, Messages.NAME_IN_USE);
            return;
        }
        server.broadcast(sender.getName() + " " + Messages.RENAME + " " + newName);
        sender.setName(newName);
    }

    private boolean isValid(String message) {
        return message.split(" ").length == 2;
    }
}

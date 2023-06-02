package org.academiadecodigo.thefellowshift.tcpchat.server.commands;

import org.academiadecodigo.thefellowshift.tcpchat.server.ClientConnection;
import org.academiadecodigo.thefellowshift.tcpchat.server.Messages;
import org.academiadecodigo.thefellowshift.tcpchat.server.Server;

public class QuitHandler implements CommandHandler {

    @Override
    public void handle(Server server, ClientConnection sender, String message) {
        server.remove(sender);
        server.broadcast(sender.getName() + " " + Messages.LEAVE);
        sender.close();
    }
}

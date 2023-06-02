package org.academiadecodigo.thefellowshift.tcpchat.server.commands;

import org.academiadecodigo.thefellowshift.tcpchat.server.ClientConnection;
import org.academiadecodigo.thefellowshift.tcpchat.server.Server;

public class ListHandler implements CommandHandler {

    @Override
    public void handle(Server server, ClientConnection sender, String message) {
        sender.send(server.listClients());
    }
}
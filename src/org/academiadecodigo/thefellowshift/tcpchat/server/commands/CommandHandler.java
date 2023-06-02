package org.academiadecodigo.thefellowshift.tcpchat.server.commands;

import org.academiadecodigo.thefellowshift.tcpchat.server.ClientConnection;
import org.academiadecodigo.thefellowshift.tcpchat.server.Server;

public interface CommandHandler {

    void handle(Server server, ClientConnection sender, String message);
}

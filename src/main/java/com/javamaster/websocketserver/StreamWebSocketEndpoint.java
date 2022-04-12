/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javamaster.websocketserver;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author charlô
 */
@ServerEndpoint("/fotostream")
public class StreamWebSocketEndpoint {

    private static Set<Session> sessions = Collections.synchronizedSet(new HashSet<Session>());

    @OnMessage
    public String onMessage(Session session, String message) {
        return null;
    }

    @OnOpen
    public void onOpen(Session session) {
        System.out.println("On open: " + session.getId());
        sessions.add(session);
    }

    @OnClose
    public void onClose(Session session) {
        System.out.println("On close: " + session.getId());
        sessions.remove(session);
    }
}

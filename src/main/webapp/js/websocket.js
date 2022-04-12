/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var wsURI = "ws://" + document.location.host + document.location.pathname + "fotostream";
//ws://localhost:8080/websocket-app/chat

var websocket = new WebSocket(wsURI);

websocket.onopen = function() {
    onOpen();
}

function onOpen() {
    console.log("Opened connection: " + wsURI);
}

function onClose() {
    console.log("Closed connection: " + wsURI);
}
//
//function onMessage(event) {
//    console.log(event);
//}
//
//function send() {
//
//}


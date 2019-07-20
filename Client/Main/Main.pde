import hypermedia.net.*;
UDP udp;
String ipServer;


NetworkManager net;
GUI gui;


String message = "Fromage de brebis";

 void setup() {
   size(1280, 720);
   
   net = new NetworkManager(ipServer);
   net.send("Fromage");
   //gui = new GUI();
 }

 void draw()
 {
   net.send("fromage");
   delay(100);
   //gui.display();
 }



 void mousePressed() {
   //gui.click(mouseX, mouseY);
 }
 
 
 void keyPressed() {
   net.send(str(key));
}


 

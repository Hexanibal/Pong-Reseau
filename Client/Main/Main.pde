import hypermedia.net.*;

UDP udp;

String ipServer = "192.168.0.207";

NetworkManager net;



int portRx = 4455;

int portTx = 1234;


String message = "Fromage de brebis";

 void setup() {
   net = new NetworkManager(ipServer);
 }

 void draw()
 {
   
 }



 void keyPressed() {
   net.send(str(key));
}


 

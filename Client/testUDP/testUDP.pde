import hypermedia.net.*;

UDP udp;

int portRx = 4455;

int portTx = 1234;
String ipTx = "192.168.0.207";

 void setup() {
   udp = new UDP(this, portRx);
   udp.listen(true);
 }

 void draw()
 {
   
 }


String message;
 void keyPressed() {
  message = "Fromage de brebis";
   
  udp.send(message, ipTx, portTx);
  println("send");
}

String received;
 void receive(byte[] data) {         
   received = new String(data);
   println(received);
 }

import hypermedia.net.*;
UDP udp;

int state = 1;

String ipServer = null;

int portTx = 5000;
int portRx = 5001;

String received;

String message = "message";

GUI gui;
Pong pong;

 
 void setup() {
   size(1280, 720);
   udp = new UDP(this, portRx);
   udp.listen(true);
   
   gui = new GUI();
   pong = new Pong();
 }

 void draw()
 { /*
   if(state == 1){
     gui.display(state);
   }
   if(state == 2) {
     if(ipServer == null){
       state = 1;
     } else {
       ipServer = gui.ip();
       gui.display(state);
       send(message);

     }
   }
   if(state == 3) {
     pong.display();
   }*/
   udp.send("#heho$", "90.14.254.49", 5000);
 }



 void mousePressed() {
   if(state == 1 || state == 2){
   gui.click(state, mouseX, mouseY);
   }
   if(state == 1){
     if(gui.valid(mouseX, mouseY)) {
       ipServer = gui.ip();
       message = "#heho$";
       state = 2;
       println(gui.ip());
     }
   }
 }
 
 
 
 
  void send(String message) {
     udp.send(message, ipServer, portTx);
     print("message send: ");
     println(message);
  }
  
  public void receive(byte[] data) {         
     received = new String(data);
     print("reçu: ");
     println(received);
     
     if (state == 2 && received != null) {
       portTx = Integer.parseInt(received);
     }
     println(portTx);
  }

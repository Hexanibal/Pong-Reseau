import hypermedia.net.*;
UDP udp;

int state = 1;

String ipServer = null;

int tempPortTx = 5000;
int portRx = 5001;

String received;

String message = "Fromage de brebis";

GUI gui;

 
 void setup() {
   size(1280, 720);
   udp = new UDP(this, tempPortTx);
   udp.listen(true);
   
   gui = new GUI();
 }

 void draw()
 {
   if(state == 1){
     if(ipServer != null){
       send(message);
     }
     delay(100);
     gui.display();
   } else if(state == 2) {
     
   }
 }



 void mousePressed() {
   if(state == 1){
     gui.click(mouseX, mouseY);
     
     if(gui.valid(mouseX, mouseY)) {
       ipServer = gui.ip();
       message = "he oh";
       println(gui.ip());
     }
   }
 }
 
 
 
 
  void send(String message) {
     udp.send(message, ipServer, tempPortTx);
     print("message send: ");
     println(message);
  }
  
  public void receive(byte[] data) {         
     received = new String(data);
     print("reçu: ");
     println(received);
  }

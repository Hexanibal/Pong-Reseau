class NetworkManager{
  
  int portRx = 5001;
  
  int tempPortTx = 5000;
  
  String ipServer;
  
  String received;
  
  
  public NetworkManager(String ipServer) {
    this.ipServer = ipServer;
    
    udp = new UDP(this, portRx);
    udp.listen(true);
  }
  
  
  public void send(String message) {
    udp.send(message, ipServer, tempPortTx);
    print("message send: ");
    println(message);
  }
  
  public void receive(byte[] data) {         
       received = new String(data);
       println(received);
    }
  
  
  
}

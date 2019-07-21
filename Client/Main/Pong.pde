class Pong{
  
  public Pong() {
  
  
  
  
  
  
  }
  
  public void display() {
    background(0);
    rectMode(CENTER);
    for(int i = 0; i < 19; i++) {
      noStroke();
      rect(width/2, i*40, 6, 25);
    }
  }
}

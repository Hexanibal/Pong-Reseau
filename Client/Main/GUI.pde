class GUI{
  String ipServer = "";
  
  String text = "";
  
  public GUI() {
     
   
   
   }

   
   public void display() {
     background(190);
     
     fill(255);
     noStroke();
     rectMode(CENTER);
     rect(width/2-150, height/2, 70, 70, 10);
     rect(width/2+50, height/2, 70, 70, 10);
     rect(width/2-50, height/2, 70, 70, 10);
     rect(width/2-150, height/2+100, 70, 70, 10);
     rect(width/2+50, height/2+100, 70, 70, 10);
     rect(width/2-50, height/2+100, 70, 70, 10);
     rect(width/2-150, height/2+200, 70, 70, 10);
     rect(width/2+50, height/2+200, 70, 70, 10);
     rect(width/2-50, height/2+200, 70, 70, 10);
     
     rect(width/2+150, height/2+100, 70, 70, 10);
     
     rect(width/2+150, height/2+200, 70, 70, 10);
     
     rect(width/2+150, height/2, 70, 70, 10);
    
     rect(width/2, 650, 170, 70, 10);
     
     textAlign(CENTER);
     fill(255);
     textSize(60);
     text("IP DU SERVEUR:", width/2, 150);
     text(text, width/2, 250);
     
     textSize(40);
     fill(0);
     text("1", width/2-150, height/2+15);
     text("2", width/2-50, height/2+15);
     text("3", width/2+50, height/2+15);
     text("4", width/2-150, height/2+115);
     text("5", width/2-50, height/2+115);
     text("6", width/2+50, height/2+115);
     text("7", width/2-150, height/2+215);
     text("8", width/2-50, height/2+215);
     text("9", width/2+50, height/2+215);
     text("0", width/2+150, height/2+215);
     
     text(".", width/2+150, height/2+115);
     textSize(35);
     text("VALIDER", width/2, 662);
     
     textSize(15);
     text("SUPPR", width/2+150, height/2+5);
     
     
   }
   
   
   public void click(int x, int y) {
     if(x > width/2-150-35 && x < width/2-150+35 && y > height/2+15-35 && y < height/2+15+35) {
       text += "1";
     }
     if(x > width/2-50-35 && x < width/2-50+35 && y > height/2+15-35 && y < height/2+15+35) {
       text += "2";
     }
     if(x > width/2+50-35 && x < width/2+50+35 && y > height/2+15-35 && y < height/2+15+35) {
       text += "3";
     }
     if(x > width/2-150-35 && x < width/2-150+35 && y > height/2+115-35 && y < height/2+115+35) {
       text += "4";
     }
     if(x > width/2-50-35 && x < width/2-50+35 && y > height/2+115-35 && y < height/2+115+35) {
       text += "5";
     }
     if(x > width/2+50-35 && x < width/2+50+35 && y > height/2+115-35 && y < height/2+115+35) {
       text += "6";
     }
     if(x > width/2-150-35 && x < width/2-150+35 && y > height/2+215-35 && y < height/2+215+35) {
       text += "7";
     }
     if(x > width/2-50-35 && x < width/2-50+35 && y > height/2+215-35 && y < height/2+215+35) {
       text += "8";
     }
     if(x > width/2+50-35 && x < width/2+50+35 && y > height/2+215-35 && y < height/2+215+35) {
       text += "9";
     }
     if(x > width/2+150-35 && x < width/2+150+35 && y > height/2+215-35 && y < height/2+215+35) {
       text += "0";
     }
     
     if(x > width/2+150-35 && x < width/2+150+35 && y > height/2+115-35 && y < height/2+115+35) {
       text += ".";
     }
     
     if(x > width/2+150-35 && x < width/2+150+35 && y > height/2+15-35 && y < height/2+15+35) {
       text = "";
     }
   }
   
   
   public boolean valid(int x, int y) {
     if(x > width/2-85 && x < width/2+85 && y > 650-35 && y < 650+35) {
       ipServer = text;
       return true;
     } else {
       return false;
     }
   }
   
   public String ip() {
     return ipServer;
   }




}

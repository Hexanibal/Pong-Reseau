class Rectangle {

  constructor(x, y, largeur, hauteur, speed) {
    this.x = x;
    this.y = y;
    this.largeur = largeur;
    this.hauteur = hauteur;
    this.speed = speed;
  }

  draw() {
    noStroke();
    rectMode(CENTER);
    rect(this.x, this.y, this.largeur, this.hauteur);
  }
  
  moveUp() {
    this.y -= this.speed;
  }
   moveDown() {
    this.y += this.speed;
  }
}
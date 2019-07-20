class Ball {

  constructor(x, y, largeur, hauteur) {
    this.x = x;
    this.y = y;
    this.largeur = largeur
    this.hauteur = hauteur
  }

  draw() {
    rectMode(CENTER);
    rect(this.x, this.y, this.largeur, this.hauteur);
  }
}
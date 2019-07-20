let player;
let adversaire;
let ball;

let scorePlayer = 0;
let scoreAdversaire = 0;


function setup() {
  createCanvas(1200, 1200);
  player = new Rectangle(50, height/2, 20, 100, 7);
  adversaire = new Rectangle(width-50, height/2, 20, 100, [255, 255, 255]);
  ball = new Ball(350, height/2, 20, 20);
}

function draw() {
  background(0);
  fill(255);
  for(let i = 0; i < 31; i++) {
    noStroke();
    rect(width/2, i*40, 6, 25);
  }
  textSize(60);
  textAlign(CENTER);
  text(scorePlayer, width/2-150, 150);
  text(scoreAdversaire, width/2+150, 150);
  
  if(keyIsPressed) {
    if (keyCode == UP_ARROW && player.y > player.hauteur/2 + 15){
      player.moveUp();
    }
    if (keyCode == DOWN_ARROW && player.y < height - player.hauteur/2 - 15){
      player.moveDown();
    }
  }
  player.draw();
  adversaire.draw();
  ball.draw();
}
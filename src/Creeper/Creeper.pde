PImage minecraft;
PImage creeper;
int x = 400;
int y = 200;
void setup(){
  size(500,500);
  minecraft=loadImage("green.jpeg");
  minecraft.resize(500,500);
  background(minecraft);
  creeper = loadImage("creeper.png");
  creeper.resize(50,50);
}
void draw(){
  image(creeper, x, y);
  if(mousePressed){
    fill(255,0,0);
    ellipse(mouseX, mouseY, 10,10);
  }
  if(mousePressed&&mouseX==0&&mouseY==0){
    fill(0,255,0);
    ellipse(mouseX, mouseY, 10,10);
  }
if(isNear(mouseX,400)&&isNear(mouseY,200)){
 textSize(24);
 text("You found the creeper",250,250);
}
}
boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}
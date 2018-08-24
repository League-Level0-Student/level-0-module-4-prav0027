PImage donkey;
PImage tail;
void setup(){
 donkey = loadImage("Donkey.jpg");
 tail = loadImage("Tail.png");
 size(550,406);
 
}
void draw(){
  background(donkey);
  image(tail, mouseX-10, mouseY-20);
  rect(0,0,30,30);
  rect(520,376,30,30);
  
}
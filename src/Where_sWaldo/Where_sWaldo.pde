void setup(){
  PImage waldo = loadImage("wheres-waldo.jpg");
  size(1000,650);
  image(waldo,0,0);
  doh=minim.loadSample("/Users/League/Google Drive/league-sounds/homer-doh.wav");
  woohoo=minim.loadSample("/Users/League/Google Drive/league-sounds/homer-woohoo.wav");
}
void draw(){
  println("X: " + mouseX + "Y; " + mouseY);
  if(mouseX == 250 && mouseY == 250){
   println("Waldo found!"); 
   playWoohoo();
  }
  else{
   if(mousePressed){
     playDoh();
   }
  }
}
void playWoohoo(){
  woohoo.stop();
  woohoo.trigger();
}
void playDoh(){
  doh.stop();
  doh.trigger();
}
import ddf.minim.*;
Minim minim = new Minim (this);
AudioSample doh;
AudioSample woohoo;
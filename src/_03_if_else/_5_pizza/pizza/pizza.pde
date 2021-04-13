
void setup() {
    size(500,500);
}
void draw() {
    background(200, 200, 200);

   noStroke();
   fill(#EAB113);
   ellipse(150, 200, 250, 250);
   
   fill(#EA3713);
   ellipse(150, 200, 230, 230);
   
   fill(#EAE013);
   ellipse(150, 200, 220, 220);

   //pepperoni
   
    PImage pepperoni;
    pepperoni = loadImage("pepperoni.png");
    image(pepperoni,120,80);
    pepperoni.resize(1, 1);

pepperoni = loadImage("pepperoni.png");
    image(pepperoni,50,210);
    pepperoni.resize(1, 1);
 
 
 
 //mushroom
 
 PImage mushroom;
  mushroom = loadImage("mushroom.png");
    image(mushroom,150,200);
    mushroom.resize(1, 1);

 mushroom = loadImage("mushroom.png");
    image(mushroom,70,100);
    mushroom.resize(1, 1);


//olive

PImage olive;
  olive = loadImage("olive.png");
    image(olive,40,150);
    olive.resize(1, 1);
    
    olive = loadImage("olive.png");
    image(olive,150,130);
    olive.resize(1, 1);

}

void setup() {
    size(500, 500);
}
void draw() {
  
  background(200, 200, 200);

   //tomato
   noStroke();
   fill(224,90,90);
   ellipse(150, 200, 150, 150);
   ellipse(212, 200, 150, 150);
   
   //stem
  fill(48,130,31); 
   rect(176, 103, 12, 32);
   
    //take a bite
    if(mousePressed){
   fill(200,200,200);
  ellipse(100,200,60,60);
    }
}

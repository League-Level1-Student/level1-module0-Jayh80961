int y = 20;
int x = (int) random(600);
int score = 0;

void setup(){
size(600,600);




}
void draw(){
background(34, 54, 125); 
fill(0, 0, 255);
    stroke(0, 0, 23);
    ellipse(x, y, 50, 50);  
    y=y+10;
    if(y >=600){
      y=0;
      x = (int) random(600);
    }
    if(y==510){
      checkCatch(x);
    }
    fill(255,255,255);
    rect(mouseX, 500, 80, 90);
    fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
}
    
void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
        println("Your score is now: " + score);
    }
  
   

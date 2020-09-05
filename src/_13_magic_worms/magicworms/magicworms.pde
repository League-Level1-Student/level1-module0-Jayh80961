int x=0;  
int y=0;  
int z=0;  


void setup(){
size(600,600);
background(0, 0, 0); 


  
}

void draw(){
  makeMagical();
  for (int i=0;i<301;i++){
    z=z+1;
   x= (int) random(600);
   y= (int) random(600);
   fill(frameCount,i,0);
   ellipse(getWormX(i),getWormY(i),10,10);
  }
 
  
  
}
    float frequency = .002;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }

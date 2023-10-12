import processing.core.PApplet;

public class Sketch extends PApplet {
		
  //Called once at the beginning of execution, put your size all in this method
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /* Called once at the beginning of execution. 
  ** Add initial set up values here i.e background, stroke, fill etc.
  */
  public void setup() {
    background(210, 255, 173);
  }

  //Called repeatedly, anything drawn to the screen goes here 
  public void draw() {
	  float circleX = random(0, width);
    float circleY = random(0, height);

    stroke(43, 97, 143);
    fill(43, 97, 143);
    ellipse(circleX, circleY, 50, 50);
        
    if (circleX > 200 && circleY > 200){
      fill (234, 0, 255);
      ellipse(circleX, circleY, 50, 50);
    } else if (circleX > 200 && circleY < 200){
      fill (255, 0, 0);
      ellipse(circleX, circleY, 50, 50);
    } else if (circleX < 200 && circleY > 200){
      fill(0, 255, 0);
      ellipse(circleX, circleY, 50, 50);
    } else if (circleX < 200 && circleY < 200){
      fill(0, 0, 255);
      ellipse(circleX, circleY, 50, 50);
    }
      
    text(hour(), 180, 200);
    text(minute(), 200, 200);
    text(second(), 210, 200);
    
    noLoop();

  }
  
}
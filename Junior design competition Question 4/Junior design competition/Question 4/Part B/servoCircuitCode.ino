#include <Servo.h>

int pos = 0;
Servo servo;

void setup()
{
  //attach pin 9 to servo
  servo.attach(9); 
}

void loop()
{
 // from 0 to 180 in steps of 45 degrees with delay of 1sec between each 45deg
 for (pos = 0; pos <= 180; pos += 45) {
    servo.write(pos);
    delay(1000); 
  }
  
  //2 second delay before starting second movement 
  delay(2000);
  
  // from 180 to 0 in steps of 30 degrees with delay of 1sec between each 30deg
  for (pos = 180; pos >= 0; pos -= 30) {
    servo.write(pos);
    delay(1000);
  }   
}
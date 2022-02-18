//int pin2 = 2; 
//int pin3 = 3; 
//int pin4 = 4; 
//int pin5 = 5; 

//array of pins needed 
int pins[] = {2,3,4,5}; 


void setup()
{
  //setting pins 2,3,4,5 to be the output
  pinMode(2, OUTPUT);
  pinMode(3, OUTPUT);
  pinMode(4, OUTPUT); 
  pinMode(5, OUTPUT); 
}

void loop()
{
  //from 0 to 15, displain each number with a delay of 1000ms between each number
  for (int counter =0; counter<16; counter++){
  	display(counter);
    delay(1000); //wait for 1000 milliseconds
  }
  
}

void display(int count){
  //For LEDs 1 to 4 (inc) 
  for (int i =0; i<4; i++){
    									//what to extract a bit from(x) and which bit to extract(n) , it will return that bit
    if(bitRead(count,i)==1){			//bitRead(x, n) function in arduino database
    	digitalWrite(pins[i], HIGH);	
    } 
    else {
    	digitalWrite(pins[i], LOW);
    } //If a bit is 1, it will light up the led according to the binary number
    
  }
	
}
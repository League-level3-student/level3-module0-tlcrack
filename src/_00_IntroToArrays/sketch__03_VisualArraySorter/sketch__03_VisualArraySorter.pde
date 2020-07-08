/* Copy the code into a new Processing sketch and complete then steps. */

//1. create an array of ints. don't initialize it yet.
int[] intArray;
boolean isSorted = false;
void setup() {
  //2. set the size of your window
  size(1000, 1000);

  //3. initialize your array with the built in width variable
  intArray = new int[width];

  //4. initialize the ints in the array with random numbers
  //   from 0 to the built-in height variable, (int)random(height)
  reset();

  //5. call the noStroke() method
  noStroke();
}

void draw() {
  //6. set the background color with background(r, g, b);


  //7. set the color for your graph using the fill() method


  //8. draw a rectangle for each int in your array.
  //   the x value will be the index of the int
  //   the y value will the height variable
  //   the width is 1
  //   the height is the negative array value at the array index, e.g. -intArray[ i ]

  if (!isSorted) {
    background(100, 180, 190);
    for (int i = 0; i < intArray.length; i++) {
      fill((int)random(255), (int)random(255), (int)random(255));
      rect(i, height, 1, -intArray[i]);
    }
    
    for (int i = 0; i < intArray.length; i++) {
     stepSort(intArray);
     delay(1);
    }
    background(100, 180, 190);
    
    for (int i = 0; i < intArray.length; i++) {
      fill((int)random(255), (int)random(255), (int)random(255));
      rect(i, height, 1, -intArray[i]);
    }
    
    isSorted=true;
  }
  //9. call the stepSort method
//  stepSort(intArray);

  //10. extract the code from step 4 that randomizes the array into a new method.


  //11. call the method you made in step 10 when the mouse is pressed using the mousePressed variable
  if (mousePressed) {
    reset();
  }
}
void reset() {
  for (int i = 0; i < intArray.length; i++) {
    intArray[i] = (int)random(height);
  } 
  isSorted=false;
}
void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}

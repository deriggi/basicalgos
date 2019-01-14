### Some basic algorithms in different languages
Playing around with some old algorithms in new languages. Kotlin I'm the least familiar and also seems to have the least amount of info on StackOverflow. Great compiler warnings though! Data visuals are of course much more compelling than the ol' big oh notation so I'll make a few here for some of the code

[Binary search in five languages](/arraysandbinarysearch)
#### Comparing bubble sort algorithms
When you don't scan the entire array every time you get about a 50% improvement over a standard On^2 on bubblesort. Fast is the version where the right side limit of the search decrements by one everytime you hit the right side. 

![Alt text](sorts/bubblesort/combined2.png?raw=true "w")

#### Rotating an array!
Rotating is straightforward. To the right, save the last element as a temp then bump every other element up by one:
[Rotating a circular buffer](circularbuffer/roundrotation.js)

Here is a [left and right rotation in Java](circularbuffer/CircularBuffer.java) 







# Canvas Service

The application allows users to :
1. Create a new canvas
2. Draw on the canvas using text based commands
3. Quit the program

## Getting Started

To get the project running in your local machine, please do the following:
1. Clone the project from Github and checkout master branch
2. Run CanvasClient as Main class

### Prerequisites

1. JDK 8
2. Apache Maven



### Using the application

Below is the example usage of the program.
Users can choose to enter one of the following commands and respective attributes
1. C w h - Create a new canvas of width w and height h
2. L x1 y1 x2 y2 - Draw a new line from coordinates (x1, y1) to (x2, y2) horizontally or vertically. Lines are made up of the x character
3. R x1 y1 x2 y2 - Draw a new rectangle, with upper left corner at coordinate (x1, y1) and lower right coordinate at (x2, y2). Lines are made up of the x character
4. Q - Quit the program

Sample Example:
Please see the examples in the "Raw" version of this file to get the correct picture.

enter command: C 20 5
----------------------
|                    |
|                    |
|                    |
|                    |
|                    |
----------------------
enter command: L 1 3 7 3
----------------------
|                    |
|                    |
|xxxxxxx             |
|                    |
|                    |
----------------------
enter command: L 7 1 7 3
----------------------
|      x             |
|      x            |
|xxxxxxx             |
|                    |
|                    |
----------------------
enter command: R 15 2 20 5
----------------------
|      x             |
|      x       xxxxxx|
|xxxxxxx       x    x|
|              x    x|
|              xxxxxx|
----------------------
enter command: Q

## Running the tests

Testing framework used - JUnit.


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management


# Tetris.Hell
Implemented in Java, a game of Tetris with the incorporation of an AI component. Bootstrapped from an assignment in CS108 of Stanford. Written in DevFest 2015@Columbia University. 
=================================================
##Components 

###Piece 
- There are a total of five different pieces in the game of Tetris: stick, L, S, L-mirror, S-mirror, square, and pyramid, as well as four rotations of every piece. 
- We define a piece by the coordinates of the blocks that make up the "body" of the piece. For example, a square at the bottom left corner would have coordinates (0,0), (0,1), (1,0), (1,1). 
- Pieces also have an element named "skirt", which stores the lowest value that appears in the body for each x value in the piece. This is useful for computing where the piece will land. 
- Rotation strategies. Since there are limited amount of pieces, we can pre-store all rotations of each piece to be retrieved when needed instead of computing and creating each object later on, which can become very costly. 

###Board

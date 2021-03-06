# KnightL On A Chessboard

## Origin

[Link](https://www.hackerrank.com/contests/rookierank-2/challenges/knightl-on-chessboard)

## Description

## Companies

## Categories

1. Contests
1. RookieRank 2

## Tags

## Notes

KnightL(a, b) doesn't represent a position but instead the set of moves it can make. As you may know, knights in chess move like an L. The a and b are the lengths you can use to make the L.
I was also hung up on what exactly we were supposed to output. Don't bother reading the explanation and just look at the matrix of tuples. You're supposed to print out a matrix where element ij is the number of moves it takes to get to the bottom right corner if your knight makes moves KnightL(i, j). Note that i and j start at 1. (It's probably because if i and j started at 0, the first row and column would just be 0. You can't move the knight anywhere if the parts of the L both have length 0.)


The idea is to start from the (n-1,n-1) piece and going back to (0,0). The algorithm looks like this:
for (i,j) in range(1,n) * range(1,n) #moving possibilities for the knight
while we didn't reach (0,0) or (no new squares are reachables):

    look at squares that we could reach from the last discovered ones

    substract those that we already discovered in previous steps (which means less moves)

    store these new squares in a set, named new set

if (0,0) is in the new set, then print the number of iterations over the while loop

else print(-1)
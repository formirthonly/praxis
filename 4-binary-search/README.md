This problem is excerpted, unedited, from the [Programming Praxis](https://programmingpraxis.com) website, which is under a [Creative Commons Attribution-Noncommercial-Share Alike 3.0 United States License](https://creativecommons.org/licenses/by-nc-sa/3.0/us/).

[Link to the problem](https://programmingpraxis.com/2009/03/23/binary-search/)

## Binary Search
*March 23, 2009*

Children who are learning arithmetic sometimes play a number-guessing game: “I’m thinking of a number between 1 and 100. Can you guess it?” “Is the number less than 50?” “Yes.” “Is the number less than 25?” “No.” And so on, halving the interval at each step until only one number is left. This technique is known colloquially as the binary chop.

Your first task is to write a function that takes a target number and an array of numbers in non-decreasing order and returns either the position of the number in the array, or -1 to indicate the target number is not in the array. For instance, bsearch(32, [13 19 24 29 32 37 43]) should return 4, since 32 is the fourth element of the array (counting from zero).

Beware that this exercise is harder than it looks. Jon Bentley, in his book Programming Pearls, reports that 90% of professional programmers cannot write a proper implementation of binary search in two hours, and Donald Knuth, in the second volume of his book The Art of Computer Programming, reports that though the first binary search was published in 1946, the first bug-free binary search wasn’t published until 1962.

Thus, your second task is to write a suitable test program that shows the accuracy of your binary search function.
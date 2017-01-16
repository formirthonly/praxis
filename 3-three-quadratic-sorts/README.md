This problem is excerpted, unedited, from the [Programming Praxis](https://programmingpraxis.com) website, which is under a [Creative Commons Attribution-Noncommercial-Share Alike 3.0 United States License](https://creativecommons.org/licenses/by-nc-sa/3.0/us/).

[Link to the problem](https://programmingpraxis.com/2009/10/27/three-quadratic-sorts/)

## Three Quadratic Sorts
*October 27, 2009*

Sorting is one of the most common computing tasks. In the days of large mainframes, sorting would often account for ten percent of a computer’s workload, and there were complicated procedures involving large free-standing tape machines for sorting more records than could fit in the computer’s memory; the programmer who could shave a few percentage points of time or core memory space off the standard system sort was a hero. Nowadays, most programmers simply call their local sort library, and never worry about how it works.

We are going to explore classical sorting algorithms in the next several exercises. The rules of the game: We will be sorting arrays of integers with elements stored in locations zero through n−1, where n is the number of elements in the array. We will always sort into ascending order, and will use <, never ≤, to compare array elements. All sorting functions will be called with two parameters, the name of the array and its length.

Today, we will look at three simple sorting algorithms. Bubble sort works by repeatedly stepping through the array to be sorted, comparing each pair of adjacent elements and interchanging them if they are in the wrong order, until the array is sorted. Selection sort works by repeatedly passing through the array, at each pass finding the minimum element of the array, interchanging it with the first element of the array, then repeating on the sub-array that excludes the first element of the array. Insertion sort works the same way that card players generally sort their hands; starting from an empty hand, they pick up a card, insert it into the correct position, then repeat with each new card until no cards remain.

Your task is to write functions that sort an array using bubble sort, selection sort, and insertion sort; you should also write a test program that can be used for any of the sorting algorithms. When you are finished, you are welcome to [read](https://programmingpraxis.com/2009/10/27/three-quadratic-sorts/2/) or [run](http://programmingpraxis.codepad.org/vuYNXRdL) a suggested solution, or to post your own solution or discuss the exercise in the comments below.

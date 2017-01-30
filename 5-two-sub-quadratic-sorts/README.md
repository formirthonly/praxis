This problem is excerpted, unedited, from the [Programming Praxis](https://programmingpraxis.com) website, which is under a [Creative Commons Attribution-Noncommercial-Share Alike 3.0 United States License](https://creativecommons.org/licenses/by-nc-sa/3.0/us/).

[Link to the problem](https://programmingpraxis.com/2009/10/30/two-sub-quadratic-sorts/)

## Two Sub-Quadratic Sorts
*October 30, 2009*

In the previous exercise we looked at three sorting algorithms that work in quadratic time. Today we look at two sorting algorithms, each a minor variant on one of the previous algorithms, that work much more quickly.

Comb sort is a variant of bubble sort popularized by Stephen Lacey and Richard Box in an article in the April 1991 edition of Byte Magazine. The basic idea is to quickly eliminate turtles, small values near the end of the array, since they greatly hamper the speed of the sort. In bubble sort, the elements being compared are always adjacent; the gap between them is 1. In comb sort, the gap is initially the length of the list being sorted; the array is sorted using that gap size, then the gap is reduced and the array is sorted again, and so on until the gap is reduced to 1, when the sort reduces to ordinary bubble sort. Since early stages with large gaps quickly move turtles near the front of the array, later stages with smaller gaps have less work to do, and the sorting algorithm becomes relatively efficient. Most often, the gap is reduced by a factor of 1.3 at each step, though other shrink factors are sometimes used.

In the same way that comb sort is a variant of bubble sort, shell sort, invented by Donald Shell in 1959, is a variant of insertion sort that attempts to eliminate large disorder in early stages so that later stages have less work to do. Shell sort performs multiple stages of insertion sort, using a diminishing sequence of gaps that eventually reaches 1; a popular gap sequence is …, 364, 121, 40, 13, 4, 1.

Your task is to write functions that perform comb sort and shell sort, in the same manner as the previous exercise. When you are finished, you are welcome to [read](https://programmingpraxis.com/2009/10/30/two-sub-quadratic-sorts/2/) or [run](http://programmingpraxis.codepad.org/XysypyUa) a suggested solution, or to post your own solution or discuss the exercise in the comments below.

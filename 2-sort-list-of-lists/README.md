This problem is excerpted, unedited, from the [Programming Praxis](https://programmingpraxis.com) website, which is under a [Creative Commons Attribution-Noncommercial-Share Alike 3.0 United States License](https://creativecommons.org/licenses/by-nc-sa/3.0/us/).

## Hett’s Problem 1.28
*August 9, 2011*

Over at PrologSite, Werner Hett gives a list of Ninety-Nine Prolog Problems “to
give you the opportunity to practice your skills in logic programming.” Today’s
exercise is number 1.28 on the list. Hett gives the problem two stars, meaning
that he expects a skilled Prolog programmer to spend thirty to ninety minutes to
solve it. Here is Hett’s statement of the problem:

    1.28 (**) Sorting a list of lists according to length of sublists
    a) We suppose that a list (InList) contains elements that are
    lists themselves. The objective is to sort the elements of InList
    according to their length. E.g. short lists first, longer lists
    later, or vice versa.

    Example:
    
    lsort([[a,b,c],[d,e],[f,g,h],[d,e],[i,j,k,l],[m,n],[o]],L)
    
    L = [[o], [d, e], [d, e], [m, n], [a, b, c], [f, g, h], [i, j, k, l]]
    
    b) Again, we suppose that a list (InList) contains elements that
    are lists themselves. But this time the objective is to sort the
    elements of InList according to their length frequency; i.e. in
    the default, where sorting is done ascendingly, lists with rare
    lengths are placed first, others with a more frequent length come
    later.

    Example:
    
    lfsort([[a,b,c],[d,e],[f,g,h],[d,e],[i,j,k,l],[m,n],[o]],L)
    
    L = [[i, j, k, l], [o], [a, b, c], [f, g, h], [d, e], [d, e], [m, n]]

    Note that in the above example, the first two lists in the result
    L have length 4 and 1, both lengths appear just once. The third
    and forth list have length 3; there are two list of this
    length. And finally, the last three lists have length 2. This is
    the most frequent length.

Your task is to solve Hett’s problem 1.28; you need not use Prolog. Be
sure to follow Hett’s advice:

    Your goal should be to find the most elegant solution of the
    given problems. Efficiency is important, but logical clarity is
    even more crucial.

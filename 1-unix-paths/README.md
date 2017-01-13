This problem is excerpted, unedited, from the [Programming Praxis](https://programmingpraxis.com) website and the content is under a [Creative Commons Attribution-Noncommercial-Share Alike 3.0 United States License](https://creativecommons.org/licenses/by-nc-sa/3.0/us/).

## Unix Paths
*August 13, 2013*
Today’s exercise was written by guest author Robert Fisher. Having worked on shrinkwrapped consumer software, e-commerce web apps, embedded systems, and insurance OLTP systems, Robert currently writes C/C++ and Javascript for HP Tippingpoint and writes Scheme whenever he can. Suggestions for exercises are always welcome, or you may wish to contribute your own exercise; feel free to contact me if you are interested.

Under Unix, files are identified by paths. These are strings of directory names separated by slash characters followed by the name of the file. Paths starting with a slash are absolute, but paths that don’t start with a slash are relative to the current directory. Relative paths may include “..” elements. These represent a parent directory. Likewise, “../..” would represent a grandparent directory. For example, if the current directory is “/home/bob” then “praxis/prelude.scm” represents the file “/home/bob/praxis/prelude.scm” and “../tom/bin/scheme” represents “/home/tom/bin/scheme”.

Your task is to write a function that takes the current directory path and a target path and returns an absolute and minimal path equivalent to the target path. When you are finished, you are welcome to read or run a suggested solution, or to post your own solution or discuss the exercise in the comments below.

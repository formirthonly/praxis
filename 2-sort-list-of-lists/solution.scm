;; Part 1
(define (lsort lislis)
  (sort lislis
        (lambda (a b)
          (< (length a) (length b)))))

(define lsme '((a a a a a a a)
               (a a a)
               (a a a a a)
               (a a a a a a a a a)
               (a a)
               (a a a a a a a a a a)))

(lsort lsme)

;; Part 2
(import (srfi srfi-1))

(define (flatmap proc seq)
  (fold-right append '() (map proc seq)))

(define (flsort lislis)
  (let ((freq-list '()))
    (map (lambda (lis)
           (let* ((len (length lis))
                  (valis (assoc-ref freq-list len)))
             (if (eq? valis #f)
                 (set! freq-list
                       (assoc-set! freq-list len (list lis)))
                 (set! freq-list
                       (assoc-set! freq-list len (cons lis valis))))))
         lislis)
    (flatmap (lambda (y)
               (cdr y))
             (lsort freq-list))))

(define flsme '((a a a a) ;; 3 times
                (a a a a)
                (a a a a)
                (a a a a a) ;; 2 times
                (a a a a a)
                (a) ;; 4 times
                (a)
                (a)
                (a)
                (a a) ;; 3 times
                (a a)
                (a a)
                (a a a a a a a) ;; 6 times
                (a a a a a a a)
                (a a a a a a a)
                (a a a a a a a)
                (a a a a a a a)
                (a a a a a a a)
                (a a a) ;; 1 time
                (a a a a a a) ;; 4 times
                (a a a a a a)
                (a a a a a a)
                (a a a a a a)))

(flsort flsme)

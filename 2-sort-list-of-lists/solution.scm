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
    (map (lambda (x)
           (if (eq? (assoc-ref freq-list (length x)) #f)
               (set! freq-list
                     (assoc-set! freq-list
                                 (length x)
                                 (list x)))
               (set! freq-list
                     (assoc-set! freq-list
                                 (length x)
                                 (cons x (assoc-ref
                                          freq-list
                                          (length x)))))))
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

;; I reserve the right to refactor this later ;-P

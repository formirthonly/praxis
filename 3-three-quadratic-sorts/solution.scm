(define ul '(1 0 2 4 9 3 8 4 7 5 6))
(define ul-sorted '(0 1 2 3 4 4 5 6 7 8 9))

;; Bubble Sort

(define add1
  (lambda (x)
    (+ x 1)))

(define (bubblesort lis)
  (let ((flops 0))
    (define (switcher li)
      (cond ((or (null? li) (eq? (length li) 1)) li)
            ((> (length li) 1)
             (let ((first (car li))
                   (second (cadr li))
                   (rest (cddr li)))
               (cond ((<= first second)
                      (cons first (switcher (cons second rest))))
                     (else (set! flops (add1 flops))
                           (cons second (switcher (cons first rest)))))))))
    (let ((pass (switcher lis)))
      (if (> flops 0)
          (bubblesort pass)
          pass))))

(bubblesort ul)

;; Selection Sort

(define rember
  (lambda (a lat)
    (cond
     ((null? lat) '())
     ((eq? a (car lat))
      (cdr lat))
     (else (cons (car lat)
                 (rember a (cdr lat)))))))

(define (smallest lis)
  (define (smlst li cSmall)
    (cond ((null? li) cSmall)
          ((< (car li) cSmall)
           (smlst (cdr li) (car li)))
          (else (smlst (cdr li) cSmall))))
  (smlst (cdr lis) (car lis)))

(define (selectionsort lis)
  (define (selectsort li srtd)
    (cond ((null? li) (reverse srtd))
          (else
           (let* ((small (smallest li))
                 (popped (rember small li)))
             (selectsort popped (cons small srtd))))))
  (selectsort lis '()))

(selectionsort ul)

;; Insertion Sort

(define (insertsort lis)
  (define (insort num lat)
    (cond ((null? lat) (list num))
          ((<= num (car lat))
           (cons num lat))
          (else (cons (car lat)
                      (insort num (cdr lat))))))
  (define (isort li srtd)
    (cond ((null? li) srtd)
          (else (isort (cdr li) (insort (car li) srtd)))))
  (isort lis '()))

(insertsort ul)

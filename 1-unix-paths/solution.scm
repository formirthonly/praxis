(define (abs-path pwd target)
  (define (calc-path pwd-list target-list)
    (cond
     ((null? target-list) pwd-list)
     ((and (equal? (car target-list) "..")
           (not (null? pwd-list)))
      (calc-path (cdr pwd-list)
                 (cdr target-list)))
     ((equal? (car target-list) "..")
      (calc-path '()
                 (cdr target-list)))
     ((equal? (car target-list) ".")
      (calc-path pwd-list
                 (cdr target-list)))
     (else (calc-path (cons (car target-list) pwd-list)
                      (cdr target-list)))))
  (define (string-path path)
    (string-join (reverse path) "/" 'prefix))
  (string-path
   (calc-path (reverse (cdr (string-split pwd #\/)))
              (string-split target #\/))))

(abs-path "/home/soylent" "../foodman") ;; p typical
(abs-path "/home/soylent" "hello/venus/djNHKGUY") ;; p typical
(abs-path "/home/soylent" "../../../../../../../kane/west") ;; when it zeroes out, it should refresh a list
(abs-path "/home/soylent" "../luvraw?$") ;; works with punctuation/weird characters
(abs-path "/home/soylent" "../kane west/todak todak/../eelica") ;; and spaces
;; but not escaped characters

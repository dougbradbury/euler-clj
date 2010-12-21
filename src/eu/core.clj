(ns eu.core
  (:use
    [eu.prime-factors]
    [eu.palindrome]))

(defn divisible?
        [x, divisor]
                (= 0 (rem x divisor)))

(defn keep3_5
        [x]
        (or (divisible? x 3) (divisible? x 5)))

(defn fib-sequence []
  ((fn fib-internal
    [a b]
    (cons a (lazy-seq (fib-internal b (+ a b))))) 0 1))

(defn fib
  [n]
  (take n (fib-sequence))
  )

(defn fib-less-than
  [x]
  (take-while (fn[n] (< n x)) (fib-sequence)))

(defn euler1
  [n]
  (reduce + (filter keep3_5 (range 1 n))))

(defn euler2
  [n]
  (reduce + (filter even? (fib-less-than n)))
  )

(defn euler3
  [n]
  (last (prime-factors n)))

(defn product-seq [max]
  ((fn prod-internal
    [a b]
    (cons (* a b) (cond (= a 0) '()
      (= b 0) (lazy-seq (prod-internal (- a 1) max))
      :else (lazy-seq (prod-internal a (- b 1))))
      )) max max))

(defn euler4
  [max-num]
  (apply max (filter palindrome? (product-seq max-num))))

;  (filter palindrome? (num-with-digits num-digits) ))
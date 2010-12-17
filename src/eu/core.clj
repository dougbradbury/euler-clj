(ns eu.core
  (:use
    [eu.prime-factors]))

(defn div
        [x, divisor]
                (= 0 (rem x divisor)))

(defn keep3_5
        [x]
        (or (div x 3) (div x 5)))

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
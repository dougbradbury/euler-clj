(ns eu.prime-factors)

(defn prime-factors
  [n]
  (if (<= n 1)
    '()
    ((fn try-candidate
      [candidate n]
      (if (> candidate (Math/sqrt n))
        (list n)
        (if (= 0 (rem n candidate))
          (cons candidate (try-candidate candidate (/ n candidate)))
          (try-candidate(+ candidate 1) n)))) 2 n)))
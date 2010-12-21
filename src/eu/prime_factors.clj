(ns eu.prime-factors)

(defn prime-factors
  [n]
  ((fn try-candidate
    [candidate n]
    (cond
      (<= n 1)
      '()

      (> candidate (Math/sqrt n))
      (list n)

      (= 0 (rem n candidate))
      (cons candidate (try-candidate candidate (/ n candidate)))
      :else
      (try-candidate (+ candidate 1) n))) 2 n))
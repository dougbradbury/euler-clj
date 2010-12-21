(ns eu.palindrome)


(defn r-digits
  [n]
  (if (< n 10)
    (list n)
    (let [tens (int (/ n 10))]
      (cons
        (- n (* 10 tens))
        (r-digits tens)
        ))))

(defn digits
  [n]
  (reverse (r-digits n)))

(defn palindromic-list?
  [a]
  (cond
    (= 1 (count a)) true
    (= 2 (count a)) (= (first a) (last a))
    :else
    (and (= (first a) (last a)) (recur (rest (drop-last a)))))
  )

(defn palindrome?
  [n]
  (palindromic-list? (digits n))
  )

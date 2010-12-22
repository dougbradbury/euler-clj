(ns eu.least-common-multiple
  (:use
    [eu.prime-factors]))

(defn merge-factors [a b]
  (merge-with max a b)
  )

(defn reverse-frequencies
  [map]
  (mapcat (fn [[k v]] (repeat v k)) map)
  )


(defn lcm [n]
   (let [primes-hist (reduce merge-factors
     (map frequencies
       (map prime-factors n)))]
     (reduce * (reverse-frequencies primes-hist))
      ))

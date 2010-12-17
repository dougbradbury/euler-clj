(ns sample.core-spec
  (:use
    [speclj.core]
    [eu.prime-factors]))
(describe "Prime Factors"
  (it "factors primes"
    (should= '() (prime-factors 0))
    (should= '() (prime-factors 1))
    (should= '(2) (prime-factors 2))
    (should= '(3) (prime-factors 3))
    (should= '(2 2) (prime-factors 4))
    (should= '(5) (prime-factors 5))
    (should= '(2 3) (prime-factors 6))
    (should= '(7) (prime-factors 7))
    (should= '(2 2 2) (prime-factors 8))
    (should= '(3 3) (prime-factors 9))
    (should= '(2 2 3 7 7 11 13 13) (prime-factors (* 2 2 3 7 7 11 13 13))))
  )

(run-specs)
(ns sample.core-spec
  (:use
    [speclj.core]
    [eu.least-common-multiple]))

(describe "Least Common Multiple"
  (it "should lcm one number"
    (should= 1 (lcm '(1)))
    (should= 5 (lcm '(5))))
  (it "should lcm primes"
    (should= (* 3 5 13 17) (lcm '(3 5 13 17))))
  (it "should lcm non-primes"
    (should= 12 (lcm '(2 4 6)))
    (should= 2520 (lcm (range 1 10)))
    (should= 232792560 (lcm (range 1 20)))
    )
  )

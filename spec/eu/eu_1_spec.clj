(ns sample.core-spec
  (:use
    [speclj.core]
    [eu.core]))

(describe "Euler Solutions"

  (it "should be 23 for the number 1 to 10"
    (should (= 23 (euler1 10))))

  (it "should find for 1000"
    (should= 233168 (euler1 1000)))

  (it "should do fib numbers"
    (should= '(0 1 1 2 3 5 8 13) (fib 8))
    (should= '(0 1 1) (fib 3)))

  (it "should have fib numbers less than"
    (should= '(0 1 1 2 3) (fib-less-than 4)))

  (it "should be even"
    (should (even? 2))
    (should-not (even? 3)))


  (it "should solve small euler 2"
    (should= 10 (euler2 9)))

  (it "should solve big euler 2"
    (should= 4613732 (euler2 4000000)))

  (it "should solve small euler 3"
    (should= 13 (euler3 (* 2 2 2 2 3 3 3 3 3 3 11 11 11 11 13))))

  (it "should solve big euler 3"
    (should= 6857 (euler3 600851475143)))

  (it "should have product sequence"
    (should= (list (* 99 99) (* 99 98) (* 99 97)) (take 3 (product-seq 99))))
    
  (it "should solve small euler 4"
    (should= 9009 (euler4 99)))

  (it "should solve big euler 4"
    (should= 906609 (euler4 999)))

  )
(run-specs)
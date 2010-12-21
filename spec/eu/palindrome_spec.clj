(ns eu.palindrome-spec
  (:use
    [speclj.core]
    [eu.palindrome]))

(describe "Palindromes"
  (it "splits into digits"
    (should= '(1 1) (digits 11))
    (should= '(1 2) (digits 12)))
  (it "splits 3 digit numbers"
    (should= '(1 2 3) (digits 123)))
  (it "identifies palindromic lists"
    (should (palindromic-list? '(1 1)))
    (should-not (palindromic-list? '(3 2)))
    (should (palindromic-list? '(1 0 0 1)))
    (should-not (palindromic-list? '(1 2 3 1)))
    (should (palindromic-list? '(2 3 4 3 2)))
    (should-not (palindromic-list? '(1 2 4 3 1)))
    )
  (it "identifies palindromic numbers"
    (should (palindrome? 11))
    (should-not (palindrome? 12))
    )

  )



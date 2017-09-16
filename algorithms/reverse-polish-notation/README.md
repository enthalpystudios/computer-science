# Reverse Polish Notation

In reverse Polish notation, the operators follow their operands; for instance, to add 3 and 4, one would write 3 4 + rather than 3 + 4. If there are multiple operations, operators are given immediately after their second operands; so the expression written 3 − 4 + 5 in conventional notation would be written 3 4 − 5 + in reverse Polish notation: 4 is first subtracted from 3, then 5 is added to it. An advantage of reverse Polish notation is that it removes the need for parentheses that are required by infix notation. While 3 − 4 × 5 can also be written 3 − (4 × 5), that means something quite different from (3 − 4) × 5. In reverse Polish notation, the former could be written 3 4 5 × −, which unambiguously means 3 (4 5 ×) − which reduces to 3 20 −; the latter could be written 3 4 − 5 × (or 5 3 4 − ×, if keeping similar formatting), which unambiguously means (3 4 −) 5 ×.

# Example

The infix expression ((15 ÷ (7 − (1 + 1))) × 3) − (2 + (1 + 1)) can be written like this in reverse Polish notation:

15 7 1 1 + − ÷ 3 × 2 1 1 + + − = 5
because
```
=> (((15 (7 (1 1 +) -) ÷) 3 x) (2 (1 1 +) +) -)
=> (((15 (7 (2) -) ÷) 3 x) (2 (1 1 +) +) -) 
=> (((15 (5) ÷) 3 x) (2 (1 1 +) +) -) 
=> (((3) 3 x) (2 (1 1 +) +) -) 
=> ((9) (2 (1 1 +) +) -) 
=> ((9) (2 (2) +) -) 
=> ((9) (4) -) 
=> 5
```

# Implementations

There are two implementations of the same problem, in Java and Scala

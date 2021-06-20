# Takeaways

## Magic Square

- The keys are
  1. __all of the digits must be distinct__
  2. __the digits are restricted to 1 through 9 inclusive__
- This means that there are only 8 distinct magic squares
- This can also be seen by creating a system of equations and noticing that the magic number is modulo 8

## Diagonal Difference

- Don't forget to initialize primitive types!

## Bigger Greater

- Take an algorithms course
- Know that the STL has a next_permutation function built in
- Not sure why but the if statement needed parentheses around ```next_permutation(str, w.length())``` to properly evaluate the returned bool

## Modified Kaprekar Numbers

- If the numbers can get unwieldy, use modular arithmetic or maybe take the hint and use strings
- Use ```stoi()``` to parse integers
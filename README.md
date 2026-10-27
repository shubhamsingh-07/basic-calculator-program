# Basic Calculator (Java)

[![Language](https://img.shields.io/badge/Language-Java-orange.svg)](https://www.java.com/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

A console calculator written in Java. It reads two numbers and an operator, then evaluates the requested arithmetic operation.

## Supported Operations

| Operator | Operation |
| --- | --- |
| `+` | Addition |
| `-` | Subtraction |
| `*` | Multiplication |
| `/` | Division, with a division-by-zero check |
| `^` | Exponentiation using `Math.pow()` |

## Project Structure

```text
basic-calculator-program/
└── MiniProject4.java
```

## Compile and Run

```bash
javac MiniProject4.java
java MiniProject4
```

Enter the first number, an operator, and the second number when prompted.

## Concepts Practiced

- Console input with `Scanner`.
- Switch expressions.
- Conditional error handling.
- Exponentiation with `Math.pow()`.

## Limitations and Improvements

Only one calculation is performed per run, and non-numeric input is not handled. Improvements could include repeated calculations, stronger input validation, and tests for division and exponentiation edge cases.

## License

Licensed under the MIT License. See [LICENSE](LICENSE).

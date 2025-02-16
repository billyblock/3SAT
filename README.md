# 3SAT

## Goals

- Implement a 3SAT Generator
- Implement a 3SAT Solver
    1. Create a brute force algorithm
    2. Create Davis–Putnam–Logemann–Loveland (DPLL) algorithm

- Implement a 3SAT Verfier

## Generator

The generator is a static utility class, meaning that it cannot create instances of it's self. You can only generate equations and print equations from it.

You can either give it the amount of variables you want as well as the amount of clauses OR it will generate a equation with anywhere between 1-25 of each.

print output: 
Formula:
(x2 V x3 V ¬x4) AND (¬x1 V ¬x6 V ¬x3)

Before formatting, the above formula would be:

{ [ 2 3 -4 ][ -1 -6 -3 ] }

## Solver

The solver is a static utility class. Given a formula, you can brute force an answer or use DPLL to find a solution. 

The accepted formula format is shown above in the generator section.

The solution will return an array of booleans. Each index is (subscript - 1) of the given x value. Therefore x subset 5 is the array at 4.

## Verifier

The accepted format for equation is shown above in the generator section.
The accepted format for the solution is showen above in the solver section.
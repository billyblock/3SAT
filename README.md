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
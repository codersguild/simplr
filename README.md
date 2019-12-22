
[![Build Status](https://travis-ci.com/codersguild/parser-symbolic-exec.svg?token=y7dv4AHgKobrxUyj4TGA&branch=master)](https://travis-ci.com/codersguild/parser-symbolic-exec) [![Scala](https://img.shields.io/badge/Scala-2.11.0-blue)](https://img.shields.io/badge/Scala-2.11.0-blue)

### Project

Demonstrate parsing, and constraint solving on a new programming language ```simpl``` 
using scala, z3, ANTLR4 and LLVM. 

### Run

Folder ```code``` is the base folder for all scala code. 

```
$ cd code
$ sbt
(wait for build to complete...)

$ ~run 
```

 ```~```  for re-run on file changes. 

 ### Grammar

 The grammar for ```simpl```, is in ```parser/grammar``` folder. 

 ```
 assert (x + y * 90 > 500);
 ```

### Parse Tree

![Parse-Tree](https://github.com/codersguild/parser-symbolic-exec/blob/master/code/src/main/scala/parser/grammar/grammar.png)

###  Sample Output 

We pass ```simple.simpl``` file to  our lexer-parser and run parsing to generate constraints as per
```assert``` statements. ```Conditional Statements``` not covered yet. 

```Z3```  run on dummy constraints using ```scala z3 api``` .  See function ```ExampleZ3Solving()```
in ```parser.scala```.

```bash
    AssignRuleAdded
    AssignRuleAdded
    AssignRuleAdded
    AssignRuleAdded
    AssignRuleAdded
    AssignRuleAdded
    Conditional : (fullcondlexpr : x > y) ? (true) {x=90;} : (false) (x=z-y;)
    line 1:13 missing ';' at '<EOF>'
    GreaterThanRuleAdded
    AssertRule : (id: z) (relop: >) (condexpr: x) (result : 90)
    GreaterThanRuleAdded
    AssertRule : (id: z) (relop: >) (condexpr: b) (result : 0)
    Print : (evalprintrec: x+20+5*y) : 39600
    Print : (evalprintrec: y) : 7898
    Print : (evalprintrec: z) : 27717
    line 1:18 missing ';' at '<EOF>'
    GreaterThanRuleAdded
    AssertRule : (id: z) (relop: >) (condexpr: y+62) (result : 7960)
    Domain : HashMap(a -> int, b -> int, x -> int, y -> int, z -> int, m -> bool)
    Delta : HashMap(a -> 0, b -> 0, x -> 90, y -> 7898, z -> 27717, m -> 1)
    sat
```

For ```simple.simpl``` file program. 

```bash 
    [info] running Main ./samples/simple.simpl
    AssignRuleAdded
    AssignRuleAdded
    AssignRuleAdded
    AssignRuleAdded
    AssignRuleAdded
    AssignRuleAdded
    Conditional : (fullcondlexpr : x > y) ? (true) {x=90;} : (false) (x=z-y;)
    GreaterThanRuleAdded
    AssertRule : (id: z) (relop: >) (condexpr: x) (result : 90)
    GreaterThanRuleAdded
    AssertRule : (id: z) (relop: >) (condexpr: b) (result : 0)
    Print : (evalprintrec: x+20+5*y) : 39600
    Print : (evalprintrec: y) : 7898
    Print : (evalprintrec: z) : 27717
    GreaterThanRuleAdded
    AssertRule : (id: z) (relop: >) (condexpr: y*54-67*x) (result : 420462)
    GreaterThanRuleAdded
    AssertRule : (id: y) (relop: >) (condexpr: z/50+62) (result : 616)
    AssignRuleAdded
    Print : (evalprintrec: x-a+b-y+z*78) : 2154118
    GreaterThanRuleAdded
    AssertRule : (id: x) (relop: >) (condexpr: z*y) (result : 218908866)
    Domain : HashMap(a -> int, b -> int, x -> int, y -> int, z -> int, m -> bool, n -> bool)
    Delta : HashMap(a -> 0, b -> 0, x -> 90, y -> 7898, z -> 27717, m -> 1, n -> 0)
    unsat
``` 

### TO-DO

1.  How to process branch statements/conditionals ?
2.  Check for variable redeclaration and redefiniton ?
3.  Add Support for boolean expressions.
4.  Include Loops
5.  Make Z3 Expressions while parsing. 
6.  Make ANTRL4 Visitor parser do annotations and semantic analysis.
7.  Printing the Z3 Model. 











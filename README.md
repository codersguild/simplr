
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
    [warn] three warnings found
    [info] running Main ./samples/simple.simpl
    Conditional : (fullcondlexpr : x > y) ? (true) {x=90;} : (false) (x=z-y;)
    AssertRule : (id: x) (relop: >) (condexpr: y)
    AssertRule : (id: z) (relop: >) (condexpr: b)
    Print : (evalprintrec: x+20+5*y) : 39600
    Print : (evalprintrec: y) : 7898
    Print : (evalprintrec: z) : 27717
    Domain : HashMap(a -> int, b -> int, x -> int, y -> int, z -> int, m -> bool)
    Delta : HashMap(a -> 0, b -> 0, x -> 90, y -> 7898, z -> 27717, m -> 1)
    sat
```








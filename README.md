
[![Build Status](https://travis-ci.com/codersguild/parser-symbolic-exec.svg?token=y7dv4AHgKobrxUyj4TGA&branch=master)](https://travis-ci.com/codersguild/parser-symbolic-exec) [![Scala](https://img.shields.io/badge/Scala-2.11.0-blue)](https://img.shields.io/badge/Scala-2.11.0-blue)

### Project

Demonstrate parsing, and constraint solving on a new programming language ```simpl``` 
using scala, z3, ANTLR4 and LLVM. 

### Run

Folder ```simpl``` is the base folder for all scala code. 

```
$ cd code
$ sbt
(wait for build to complete...)

$ ~run ./samples/simple.simpl
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

For ```simple.simpl``` file program. 

```bash 
        Assign : x = 90
        AssignRuleAdded
        Assign : y = 7898
        AssignRuleAdded
        Assign : m = 1
        AssignRuleAdded
        Assign : z = 27717
        AssignRuleAdded
        GreaterThanRuleAdded
        LessThanRuleAdded
        Print : 39600
        GreaterThanRuleAdded
        Print : 90
        Print : 23
        Print : 7898
        Print : 27717
        NotEqualRuleAdded
        NotEqualRuleAdded
        Assign : n = 0
        AssignRuleAdded
        Print : 2154118
        LessThanRuleAdded
        Print : 7988

        No of Z3 Assertions : 11
        __m = 1
        __x > 0
        __z > 90
        __n = 0
        __z < 0
        __x = 90
        __z != 420462
        __y != 616
        __y = 7898
        __z = 27717
        __x < 218908866

        Not Satisfiable
``` 

### TO-DO

1. Convert the processing into passes. 
2. Check and Print Z3 Model.
3. Handle Function Calls. 
4. Improve the token matching. 

### Working

1.  Z3 Modelling. 
2.  New Grammar definition for functions & multi-line block statements.
3. Fix Z3 Linking errors. 
4. Add Z3 Symbolic Equations

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








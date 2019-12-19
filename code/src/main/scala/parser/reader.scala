package reader

import scala.collection.mutable._
import scala.collection.immutable._
import scala.io._

object reader {
    
    def read (name : String) : List[String] =  {
        return Source.fromFile(name).getLines.toList
    }
    
}
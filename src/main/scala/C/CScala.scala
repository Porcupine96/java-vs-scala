package C

class CScala {

  /*
    Let's sum all integers from a given list but only those that are divisible by 7.
    In addition to this, assume that the input is provided as a list of Strings.
     */

  def sumDivBy7Scala(numbers: List[String]) = numbers.map(_.toInt).filter(_ % 7 == 0).sum

}

package C

import java.util.concurrent.Executors

import scala.concurrent.{ExecutionContext, Future}

class MapsVsForExpressions {

  implicit val executionContext = ExecutionContext.fromExecutor(Executors.newFixedThreadPool(8))

  def listsCollectionWay(listOfMaps: List[Map[Int, List[Int]]]): List[Int] = listOfMaps.flatMap(_.values.flatten)

  def listsForExpressionWay(listOfMaps: List[Map[Int, List[Int]]]): List[Int] =
    for {
      map <- listOfMaps
      list <- map.values
      element <- list
    } yield element


  def futuresCollectionWay(futureString: Future[String], futureInt: Future[Int], futureBoolean: Future[Boolean]): Future[(String, Int, Boolean)] =
    futureString
      .flatMap { string =>
        futureInt.flatMap { int =>
          futureBoolean.map { bool =>
            (string, int, bool)
          }
        }
      }

  def futuresForExpressionWay(futureString: Future[String], futureInt: Future[Int], futureBoolean: Future[Boolean]): Future[(String, Int, Boolean)] =
    for {
      string <- futureString
      int <- futureInt
      bool <- futureBoolean
    } yield (string, int, bool)

}

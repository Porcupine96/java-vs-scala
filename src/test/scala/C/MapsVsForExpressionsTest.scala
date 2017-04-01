package C

import org.scalatest.{AsyncFlatSpec, Matchers}

import scala.concurrent.Future

class MapsVsForExpressionsTest extends AsyncFlatSpec with Matchers {

  private val testClass = new MapsVsForExpressions

  private val listOfMaps = List(
    Map(1 -> List(1, 2)),
    Map(2 -> List(3, 4), 3 -> List(5, 6))
  )

  // what would happen if we used "val" instead of "def"? :)
  private def futureString = Future.successful("hello")

  private def futureInt = Future.successful(1)

  private def futureBoolean = Future.successful(true)


  "The list example" should "work when solved using collection operations" in {
    testClass.listsCollectionWay(listOfMaps) shouldBe List(1, 2, 3, 4, 5, 6)
  }

  it should "work when solved using for expressions" in {
    testClass.listsForExpressionWay(listOfMaps) shouldBe List(1, 2, 3, 4, 5, 6)
  }


  "The future example" should "work when solved using collection operations" in {
    testClass.futuresCollectionWay(futureString, futureInt, futureBoolean).map { result =>
      result shouldBe("hello", 1, true)
    }
  }

  it should "work when solved using for expressions" in {
    testClass.futuresForExpressionWay(futureString, futureInt, futureBoolean).map { result =>
      result shouldBe("hello", 1, true)
    }
  }

}

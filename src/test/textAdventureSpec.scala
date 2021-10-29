package textAdventure
import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

class textAdventureSpec extends AnyWordSpec {

  "A Healthbar" when {
    "empty" should {
      "be created using the amount of HP between 0 and 10" in {
        val hp = healthbar(0)
        hp should be("|                    |")
      }
    }
    "full" should {
      val hp = healthbar(10)
      hp should be("|+ + + + + + + + + +|")
    }
  }
}

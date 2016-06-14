package coffeemixer

import org.scalatest.{FlatSpec, Matchers}

class MixerSpec extends FlatSpec with Matchers {

  "A Base Coffee" should "have basic stats" in {
    val coffee = Coffee()
    coffee.texture should be (0)
    coffee.flavor should be ("neutral")
    coffee.cream should be (false)
  }

}
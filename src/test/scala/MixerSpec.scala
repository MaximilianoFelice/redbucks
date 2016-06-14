package coffeemixer

import org.scalatest.{FlatSpec, Matchers}

class MixerSpec extends FlatSpec with Matchers {

  "A Base Coffee" should "have basic stats" in {
    val coffee = Coffee()
    coffee.texture should be (0)
    coffee.flavor should be ("neutral")
    coffee.cream should be (false)
  }

  "A Coffee" should "be combinable with chocolate" in {
    val coffee = Coffee()
    val chocolate = Chocolate()
    val newCoffee = coffee.add(chocolate)
    newCoffee.texture should be (coffee.texture + 1)
    newCoffee.flavor should be ("neutral")
  }

  "A Coffee" should "be combinable with cream" in {
    val coffee = Coffee()
    val cream = Cream()
    val newCoffee = coffee.add(cream)
    newCoffee.cream should be (true)
  }

  "A Coffee" should "be combinable with colombian beans" in {
    val coffee = Coffee()
    val beans = ColombianBeans()
    val newCoffee = coffee.add(beans)
    newCoffee.texture should be (coffee.texture + 10)
    newCoffee.flavor should be ("bitter")
  }

  "A Coffee" should "be correctly informed to the users" in {
    val coffee = Coffee()
    val beans = ColombianBeans()
    val watery = coffee.add(beans)
    watery.displayable.texture should be (5)
    val strong = watery.add(beans)
    strong.texture should be (20)
    strong.displayable.texture should be (40)
  }

  "Two Coffees" should "be correctly mixed" in {
    val coffee = Coffee()
    val beans = ColombianBeans()
    val watery = coffee.add(beans)
    val strong = watery.add(beans).add(Cream())

    val mix = watery.combine(strong)

    mix.texture should be (30)
    mix.cream should be (true)
  }

}
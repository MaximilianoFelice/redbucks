package coffeemixer

trait CoffeeState {
  def texture: Int
  def cream: Boolean
  def flavor: String
}

case class WateryCoffee(base: Coffee) extends CoffeeState {
  def texture: Int = base.texture / 2
  def cream: Boolean = base.cream
  def flavor: String = base.flavor
}

case class StrongCoffee(base: Coffee) extends CoffeeState {
  def texture: Int = base.texture * 2
  def cream: Boolean = base.cream
  def flavor: String = base.flavor
}

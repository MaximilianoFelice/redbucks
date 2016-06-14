package coffeemixer

trait Ingredient {
  def action(coffee: Coffee): Coffee
}

case class Chocolate() extends Ingredient {
  def action(coffee: Coffee): Coffee = Coffee(coffee.texture + 1, coffee.cream, coffee.flavoring("sweet"))
}

case class Cream() extends Ingredient {
  def action(coffee: Coffee): Coffee = Coffee(coffee.texture, true, coffee.flavor)
}

case class ColombianBeans() extends Ingredient {
  def action(coffee: Coffee): Coffee = Coffee(coffee.texture + 10, coffee.cream, coffee.flavoring("bitter"))
}
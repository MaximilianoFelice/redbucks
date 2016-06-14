/**
  * Created by maximilianofelice on 13/06/16.
  */
package object coffeemixer {

  def computeState(coffee: Coffee): CoffeeState = coffee match {
    case Coffee(x, _, _) if x < 15 => WateryCoffee(coffee)
    case _ => StrongCoffee(coffee)
  }

  def mixCoffee(ingredients: Seq[Ingredient]): Coffee =
    ingredients.foldLeft[tree.Tree[Ingredient]](tree.Empty())(_.add(_)).foldLeft(Coffee())(_.add(_))

}

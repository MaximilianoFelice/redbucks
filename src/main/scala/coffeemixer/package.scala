/**
  * Created by maximilianofelice on 13/06/16.
  */
package object coffeemixer {

  def computeState(coffee: Coffee): CoffeeState = coffee match {
    case Coffee(x, _, _) if x < 15 => WateryCoffee(coffee)
    case _ => StrongCoffee(coffee)
  }

}

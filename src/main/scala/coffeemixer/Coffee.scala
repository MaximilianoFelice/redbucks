package coffeemixer

/**
  * Created by maximilianofelice on 13/06/16.
  */
case class Coffee(val texture: Int = 0, val cream: Boolean = false, val flavor: String = "neutral") {

  lazy val displayable = computeState(this)

  def add(ingredient: Ingredient): Coffee = ingredient.action(this)

  def flavoring(newFlavor: String): String =
    if (newFlavor > flavor) flavor
    else newFlavor

  def combine(coffee: Coffee): Coffee = Coffee(coffee.texture + texture, coffee.cream || cream, coffee.flavoring(flavor))
}

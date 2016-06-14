package tree

trait Tree[T] {

  def add(elem: T): Tree[T]

  def foldLeft[B](z: B)(op: (B, T) => B): B

  def length: Int

}

case class Empty[T]() extends Tree[T] {
  override def add(elem: T): Tree[T] = Leaf(elem)

  override def length: Int = 0

  override def foldLeft[B](z: B)(op: (B, T) => B): B = z
}

case class Leaf[T](elem: T) extends Tree[T] {
  override def add(el: T): Tree[T] = Node(this, Leaf(el), 2)

  override def length: Int = 1

  override def foldLeft[B](z: B)(op: (B, T) => B): B = op(z, elem)
}

case class Node[T](left: Tree[T] = Empty(), right: Tree[T] = Empty(), val length: Int = 0) extends Tree[T] {
  override def add(elem: T): Tree[T] =
    if (left.length <= right.length) Node(left.add(elem), right, length + 1)
    else Node(left, right.add(elem), length + 1)

  override def foldLeft[B](z: B)(op: (B, T) => B): B = right.foldLeft(left.foldLeft(z)(op))(op)
}

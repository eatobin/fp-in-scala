package myOwnStuff

class Foo(val name: String, val age: Int, val sex: Symbol)

object Foo {
  def apply(name: String, age: Int, sex: Symbol) = new Foo(name, age, sex)

  val fooList: List[Foo] = Foo("Hugh Jass", 25, Symbol("male")) ::
    Foo("Biggus Dickus", 43, Symbol("male")) ::
    Foo("Incontinentia Buttocks", 37, Symbol("female")) ::
    Nil

  val stringList: List[String] = fooList.foldLeft(List[String]()) { (z, f) =>
    val title = f.sex match {
      case Symbol("male") => "Mr."
      case Symbol("female") => "Ms."
    }
    z :+ s"$title ${f.name}, ${f.age}"
  }

  def main(args: Array[String]): Unit = {
    println(stringList.head) // Mr. Hugh Jass, 25
    println(stringList(2)) // Ms. Incontinentia Buttocks, 37
  }
}

object Test {
  def main(args: Array[String]): Unit = {
    val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
    val nums = Nil

    println("Head of fruit : " + fruit.head)
    println("Tail of fruit : " + fruit.tail)
    println("Check if fruit is empty : " + fruit.isEmpty)
    println("Check if nums is empty : " + nums.isEmpty)
    println("Length of fruit : " + fruit.length)
    println("Length of nums : " + nums.length)
  }
}

object textAdventure {

  @main def hello: Unit =
    println("Welcome!")

  val width = 1
  val zeilen = 2
  val spalten = 20
  def cells(cellwidth: Int = 3) = ("|" + " " * cellwidth) * spalten + "|\n"
  def bar(cellwidth: Int = 3) = ("+" + "-" * cellwidth) * spalten + "+\n"
  val mesh = (bar(width) + cells(width)) * zeilen + bar(width)
  println(mesh)
}

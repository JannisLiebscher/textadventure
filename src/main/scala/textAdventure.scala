object textAdventure {
  @main def hello: Unit =
    println("Welcome!")

  val health = 10
  val width = 1
  val zeilen = 1
  val spalten = 20
  def cells(cellwidth: Int = 3) = ("|" + " " * cellwidth) * spalten + "|\n"
  def bar(cellwidth: Int = 3) = ("+" + "-" * cellwidth) * spalten + "+\n"

  def healthbar(hp: Int = 0) = ("|" + "+ " * hp) + "  " * (10 - hp) + "|\n"

  val mesh = (bar(width) + cells(width)) * zeilen + bar(width)
  println(mesh)
  print("HP:" + healthbar(health))

}

import scala.io.StdIn.readLine

object textAdventure {
  @main def run: Unit =
    println("Welcome!")
    println("HP between 0 and 10")
    val health = readLine.toInt
    val mesh = (bar(width) + cells(width)) * zeilen + bar(width)
    println(mesh)
    print("HP:" + healthbar(health) + "\n")

  val width = 1
  val zeilen = 1
  val spalten = 20
  def cells(cellwidth: Int = 3) = ("|" + " " * cellwidth) * spalten + "|\n"
  def bar(cellwidth: Int = 3) = ("+" + "-" * cellwidth) * spalten + "+\n"

  def healthbar(hp: Int = 0): String =
    ("|" + "+ " * hp) + "  " * (10 - hp) + "|"
}

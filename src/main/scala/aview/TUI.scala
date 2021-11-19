package aview

import scala.io.StdIn.readLine
import controller.Controller
import util.Observer

class TUI(controller: Controller) extends Observer:
  controller.add(this)
  def run =
    println(controller.toString())
    getInputAndPrintLoop()

  override def update = ???

  def getInputAndPrintLoop(): Unit =
    val input = readLine
    input match
      case "hp" =>
        val test = controller.getHealth()
        print(controller.getHealth().toString())
      case _ =>
        print("Unknown command!\n")

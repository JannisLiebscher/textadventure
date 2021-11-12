package aview

import scala.io.StdIn.readLine
import controller.Controller
import util.Observer

class TUI(controller: Controller) extends Observer:
  controller.add(this)
  def run =
    println(controller.ToString())
    getInputAndPrintLoop(controller)

  override def update = ???

def getInputAndPrintLoop(controller: Controller): Unit =
  val input = readLine
  input match
    case "hp" =>
      controller.getHealth()

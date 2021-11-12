package controller
import util.Observable
import model.Health
case class Controller(h: Health) extends Observable:
  def getHealth(): String = h.toString

  def ToString(): String = "Hi ich bin ein Controller!"

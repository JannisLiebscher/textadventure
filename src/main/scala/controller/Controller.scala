package controller
import util.Observable
import model.Health
import model.Level
case class Controller(h: Health, l: Level) extends Observable:

  def getHealth(): String = h.toString

  override def toString(): String = "Hi ich bin ein Controller!"

  def getLvl(): String = l.toString

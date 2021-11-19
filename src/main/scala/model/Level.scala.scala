package model

case class Level(lvl: Int):
  override def toString: String =
    "Level " + lvl + "!"

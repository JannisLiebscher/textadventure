package model

case class Health(hp: Int):
  override def toString: String =
    ("|" + "+ " * hp) + "  " * (10 - hp) + "|"

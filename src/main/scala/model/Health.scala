package model

case class Health():
  val hp = 10
  override def toString: String =
    ("|" + "+ " * hp) + "  " * (10 - hp) + "|"

case class cells(cellwidth: Int) {
  def isSet: Boolean = value != 0
}

val cell1 = cells(2)
cell1.isSet

val cell2 = cells(0)
cell2.isSet
case class cells(cellwidth: Int) {
  val value = 1
  def isSet: Boolean = value != 0
}

val cell1 = cells(2)
cell1.isSet

val cell2 = cells(0)
cell2.isSet
def healthbar(hp: Int = 0): String =
  ("|" + "+ " * hp) + "  " * (10 - hp) + "|"
def hp = healthbar(10)
hp.equals("|+ + + + + + + + + + |")
val hp2 = healthbar(1)
print(hp2)
val st = "hallo"
st.equals("hallo")

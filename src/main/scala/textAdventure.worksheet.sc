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
print(hp)
val st = "hallo"
st.equals("hallo")

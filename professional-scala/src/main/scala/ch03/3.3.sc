val oneTwoThree = List(1,2,3)

val oneTwo = List(1,2)
val threeFour = List(2,4)
val oneTwoThreeFour = oneTwo ::: threeFour
println(oneTwo + " and " + threeFour + " were not mutated.")
println("Thus, " + oneTwoThreeFour + " is new list")

val twoThree = List(2, 3)
val oneTwoThreeNew = 1::twoThree

val oneTwoThree02 = 1::2::3::Nil

val emptyList = List()
val emptyList1 = Nil


oneTwoThree.count(item => (item == 1))

oneTwoThree.exists(item=>(item == 1))


oneTwoThree.sortWith((a,b)=>(a>b))

oneTwoThree


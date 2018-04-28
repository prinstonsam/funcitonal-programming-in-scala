
var jetSet = Set("Boeing", "Airbus")

jetSet += "Lear"
jetSet += "aaa"

println(jetSet.contains("Cesna"))
println(jetSet)

jetSet = jetSet + "my"
jetSet = jetSet + "here"
jetSet += "aaa1"
jetSet
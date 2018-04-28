val greetStrings = new Array[String](3)
greetStrings(0) = "Hello"
greetStrings(1) = ","
greetStrings(2) = "World"

for(i<-0 to 2) {
  print(greetStrings(i))
}

greetStrings.update(0, "My")
greetStrings.update(1, "name")
greetStrings.update(2, "Igor")

for(i<-0 to 2) {
  print(greetStrings(i))
}
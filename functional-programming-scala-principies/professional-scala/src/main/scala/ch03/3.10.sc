import scala.io.Source


for (line <- Source.fromFile("/home/igors/exthdd/work" +
  "/projects/scala/coursera/professional-scala" +
  "/src/main/scala/ch03/test").getLines())
  println(line.length + " " + line)

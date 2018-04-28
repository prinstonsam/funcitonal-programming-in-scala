def formatArgs(args: Array[String]) = args.mkString("\n")

val s = Array("a", "b", "c")

formatArgs(s)
print(formatArgs(s))
abstract class JSON

case class JSeq(elems: List[JSON]) extends JSON

case class JObj(bindings: Map[String, JSON]) extends JSON

case class JNum(num: Double) extends JSON

case class JStr(num: String) extends JSON

case class JBool(b: Boolean) extends JSON

case object JNull extends JSON

val data = JObj(
  Map("firstName" -> JStr(" John"),
    "lastName" -> JStr(" Smith"),
    "address" -> JObj(Map(
      "streetAddress" -> JStr(" 21 2 nd Street"),
      "state" -> JStr(" NY"),
      "postalCode" -> JNum(10021)
    )),
    "phoneNumbers" -> JSeq(List(
      JObj(Map(
        "type" -> JStr(" home"), " number" -> JStr(" 212 555 - 1234")
      )),
      JObj(Map(
        "type" -> JStr(" fax"), " number" -> JStr(" 646 555 - 4567")
      ))
    ))
  ))

def show(json: JSON): String = json match {
  case JSeq(elems) =>
    "[" + (elems map show mkString ", ") + "]"
  case JObj(bindings) =>
    val assocs = bindings map {
      case (key, value) => "\"" + key + "\": " + show(value)
    }
    "{" + (assocs mkString ", ") + "}"
  case JNum(num) => num.toString
  case JStr(str) => '\"' + str + '\"'
  case JBool(b) => b.toString
  case JNull => " null"
}

show(data)

val f: String => String = {case "ping" => "pong"}
val f1: PartialFunction[String, String] = {
  case "ping" => "pong"
}


val f2: PartialFunction[List[Int], String] = {
  case Nil => "one"
  case x::y::rest => "two"
}

f2.isDefinedAt(List(1,2))
f2.isDefinedAt(List(1,2,3,4))

val g: PartialFunction[List[Int], String] = {
  case Nil => "one"
  case x :: rest =>
    rest match {
      case Nil => "two"
    }
}

g.isDefinedAt(List(1,2))
g.isDefinedAt(List(1,2,3,4))

abstract class Base{
  def foo = 1
  def bar: Int
}

class Sub extends Base {
  override def bar: Int = 3
  override def foo: Int = 2
}
class ChecksummAccumulator {
  private var sum = 0

  def add(b: Byte): Unit = sum += b

  def checksum(): Int = ~(sum & 0xFF) +1
}

val cs = new ChecksummAccumulator

cs.add(0xFF.toByte)

println(cs.checksum())
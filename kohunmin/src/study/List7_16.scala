package study

object List7_16 {
  def main(args: Array[String]): Unit = {
    var i = 0
    var foundIt = false
    while (i < args.length && !foundIt) {
      if (!args(i).startsWith("-"))
        if (args(i).endsWith(".scala"))
          foundIt = true
      i = i + 1
    }
  }
}
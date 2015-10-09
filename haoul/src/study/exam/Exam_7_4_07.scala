package study.exam

/**
 * @author Haoul
 */
object Exam_7_4_07 {
  def main(args: Array[String]): Unit = {
    def searchFrom(i: Int): Int =
    if(i >= args.length) -1
    else if(args(i).startsWith("-")) searchFrom(i+1)
    else if(args(i).endsWith(".scala")) i
    else searchFrom(i+1)
    
    val i = searchFrom(0)
  }  
}
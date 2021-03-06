package study.exam.day6.control.refactoring3

/**
 * @author Yunseong
 */
object FileMatcher {
  private def filesHere = (new java.io.File(".")).listFiles
  
  def filesEnding(query: String) {
    filesMatching(_.endsWith(query))
  }
  
  def filesContaining(query: String) = {
    filesMatching(_.contains(query))
  }
  
  def filesRegex(query: String) {
    filesMatching  (_.matches(query))
  }
  
  private def filesMatching(matcher: String => Boolean) = {
    for(file <- filesHere; if matcher(file.getName))
      yield file
  }
}
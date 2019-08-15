import scala.io.{Source,BufferedSource}

object AdventOfCode01 {

  def input():BufferedSource = Source.fromResource("input01.txt")

  def main(args: Array[String]): Unit = {
    part01
    part02
  }

  def part01() : Unit = {
    println("Part01 = " + input.getLines.foldLeft(0) { _ + _.toInt })
  }

  def part02() : Unit = {

  }
}

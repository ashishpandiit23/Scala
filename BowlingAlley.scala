

object BowlingAlley {

  def main(args: Array[String]) {
    //var no_Of_Lanes = 10
    //var no_of_set = 10

    var key_set_play = Map[String, (List[Int], Int, Int)]()
    var key_set_score = Map[String, Int]()

    var x = 5
    var spare = 0
    var strike = 0

    println("for addition of player press 1" + "\n" + "for removal of player press 2" + "\n" +
      "for displaying the score press 3" + "\n" + "for exit press 0" + "for play game press 4")
    while (x != 0) {
      x = Console.readLine().toInt

      if (x == 1) {
        println("Enter the name of player")
        var name = Console.readLine()
        var k = (name, (List(0), spare, strike))
        key_set_play = addPlayer(key_set_play, k)
        println("for addition of player press 1" + "\n" + "for removal of player press 2" + "\n" +
          "for displaying the score press 3" + "\n" + "for exit press 0" + "for play game press 4")
      }

      if (x == 2) {
        println("Enter the name which needs to be removed")
        var name = Console.readLine()
        var k = (name, (List(0), spare, strike))
        key_set_play = removePlayer(key_set_play, k)
        println("for addition of player press 1" + "\n" + "for removal of player press 2" + "\n" +
          "for displaying the score press 3" + "\n" + "for exit press 0" + "for play game press 4")
      }

      if (x == 3) {
        displayScore(key_set_play, key_set_score)
        println("for addition of player press 1" + "\n" + "for removal of player press 2" + "\n" +
          "for displaying the score press 3" + "\n" + "for exit press 0" + "for play game press 4")
      }

      if (x == 4) {

        println("Enter the player Name:" + "\t")
        var name = Console.readLine()
        println("Enter the set Number:" + "\t")
        var setno = Console.readInt()
        println("Enter the pin drop:" + "\t")
        var pindrop = Console.readInt()
        if (setno == 1 && pindrop == 10) {
          pindrop = pindrop + 10
          strike = 1
        }

        key_set_play = play(key_set_play, name, setno, pindrop, spare, strike)
        println("for addition of player press 1" + "\n" + "for removal of player press 2" + "\n" +
          "for displaying the score press 3" + "\n" + "for exit press 0" + "for play game press 4")
      }
    }

  }

  def addPlayer(key_set_play: Map[String, (List[Int], Int, Int)], K: (String, (List[Int], Int, Int))): Map[String, (List[Int], Int, Int)] =
    {
      var key_set = key_set_play
      if (key_set_play.size < 10) {
        key_set = key_set_play + K
      }
      return key_set
    }

  def removePlayer(key_set_play: Map[String, (List[Int], Int, Int)], K: (String, (List[Int], Int, Int))): Map[String, (List[Int], Int, Int)] =
    {
      var key_set = key_set_play

      if (key_set_play.keySet.exists(_ == K._1)) {
        var key_set = key_set_play - K._1
      }
      key_set
    }

  def displayScore(key_set_play: Map[String, (List[Int], Int, Int)], key_set_score: Map[String, Int]) {

    var x = key_set_play.keySet.toList
    var ScoreMap = key_set_score
    var p = x(0)
    try {

      for (i <- 0 to key_set_play.size) {
        var score = key_set_play(x(i))._1.reduce(_ + _)
        var ScoreMap = key_set_score

        ScoreMap = ScoreMap + (x(i) -> score)

        for ((k, v) <- ScoreMap) printf("player: %s, Score: %d\n", k, v)
      }
    } catch {
      case e: Exception => println("")
    }
  }
  def play(key_set_play: Map[String, (List[Int], Int, Int)], name: String, setno: Int, pindrop: Int, Spare: Int, Strike: Int): Map[String, (List[Int], Int, Int)] = {

    var spare1 = Spare
    var strike1 = Strike
    var key_set = key_set_play

    var p = key_set(name)._1 :+ pindrop

    key_set = key_set + (name -> (p, spare1, strike1))
    key_set
  }
}

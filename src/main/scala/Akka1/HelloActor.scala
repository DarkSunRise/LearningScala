import akka.actor._
import akka.util._

/** Simple hello from an actor in Scala. */
object Hello1 extends App {

  val system = ActorSystem("actor-demo-scala")
  val hello = system.actorOf(Props[Hello])
  hello ! "Bob"
  Thread sleep 1000
  system terminate()

  class Hello extends Actor {
    def receive = {
      case name: String => println(s"Hello $name")
    }
  }
}
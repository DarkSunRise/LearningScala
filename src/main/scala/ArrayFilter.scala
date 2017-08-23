object HelloFilter
{
  def main(args: Array[String]): Unit = {
    args.filter( (arg:String) => arg.startsWith("G") )
      .foreach( (arg:String) => Console.println("Found " + arg) )
  }
}
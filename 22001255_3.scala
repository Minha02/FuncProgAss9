object StringFormatter {

  def toUpper(str: String): String = str.toUpperCase

  def toLower(str: String): String = str.toLowerCase

  def formatNames(name: String, formatter: String => String): String = {
    formatter(name)
  }

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    val upperCaseFormatter: String => String = toUpper
    val lowerCaseFormatter: String => String = toLower
    val customFormatter1: String => String = name => name.substring(0, 2).toUpperCase + name.substring(2)
    val customFormatter2: String => String = name => {
      name.substring(0, 1).toUpperCase() + name.substring(1, name.length() - 1) + name.substring(name.length() - 1).toUpperCase
    }

    names.foreach { name =>
      val formattedName = name match {
        case "Benny"    => formatNames(name, upperCaseFormatter)
        case "Niroshan" => formatNames(name, customFormatter1)
        case "Saman"    => formatNames(name, lowerCaseFormatter)
        case "Kumara"   => formatNames(name, customFormatter2)
        case _          => "Unknown"
      }
      println(formattedName)
    }
  }
}

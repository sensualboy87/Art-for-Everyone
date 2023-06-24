object ArtForEveryone {
  def main(args: Array[String]): Unit = {
    // prints welcome message
    println("Welcome to Art For Everyone!")
    
    // create an array of different types of art
    val artTypes = Array("Painting", "Sculpting", "Drawing", "Photography", "Fashion Design", "Printmaking")
    
    // prints all the different types of art
    for (a <- artTypes) {
      println(a)
    }
    
    // prompts user to choose an art type
    println("Choose an art type from the list and let's get started!")
    val userChoice = scala.io.StdIn.readLine()
    
    // prints instructions for the chosen art type
    if (userChoice == "Painting") {
      println("To start painting, you will need some canvas, paint brushes, paints, and other art supplies.")
      println("Choose a location with good lighting and set up your canvas.")
      println("Make sure you have a variety of brush sizes and colors to choose from.")
      println("Once you are set up, start experimenting and painting away!")
    } else if (userChoice == "Sculpting") {
      println("To start sculpting, you will need clay, tools such as chisels and mallets, and other art supplies.")
      println("Choose a location with good lighting and set up your workspace.")
      println("Make sure you have a variety of tools to choose from.")
      println("Once you are set up, start experimenting and sculpting away!")
    } else if (userChoice == "Drawing") {
      println("To start drawing, you will need paper, pencils, pens, and other art supplies.")
      println("Choose a location with good lighting and set up your workspace.")
      println("Make sure you have a variety of pencils and pens to choose from.")
      println("Once you are set up, start experimenting and drawing away!")
    } else if (userChoice == "Photography") {
      println("To start photography, you will need a digital camera, lenses, and other art supplies.")
      println("Choose a location with good lighting and set up your workspace.")
      println("Make sure you have a variety of lenses to choose from.")
      println("Once you are set up, start experimenting and taking photos away!")
    } else if (userChoice == "Fashion Design") {
      println("To start fashion design, you will need fabric, thread, needles, and other art supplies.")
      println("Choose a location with good lighting and set up your workspace.")
      println("Make sure you have a variety of fabric to choose from.")
      println("Once you are set up, start experimenting and designing away!")
    } else if (userChoice == "Printmaking")  {
      println("To start printmaking, you will need paper, ink, and other art supplies.")
      println("Choose a location with good lighting and set up your workspace.")
      println("Make sure you have a variety of ink colors to choose from.")
      println("Once you are set up, start experimenting and printmaking away!")
    }
    
    // print final message
    println("Have fun and enjoy creating your own masterpiece!")
  }
}
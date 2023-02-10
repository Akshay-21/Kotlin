// Basic Syntax

/*  This is a collection of basic syntax elements with examples. At the end of every
    section, you'll find a link to a detailed description of the related topic.

    You can also learn all the kotlin essentials with the free Kotlin Basic track on
    JetBrains Academy.

*/

// Package definition and imports

// Package specification should be at the top of the source file.

//package my.demo
//import kotlin.text.*

// It is not required to match directories and packages: source files
// can be placed arbitrarily in the file system.


// Program entry point

// An entry point of a kotlin application is the main function.

/*fun main() {
println("Hello World!")
}*/

// Another form of main accepts a variable number of String arguments.
fun main(args: Array<String>) {
    println(args.contentToString())
}

// Print to the standard output

// 'print' prints its argument to the standard output.

/*fun main() {
    print("Hello ")
    print("world!")
}*/

// 'println' prints it argument and adds a line break, so that the next thing you print appears on the next line.

/*fun main() {
//println("Hello world!")
//    println(42)
}*/


// Functions

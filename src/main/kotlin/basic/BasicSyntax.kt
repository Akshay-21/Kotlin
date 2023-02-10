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
/*fun main(args: Array<String>) {
    println(args.contentToString())
}*/

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


//    A function with two 'Int' parameter and 'Int' return type.

/*
fun main() {
    println("sum of 3 and 5 is ")
    println(sum(3, 5))
}

fun sum(a:Int, b:Int):Int{
    return a + b;
}
*/

// A function body can be an expression. Its return type is inferred.

/*
fun main(){
println("sum of 19 and 23 is ${sum(19, 23)}")
}

fun sum(a:Int, b:Int) = a + b;
*/

//  A function that returns no meaningful value.

/*fun main() {
    printSum(-1, 8);
}


fun printSum(a:Int, b:Int):Unit{
    println("sum of $a and $b is ${a + b}")
}*/

//  'Unit' return type can be omitted.

/*fun main() {
    printSum(-1, 8)
}

fun printSum(a:Int, b:Int){
    println("sum of $a and $b is ${a + b}")
}*/

// =================== Variable ===================

// Variable

// Read-only local variable are defined using the keyword 'val'. They can be assigned a value only once.

/*
fun main(){
    val a: Int = 1 // immediate assignment
    val b = 2 // 'Int' type is inferred
    val c: Int // Type required when no initializer is provided
    c = 3;
}*/

// Variables that can be reassigned use the 'var' keyword.

/*
fun main(args: Array<String>) {
    var x = 5 // 'Int' type is inferred
    x += 1
    println("x= $x")
}
*/

// You can declare variables at the top level.

/*val PI = 3.14
var x = 0*/

/*fun main() {
    println("x = $x; PI = $PI")
    incrementX()
    println("incrementX()")
    println("x = $x; PI = $PI")
}

fun incrementX() {
    x += 1
}*/

// ========== Classes and instances ===========

// Creating classes and instances

// To define a class, use the class keyword

//class Shape

// Properties of a class can be listed in its declaration or body.

/*class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
}*/

// The default constructor with parameters listed in the class declaration is
// available automatically.

/*class Rectangle(val height: Double, var length: Double){
    var perimeter = (height + length) * 2
}

fun main(){
    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")
}*/

// Inheritance between classes is declared by a colon (:).
// Classes are final by default; to make a class inheritable, mark is as open.

/*open class Shape

class Rectangle(var height: Double, var length: Double) : Shape() {
    var perimeter = (height + length) * 2
}*/

// ============ Comments =============
//Just like most modern languages, kotlin supports single-line (or end-of-line) and multi-line
//(block) comments.

// This is an end-of-line comment

/*  This is block comment
    on multiple lines. */

// Block comments in kotlin can be nested.

/*The comment starts here
/* contains a nested comment */
 and end here. */


// ============ String templates ===========

// String templates

/*fun main() {
    var a = 1
// simple name in template:

    val s1 = "a is $a"
    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)
}*/

// ======== Conditional expressions =========

/*fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun main() {
    println("max of 0 and 42 is ${maxOf(0, 42)}")
}*/

// In kotlin, 'if' can also be used as an expression

/*fun maxOf(a: Int, b: Int) = if (a > b) a else b

fun main() {
    println("max of 22 and 13 is ${maxOf(22, 13)}")
}*/

// ============ for loop =================

/*fun main(){
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items){
        println(item)
    }*/

//    Or

/*
fun main() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}*/

// ==================== while loop ================

/*fun main() {
    val items = listOf("apple", "banana", "kiwifruit")
    var index = 0

    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}*/

// =========== When expression ==========

/*fun main() {
    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))
}

fun describe(obj: Any): String = when (obj) {
    1 -> "One"
    "Hello" -> "Greeting"
    is Long -> "Long"
    !is String -> "Not a string"
    else -> "Unknown"
}*/

// ============= Ranges ==============

// Check if a number is within a range using 'in' operator.

/*fun main() {
    val x = 10
    val y = 9

    if (x in 1..y + 1) {
        println("fits in range")
    }
}*/

// Check if a number is out of range.

/*fun main(args: Array<String>) {
    val list = listOf("a", "b", "c")

    if(-1 !in 0..list.lastIndex){
        println("-1 is out of range")
    }

    if(list.size !in list.indices){
        println("list size is out of valid list indices range, too")
    }
}*/

// Iterate over a range.

/*fun main(args: Array<String>) {
    for (x in 1..5) {
        println(x)
    }
}*/

// Or over progression.

/*fun main(args: Array<String>) {
    for (start in 1..10 step 2) {
        print(start)
    }
    println()
    for (start in 9 downTo 0 step 3) {
        print(start)
    }
}*/

// ============== Collection ====================

// Iterate over a collection

/*fun main(args: Array<String>) {
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }
}*/

// Check of a collection contains an object using in operator.

/*fun main(){
    val items = setOf("apple", "banana", "kiwifruit")
    when{
        "orange" in items -> println("Juicy")
        "apple" in items -> println("apple is fine too")
    }
}*/

// using lambda expression to filter and map collections:

/*fun main(args: Array<String>) {
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits.filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }
}*/

//============== Nullable values and null checks =================

//  A reference must be explicitly marked as nullable when null values is possible. Nullable type
// names have ? at the end

// Return null if 'str' does not hold an integer:

/*fun parseInt(str: String): Int? {
return str.toIntOrNull()
}*/

// use a function returning nullable value:

/*fun main(args: Array<String>) {
    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("a", "b")

}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

//    using 'x' * 'y' yields error because they may hold nulls.

    if (x != null && y != null) {
        // x and y are automatically cast to non-nullable after null check
        println(x * y)
    }
}

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}*/

//Or

/*
fun main() {
    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("99", "b")
}

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // ...
    if (x == null) {
        println("Wrong number format in arg1: '$arg1'")
        return
    }
    if (y == null) {
        println("Wrong number format in arg2: '$arg2'")
        return
    }

    // x and y are automatically cast to non-nullable after null check
    println(x * y)
}
*/


// Types checks and automatic casts

/* The 'is' operator checks if an expression is an instance of a type. If an immutable
local variable or  property is checked for a specific type, there's no need to cast it explicitly*/

/*fun main(args: Array<String>) {
    fun printLength(obj:Any)  {
        println("Getting the length of '$obj'. Result: ${getStringLength(obj)}")
    }

    printLength("Incomprehensibilities")
    printLength(1000)
    printLength(listOf(Any()))
}


fun getStringLength(obj: Any): Int? {
    if (obj is String) {
//       'obj' is automatically cast to 'String' in this branch
        return obj.length
    }

    // 'obj' is still of type 'Any' outside of the type-checked branch
    return null
}*/

// Or

fun main() {
    fun printLength(obj: Any) {
        println("Getting the length of '$obj'. Result: ${getStringLength(obj) ?: "Error: The object is not a string"} ")
    }
    printLength("Incomprehensibilities")
    printLength(1000)
    printLength(listOf(Any()))
}

fun getStringLength(obj: Any): Int? {
    if (obj !is String) return null

    // `obj` is automatically cast to `String` in this branch
    return obj.length
}

//or even

fun getStringLength(obj: Any): Int? {
    // `obj` is automatically cast to `String` on the right-hand side of `&&`
    if (obj is String && obj.length > 0) {
        return obj.length
    }

    return null
}

fun main() {
    fun printLength(obj: Any) {
        println("Getting the length of '$obj'. Result: ${getStringLength(obj) ?: "Error: The object is not a string"} ")
    }
    printLength("Incomprehensibilities")
    printLength("")
    printLength(1000)
}
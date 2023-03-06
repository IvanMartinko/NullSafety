fun main(args: Array<String>) {
    //Null vrijednost (null value) - no value present
    //Koristenje varijable s null vrijednosti baca NullPointerException (NPE) - crasha program
    //Tip varijable koja moze biti null ima znak ?

    //Primjer
    val herName: String = "Ana"
    println(herName)
    println(herName.length)

    val hisName: String? = null

    var myNullableName: String? = "Ivan"
    myNullableName = null
    println(myNullableName)


    ////////////////////////
    //Null-safe calls
    var dogName: String? = "Rex"  // UPITINIK PRETVARA U NULL
    println(dogName?.length)
    dogName = null
    println(dogName?.length)

    var a: Int? = 10
    println(a?.times(10))  // ili ?.plus  ?.minus ?.div, ...
    a = null
    println(a?.times(10))

    //Elvis operator ?:
    println(a?: 20)
    a = 30
    println(a?: 20)

    //println("Input something: ")  //Da korisnik nešto unese
    //val myInput = readLine()
    //println(myInput?.length)

    //val myValue2 = a ?: 30
    //println(myValue2.toString().length)

    //COLLECTIONS

    //List - ordered collection that can contain duplicate elements, immutable (neprmjenjiva)
    println("-------------------COLLECTIONS-------------------")
    val colors = listOf("red", "blue", "green")
    println(colors)

    val colors2 = listOf("red", "blue", null, null)
    println(colors2)
    println(colors2[0]) //dohvaćanje određenog elementa
    println(colors2.size)

    val colors3 = listOf<String>()
    println(colors3)
    println(colors3.size)
    print(colors3.isEmpty())
    println("----------------")

    //Mutable liste
    val colors4 = arrayListOf<String?>("blue", "red") //da moze ici null unutra ? jer ima u colors2 null
    println(colors4)
    colors4.add("green")
    println(colors4)
    colors4.addAll(colors2) //sad mogu her sam gore stavil string? i sad moze i colors2 koji ima null
    println(colors4)
    colors4.removeAll(listOf("blue")) //sve kaj ima blue miče, ak hocu jedan element onda samo remove("red")
    println(colors4)
    colors4.removeAt(0)
    print(colors4)
    println("------------------------------------------------------------------------------")


    val colors5 = listOf("red", "green")
    val colors6 = arrayListOf("red", "green")
    println(colors5 == colors6)
    colors6.remove("red")
    println(colors5 == colors6)

    //Sets
    val numbersSet = setOf(1, 2, 3, null, null)
    println(numbersSet)
    println(numbersSet.contains(1)) // kaže da je true
    println(numbersSet.size)
    println(numbersSet.isEmpty())  // kaže da je false

    var numbersHashSet = hashSetOf(1, 2, 3, null, null)
    println(numbersHashSet)
    numbersHashSet.add(5)  //dodaje peticu
    println(numbersHashSet)

    var colorsHashSet = hashSetOf("blue", "red")
    colorsHashSet.addAll(colors6)
    println(colorsHashSet)  //izbacio je duplikate









}
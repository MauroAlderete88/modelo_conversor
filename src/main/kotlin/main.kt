fun main(args: Array<String>) {


    val conversores = Conversores()

    //ejemplo conversion Hex a RGB
    println(conversores.convertToRGB("8c8c8c"))

    //ejemplo conversion RGB a Hex
    println(conversores.convertToHex("140,140,140"))
}
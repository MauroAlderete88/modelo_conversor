class Conversores () {


    private val hexToRGB = hexToRGB()
    private val RGBToHex = RGBToHex()

    fun convertToRGB (valor_string : String) : String {
        return hexToRGB.convertToRGB(valor_string)
    }

    fun convertToHex (valor_string: String) : String {
        return RGBToHex.convertToHex(valor_string)
    }


}
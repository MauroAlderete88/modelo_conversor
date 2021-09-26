class RGBToHex {

    fun convertToHex(RGB : String) : String {
         var arrayDenums : IntArray = StringToIntArray(RGB)
        return IntArrayToHexString(arrayDenums)
      }

    private fun StringToIntArray (RGB: String) : IntArray {

        var cadena : CharArray = RGB.toCharArray()

        var primerComa : Int? = null

        var segundaComa : Int? = null

         for (i in cadena.indices){

             if (cadena[i] ==','){
                 if (primerComa==null){
                     primerComa = i
                 }else {
                     segundaComa = i
                 }


            }
        }

        var R : Int = cadena.concatToString(0,primerComa!!).toInt()
        var G : Int = cadena.concatToString(primerComa+1,segundaComa!!).toInt()
        var B : Int = cadena.concatToString(segundaComa+1,cadena.size).toInt()
        var array : IntArray = intArrayOf(R,G,B)

        return array
    }

    private fun IntArrayToHexString(arrayNum : IntArray) : String {

        val R = java.lang.Integer.toHexString(arrayNum.get(0))
        val G = java.lang.Integer.toHexString(arrayNum.get(1))
        val B = java.lang.Integer.toHexString(arrayNum.get(2))

        var resultado : String = "#$R$G$B"
        return resultado
    }

}
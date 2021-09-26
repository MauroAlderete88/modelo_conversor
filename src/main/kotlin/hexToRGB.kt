import sun.security.ec.point.ProjectivePoint

class hexToRGB {

    fun convertToRGB (Hex : String) : String {
        var arrayInt = convert_CharToInt(Hex)
        var resultado = red(arrayInt.get(0), arrayInt.get(1))+","+
                        green(arrayInt.get(2), arrayInt.get(3))+","+
                        blue(arrayInt.get(4),arrayInt.get(5))

        return resultado
    }

    private fun convert_CharToInt (Hex : String) : MutableList<Int> {
        var lista_num : MutableList<Int> = arrayListOf()
        var lista : CharArray = Hex.toCharArray()

        for (item in lista.indices) {

            when (lista[item]) {
                '0'->lista_num.add(0)
                '1'->lista_num.add(1)
                '2'->lista_num.add(2)
                '3'->lista_num.add(3)
                '4'->lista_num.add(4)
                '5'->lista_num.add(5)
                '6'->lista_num.add(6)
                '7'->lista_num.add(7)
                '8'->lista_num.add(8)
                '9'->lista_num.add(9)
                'a','A'->lista_num.add(10)
                'b','B'->lista_num.add(11)
                'c','C'->lista_num.add(12)
                'd','D'->lista_num.add(13)
                'e','E'->lista_num.add(14)
                'f','F'->lista_num.add(15)
            }

        }
    return lista_num
    }

    private fun red(v1 : Int , v2 : Int) : String{
          var x = ((v1*16)+v2).toString()
          return x
    }

    private fun green(v1 : Int , v2 : Int) : String{
        var x = ((v1*16)+v2).toString()
        return x
    }

    private fun blue(v1 : Int , v2 : Int) : String{
        var x = ((v1*16)+v2).toString()
        return x
    }

}
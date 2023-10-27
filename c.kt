fun main(){
    var is_true = true
    var x: String = "0"
    var is_comma = false
    var symbol: Char?  = null
    var first: Double = 0.0
    while(is_true){
        var c :Char = readln()[0]
        try{
            var number = c.toString().toInt()
            if(x=="0"){x = ""}
            x += number
            if(symbol!=null){
                first = result(first, x, symbol)
            }
        }
        catch(e: Exception){
            if(c == '.' && !is_comma){
                is_comma = true
                x += "."
            }
            if(c!='.'){
                if(symbol == null) {
                    first = x.toDouble()
                }
                symbol = c
                x = "0"
            }
        }

        if(c=='='){
            is_true = false
            println(first)
        }
    }
}
fun result(first: Double, x: String, symbol: Char?):Double{
    var res = 0.0
    when(symbol){
        '+' -> res = first + x.toDouble()
        '-' -> res = first - x.toDouble()
        '*' -> res = first * x.toDouble()
        '/' -> res = first / x.toDouble()
    }
    return res
}

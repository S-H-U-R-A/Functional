fun main(args: Array<String>) {
    var resultado = calculadora(1,2,3, ::multiplicar)
    println("El resultado es: $resultado")

    println("La resta fue ${ calculadora(4,5,6, ::restar) }")

    println("La suma fue ${ calculadora(4,5,6, ::sumar) }")

}

//Funcion de orden Superior
fun calculadora(a: Int, b: Int, c: Int, operacion: (Int, Int, Int) -> Int): Int{
    return operacion(a, b, c)
}

//Funcion de una sola linea que asume que se retorna la suma
fun sumar(a: Int, b: Int, c: Int) = a+b+c

//Funcion normal que debe especificar el tipo de dato a retornar
fun restar(a: Int, b: Int, c: Int): Int{
    return a-b-c
}

fun multiplicar(a: Int, b: Int, c: Int): Int{
    return a*b*c
}
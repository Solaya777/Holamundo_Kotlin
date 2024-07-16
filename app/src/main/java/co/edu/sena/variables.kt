package co.edu.sena
//Hacemos una función principal para que se ejecute nuestro código
fun main(){
    val stringNombre = "Sebastian Olaya Echeverry"
    val stringficha = "2902274"
    println("Hola me llamo, $stringNombre, ficha $stringficha ")
    // En Kotlin podremos encontrar variables como:
    // Int, para números no muy grandes,
    // Long para números más grandes,
    // Float para números decimales,se debe poner una "f" al final de la declaración de la variable,
    // Double para números decimales y adicionalmente una mayor precisión en estos
    // Char para alfanuméricos
    // String para alfabeticos o carácteres

    var num1:Int = 13
    var num2:Int = 12

    println("Suma de 13+12: ")
    println(num1 + num2)

    //Para hacer que una variable pueda ser nula usaremos el "?",
    //hay diferentes tipos de uso con "?", pero por el momento solamente
    //usaremos el básico
    var variablenula: String? = null

    if (variablenula == null) {
        println("La variable es nula o null")
    } else {
        println("La variable no es nula")
    }

    //En el anterior código verificamos si la variable
    //es nula o null

    //En esta parte usamos opcionales basicos,
    //usamos el operador Elvis "?:"
    // para darle un valor por defecto
    //a un objeto Null

    val nombre: String? = null
    val UsuarioNull = nombre?: "Invitado"
    println("Hola, $UsuarioNull. Bienvenido!")

    val nombre2: String = "Jean"
    val UsuarioNoNull = nombre2
    println("Hola, $UsuarioNoNull. Bienvenido!")


}
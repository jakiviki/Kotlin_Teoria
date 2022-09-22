package poo_anahin.getters_setters

import java.time.LocalDate

// USER
// -email
// -password
// -cumpleaños
// -genero
// añadirUser(User)


class User (
    email: String,
    password: String
) {
    // auxiliares para la clase
    private var genero: List<Char> = listOf('M','F')
    private var date = LocalDate.now()
    var isValid= true

    var email = email
    set(value) {
        field = value.lowercase()
    }

    var password = password
    set(value) {
        field = if (value.length == 6){
            value
        } else {
            isValid = false
            ""
        }
    }

    init {
        this.email = email
        this.password = password
    }


    constructor(email: String,password: String,cumpleaños: LocalDate,genero: Char): this(email,password){
        this.cumple = cumpleaños
        this.gender = genero
    }

    var cumple = date
    set(value)  {
        val age = date.year - value.year
        field = if (age > 18){
            value
        }else{
            isValid = false
            date
        }
    }

    var gender = 'N'
    set(value) {
        field = if (genero.contains(value)){
            value
        }else{
            isValid = false
            'N'
        }
    }
}
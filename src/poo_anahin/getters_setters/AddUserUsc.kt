package poo_anahin.getters_setters

class AddUserUsc {
   operator fun invoke(user: User): User? {
        return if (user.isValid) user else null
    }
}

class ChangeName {
    private var name = "ejem"
    operator fun invoke(name: String): String{
        this.name = name
        return  this.name

    }
}
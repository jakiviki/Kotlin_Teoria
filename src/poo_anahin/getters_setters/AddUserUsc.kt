package poo_anahin.getters_setters

class AddUserUsc {
    fun invoke(user: User): User? {
        return if (user.isValid) user else null
    }
}
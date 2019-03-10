package playground.parts.three

import playground.data.models.User

/**
 * Part 3 of our Kotlin playground focusing on scoping functions.
 *
 * @see [playground.parts.one.Variables]
 * @see [playground.parts.two.Functions]
 */
class Scope {

    /**
     * Prints [User.firstName] and [User.lastName] using the [with] function.
     *
     * @param user The user to be referenced in [with] function
     */
    fun `with function`(user: User) {
    }

    /**
     * Possibly prints [User.firstName] using the [let] function and utilizes null-safety.
     *
     * @param user The user to be referenced in [let] function
     */
    fun `let function`(user: User?) {

    }


    /**
     * Creates a user with properties using the [apply] function and returns created user.
     *
     * @return The created user
     */
    fun `apply function`(): User? {
        return null
    }

    /**
     * Increments the age of a user using the [also] function and returns changed user.
     *
     * @param user The user to be referenced in [also] function
     *
     * @return The updated user
     */
    fun `also function`(user: User): User? {
        return null
    }
}
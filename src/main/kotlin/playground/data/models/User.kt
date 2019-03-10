package playground.data.models

/**
 * Model used to help with sampling the scoping functions.
 *
 * @property firstName Associated with the first name of a user
 * @property lastName Associated with the last name of a user
 * @property age Associated with the age of a user
 */
data class User(
        var firstName: String? = "",
        var lastName: String? = "",
        var age: Int? = 21
)
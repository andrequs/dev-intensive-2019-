package ru.skillbranch.devintensive

import org.junit.Test

import org.junit.Assert.*
import ru.skillbranch.devintensive.extensions.TimeUnits
import ru.skillbranch.devintensive.extensions.add
import ru.skillbranch.devintensive.extensions.format
import ru.skillbranch.devintensive.models.User
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun test_factory() {

        var user1 = User.makeUser("Andrew Wick")
        val user2 = user1.copy(id="2", lastName = "Cena", lastVisit = Date())
        print("$user1 \n$user2")
    }

    @Test
    fun test_decomposition(){
        val user = User.makeUser("John Wick")
        fun getUserInfo() = user

        val (id, firstName, lastName) = getUserInfo()

        println("${user.id}, ${user.firstName}, $lastName")
    }

    @Test
    fun test_copy(){
        val user = User.makeUser("John Wick")
        val user2= user.copy(lastVisit = Date().add(-2, TimeUnits.SECOND))
        val user3= user.copy(lastName = "Cena",lastVisit = Date().add(2, TimeUnits.HOUR))
        val user4= user.copy(lastVisit = Date())

        println("""
            ${user.lastVisit?.format()}
            ${user2.lastVisit?.format()}
            ${user3.lastVisit?.format()}
            ${user4.lastVisit?.format()}
        """.trimIndent()

        )

    }

  //

}

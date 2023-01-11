package validPalindrome

import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.nielsen.validPalindrome.ValidPalindrome

class ValidPalindromeTest {

    @Test
    fun `isPalindrome check for palindromic string`() {
        val listAssert = mutableListOf<Boolean>()
        val palindromes = listOf("civic", "peep", "deed", "rotator", "kayak", "racecar", "Never odd or even")

        //Act
        palindromes.forEach {
            listAssert.add(ValidPalindrome.isPalindrome(it))
        }

        //Assert
        assertEquals(true, !listAssert.contains(false))
    }

    @Test
    fun `isPalindrome check for non-palindromic string`() {
        val listAssert = mutableListOf<Boolean>();
        val nonPalindromes = listOf("Java", "kotlin", "Javascript", "Python", "C#")

        //Act
        nonPalindromes.forEach {
            listAssert.add(ValidPalindrome.isPalindrome(it))
        }
        //Assert
        assertEquals(false, !listAssert.contains(true))
    }
}
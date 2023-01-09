package validPalindrome

import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.nielsen.validPalindrome.ValidPalindrome

class ValidPalindromeTest {

    @Test
    fun `isPalindrome check for palindromic string`() {
        val validPalindromes = listOf("civic", "peep", "deed", "rotator", "kayak", "racecar", "Never odd or even")
        val wordIndex = (0..6).random()
        val validPalindrome = ValidPalindrome()
        //Act
        val result = validPalindrome.isPalindrome(validPalindromes[wordIndex])
        //Assert
        assertEquals(true, result)
    }

    @Test
    fun `isPalindrome check for non-palindromic string`() {
        val validPalindromes = listOf("Java", "kotlin", "Javascript", "Python", "C#")
        val wordIndex = (0..4).random()
        val validPalindrome = ValidPalindrome()
        //Act
        val result = validPalindrome.isPalindrome(validPalindromes[wordIndex])
        //Assert
        assertEquals(false, result)
    }
}
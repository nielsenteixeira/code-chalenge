package org.nielsen.validPalindrome

import java.util.*

class ValidPalindrome {
    fun isPalindrome(s: String): Boolean {
        val palindrome = s.lowercase(Locale.getDefault()).replace("[^a-z0-9]".toRegex(), "")
        var aux = palindrome.length - 1
        for (i in 0 until palindrome.length) {
            if (palindrome[i] != palindrome[aux--]) {
                return false
            }
        }
        return true
    }
}
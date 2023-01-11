package org.nielsen.validPalindrome

import java.util.*

class ValidPalindrome {
    companion object {
        fun isPalindrome(s: String): Boolean {
            val palindrome = s.lowercase(Locale.getDefault()).replace("[^a-z0-9]".toRegex(), "")
            var aux = palindrome.length - 1
            for (element in palindrome) {
                if (element != palindrome[aux--]) {
                    return false
                }
            }
            return true
        }
    }
}
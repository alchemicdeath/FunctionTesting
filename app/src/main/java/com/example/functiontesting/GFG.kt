package com.example.functiontesting

import com.example.functiontesting.GFG
import kotlin.jvm.JvmStatic

// Java program to check if two numbers are co-prime or not
object GFG
{
    // Recursive function to return gcd of a and b
    private fun gcd(a: Int, b: Int): Int
    {
        // Everything divides 0
        if (a == 0 || b == 0)
            return 0

        // base case
        if (a == b)
            return a

        // a is greater
        return if (a > b)
            gcd(a - b, b)
        else
            gcd(a, b - a)
    }

    // function to check and print if
    // two numbers are co-prime or not
    private fun coPrime(a: Int, b: Int)
    {
        if (gcd(a, b) == 1)
        {
            println("Co-Prime")
            println("$a, $b")
        }
        else
        {
            println("Not Co-Prime")
            println("$a, $b")
       }
    }

    //driver code
    @JvmStatic
    fun main(args: Array<String>)
    {
        var a = 7
        var b = 40

        a = 8
        b = 16

        for (i in 1..40)
        {
            coPrime(i, 40)
        }
    }
}
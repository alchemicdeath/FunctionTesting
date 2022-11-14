package com.example.functiontesting

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.pow
import kotlin.random.Random

class MainActivity : AppCompatActivity()
{
    private lateinit var euler: EditText
    private lateinit var edPrime: EditText
    private lateinit var edFact: EditText
    private lateinit var factors : String


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        euler = findViewById(R.id.editeuler)
        edPrime = findViewById(R.id.editprime)
        edFact = findViewById(R.id.editfactor)
        factors = ""

        val numberN = 55
        val numberQ = 11
        val numberP = 5
        val phiNum =  phi(55)
        val msg = "Hello"

        var primeP = randomPrime(256)
        var primeQ = randomPrime(256)
        val productN = primeP*primeQ
        val euelerPhi = phi(productN)
        // get index e
        // get mult inverse of e to get d

        while (isPrime(primeP))
        {
            primeP = randomPrime(256)
        }

        while (isPrime(primeQ))
        {
            primeQ = randomPrime(256)
        }
        factor(phiNum)

        euler.setText("e = ")
        edPrime.setText("N = ")
        edFact.setText("P and Q = ")

        val numP = 5
        val numQ = 11
        val numN = numP*numQ
        val numE = phi(numN)


    }

    fun encrypt(msg : String, p : Int, q : Int, n : Int, e : Double, d : Int)
    {
        var msgInt = msg.toDouble()
        var C = msgInt.pow(e)


    }

    fun factor(number : Int)
    {
        var facString = ""

        for (i in 1..number)
        {
            if (number % i == 0)
            {
                if (i == 1 || i == number)
                {
                    facString = "$facString"
                }
                else
                {
                    facString = "$facString$i,"
                }
            }
        }

        factors = facString
    }

    fun phi(n: Int): Int
    {
        var n = n
        var r = n
        var i = 2
        while (i * i <= n)
        {
            if (n % i == 0)
            {
                r -= r / i
                while (n % i == 0)
                {
                    n /= i
                }
            }
            i++
        }
        r -= r / n
        return r // returns the phi number e
    }

    fun randomPrime(limit: Int): Int
    {

        return Random.nextInt(0, limit)
    }

    fun isPrime(n : Int): Boolean
    {
        var i = 2
        var flag = false
        while (i <= n / 2)
        {
            // condition for nonprime number
            if (n % i == 0)
            {
                flag = true
                break
            }
            ++i
        }
        return flag
    }

    //
}
package com.example.bankaccountapp

class bank (val Holdername : String , var balence : Double){
    private val transationHistory = mutableListOf<String>()  // private here reflects that the this variable is not accesiable outside of
    // the class

     fun deposite(amount :Double){
         balence += amount // balance + amount
        transationHistory.add("$Holdername has deposited amount $amount and the balence is $balence")
//         println("Thank you")
    }

    fun withdraw(amount: Double){
       if ( balence >= amount){
           // you can withdraw money
           balence -= amount // balance - amount
           transationHistory.add("$Holdername has withdrawn amount $amount and the balence is $balence")
//           println("Thank you")
       } else
           // you cannot withdraw
           println("Insufficient balence")
//        println("Thank you")
    }

    fun trans(){
        println(" transaction history for $Holdername")
        for ( transtion in transationHistory){
            println(transtion)
            println("Thank you $Holdername")
        }

    }
}
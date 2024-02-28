package com.fokinar

class TextWork {
    val text = "Sometimes I dream about cheese " +
            "The cake is a lie " +
            "Do you know the definition of madness " +
            "Agile no " +
            "Incompetence Mediocrity Conscripts"
    val words = text.lowercase().split(" ").filter{it.all {it.isLetter()}}
    val fLetter = words.groupingBy { it.substring(0,1) }.eachCount().maxByOrNull { it.value }?.key
    val mWords = words.filter { it.substring(0,1) == fLetter }

}


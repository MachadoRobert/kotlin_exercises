package basic_exercises

import kotlin.KotlinVersion

class KotlinVersion {

    fun printVersion(){
        val kotlinVersion = KotlinVersion.CURRENT
        return println("Kotlin Version ${kotlinVersion}")
    }

}
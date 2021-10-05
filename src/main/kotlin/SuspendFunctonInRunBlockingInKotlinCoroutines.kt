import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {   //Create a coroutine that block the current main thread
    println("Main program starts: ${Thread.currentThread().name}")

    GlobalScope.launch {   //Create background coroutine that runs on a background thread
        println("Fake work starts: ${Thread.currentThread().name}")
        suspendFunction(1000) //Coroutine is suspended but thread is free (not block)
        println("Fake work ends: ${Thread.currentThread().name}")
    }


    suspendFunction(2000) // Wait for coroutine to finis


    println("Main program ends: ${Thread.currentThread().name}")
}

suspend fun suspendFunction(time:Long){
    delay(time)
}

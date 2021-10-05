import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun main(){                   //Executes in main thread
    println("Main program starts: ${Thread.currentThread().name}")

    GlobalScope.launch {   //Create background coroutine that runs on a background thread
        println("Fake work starts: ${Thread.currentThread().name}")
        delay(1000) //Coroutine is suspended but thread is free (not block)
        println("Fake work ends: ${Thread.currentThread().name}")
    }

    Thread.sleep(2000)

    println("Main program ends: ${Thread.currentThread().name}")
}
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun main(){                   //Executes in main thread
    println("Main program starts: ${Thread.currentThread().name}")

    GlobalScope.launch {   //Create background coroutine that runs on a background thread
        println("Fake work starts: ${Thread.currentThread().name}")
        suspendFunc(1000) //Coroutine is suspended but thread is free (not block)
        println("Fake work ends: ${Thread.currentThread().name}")
    }

    suspendFunc(2000)

    println("Main program ends: ${Thread.currentThread().name}")
}

suspend fun suspendFunc(time:Long){
    delay(time)
}
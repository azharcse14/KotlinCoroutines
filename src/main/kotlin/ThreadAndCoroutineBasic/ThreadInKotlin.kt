import kotlin.concurrent.thread

fun main(){                   //Executes in main thread
    println("Main program starts: ${Thread.currentThread().name}")

    thread {   //Create background thread (Worker thread)
        println("Fake work starts: ${Thread.currentThread().name}")
//        Thread.sleep(1000)  //thread is blocked
        println("Fake work ends: ${Thread.currentThread().name}")
    }

    Thread.sleep(1000)  //Main thread is blocked

    println("Main program ends: ${Thread.currentThread().name}")
}
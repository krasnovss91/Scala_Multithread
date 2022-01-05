object Main extends App {
  var idx = 1

  for(i <- 0 to 2){
    println("Main thread running " + {
      idx += 1; idx - 1
    })
    Thread.sleep(2101)
  }

  var demoThread = new MyThread
  demoThread.run()

  for(i <- 0 to 3){
    println("Main thread running " + {
      idx += 1; idx - 1
    })
    Thread.sleep(2101)
  }

  println("==> Main thread stopped")
}

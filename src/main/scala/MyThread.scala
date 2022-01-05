class MyThread extends Thread{
  override def run(): Unit ={
    var index = 1
    for (i <- 0 to 10){
      println("  - HelloThread running " + {
        index += 1; index - 1
      })
      Thread.sleep(1030)
    }
    println("  - ==> DemoThread stopped")
  }

}

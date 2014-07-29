package com.flyme.scala

class test1{
  
  def hello(){
    println("hello hello")
  }
  
  
  def add(x:Int,y:Int):Int ={
    
   
       
    return x+y    
  }
  
  
  def max(x:Int,y:Int):Int = {
    return if (x >y ) x else y 
    
  }
  
  def pp(){
   
    var greeting  = new Array[String](3)
    greeting(0) = "hello"
    greeting(1) = ","
    greeting(2) = "world\r\n"
    
    for(i <- 0 to 2)
      print(greeting(i))
      
      
    println("+++++++++++++++++++++++++++++++++++++++++++++++++=")
    
    var x1  = List(1,2,3,4,5)
    var x2 = List(11,22,33,44,55)
    
    x1.foreach(f=>{
      println(f)      
    })
    
    x2.foreach(f=>{
      println(f)
    })
    
    println("++++++++++++++++++++++++++++++++++++++++++++++++++++")
    var x3  = x1 ::: x2
    x3.foreach(f=>{
      println(f)
    })
    
     println("++++++++++++++++++++++++++++++++++++++++++++++++++++")
     
     var x4 = 54 :: x1;
     x4.foreach(f=>{
      println(f)
    })
    
     println("++++++++++++++++++++++++++++++++++++++++++++++++++++")
     
     var x5 = x1.::(78)
     x5.foreach(f=>{
      println(f)
    })
    
     println("++++++++++++++++++++++++++++++++++++++++++++++++++++")
     
    var x6 = 1::2::3::4::5::Nil
    x6.foreach(f=>{
      println(f)
    })
    println("x7 ++++++++++++++++++++++++++++++++++++++++++++++++++++")
    var x7  = List("abc","c44de","efg")
    println(x7.count(f=>f.length() == 3))
    println(x7.exists(f=>f == "4efg"))
//    var x8 = x7.filter(f=>f.length() == 3)
//    x8.foreach(println)
    println(x7.head)
    println(x7.tail)
    
    println(x7.map(f=>f + "y"))
    
    val b  = "sfsfs"
    
    var b1 = b indexOf 'f'
    println(b1)
  }
  
  
  
  
  def mc(x:String){
    
    x match{
      case "1" =>
      	println("11:" + x)
      case "5" =>
        println("55" + x)
      case _ =>
        println("default")
    }
    
    
  }
  
  
  
  
  
  
  
  
}
package com.flyme.scala

trait pt{
  
  def sayhi(){
    println("hello from pt sayhi")
  }
}


class frog extends  pt{
  override def toString = "frog"
}

class animial

class dog extends animial with pt{
   override def toString = "dog"
}

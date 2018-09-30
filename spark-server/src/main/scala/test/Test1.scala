package test

object Test1 {

  def hello(name:String)={
    s"hello,${name}"
  }

  def main(args: Array[String]): Unit = {
    //println(hello("张三"))
    /*var l=List("a","aa","aaa","aaaa")
    var rl=for{
      s<- l
      s1=s.toUpperCase
      if (s1!="")
    } yield (s1)
    println(rl)*/

    /*val rtry=try {                    //“_”下划线通配符表示：https://blog.csdn.net/wfhjhffg/article/details/78986076
      Integer.parseInt("dog")
    }catch {
      case _=> 0
    }finally {
      println("always be printed")
    }
    println(rtry)*/

    /*var code=1
    var rm=code match{
      case 0=> "one"
      case 2=> "two"
      case _=> "other"
    }
    println(rm)*/

    //println(kl(1)(2))

    /*val addOne=kl(1)_
    println(addOne(2))*/

    println(factorial(5,1))

  }

  def kl(a:Int)(b:Int)=a+b

  @annotation.tailrec
  def factorial(n:Int,m:Int):Int=
    if (n<=0) m
    else factorial(n-1,m*n)
}

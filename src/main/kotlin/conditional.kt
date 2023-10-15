class conditional {
    var accountTYpe = "Free"
    var extramoney = true
    var tip = if(extramoney) 10 else 0
    fun print(){
        println(tip)
    }
    var goodface=true
    val money=10000000
    var haveGf=if(goodface && money>100000)true else false
    fun show(){
        println("Do you have gf=>"+haveGf)
    }
    var workHard=false
    fun show2(){
        if(workHard){
            println("You are the best")
        }else{
            println("Ohh You are --> shitt")
        }
    }
}


object Acc{
    
    val NIC : String = ("992245751v")
    
    val accnum : Int = 9965645
    var balance : Double =2500

    def withdraw( a : Double ) =  this.balance -= a
   
   
    def deposit ( a : Double ) = this.balance += a

    def transfer( a : Double ,that : Acc ): Unit = {
        this.balance =  this.balance - a
        that.balance = that.balance + a
    }


    @Override
    override def toString() : String = "NIC : " + this.NIC + "\n Account Number : " + this.accnum + "\n Balance : " + this.balance
    
}
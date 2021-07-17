class Franc (amount : Int, curr : String) : Money(amount, curr){
    override fun times(multiplier : Int) : Franc = Franc(amount * multiplier, currency)
}
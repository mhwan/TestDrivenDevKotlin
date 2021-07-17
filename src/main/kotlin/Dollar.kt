class Dollar(amount: Int, curr : String) : Money(amount, curr) {
    override fun times(multiplier : Int) : Money = Dollar(amount * multiplier, currency)

    /*
    override fun hashCode(): Int {
        return amoun
    }
*/

}
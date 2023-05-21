package onlinebookstore

interface Discountable {
    //3. Discounts:
    //- Create an interface `Discountable` with a function `applyDiscount()`.
    //- Implement the `applyDiscount()` function in the `FictionCategory` class to apply a discount of 10% on the book price.

    fun applyDiscount(){
        println("Applying 10% discount for Fiction category")
    }
}
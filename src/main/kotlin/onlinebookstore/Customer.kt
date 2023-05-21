package onlinebookstore

class Customer(private var name:String,private var email:String):User(name,email),Discountable {
    //6. Inheritance and Interface Implementation:
    //- Create a class `Customer` that inherits from `User` and implements `Discountable` interface.
    //- Override the `applyDiscount()` function in the `Customer` class to apply a 5% discount on the book price.
    override fun applyDiscount() {
       println("Applying 5% discount for customer: $name")
    }
    override fun displayUser() {
        println("Customer Name: $name")
        println("Customer Email: $email")
    }
}
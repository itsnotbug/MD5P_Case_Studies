package onlinebookstore

fun main(){
    // Create books
    val book1 = Book("Book 1", "Author 1", 19.99, 10)
    val book2 = Book("Book 2", "Author 2", 24.99, 5)

    // Create categories
    val fictionCategory = FictionCategory("Fiction")
    val nonFictionCategory = NonFictionCategory("Non-Fiction")

    // Create customer and shopping cart
    val customer = Customer("John Doe", "john@example.com")
    val shoppingCart = ShoppingCart()

    // Add books to cart
    shoppingCart.addToCart(book1)

    // Remove a book from cart
    shoppingCart.removeFromCart(book2)

    // Display cart contents
      shoppingCart.displayCart()

    // Display book categories
    fictionCategory.displayCategory()
    nonFictionCategory.displayCategory()

    // Apply discounts
    fictionCategory.applyDiscount()
    customer.applyDiscount()




}
package onlinebookstore

class ShoppingCart{
    //5. Shopping Cart:
    //- Create a class `ShoppingCart` that represents the shopping cart for a user.
    //- Include functions to add books to the cart (`addToCart()`), remove books from the cart (`removeFromCart()`), and display the cart contents (`displayCart()`).
    private val bookList = mutableListOf<Book>()
    private val title :String
    private val author:String
    private val price :Double
    private val quantityInStock:Int

    init{
        title=""
        author=""
        price=0.0
        quantityInStock=0
    }
    fun addToCart(book:Book) {
        bookList.add(book)
        println("Book added to cart: ${book.getTitle()}")
    }
    fun removeFromCart(book: Book) {
        bookList.remove(book)
        println("Book removed from cart: ${book.getTitle()}")

    }
    fun displayCart() {
        for (book in bookList){
            println("Shopping Cart: ")
            println("Title: ${book.getTitle()} ")
            println("Author: ${book.getAuthor()}")
            println("Price: ${book.getPrice()}")
            println("Quantity in stock: ${book.getQuantityInStocks()} ")
            println(" ------------------")
        }


    }

}
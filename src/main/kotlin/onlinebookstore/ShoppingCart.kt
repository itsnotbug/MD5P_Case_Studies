package onlinebookstore

class ShoppingCart{
    //5. Shopping Cart:
    //- Create a class `ShoppingCart` that represents the shopping cart for a user.
    //- Include functions to add books to the cart (`addToCart()`), remove books from the cart (`removeFromCart()`), and display the cart contents (`displayCart()`).

    private val title = mutableListOf<String>()
    private val author = mutableListOf<String>()
    private val price = mutableListOf<Double>()
    private val quantityInStock= mutableListOf<Int>()
    private var ctr=0
    fun addToCart(book:Book) {
        title.add(book.getTitle())
        author.add(book.getAuthor())
        price.add(book.getPrice())
        quantityInStock.add(book.getQuantityInStocks())
        println("Book added to cart: ${book.getTitle()}")
    }
    fun removeFromCart(book: Book) {
        title.remove(book.getTitle())
        author.remove(book.getAuthor())
        price.remove(book.getPrice())
        quantityInStock.remove(book.getQuantityInStocks())
        println("Book removed from cart: ${book.getTitle()}")

    }
    fun displayCart() {
        while (ctr<title.size && ctr<author.size && ctr<price.size && ctr<quantityInStock.size){
            println("Shopping Cart: ")
            println("Title: ${title[ctr]} ")
            println("Author: ${author[ctr]}")
            println("Price: ${price[ctr]}")
            println("Quantity in stock: ${quantityInStock[ctr]} ")
            println(" ------------------")
            ctr++
        }

    }

}
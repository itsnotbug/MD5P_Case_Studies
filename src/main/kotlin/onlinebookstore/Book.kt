package onlinebookstore

class Book(private var title:String,private var author:String,private var price:Double,private var quantityInStock: Int) {
    //1. Books:
    //- Create a class `Book` with the following properties: `title` (String), `author` (String), `price` (Double), and `quantityInStock` (Int).
    //- Implement functions to get and set the properties, as well as a function to display book details (`displayDetails()`).

    fun setTitle(title: String){
        this.title =title
    }
    fun setAuthor(author: String){
        this.author =author
    }
    fun setPrice(price:Double){
        this.price=price
    }
    fun setQuantityInStocks(quantityInStock: Int){
        this.quantityInStock =quantityInStock
    }

    fun getTitle():String{
        return title
    }

    fun  getAuthor():String{
        return  author
    }

    fun getPrice():Double{
        return price
    }
    fun getQuantityInStocks():Int{
        return quantityInStock
    }
    fun displayDetails(){
        println("Title:${getTitle()}")
        println("Author:${getAuthor()}")
        println("Price:${getPrice()}")
        println("Quantity:${getQuantityInStocks()}")
    }
}
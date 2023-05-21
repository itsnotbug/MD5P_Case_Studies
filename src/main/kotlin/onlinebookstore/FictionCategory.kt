package onlinebookstore

class FictionCategory(private val name:String): Category(name),Discountable {
    override fun displayCategory() {
        println("Category: $name(Fiction)")
    }

}
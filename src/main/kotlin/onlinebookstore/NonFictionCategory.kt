package onlinebookstore

class NonFictionCategory(private val  name:String):Category(name) {
    override fun displayCategory() {
        println("Category: $name(Non-Fiction)")
    }
}
fun main() {
println(isEven(48))
    var product1=Product("baby oil",54.67,240, "hygiene")
    println(product1)
    println(evenIndices("MANGOES"))
    println(evenStrings(arrayOf("irene","uhuru","potato","cabbages")))
}
fun isEven(num:Int):Boolean{
    return num%2==0
}
data class Product (var name:String,var weight:Double,var price:Int,var category:String)
fun productCategory(product: Product) {
    var groceriesList= mutableListOf<Product>()
    var hygieneList=mutableListOf<Product>()
    var otherList= mutableListOf<Product>()
       when(product.category){
           "groceries" -> groceriesList.add(product)
           "hygiene"-> hygieneList.add(product)
           else-> otherList.add(product)
       }
    println(groceriesList)
   }


fun  evenIndices(fruit:String):String {
    var feature = " "
    fruit.forEachIndexed { index, character ->
        if (index % 2 == 0) {
            feature += character
        }
    }
        return feature
    }
fun evenStrings(names: Array<String>):List<String>{
    var listNames= mutableListOf<String>()
    for (name in names){
        if (name.length%2==0){
            listNames.add(name)
        }
    }
    return listNames
}


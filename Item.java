class Item {
  double itemPrice;
  double discount;
  
  //constant
  final int PRICE_LIMIT = 1000;
  
  Item(double regPrice, double discount) {
    this.itemPrice = itemPrice;
    this.discount = discount;
  }
  
  /* double, double -> double
   * Returns the total discount of an item
   */
  
 /* double totalDiscount(double itemPrice, double discount) {
    ... itemPrice ...
    ... discount ...
  } */
  
  double totalDiscount(double itemPrice, double discount) {
    return (itemPrice * discount);
  }
  
  /* double, double -> double
   * Returns the salePrice of an item if the item price is greater than 1000.
   * If not, returns the regular price of the item.
   */
  
 /* double salePrice(double itemPrice, double discount) {
    ... itemPrice ...
    ... discount ...
    ... PRICE_LIMIT 1000 ...
  } */
  
  double salePrice(double itemPrice, double discount) {
    if (itemPrice > PRICE_LIMIT) {
      return itemPrice - (totalDiscount(itemPrice, discount)); // wish totalDiscount(double itemPrice, double discount)
    } else {
      return itemPrice;
    }
  }
}
  
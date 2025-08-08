# class diagram

```
------------------
|     Product    |
------------------
| - sku: String  |
| - name: String |
| - variant: String |
| - price: double |
------------------
| + getPrice(): double |
| + getName(): String |
| + getVariant(): String |
| + getSku(): String |
------------------

------------------
|    Filling     |
------------------
| - inherits from Product |
------------------

------------------
|     Bagel      |
------------------
| - inherits from Product |
| - fillings: List<Filling> |
------------------
| + addFilling(Filling): void |
| + removeFilling(Filling): void |
| + getFillings(): List<Filling> |
| + getTotalPrice(): double |
------------------

------------------
|    Basket      |
------------------
| - items: List<Bagel> |
| - capacity: int |
------------------
| + addItem(Bagel): boolean |
| + removeItem(Bagel): boolean |
| + isFull(): boolean |
| + getTotalCost(): double |
| + getItems(): List<Bagel> |
| + setCapacity(int): void |
| + hasItem(Bagel): boolean |
------------------

------------------
|   Inventory    |
------------------
| - products: List<Product> |
------------------
| + getProductBySku(String): Product |
| + isInStock(String): boolean |
| + getPrice(String): double |
| + getAll(): List<Product> |
------------------
```
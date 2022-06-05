For this task you should only use classes and their methods from the package java.lang, no imports allowed apart from the ones we have made available to you in your git repository.

Penguins go shopping and unfortunately they are now firmly convinced that they must have a supermarket for this. Since there is no supermarket yet, we will implement it ourselves.

Important Notes:

If possible, mark attributes with final.
In some places, a check for validity or special treatment of exceptional cases is required. Use the method unsupportedOperation(String) or illegalArgument(String) from the class ExceptionUtil included in the template, in order to abort the execution of the method or the constructor in such exceptional cases. In these exceptional cases we want to get an error message back, so don't be surprised. Simply call the method at a suitable point (invalid value/status) with a meaningful error message.
Hide implementation details of the classes. Therefore mark all attributes with private. If you write helper methods, mark them with private as well.
Be careful with the implementation, the public test cases often only test for the existence of classes and methods. What exactly is tested is included in the test case or Artemis task. Thoroughly test your implementation yourself.
Always use the most general possible/meaningful type for attributes. So avoid having e.g. LinkedStack there, and use the Stack interface instead. So your implementation remains flexible and maintainable.
Aside from this, make sure that the source code is properly formatted.
First we need a few data structures to be able to model a supermarket for penguins.

Improve list from the lecture
 We now want to convert the int-List implementation of the solution into a generic list 3 of 3 tests passing
You can find the list in your repository. Replace int with a generic type parameter and change the attributes to private. Mark the info attribute as final. You don't need to insert validity tests. (A getter has to be created for info and next, as these are now private.)

Interfaces
 Create next three interfaces 3 of 3 tests passing
Define the two well-known data structures Stack and Queue as a Java interface, and implement them later.

An interface DataStructure, which defines the following methods:
a method size() that returns the number of stored elements as int.
a method isEmpty(), which returns a boolean, whether the data structure is empty. (You can also use a default method here)
A generic interface Stack, which extends DataStructure and defines the following methods:
a method push(T), which adds an object of the generic type T to the stack.
a method pop(), which removes an object of the generic type T from the stack. If the stack is empty, it returns null.
A generic interface Queue, which extends DataStructure and defines the following methods:
a method enqueue(T), which adds an object of the generic type T to the queue.
a method dequeue(), which removes an object of the generic type T from the queue. If the queue is empty, it returns null.
All data structures described here should behave as they are known from the lecture.

Implement interfaces
 Implement the generic LinkedStack class, which implements the Stack, and use the List class for this 2 of 2 tests passing
push "ABC"
push "DEF"
pop
(Sample operations from the test)

 Implement the generic LinkedQueue class, which implements the Queue, and use the List class for this 2 of 2 tests passing
Example:

enqueue "ABC"
enqueue "DEF"
dequeue
(Sample operations from the test)

Connect data structures
Next, we want to connect data structures together in order to effectively move elements from one data structure to another. TWe need this for the next subtask, so we want to find a good solution for it without using the existing interfaces overloaded with methods or made method names less descriptive.

 First implement the generic interface DataStructureConnector 1 of 1 tests passing
The following methods should be included:

hasNextElement() returns whether the data structure still contains elements.
addElement(T) adds an element of the generic type T to the data structure.
removeNextElement() takes the next element (of the generic type T) from the data structure. If the data structure does not contain any more elements, null is returned.
 Create the generic StackConnector class that implements DataStructureConnector for Interface Stack 2 of 2 tests passing
The Stack should be passed in the constructor (and of course it has to be of the same generic type). The public test creates a new LinkedStack for Integer, connects it to the connector and does addElement(42) and removeNextElement().

 Create the generic QueueConnector class that implements DataStructureConnector for Interface Queue 2 of 2 tests passing
The Queue should be passed in the constructor (and of course it has to be of the same generic type). The public test creates a new LinkedQueue for Integer, connects it to the connector and does addElement(42) and removeNextElement().

 Create the class generic DataStructureLink 4 of 4 tests passing
A DataStructureLink should receive two DataStructureConnectors in the constructor (they must be of the same generic type). The DataStructureLink offers two public methods:

moveNextFromAToB() moves the next element from the first connector to the second connector (remove and then add). If the first connector is no longer an element, the method returns false and nothing happens, otherwise an element is transferred andtrue is returned.
moveAllFromAToB() moves all elements from the first connector to the second connector; if the first is empty, nothing happens. Nothing is returned.
Tests (always in the format <A> -> <B>, the error messages of the tests show the order of insertion, don't get confused by it):

stackToStackSingle uses moveNextFromAToB() with StackConnectors on ["ööö", "abc"] -> ["xyz"].
stackToStackAll uses moveAllFromAToB() with StackConnectors on ["xyz", "Niugnip", "Penguin"] -> ["NiugnPinguin"].
queueToStackAll uses moveAllFromAToB() with QueueConnector to StackConnector on ["Pinguin", "Niugnip", "xyz"] -> ["NiugnPinguin"].
Objects from the application area Penguinsupermarket
The FishyProduct class
A FishyProduct essentially has two properties:

name (String)
price (int, penguins don't take it too seriously)
Implement the class FishyProduct with the mentioned attributes and provide the getters:

getName()
getPrice()
Make the attributes final so that their value is only set once when the constructor FishyProduct(String, int) is called. Check the values for validity. Neither the name null nor the price should be less than or equal to 0 (penguins don’t give away anything, especially food). Override the toString method so that the return value contains the most important characteristics of a product.

Example in the test case: new FishyProduct("Micro Mac with Soft Fish", 1254)

 Public test case works 2 of 2 tests passing


The PenguinCustomer class
The PenguinCustomer puts FishyProducts in his shopping cart, waits at the checkout and finally pays. For this we need the following attributes:

name (String)
available money (int, penguins still don't take it too seriously)
the products in the shopping cart (Stack<FishyProduct>, penguins always stack the goods)
Implement the class PenguinCustomer with the mentioned attributes and provide the getters:

getName()
getMoney()
getProducts()
A few more methods are also necessary:

with addProductToBasket(FishyProduct) a penguin can add the transferred product to his product stack. (This can also be multiple).
with placeAllProductsOnBand(Queue<FishyProduct>) the penguin places all its products on the belt at the checkout (the transferred queue). Use a DataStructureLink for this.
with takeAllProductsFromBand(Queue<FishyProduct>) the penguin takes all products from the tape at the till (the transferred queue) into its product stack. Use a DataStructureLink for this.
with pay(int) the penguin pays the transferred amount. The amount must not be negative and the available money must not be negative as well (penguins cannot have debts).
Make all attributes - if possible - final so that their value is only set once when the PenguinCustomer(String name, int initialMoney) constructor is called. Check the values for validity. So neither the name null nor the money available should be negative (penguins cannot have debts). Override the toString method so that the return value contains the most important characteristics of a PenguinCustomer.

Example in the test case: new FishyProduct("Micro Mac with Soft Fish", 1254) and new PenguinCustomer("Tux", 1337). In the first test only name and money are checked, in the second the FishyProduct is placed in the shopping cart (addProductToBasket).

 Public test case works 3 of 3 tests passing


Penguinsupermarket
Checkout
Create the class Checkout, which represents a cash register in our supermarket. It consists of:

a queue from PenguinCustomers
a queue of FishyProducts in front of the cashier on the belt
a queue of FishyProducts after the cashier on the tape
Implement the class Checkout with a parameterless constructor and the named attributes and provide the getters:

getQueue()
getBandBeforeCashier()
getBandAfterCashier()
queueLength() method directly returns the length of the queue. serveNextCustomer() method should be implemented so that the next penguin is served. The procedure is as follows:

the first PenguinCustomer leaves the queue,
puts all his products on the belt in front of the cashier (bandBeforeCashier),
the cashier scans all the products and calculates the price, moving the products to the rear belt (bandAfterCashier).
the PenguinCustomer takes all products from the back belt into the shopping cart (product stack)
and the PenguinCustomer is asked to pay. (An error may arise here, if he cannot do that, that's how it should be)
If there is no penguin to operate, nothing happens when it is called (it waits). Overwrite toString here as well.

Example in the test case: new FishyProduct("Micro Mac with Soft Fish", 1254) and new PenguinCustomer("Tux", 1337). "Tux" has the product in the shopping cart and is at the checkout. ServeNextCustomer() is called. He then has the product and is no longer at the checkout.

 Public test case works 2 of 2 tests passing


PenguinSupermarket
Create the class PenguinSupermarket that represents our supermarket. It consists of:

an array of Checkouts (theoretically you can use something else here too.)
Implement the class PenguinSupermarket with the mentioned attributes and provide the getters:

getCheckouts(), which in any case provides an array of all open Checkouts (registers).
In the constructor, the PenguinSupermarket receives the number of registers (must be greater than 0). There should be other methods for this purpose:

getCheckoutWithSmallestQueue() returns the first of all Checkouts (foremost in the array), which has the smallest queue length. Now write the goToCheckout(PenguinSupermarket) method for the PenguinCustomer class, which can be called the PenguinCustomer places itself in the shortest queue of the handed over supermarket.
closeCheckout(index) closes the cash register at the index passed (starting from 0). If one does not exist, an error message should be output; and also print an error if this is the last remaining cash register. When a cash register is closed, the register is removed from the array of registers (the array becomes smaller), and the penguins have to look for another cash register. However, this happens in the reverse order of the queue, the last are then the first. You can do this with DataStructureLink and goToCheckout(PenguinSupermarket).
serveCustomers() calls serveNextCustomer() once for each register.
Example in the test case: new FishyProduct("Micro Mac with Soft Fish", 1254) and new PenguinCustomer("Tux", 1337). Supermarket new PenguinSupermarket(2). "Tux" has the product in the shopping cart and goes to the checkout (goToCheckout). Cash register 1 is closed (closeCheckout(1)) ServeCustomers() is called. He then has the product and is no longer at the checkout.

 Public test case works 2 of 2 tests passing


Remarks:

All methods specified here in the task are public and not static.

Unspecified or obvious from the context methods return void.

When class java.lang.Object is mentioned in the error messages, it is almost always related to the type parameters. (see Type Erasure in Java, at runtime every free type parameter is of the type java.lang.Object)

General correction specifications
Structure and style are checked manually and appropriate deductions can be made if necessary.

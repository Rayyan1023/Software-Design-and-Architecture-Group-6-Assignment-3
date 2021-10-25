# Software-Design-and-Architecture-Group-6-Assignment-3
## Exercise 4
Exercise 1:
Because each View operator has an instance variable in the Cash Register class, the first solution is simple to construct but complicated to modify.
It is also easy to implement the Display and TicketPrinter because there is no need for layering, but it also makes it difficult to modidify because of it.

Exercise 2:
The second exercise is simpler to integrate than the first since the CashRegister does not have to rely on the View classes' operators.
Although, because the View classes still include instance variables, the Cash Register class is still reliant on it. 
We can also easily change the views without needing to change the model but it will still be dependent on the view. 

Exercise 3:
This method is simple to extend since you may construct a new class that implements observerRegister without changing CashRegister, and so Cash Register isn't reliant of any operator.
Also the model now controls the view, which is great for MVC design. The only downside it seems is that it is the hardest to implement out of the 3 approaches

<br>

## Contributors

Rayyan Mohammed 100752351

Daniyal Khan 100750029

Muhammad Khalid 100746801

Juan Gaviriarojas 100738545

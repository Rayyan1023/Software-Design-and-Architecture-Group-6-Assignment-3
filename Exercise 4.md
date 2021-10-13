Approach One
  
  The first approach is easy to implement but is difficult to extend due to each View operators having an instance variable in the Cash Register class

Approach Two
  
  The second approach is easier to implement compared to the first approach due to the CashRegister not having to depend on the operators of the View classes, 
  however due to the View classes themselves still having instance variables, it still causes the Cash Register class to depend on it.

Approach Three
  
  This approach is very easy to extend, as you can create a new class that implements observerRegister without modifying CashRegister, and thus Cash Register is not dependent on any operator. This approach however is much harder and more complicated to implement compared to the other approaches because it has more code that needs to be maintained due to the addition of the new class.

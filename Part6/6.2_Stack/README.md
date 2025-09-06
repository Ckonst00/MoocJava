## Exercise desctiption

A stack is a data structure that you can add to and take from. Always to the top of it or from the top.

---
Part 1: Adding to the Stack and Checking Emptiness

Create a Stack class that has a list of strings as an instance variable. Add the following methods to the class:

    public boolean isEmpty() - returns a boolean-type value (true or false) that tells whether or not the stack is empty.

    public void add(String value) - Adds the value given as a parameter to the top of the stack.

    public ArrayList<String> values() - returns the values ​​contained in the stack as a list.

You can test your class with the following code:

    Stack s = new Stack();
    System.out.println(s.isEmpty());
    System.out.println(s.values());
    s.add("Value");
    System.out.println(s.isEmpty());
    System.out.println(s.values());

Sample output

    true
    []
    false
    [Value]
---
Part 2: Taking from the Stack

Add to the Stack class a public String take() method, which returns the topmost value (i.e., the last value added to the deque) and removes it from the stack.

    Stack s = new Stack();
    System.out.println(s.isEmpty());
    System.out.println(s.values());
    s.add("Value");
    System.out.println(s.isEmpty());
    System.out.println(s.values());
    String taken = s.take();
    System.out.println(s.isEmpty());
    System.out.println(s.values());
    System.out.println(taken);

Sample output

    true
    []
    false
    [Value]
    true
    []
    Value
---

    Stack s = new Stack();
    s.add("1");
    s.add("2");
    s.add("3");
    s.add("4");
    s.add("5");

    while (!s.isEmpty()) {
    System.out.println(s.take());
    }

Sample output

    5
    4
    3
    2
    1

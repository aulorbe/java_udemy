# Classes, Objects, and their Members
- Methods encapsulate the software's business logic and algorithms
- Constructors help with constructing/creating objects
- Objects are always created from classes

## Classes & Objects
- An object has both *state* and *behavior*
    - State: the metadata about a particular object (e.g. the "John" object is `29` years old)
        - State comprises variables
        - State:Variables
    - Behavior: the things a particular object can do (e.g. the "John" object can *register* for a course)
    - (Registering for a course would be a *method*)
    - Behavior:Methods
- Classes are like blueprints & objects are the instantiations of a class
    - Can have nested classes & nested interfaces, too
- Class "members" are either variables or methods
- Class structure:
    - Classes start w/variable declarations (e.g. id, name, gender)
    - Then comes the method definitions (e.g. `updateProfile`)
- When you initialize an object w/specific values for its variables, you initialize/"set" its *state*
    - You'd use the `.` operator to do this (e.g. `s.id = 10;` for the variable `s`)
- When you use a method on an object, you are "invoking" or "calling" the method on the object

## Variables
- Store "state information"
- Containers that hold data of different types
- Variables can only hold data of the type that its data type allows it to
- You cannot change variables' types; their type is *fixed*
    - This is why Java is referred to as a "statically typed" language
    - Compiler does "static type checking"
- There are `primitive` variables and `object reference` variables (holds a reference to an object e.g. `Student s = new Student();`)
    - If the variable type is of `interface`, it can also be called an `object reference`
    - When variables are strings, they are also `object references` because `String` is a class in Java, even though it *looks* like a `primitive`
- Java has `8` primitive types
- Variables can store `literals` or `expressions`
    - `Literals` are raw data (`object references` can be `literals`, too, like `String`)
    - `Expressions` evaluated to a single value (e.g. `int id = x +y;`); `expressions` involve *computation*
        - `Student s = new Student()` would be an *expression*
- Variables' *values* can be changed (even though their `data types` cannot)
    - When you reassing a variable, you don't have to include its data type again, sine you cannot change it
    - You *cannot* reassign variables within the body of a class
- Initialization of a variable is sometimes optional, IF it's defined globally
  - If defined locally, default values do not apply
  - If you don't initialize & you have the variable globally, the variable's value defaults to 0 (when it's of type `int`)
- Assignment statements CANNOT appear at class level


## Primitive Variable Types
- `boolean`
- Integers: `byte`, `short`, `int`, `long`
- Floating point: `float`, `double`
- Character: `char` (even char is a numeric data type in Java!)

### Integer data types
- Whole numbers
- bytes, shorts, ints, and longs are all different *sizes* (storage sizes needed for their values)
- byes = 8 bits, shorts = 16 bits, ints = 32 bits, longs = 64 bits
  - These sizes are referred to as their "bit depths"
- Longs can only be assigned to longs (or other data types that are larger than a `long`), while the others can be assigned to ints
- Only 2 integer *literals*: `int` and `long`
- You can put `_` in `long`s (> Java 7) to make them more readable (they won't show up when printing)
- If you want to get the min/max of an int (but can do this with all data types, too), you can do: `int minValue = Integer.MIN_VALUE;`
  - ^ called a `Boxed Primitive`; every data type has a boxed primitive
- There's hexadecimal, binary, and octal, too

### Floating point numbers
- Real numbers
- floats = 32 bits & 6-7 decimal pts precision, double = 64 bits + 15-16 decimal pts precision
- In general, stick with `int` and `double` (w/preference to `int`)
- Pitfalls:
  - Floats and doubles can lead to *approximate* results (definitely a problem if you're using for an eCommerce app, for instance)
  - 





---
- "Static" = [a member of a class that isn't associated with an instance of a class](https://www.dummies.com/programming/java/what-is-the-static-keyword-in-java/)
  - Static fields are the same across all instances of a class
  - Static fields are created and initialized when the class is first loaded
  - Static method -- like static fields, static methods are associated with the class itself, not an instance of the class, so you don't have to create an object from the class before you can use static methods defined by the class
  - "Main" is always a static method -- must be static, which means that the applications run in a static context by default
  - If you work with static methods, you cannot access a non-static method or non-static field from it, since static methods don't have an instance of a class to use to reference instance methods or fields
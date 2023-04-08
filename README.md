# Bridge Pattern Assignment

This repository contains a decorator design pattern implementation for homework #3 of CS-5800 (Advanced Software Engineering).
A restaurant order system is simulated, with add-ons and discounts applied via the decorator pattern. 
The various decorators are tested in the driver program in the package: `driver`. 
An example of the program's output can also be found in `output.png`.

## Build & Run

To build with Maven, simply navigate to the project root in the command line and run:

```shell
mvn package
```

Alternatively, IDEs such as IntelliJ should be able to build the source files using their standard build utilities.

Once built, the project can be run using the `driver` package:

```shell
java -cp ./target/decorator-assignment-1.0-SNAPSHOT.jar driver.Main
```
# JAVA

## Need
- Comes in top 3 most popular languages 
- Extremely flexible (businesses, web apps, android apps, games etc.)

## How coding works
Humans write the source code using a high level language having certain syntax (language specific). This source code is then compiled (transformed into machine code), machine code (low level language) is a code which the computers understand, its in binary, 0's and 1's.

If we compile a source code on mac, we can run that compiled code only on mac, same applies for windows.

But in JAVA we have an intermediary step `Byte Code`

```Source Code -> Byte Code -> Machine Code``` 

Byte code is cross platform and ends with a `.class` file extension.

So, the process in JAVA is,

`Source code is compiled into byte code by the compiler during the compilation process, byte code is then converted to machine code by JVM during the run process. JVM is included in JDK (Java Development Kit)`

`JDK (has developer tools) includes JRE (Java Runtime environment) (has libraries and toolkits) which further includes JVM (Java Virtual Machine) (runs Java programs).`

So, we can run a source code compiled on mac on windows by sharing the byte code instead of the machine code.

## Variables
A placeholder for a value that behaves as a value it contains.

### Primitive vs Reference Data types
In java, primitive data types are of 8 types, they store data, can hold only one value, take less memory and are fast.

Reference data types are unlimited, they are user defined, the store addresses, can hold more than one value, take more memory and are slower. Reference data types begin with a capital letter.
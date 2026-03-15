package Oct.Chapter01_JVM_JRE_JDK;

public class Notes {
    /*
===========================================================
JVM vs JRE vs JDK
===========================================================

Java program execution involves three main components:
JVM, JRE, and JDK.

-----------------------------------------------------------
1. JVM (Java Virtual Machine)
-----------------------------------------------------------

JVM is responsible for executing Java bytecode.

Flow:
Java Code (.java) → Compiler (javac) → Bytecode (.class) → JVM → Machine Code

Key Responsibilities of JVM:
- Loads class files
- Verifies bytecode
- Executes bytecode
- Manages memory (Heap, Stack)
- Handles Garbage Collection

Important Points:
- JVM is platform dependent.
- Different operating systems have different JVM implementations.
- JVM enables "Write Once, Run Anywhere".

Example:
java MyProgram

-----------------------------------------------------------
2. JRE (Java Runtime Environment)
-----------------------------------------------------------

JRE provides the environment required to run Java programs.

JRE = JVM + Core Java Libraries

Components of JRE:
- JVM
- Core class libraries
- Supporting files required to run Java applications

Use Case:
If we only want to RUN a Java application, JRE is sufficient.

Example:
Running a compiled program:
java MyProgram

Important Point:
JRE does NOT contain development tools like the compiler.

-----------------------------------------------------------
3. JDK (Java Development Kit)
-----------------------------------------------------------

JDK is used for DEVELOPING Java applications.

JDK = JRE + Development Tools

Key Tools in JDK:
- javac → Java compiler
- java → program runner
- javadoc → documentation generator
- jdb → debugger
- jar → packaging tool

Use Case:
If we want to WRITE, COMPILE, and RUN Java code, we need JDK.

Example:
javac MyProgram.java
java MyProgram

-----------------------------------------------------------
Hierarchy
-----------------------------------------------------------

JDK
 └── JRE
      └── JVM

Meaning:
JDK contains JRE, and JRE contains JVM.

-----------------------------------------------------------
Summary Comparison
-----------------------------------------------------------

JVM
- Executes bytecode
- Platform dependent
- Handles memory management

JRE
- Provides runtime environment
- Contains JVM + libraries
- Used to run Java programs

JDK
- Used to develop Java programs
- Contains JRE + development tools
- Required for compilation

-----------------------------------------------------------
Important Note for Automation Testing
-----------------------------------------------------------

For Selenium / TestNG / Maven frameworks we install JDK
because:

- Test code needs compilation
- Build tools require javac
- IDEs like IntelliJ/Eclipse require JDK

JRE alone is not sufficient for development environments.

===========================================================
*/
}



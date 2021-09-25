# Knowledge Base Generation Tool (KBGT)

`KBGT` is a knowledge base generation tool, used for generating knowledge bases to be used for the testing of [KLM-style]{https://open.uct.ac.za/bitstream/handle/11427/32743/thesis_sci_2020_kaliski%20adam.pdf} propositional defeasible entailment implementations.
Knowledge bases that once ranked adhere to a specified number of defeasible ranks, total defeasible statements, distribution of defeasible statements, and whether or classical statements should also be included, can be generated.

## Build Commands

`KBGT` is built upon `Scala 2.13` and requires `Java 16` to compile owing to the TweetyProject dependency.

[sbt](https://www.scala-sbt.org/1.x/docs/Setup.html) is the project's build tool.

To compile, from the main directory, run

```sh
sbt assembly
```

A **jar** file will be compiled to the `target/scala-2.13` directory.

## Testing

There are a series of unit-tests for the knowledge base data-structures and knowledge base generation methods.
To run unit tests, from the main directory, run

```sh
sbt test
```

## Usage

To see the usage text, run

```sh
scala kbgt-assembly-*.0.jar --help
```

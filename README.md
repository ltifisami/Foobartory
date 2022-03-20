# Foobartory Application 

Le but de cette application est de produire une chaîne automatique de foobar.
​
On dispose au départ de 2 robots, qui sont chacun capables d'effectuer plusieurs actions :
​

Se déplacer pour changer d'activité : occupe le robot pendant 5 secondes.
Miner du foo : occupe le robot pendant 1 seconde.
Miner du bar : occupe le robot pendant un temps aléatoire compris entre 0.5 et 2 secondes.
Assembler un foobar à partir d'un foo et d'un bar : occupe le robot pendant 2 secondes. L'opération a 60% de chances de succès ; en cas d'échec le bar peut être réutilisé, le foo est perdu.
​

Tu as de grands entrepôts, la gestion des stocks n'est pas un problème.
En revanche, la législation impose la traçabilité des pièces ayant servi à fabriquer les foobars : chaque foo et chaque bar doivent avoir un numéro de série unique qu'on doit retrouver sur le foobar en sortie d'usine
​
On souhaite ensuite accélérer la production pour prendre rapidement le contrôle du marché des foobar. Les robots peuvent effectuer de nouvelles actions:

Vendre des foobar : 10s pour vendre de 1 à 5 foobar, on gagne 1€ par foobar vendu
Acheter un nouveau robot pour 3€ et 6 foo, 0s
​
Le jeu s'arrête quand on a 30 robots.
​

# Build Application 

## Requirements

For building and running the application you need:

- [JDK 11](https://www.oracle.com/java/technologies/downloads/#java11-windows)
- [Maven 3](https://maven.apache.org)
## Running the application locally
### From the IDE
Execute the `main` method in the `sid.sl.Foobartory.FoobartoryApplication` class from the IDE.
### Maven Build command :

 -----  Compile the project and generate target folder
 ```shell
mvn compile
```

```shell
mvn install
```

```shell
mvn clean install
```

```shell
mvn package
```

-----  Execute the project

```shell
mvn exec:java -Dexec.mainClass=sid.sl.Foobartory.FoobartoryApplication
```

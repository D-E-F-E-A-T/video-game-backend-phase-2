# Game Backend, Phase 2
This implements a back-end of the Game project using Spring Framework, Hibernate OGM, MongoDB.  
MongoDB was chosen since much of the data in this application does not fit into tables with fixed numbers of columns as are required in relational databases.  

MongoDB Daemon Service
-----------------------------
Before starting this program, install MongoDB on your system and start mongod.exe.

Compilation
------------------------------
To compile and run:
1. Install maven on your system.
2. Execute the pom file:
    mvn clean install
3. A "target" folder will be created in the same directory as the pom.xml
4. Navigate to the "target" directory.
5. Start the application
    java -jar gs-rest-service-0.1.jar


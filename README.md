Description:
===========
This is the WebSocket client which consumes the WebSocket service. It connects to the WebSocket endpoint 'ws://localhost:8080/systemstatus'. Future release will make this endpoint configurable.


Steps to import the project to IDEs:
========
Import the project as Gradle project in Eclipse or related IDEs like STS. 


Steps to build the project:
==========================
Run the following command to build the project:
gradle clean war


Steps to run the project:
======================
Pre-requisite: WebSocket endpoint should be up and running.
Run the following command to run the project:
gradle bootRun
 

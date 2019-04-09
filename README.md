# gauge-json-test
A Gauge, Maven, Java API testing framework using [JSON-Server](https://github.com/typicode/json-server) 

To run this project, first clone it to your computer, then skip to **Setup JSON Server** section to continue setup. 
Or read on to set up your own test framework from scratch.


## To Create Your Own Maven Project (IntelliJ)
Follow this 5 min [YouTube tutorial](https://www.youtube.com/watch?v=fi7ZbL23I2E) or read on for instructions.


File > New > Project

Maven > Project SDK *(choose version)* 

Click Next

GroupId: `com.yourname`

ArtifactId *(your project name)*: `gauge-json-test`

Click Next 

Project Name: `gauge-json-test`

Project Location: *(where you want to save it)*

Click Finish

Click ‘Enable Auto Import’ *(on Maven popup that appears)*

Click View *(from top menu)* > Tool Windows > Maven


## Initialise Gauge

**From IntelliJ Project Terminal:**

Initialise as Gauge Java project: `gauge init java`

*Before continuing, resolve any dependencies in /src/test/java/StepImplementation.java*

Clean and compile the project: `mvn clean compile`

Run the example specs (tests) file: `gauge run specs`

To view test results open html report located in: /reports/html-report/index.html


## Setup JSON Server

**From IntelliJ Project Terminal:**

`npm install -g json-server`

Follow the rest of the [JSON-Server](https://github.com/typicode/json-server) setup instructions.

### NOTE: 
If you cloned this project and did not create your own framework then **skip** the *'Create a db.json file with 
some data'* step as this file already exists in this project. 

### ALSO NOTE:
If you cloned this project the endpoints mentioned in [JSON-Server](https://github.com/typicode/json-server) setup instructions won't work. You'll also see different data in the responses as my db.json file contains different data to the example data in the setup instructions.

The endpoints for this project are `/users` and `/products`

All data from db.json can be returned with the following URL: http://localhost:3000/ after starting json-server in the Terminal using the following command: `json-server --watch db.json`

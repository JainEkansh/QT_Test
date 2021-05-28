# QT_Test

**Project Overview:**
1. Use of OOPs concepts has been done to make the code more optimized and non-redundant
2. To follow POM design, separate classes have been made for every page of the application
3. A common java class named "BaseFunctions.java" has been made to write the code that can be used throughout the framework without making class objects. This highly reduces chances of having duplicate code of the methods that are common/ordinary in nature
4. Individual feature files has been created for both of the scenarios

**Technologies used in project:**
1. Java 1.8
2. Selenium 3.6
3. Cucumber 2.3.1
4. Testng 6.8.7


**Execution Instructions:**
1. Launch TestRunner.java file in Com.Test.Ekansh.Runner Package
2. In Cucumber options, update the value of "tags" and enter the tag of the feature you want to execute
3. Save the file
4. To run through ecplise IDE, right click on the TestRunner.java class -> Click Run As -> Click TestNG Test
5. Execution will start. Progress can be seen in the console logs


**Improvement Areas:**
1. If test data is not too much, java classes can be used to store them
2. More common methods can be added in BaseFunctions.java depending on the requirements
3. Cross browser capabilities can be added


**Execution Report:**
Code added in this repository is tried and tested. For reference, please have a look at the execution status of both of the feature files:

![Scenario1](https://user-images.githubusercontent.com/84924630/119981593-7238cc00-bfdb-11eb-82fa-a4c335585519.JPG)


![Scenario2](https://user-images.githubusercontent.com/84924630/119981675-87155f80-bfdb-11eb-81ab-8d8df33af42d.JPG)

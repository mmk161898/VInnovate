# VInnovate

Hi, Thanks for accessing the VInnovate repository.

Kindly follow the below steps to start the product-task codebase on your local Machine
 
 Step-1 :- Take a clone of repository using github.
 
 Step-2 :- Open any IDE to import the codebase.For Example, Eclipse, Spring Tool Suite, etc.
 
 Step-3 :- Go to File -> Import -> Existing Maven Projects -> Click on Next -> Browse project on your local Machine -> Click on Finish button.
 
 Step-4 :- Run application as "mvn clean" and "mvn install" to download all the required jars.
 
 Step-5 :- Run application as "Java Application" and select main class as "TaskApplication".
 
You are good to go with testing the functionality.

Find the below url and json for your reference to test application functionality. 

**URL: http://localhost:8080/transaction
Request JSON :- 
      {
    "fromDate" : "2018-08-20 12:00:00",
    "toDate" : "2018-08-20 13:00:00",
    "merchant" : "MacLaren"
    }
Response JSON :- 
      {
      "noOfTransactions": 1,
      "avgTransactionValue": 5.0
      }
**

Please find the below requested questions: 
1) What you have achieved in the task - I have developed REST API used for getting processed transaction details based on input parameters.
2) What is pending from your side - I have done all the implementation which was asked to do and apart from that i have included one more REST API which is used to get                                     all the transaction details.
3) Write down steps of how to run the project/ task - Please find the above-mentioned steps to proceed further.
4) Any assumptions made - Assumed that date stored in database in of String type.


=======================================================================================================================================================================


<!-- Problem Statement:

Create a simple financial transaction analysis web application. The goal of the application is to return statistical information about processed transactions. The application should expose a REST API to return the statistical information.

CSV Data:
Input CSV Example:
-------------------------------------------------------------------------------------------------
ID, Date, Amount, Merchant, Type, Related Transaction
-------------------------------------------------------------------------------------------------
WLMFRDGD, 20/08/2018 12:45:33, 59.99, Kwik-E-Mart, PAYMENT,
YGXKOEIA, 20/08/2018 12:46:17, 10.95, Kwik-E-Mart, PAYMENT,
LFVCTEYM, 20/08/2018 12:50:02, 5.00, MacLaren, PAYMENT,
SUOVOISP, 20/08/2018 13:12:22, 5.00, Kwik-E-Mart, PAYMENT,
AKNBVHMN, 20/08/2018 13:14:11, 10.95, Kwik-E-Mart, REVERSAL, YGXKOEIA
JYAPKZFZ, 20/08/2018 14:07:10, 99.50, MacLaren, PAYMENT

REST Input (All inputs would be mandatory inputs)
{
  "fromDate" : "20/08/2018 12:00:00",
  "toDate" : "20/08/2018 13:00:00",
  "merchant" : "Kwik-E-Mart"
}

REST Output
{ 

Please note:
1) We do not need to use a database. The backend can load the data from the CSV file and store it in memory
2) We need to use Spring for the project
3) Please add a README file and steps on how to run the project
4) Please add associated unit & integration tests
5) You need to write REST service to get transactions -->

When you are done with the implementation, please check in the changes to github and answer the below questions in the Readme file
1) What you have achieved in the task
2) What is pending from your side
3) Write down steps of how to run the project/ task
4) Any assumptions made


Commands to Run:

Step 1:
javac -cp .:junit-4.12.jar MainTester.java
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore MainTester

Step 2:
run with -h
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar MainTester -h

run with -n
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar MainTester -n "1,testName"

run with -f
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar MainTester -f data.txt
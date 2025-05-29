Main Purpose

It allows the user to enter student details, input marks for multiple subjects, and then analyzes performance by:

	•	Calculating total marks
	•	Calculating average
	•	Checking whether the student has passed or failed
	•	Displaying a detailed report for each student
  

What it does:

	1 Takes input:
	•	Number of students
	•	For each student:
	•	Name
	•	Roll number
	•	Number of subjects
	•	Name + marks of each subject
 
	2 Processes the data:
	•	Calculates total marks
	•	Calculates average
	•	Checks if the student passed (mark ≥ 33 in every subject)

 
	3 Displays the report for each student:
	•	Name & Roll No
	•	Each subject’s name & marks
	•	Total marks and average
	•	Final result: PASS / FAIL

Explanation of every files:

1 Subject.java
	•	Represents one subject and the marks obtained.
	•	Has two private fields: subjectName and marks.
	•	Constructor initializes these fields.
	•	Getters provide access to these fields.

2 Person.java
	•	Represents a general person with name and rollNo.
	•	Fields are protected so subclasses can access them.
	•	Method showDetails() prints name and roll number.

3 Student.java
	•	Subclass of Person (uses inheritance).
	•	Has extra fields:
	•	An array of Subject objects.
	•	totalMarks (int) and average (float).
	•	Constructor initializes fields and calls calculateTotalAndAverage().
	•	calculateTotalAndAverage() loops through all subjects to sum marks and find average.
	•	displayReport() prints all details:
	•	Calls showDetails() from Person
	•	Lists each subject and marks
	•	Shows total, average, and result (pass/fail)
	•	isPass() checks if any subject has marks below 40.

4 Main.java
	•	Contains the main method to run the program.
	•	Uses Scanner to take input for multiple students and their subjects.
	•	Creates objects of Subject and Student based on user input.
	•	Stores all students in an array.
	•	After input, prints report for each student by calling displayReport().


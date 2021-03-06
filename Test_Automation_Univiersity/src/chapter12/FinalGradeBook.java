package chapter12;

import java.util.Map;

public class FinalGradeBook {
    //call the two methods from test results class and then make a final grade book containing each student's highest score from the two attempts
    public static void main(String[] args) {
        Map<String,Integer> firstGrading = TestResults.getOriginalGrades();
        Map<String, Integer> secondGrading = TestResults.getMakeUpGrades();

        for (var student : secondGrading.entrySet()) {
            Integer firstGrade = firstGrading.get(student.getKey());  //getValue?
            Integer secondGrade = secondGrading.get(student.getKey());

            if (secondGrade > firstGrade) {
                firstGrading.put(student.getKey(),secondGrade);
            }
        }
        System.out.println("The final student grades are:");
        firstGrading.forEach(
                (k,v) -> System.out.println("Student: " + k + " with " + " Grade: " + v + ".")
        );


    }
}


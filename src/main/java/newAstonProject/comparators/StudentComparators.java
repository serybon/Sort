package newAstonProject.comparators;

import newAstonProject.classes.Student;

public class StudentComparators {
    public static class SortByGroupNumber implements ComparatorStrategy<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getGroupNumber().compareTo(s2.getGroupNumber());
        }
    }

    public static class SortByAverageScore implements ComparatorStrategy<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return Double.compare(s1.getAverageScore(),s2.getAverageScore());
        }
    }

    public static class SortByRecordBookNumber implements ComparatorStrategy<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getRecordBookNumber().compareTo(s2.getRecordBookNumber());
        }
    }
}

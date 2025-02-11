package newAstonProject.classes;

public class Student implements Comparable<Student> {
    private final String groupNumber;
    private final double averageScore;
    private final String recordBookNumber;

    private Student(StudentBuilder studentBuilder) {
        this.groupNumber = studentBuilder.groupNumber;
        this.averageScore = studentBuilder.averageScore;
        this.recordBookNumber = studentBuilder.recordBookNumber;
    }

    public Student(String groupNumber, double averageScore, String recordBookNumber) {
        this.groupNumber = groupNumber;
        this.averageScore = averageScore;
        this.recordBookNumber = recordBookNumber;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public String getRecordBookNumber() {
        return recordBookNumber;
    }

    public static class StudentBuilder {
        private String groupNumber;
        private double averageScore;
        private String recordBookNumber;

        public StudentBuilder setGroupNumber(String groupNumber) {
            this.groupNumber = groupNumber;
            return this;
        }

        public StudentBuilder setAverageScore(double averageScore) {
            this.averageScore = averageScore;
            return this;
        }

        public StudentBuilder setRecordBookNumber(String recordBookNumber) {
            this.recordBookNumber = recordBookNumber;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public int compareTo(Student other) {
        int result = this.groupNumber.compareTo(other.groupNumber);
        if (result == 0) {
            result = Double.compare(this.averageScore, other.averageScore);
            if (result == 0) {
                return this.recordBookNumber.compareTo(other.recordBookNumber);
            }
        }
        return result;
    }
    @Override
    public String toString() {
        return String.format("Student [ groupNumber: %-4s averageScore: %-5.2f recordBookNumber: %-5s ]"
                , groupNumber, averageScore, recordBookNumber);
    }
}

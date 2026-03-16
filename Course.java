class Course {
    int calculateGrade(int assignments, int exams) {
        return 0;
    }
}

class ProgrammingCourse extends Course {
    int calculateGrade(int assignments, int exams) {
        return (assignments * 40 / 100) + (exams * 60 / 100);
    }
}

class MathematicsCourse extends Course {
    int calculateGrade(int assignments, int exams) {
        return (assignments * 30 / 100) + (exams * 70 / 100);
    }
}

class DesignCourse extends Course {
    int calculateGrade(int assignments, int exams) {
        return (assignments * 50 / 100) + (exams * 50 / 100);
    }
   public static void main(String[] args) {

        Course course;

        course = new ProgrammingCourse();
        System.out.println(course.calculateGrade(80, 90));

        course = new MathematicsCourse();
        System.out.println(course.calculateGrade(80, 90));

        course = new DesignCourse();
        System.out.println(course.calculateGrade(80, 90));
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Anna");
        student.setUniversityId("1");
        student.setCurrentCourseNumber(25);
        student.setAvgExamScore(8);
        System.out.println(student);

        University university = new University();
        university.setId("878");
        university.setFullName("Monsters university");
        university.setShortName("UM");
        university.setYearOfFoundation(2013);
        university.setMainProfile(StudyProfile.PROGRAMMING);
        System.out.println(university);

    }
}

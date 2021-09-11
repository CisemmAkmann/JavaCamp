public class CourseManager {
    public void joinCourse(Courses courses){
        System.out.println("Kursa kaydolundu " + courses.courseName);
    }

    public void completed(Courses courses){
        System.out.println("Kurs tamamlandı " + courses.courseName + " Yüzdelik:" + courses.percent);
    }
}

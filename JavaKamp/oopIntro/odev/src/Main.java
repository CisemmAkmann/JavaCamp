public class Main {

    public static void main(String[] args) {
	    Courses courses1 = new Courses("C#/Angular", "Engin Demiroğ",41);

        Courses courses2 = new Courses("Java/React","Engin Demiroğ",12);

        Courses courses3 = new Courses("Programlamaya Giriş","Engin Demiroğ",87);

        Courses[] courses = {courses1,courses2,courses3};

        CourseManager courseManager = new CourseManager();
        courseManager.joinCourse(courses1);

        /*
        courseManager.joinCourse(courses2);
        courseManager.joinCourse(courses3);
        */

        courseManager.completed(courses1);


    }
}

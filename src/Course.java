public class Course {

    private String subject;
    private int crn;
    private String title;
    private int credits;
    private static int crnBaseId = 1000;

    public Course(String subject, String title, int credits) {
        this.subject = subject;
        this.title = title;
        this.credits = credits;
        crn = crnBaseId++;

    }

    public String getSubject() {
        return subject;
    }

    private void setSubject(String subject) {
        this.subject = subject;
    }

    public int getCrn() {
        return crn;
    }

//    private void setCrn(int crn) {
//        this.crn = crn;
//    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public int getCredits()
                    {
        return credits;
    }

    private void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return '\n'+"    Course: " + '\n' +
                "       subject = '" + subject + '\n' +
                "       crn = " + crn + '\n'+
                "       title = '" + title + '\n' +
                "       credits = " + credits;
    }
}

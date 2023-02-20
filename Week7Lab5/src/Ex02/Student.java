public class Student extends Human {
    private String studentId, schoolName, skill;

    /**
     * @param studentId
     * @param schoolName
     * @param skill
     */
    public Student(String studentId, String schoolName, String skill) {
        this.studentId = studentId;
        this.schoolName = schoolName;
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

}

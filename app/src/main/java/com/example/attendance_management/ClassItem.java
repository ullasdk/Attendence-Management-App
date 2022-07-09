package com.example.attendance_management;

public class ClassItem {
    String className;
    String subjectName;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public ClassItem(String subjectName, String className) {
        this.subjectName = subjectName;
        this.className = className;
    }
}

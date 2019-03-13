package com.example.android.miwok;

public class ReportCard {

    char englishGrade = 'A';
    String mathGrade = "A-";
    int historyGrade = 85;
    double biologyGrade = 90.5;
    String studentName = "John Doe";

    public ReportCard(String studentName, char englishGrade, String mathGrade, int historyGrade, double biologyGrade) {
        this.englishGrade = englishGrade;
        this.mathGrade = mathGrade;
        this.historyGrade = historyGrade;
        this.biologyGrade = biologyGrade;
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public char getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(char englishGrade) {
        this.englishGrade = englishGrade;
    }

    public String getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(String mathGrade) {
        this.mathGrade = mathGrade;
    }

    public int getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(int historyGrade) {
        this.historyGrade = historyGrade;
    }

    public double getBiologyGrade() {
        return biologyGrade;
    }

    public void setBiologyGrade(double biologyGrade) {
        this.biologyGrade = biologyGrade;
    }

    @Override
    public String toString() {
        return getStudentName()+";"+ "English grade: "+getEnglishGrade()+";"+ "History grade: "+ getHistoryGrade()+";"+ "Math grade: "+ getMathGrade()+ ";"+ "Biology grade: "+ getBiologyGrade()+";";
    }

}


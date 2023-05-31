package Curs7HW;

import java.util.Scanner;

abstract class Teacher {
    private String Course;
    private int ExperienceYears;
    private String Schedule;

    public void setCourse(String course) {
        Course = course;
    }

    public void setExperienceYears(int experienceYears) {
        ExperienceYears = experienceYears;
    }

    public void setSchedule(String schedule) {
        Schedule = schedule;
    }

    public String getCourse() {
        return Course;
    }

    public int getExperienceYears() {
        return ExperienceYears;
    }

    public String getSchedule() {
        return Schedule;
    }
}

class Qualification extends Teacher {
    public Qualification(String Course, int ExperienceYears, String Schedule) {
        this.setCourse(Course);
        this.setExperienceYears(ExperienceYears);
        this.setSchedule(Schedule);
    }

    public void verify() {
        if (this.getExperienceYears() > 3 && this.getCourse().compareTo("Java") == 0
                && this.getSchedule().compareTo("Afternoon") == 0) {
            System.out.println("You qualify to teach at this school!");
        } else {
            System.out.println("You do not qualify!");
        }
    }
}

public class QualifiedTeacher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Course: ");
        String course = input.nextLine();
        System.out.print("Experience: ");
        int experience = input.nextInt();
        input.nextLine();
        System.out.print("Schedule: ");
        String schedule = input.nextLine();
        Qualification good = new Qualification(course, experience, schedule);
        good.verify();
        input.close();
    }
}

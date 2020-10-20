package org.cap.apps.studentms.ui;

import org.cap.apps.studentms.entities.*;
import org.cap.apps.studentms.exceptions.InvalidAgeException;
import org.cap.apps.studentms.exceptions.InvalidArgumentException;
import org.cap.apps.studentms.exceptions.InvalidStudentNameException;
import org.cap.apps.studentms.exceptions.StudentNotFoundException;
import org.cap.apps.studentms.service.*;
import org.cap.apps.studentms.exceptions.*;
import org.cap.apps.studentms.util.JpaUtil;

public class ProjectMain {

    public static void main(String args[]) {
        try {
            ProjectUi ui = new ProjectUi();
            ui.runUi();
            JpaUtil jpaUtil = JpaUtil.getInstance();
            jpaUtil.close();
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (InvalidArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InvalidStudentNameException e) {
            System.out.println(e.getMessage());
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("something went wrong");
        }

    }

}
